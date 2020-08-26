package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Invert extends js.Object {
  var invert: js.UndefOr[`0`] = js.native
}

object Invert {
  @scala.inline
  def apply(): Invert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invert]
  }
  @scala.inline
  implicit class InvertOps[Self <: Invert] (val x: Self) extends AnyVal {
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
    def setInvert(value: `0`): Self = this.set("invert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvert: Self = this.set("invert", js.undefined)
  }
  
}

