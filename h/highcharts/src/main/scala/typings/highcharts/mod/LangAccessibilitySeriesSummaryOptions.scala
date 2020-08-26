package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LangAccessibilitySeriesSummaryOptions extends js.Object {
  var bar: js.UndefOr[String] = js.native
  var barCombination: js.UndefOr[String] = js.native
  var boxplot: js.UndefOr[String] = js.native
  var boxplotCombination: js.UndefOr[String] = js.native
  var bubble: js.UndefOr[String] = js.native
  var bubbleCombination: js.UndefOr[String] = js.native
  var column: js.UndefOr[String] = js.native
  var columnCombination: js.UndefOr[String] = js.native
  var default: js.UndefOr[String] = js.native
  var defaultCombination: js.UndefOr[String] = js.native
  var line: js.UndefOr[String] = js.native
  var lineCombination: js.UndefOr[String] = js.native
  var map: js.UndefOr[String] = js.native
  var mapCombination: js.UndefOr[String] = js.native
  var mapbubble: js.UndefOr[String] = js.native
  var mapbubbleCombination: js.UndefOr[String] = js.native
  var mapline: js.UndefOr[String] = js.native
  var maplineCombination: js.UndefOr[String] = js.native
  var pie: js.UndefOr[String] = js.native
  var pieCombination: js.UndefOr[String] = js.native
  var scatter: js.UndefOr[String] = js.native
  var scatterCombination: js.UndefOr[String] = js.native
  var spline: js.UndefOr[String] = js.native
  var splineCombination: js.UndefOr[String] = js.native
}

object LangAccessibilitySeriesSummaryOptions {
  @scala.inline
  def apply(): LangAccessibilitySeriesSummaryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilitySeriesSummaryOptions]
  }
  @scala.inline
  implicit class LangAccessibilitySeriesSummaryOptionsOps[Self <: LangAccessibilitySeriesSummaryOptions] (val x: Self) extends AnyVal {
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
    def setBar(value: String): Self = this.set("bar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBar: Self = this.set("bar", js.undefined)
    @scala.inline
    def setBarCombination(value: String): Self = this.set("barCombination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarCombination: Self = this.set("barCombination", js.undefined)
    @scala.inline
    def setBoxplot(value: String): Self = this.set("boxplot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxplot: Self = this.set("boxplot", js.undefined)
    @scala.inline
    def setBoxplotCombination(value: String): Self = this.set("boxplotCombination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxplotCombination: Self = this.set("boxplotCombination", js.undefined)
    @scala.inline
    def setBubble(value: String): Self = this.set("bubble", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBubble: Self = this.set("bubble", js.undefined)
    @scala.inline
    def setBubbleCombination(value: String): Self = this.set("bubbleCombination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBubbleCombination: Self = this.set("bubbleCombination", js.undefined)
    @scala.inline
    def setColumn(value: String): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    @scala.inline
    def setColumnCombination(value: String): Self = this.set("columnCombination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnCombination: Self = this.set("columnCombination", js.undefined)
    @scala.inline
    def setDefault(value: String): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setDefaultCombination(value: String): Self = this.set("defaultCombination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultCombination: Self = this.set("defaultCombination", js.undefined)
    @scala.inline
    def setLine(value: String): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    @scala.inline
    def setLineCombination(value: String): Self = this.set("lineCombination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineCombination: Self = this.set("lineCombination", js.undefined)
    @scala.inline
    def setMap(value: String): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setMapCombination(value: String): Self = this.set("mapCombination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapCombination: Self = this.set("mapCombination", js.undefined)
    @scala.inline
    def setMapbubble(value: String): Self = this.set("mapbubble", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapbubble: Self = this.set("mapbubble", js.undefined)
    @scala.inline
    def setMapbubbleCombination(value: String): Self = this.set("mapbubbleCombination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapbubbleCombination: Self = this.set("mapbubbleCombination", js.undefined)
    @scala.inline
    def setMapline(value: String): Self = this.set("mapline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapline: Self = this.set("mapline", js.undefined)
    @scala.inline
    def setMaplineCombination(value: String): Self = this.set("maplineCombination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaplineCombination: Self = this.set("maplineCombination", js.undefined)
    @scala.inline
    def setPie(value: String): Self = this.set("pie", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePie: Self = this.set("pie", js.undefined)
    @scala.inline
    def setPieCombination(value: String): Self = this.set("pieCombination", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePieCombination: Self = this.set("pieCombination", js.undefined)
    @scala.inline
    def setScatter(value: String): Self = this.set("scatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScatter: Self = this.set("scatter", js.undefined)
    @scala.inline
    def setScatterCombination(value: String): Self = this.set("scatterCombination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScatterCombination: Self = this.set("scatterCombination", js.undefined)
    @scala.inline
    def setSpline(value: String): Self = this.set("spline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpline: Self = this.set("spline", js.undefined)
    @scala.inline
    def setSplineCombination(value: String): Self = this.set("splineCombination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplineCombination: Self = this.set("splineCombination", js.undefined)
  }
  
}

