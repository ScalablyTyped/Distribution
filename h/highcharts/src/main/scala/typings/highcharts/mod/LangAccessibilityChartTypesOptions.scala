package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LangAccessibilityChartTypesOptions extends js.Object {
  var barMultiple: js.UndefOr[String] = js.native
  var barSingle: js.UndefOr[String] = js.native
  var boxplotMultiple: js.UndefOr[String] = js.native
  var boxplotSingle: js.UndefOr[String] = js.native
  var bubbleMultiple: js.UndefOr[String] = js.native
  var bubbleSingle: js.UndefOr[String] = js.native
  var columnMultiple: js.UndefOr[String] = js.native
  var columnSingle: js.UndefOr[String] = js.native
  var combinationChart: js.UndefOr[String] = js.native
  var defaultMultiple: js.UndefOr[String] = js.native
  var defaultSingle: js.UndefOr[String] = js.native
  var emptyChart: js.UndefOr[String] = js.native
  var lineMultiple: js.UndefOr[String] = js.native
  var lineSingle: js.UndefOr[String] = js.native
  var mapTypeDescription: js.UndefOr[String] = js.native
  var pieMultiple: js.UndefOr[String] = js.native
  var pieSingle: js.UndefOr[String] = js.native
  var scatterMultiple: js.UndefOr[String] = js.native
  var scatterSingle: js.UndefOr[String] = js.native
  var splineMultiple: js.UndefOr[String] = js.native
  var splineSingle: js.UndefOr[String] = js.native
  var unknownMap: js.UndefOr[String] = js.native
}

object LangAccessibilityChartTypesOptions {
  @scala.inline
  def apply(): LangAccessibilityChartTypesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilityChartTypesOptions]
  }
  @scala.inline
  implicit class LangAccessibilityChartTypesOptionsOps[Self <: LangAccessibilityChartTypesOptions] (val x: Self) extends AnyVal {
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
    def setBarMultiple(value: String): Self = this.set("barMultiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarMultiple: Self = this.set("barMultiple", js.undefined)
    @scala.inline
    def setBarSingle(value: String): Self = this.set("barSingle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarSingle: Self = this.set("barSingle", js.undefined)
    @scala.inline
    def setBoxplotMultiple(value: String): Self = this.set("boxplotMultiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxplotMultiple: Self = this.set("boxplotMultiple", js.undefined)
    @scala.inline
    def setBoxplotSingle(value: String): Self = this.set("boxplotSingle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxplotSingle: Self = this.set("boxplotSingle", js.undefined)
    @scala.inline
    def setBubbleMultiple(value: String): Self = this.set("bubbleMultiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBubbleMultiple: Self = this.set("bubbleMultiple", js.undefined)
    @scala.inline
    def setBubbleSingle(value: String): Self = this.set("bubbleSingle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBubbleSingle: Self = this.set("bubbleSingle", js.undefined)
    @scala.inline
    def setColumnMultiple(value: String): Self = this.set("columnMultiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnMultiple: Self = this.set("columnMultiple", js.undefined)
    @scala.inline
    def setColumnSingle(value: String): Self = this.set("columnSingle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnSingle: Self = this.set("columnSingle", js.undefined)
    @scala.inline
    def setCombinationChart(value: String): Self = this.set("combinationChart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCombinationChart: Self = this.set("combinationChart", js.undefined)
    @scala.inline
    def setDefaultMultiple(value: String): Self = this.set("defaultMultiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultMultiple: Self = this.set("defaultMultiple", js.undefined)
    @scala.inline
    def setDefaultSingle(value: String): Self = this.set("defaultSingle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSingle: Self = this.set("defaultSingle", js.undefined)
    @scala.inline
    def setEmptyChart(value: String): Self = this.set("emptyChart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyChart: Self = this.set("emptyChart", js.undefined)
    @scala.inline
    def setLineMultiple(value: String): Self = this.set("lineMultiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineMultiple: Self = this.set("lineMultiple", js.undefined)
    @scala.inline
    def setLineSingle(value: String): Self = this.set("lineSingle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineSingle: Self = this.set("lineSingle", js.undefined)
    @scala.inline
    def setMapTypeDescription(value: String): Self = this.set("mapTypeDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapTypeDescription: Self = this.set("mapTypeDescription", js.undefined)
    @scala.inline
    def setPieMultiple(value: String): Self = this.set("pieMultiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePieMultiple: Self = this.set("pieMultiple", js.undefined)
    @scala.inline
    def setPieSingle(value: String): Self = this.set("pieSingle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePieSingle: Self = this.set("pieSingle", js.undefined)
    @scala.inline
    def setScatterMultiple(value: String): Self = this.set("scatterMultiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScatterMultiple: Self = this.set("scatterMultiple", js.undefined)
    @scala.inline
    def setScatterSingle(value: String): Self = this.set("scatterSingle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScatterSingle: Self = this.set("scatterSingle", js.undefined)
    @scala.inline
    def setSplineMultiple(value: String): Self = this.set("splineMultiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplineMultiple: Self = this.set("splineMultiple", js.undefined)
    @scala.inline
    def setSplineSingle(value: String): Self = this.set("splineSingle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplineSingle: Self = this.set("splineSingle", js.undefined)
    @scala.inline
    def setUnknownMap(value: String): Self = this.set("unknownMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnknownMap: Self = this.set("unknownMap", js.undefined)
  }
  
}

