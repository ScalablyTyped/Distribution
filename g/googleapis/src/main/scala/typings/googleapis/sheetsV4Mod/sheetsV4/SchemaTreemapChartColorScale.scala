package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A color scale for a treemap chart.
  */
@js.native
trait SchemaTreemapChartColorScale extends js.Object {
  /**
    * The background color for cells with a color value greater than or equal
    * to maxValue. Defaults to #109618 if not specified.
    */
  var maxValueColor: js.UndefOr[SchemaColor] = js.native
  /**
    * The background color for cells with a color value at the midpoint between
    * minValue and maxValue. Defaults to #efe6dc if not specified.
    */
  var midValueColor: js.UndefOr[SchemaColor] = js.native
  /**
    * The background color for cells with a color value less than or equal to
    * minValue. Defaults to #dc3912 if not specified.
    */
  var minValueColor: js.UndefOr[SchemaColor] = js.native
  /**
    * The background color for cells that have no color data associated with
    * them. Defaults to #000000 if not specified.
    */
  var noDataColor: js.UndefOr[SchemaColor] = js.native
}

object SchemaTreemapChartColorScale {
  @scala.inline
  def apply(
    maxValueColor: SchemaColor = null,
    midValueColor: SchemaColor = null,
    minValueColor: SchemaColor = null,
    noDataColor: SchemaColor = null
  ): SchemaTreemapChartColorScale = {
    val __obj = js.Dynamic.literal()
    if (maxValueColor != null) __obj.updateDynamic("maxValueColor")(maxValueColor.asInstanceOf[js.Any])
    if (midValueColor != null) __obj.updateDynamic("midValueColor")(midValueColor.asInstanceOf[js.Any])
    if (minValueColor != null) __obj.updateDynamic("minValueColor")(minValueColor.asInstanceOf[js.Any])
    if (noDataColor != null) __obj.updateDynamic("noDataColor")(noDataColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTreemapChartColorScale]
  }
}

