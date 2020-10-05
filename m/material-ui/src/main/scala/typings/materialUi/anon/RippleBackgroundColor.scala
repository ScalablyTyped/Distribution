package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RippleBackgroundColor extends js.Object {
  var color: js.UndefOr[String] = js.native
  var rippleBackgroundColor: js.UndefOr[String] = js.native
}

object RippleBackgroundColor {
  @scala.inline
  def apply(): RippleBackgroundColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RippleBackgroundColor]
  }
  @scala.inline
  implicit class RippleBackgroundColorOps[Self <: RippleBackgroundColor] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setRippleBackgroundColor(value: String): Self = this.set("rippleBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRippleBackgroundColor: Self = this.set("rippleBackgroundColor", js.undefined)
  }
  
}

