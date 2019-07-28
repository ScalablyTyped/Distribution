package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockToolsGuiDefinitionsLinesOptions extends js.Object {
  var arrowLine: js.UndefOr[StockToolsGuiDefinitionsLinesArrowLineOptions] = js.undefined
  var arrowRay: js.UndefOr[StockToolsGuiDefinitionsLinesArrowRayOptions] = js.undefined
  var arrowSegment: js.UndefOr[StockToolsGuiDefinitionsLinesArrowSegmentOptions] = js.undefined
  var horizontalLine: js.UndefOr[StockToolsGuiDefinitionsLinesHorizontalLineOptions] = js.undefined
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[_]] = js.undefined
  var line: js.UndefOr[StockToolsGuiDefinitionsLinesLineOptions] = js.undefined
  var ray: js.UndefOr[StockToolsGuiDefinitionsLinesRayOptions] = js.undefined
  var segment: js.UndefOr[StockToolsGuiDefinitionsLinesSegmentOptions] = js.undefined
  var verticalLine: js.UndefOr[StockToolsGuiDefinitionsLinesVerticalLineOptions] = js.undefined
}

object StockToolsGuiDefinitionsLinesOptions {
  @scala.inline
  def apply(
    arrowLine: StockToolsGuiDefinitionsLinesArrowLineOptions = null,
    arrowRay: StockToolsGuiDefinitionsLinesArrowRayOptions = null,
    arrowSegment: StockToolsGuiDefinitionsLinesArrowSegmentOptions = null,
    horizontalLine: StockToolsGuiDefinitionsLinesHorizontalLineOptions = null,
    items: js.Array[_] = null,
    line: StockToolsGuiDefinitionsLinesLineOptions = null,
    ray: StockToolsGuiDefinitionsLinesRayOptions = null,
    segment: StockToolsGuiDefinitionsLinesSegmentOptions = null,
    verticalLine: StockToolsGuiDefinitionsLinesVerticalLineOptions = null
  ): StockToolsGuiDefinitionsLinesOptions = {
    val __obj = js.Dynamic.literal()
    if (arrowLine != null) __obj.updateDynamic("arrowLine")(arrowLine)
    if (arrowRay != null) __obj.updateDynamic("arrowRay")(arrowRay)
    if (arrowSegment != null) __obj.updateDynamic("arrowSegment")(arrowSegment)
    if (horizontalLine != null) __obj.updateDynamic("horizontalLine")(horizontalLine)
    if (items != null) __obj.updateDynamic("items")(items)
    if (line != null) __obj.updateDynamic("line")(line)
    if (ray != null) __obj.updateDynamic("ray")(ray)
    if (segment != null) __obj.updateDynamic("segment")(segment)
    if (verticalLine != null) __obj.updateDynamic("verticalLine")(verticalLine)
    __obj.asInstanceOf[StockToolsGuiDefinitionsLinesOptions]
  }
}

