package typings.keystonejsKeystone.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkipAccessControl extends js.Object {
  var skipAccessControl: Boolean = js.native
}

object SkipAccessControl {
  @scala.inline
  def apply(skipAccessControl: Boolean): SkipAccessControl = {
    val __obj = js.Dynamic.literal(skipAccessControl = skipAccessControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkipAccessControl]
  }
  @scala.inline
  implicit class SkipAccessControlOps[Self <: SkipAccessControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSkipAccessControl(value: Boolean): Self = this.set("skipAccessControl", value.asInstanceOf[js.Any])
  }
  
}

