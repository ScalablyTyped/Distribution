package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrilldownActiveDataLabelStyleOptions extends js.Object {
  var color: js.UndefOr[String] = js.native
  var cursor: js.UndefOr[String] = js.native
  var fontWeight: js.UndefOr[String] = js.native
  var textDecoration: js.UndefOr[String] = js.native
}

object DrilldownActiveDataLabelStyleOptions {
  @scala.inline
  def apply(): DrilldownActiveDataLabelStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrilldownActiveDataLabelStyleOptions]
  }
  @scala.inline
  implicit class DrilldownActiveDataLabelStyleOptionsOps[Self <: DrilldownActiveDataLabelStyleOptions] (val x: Self) extends AnyVal {
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
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setFontWeight(value: String): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    @scala.inline
    def setTextDecoration(value: String): Self = this.set("textDecoration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextDecoration: Self = this.set("textDecoration", js.undefined)
  }
  
}

