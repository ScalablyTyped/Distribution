package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsMeasureTypeCrosshairXOptions extends js.Object {
  /**
    * (Highstock) The dash or dot style of the crosshair's line. For possible
    * values, see this demonstration.
    */
  var dashStyle: js.UndefOr[DashStyleValue] = js.undefined
  /**
    * (Highstock) Enable or disable the horizontal crosshair.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock) The marker-end defines the arrowhead that will be drawn at
    * the final vertex of the given crosshair's path.
    */
  var markerEnd: js.UndefOr[String] = js.undefined
  /**
    * (Highstock) The Z index of the crosshair in annotation.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object AnnotationsMeasureTypeCrosshairXOptions {
  @scala.inline
  def apply(
    dashStyle: DashStyleValue = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    markerEnd: String = null,
    zIndex: Int | Double = null
  ): AnnotationsMeasureTypeCrosshairXOptions = {
    val __obj = js.Dynamic.literal()
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (markerEnd != null) __obj.updateDynamic("markerEnd")(markerEnd)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsMeasureTypeCrosshairXOptions]
  }
}

