package typings.grommet.anon

import typings.grommet.utilsMod.ColorType
import typings.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorMargin extends js.Object {
  var color: js.UndefOr[ColorType] = js.native
  var margin: js.UndefOr[MarginType] = js.native
}

object ColorMargin {
  @scala.inline
  def apply(): ColorMargin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorMargin]
  }
  @scala.inline
  implicit class ColorMarginOps[Self <: ColorMargin] (val x: Self) extends AnyVal {
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
    def setColor(value: ColorType): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setMargin(value: MarginType): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
  }
  
}

