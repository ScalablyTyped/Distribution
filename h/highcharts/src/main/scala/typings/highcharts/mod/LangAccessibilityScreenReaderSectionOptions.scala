package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LangAccessibilityScreenReaderSectionOptions extends js.Object {
  var afterRegionLabel: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Language options for annotation
    * descriptions.
    */
  var annotations: js.UndefOr[LangAccessibilityScreenReaderSectionAnnotationsOptions] = js.native
  var beforeRegionLabel: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Label for the end of the chart.
    * Announced by screen readers.
    */
  var endOfChartMarker: js.UndefOr[String] = js.native
}

object LangAccessibilityScreenReaderSectionOptions {
  @scala.inline
  def apply(): LangAccessibilityScreenReaderSectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilityScreenReaderSectionOptions]
  }
  @scala.inline
  implicit class LangAccessibilityScreenReaderSectionOptionsOps[Self <: LangAccessibilityScreenReaderSectionOptions] (val x: Self) extends AnyVal {
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
    def setAfterRegionLabel(value: String): Self = this.set("afterRegionLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterRegionLabel: Self = this.set("afterRegionLabel", js.undefined)
    @scala.inline
    def setAnnotations(value: LangAccessibilityScreenReaderSectionAnnotationsOptions): Self = this.set("annotations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnotations: Self = this.set("annotations", js.undefined)
    @scala.inline
    def setBeforeRegionLabel(value: String): Self = this.set("beforeRegionLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeRegionLabel: Self = this.set("beforeRegionLabel", js.undefined)
    @scala.inline
    def setEndOfChartMarker(value: String): Self = this.set("endOfChartMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndOfChartMarker: Self = this.set("endOfChartMarker", js.undefined)
  }
  
}

