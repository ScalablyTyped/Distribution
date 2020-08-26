package typings.inkBox.mod

import typings.inkBox.anon.BottomLeft
import typings.inkBox.inkBoxStrings.classic
import typings.inkBox.inkBoxStrings.double
import typings.inkBox.inkBoxStrings.doubleSingle
import typings.inkBox.inkBoxStrings.round
import typings.inkBox.inkBoxStrings.single
import typings.inkBox.inkBoxStrings.singleDouble
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoxProps extends js.Object {
  var align: js.UndefOr[Alignment] = js.native
  var backgroundColor: js.UndefOr[String] = js.native
  var borderColor: js.UndefOr[String] = js.native
  var borderStyle: js.UndefOr[single | double | round | singleDouble | doubleSingle | classic | BottomLeft] = js.native
  var dimBorder: js.UndefOr[Boolean] = js.native
  var float: js.UndefOr[Alignment] = js.native
  var margin: js.UndefOr[Spacing] = js.native
  var padding: js.UndefOr[Spacing] = js.native
}

object BoxProps {
  @scala.inline
  def apply(): BoxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxProps]
  }
  @scala.inline
  implicit class BoxPropsOps[Self <: BoxProps] (val x: Self) extends AnyVal {
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
    def setAlign(value: Alignment): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBorderStyle(value: single | double | round | singleDouble | doubleSingle | classic | BottomLeft): Self = this.set("borderStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderStyle: Self = this.set("borderStyle", js.undefined)
    @scala.inline
    def setDimBorder(value: Boolean): Self = this.set("dimBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimBorder: Self = this.set("dimBorder", js.undefined)
    @scala.inline
    def setFloat(value: Alignment): Self = this.set("float", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloat: Self = this.set("float", js.undefined)
    @scala.inline
    def setMargin(value: Spacing): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setPadding(value: Spacing): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
  }
  
}

