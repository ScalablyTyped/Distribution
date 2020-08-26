package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LangAccessibilitySeriesTypeDescriptionsOptions extends js.Object {
  var arearange: js.UndefOr[String] = js.native
  var areasplinerange: js.UndefOr[String] = js.native
  var boxplot: js.UndefOr[String] = js.native
  var bubble: js.UndefOr[String] = js.native
  var columnrange: js.UndefOr[String] = js.native
  var errorbar: js.UndefOr[String] = js.native
  var funnel: js.UndefOr[String] = js.native
  var pyramid: js.UndefOr[String] = js.native
  var waterfall: js.UndefOr[String] = js.native
}

object LangAccessibilitySeriesTypeDescriptionsOptions {
  @scala.inline
  def apply(): LangAccessibilitySeriesTypeDescriptionsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilitySeriesTypeDescriptionsOptions]
  }
  @scala.inline
  implicit class LangAccessibilitySeriesTypeDescriptionsOptionsOps[Self <: LangAccessibilitySeriesTypeDescriptionsOptions] (val x: Self) extends AnyVal {
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
    def setArearange(value: String): Self = this.set("arearange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArearange: Self = this.set("arearange", js.undefined)
    @scala.inline
    def setAreasplinerange(value: String): Self = this.set("areasplinerange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAreasplinerange: Self = this.set("areasplinerange", js.undefined)
    @scala.inline
    def setBoxplot(value: String): Self = this.set("boxplot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxplot: Self = this.set("boxplot", js.undefined)
    @scala.inline
    def setBubble(value: String): Self = this.set("bubble", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBubble: Self = this.set("bubble", js.undefined)
    @scala.inline
    def setColumnrange(value: String): Self = this.set("columnrange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnrange: Self = this.set("columnrange", js.undefined)
    @scala.inline
    def setErrorbar(value: String): Self = this.set("errorbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorbar: Self = this.set("errorbar", js.undefined)
    @scala.inline
    def setFunnel(value: String): Self = this.set("funnel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunnel: Self = this.set("funnel", js.undefined)
    @scala.inline
    def setPyramid(value: String): Self = this.set("pyramid", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePyramid: Self = this.set("pyramid", js.undefined)
    @scala.inline
    def setWaterfall(value: String): Self = this.set("waterfall", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaterfall: Self = this.set("waterfall", js.undefined)
  }
  
}

