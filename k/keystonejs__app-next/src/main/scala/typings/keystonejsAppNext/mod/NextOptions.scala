package typings.keystonejsAppNext.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NextOptions extends js.Object {
  var dir: String = js.native
}

object NextOptions {
  @scala.inline
  def apply(dir: String): NextOptions = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextOptions]
  }
  @scala.inline
  implicit class NextOptionsOps[Self <: NextOptions] (val x: Self) extends AnyVal {
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
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
  }
  
}

