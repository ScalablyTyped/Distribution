package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsMeasureTypeCrosshairYOptions extends js.Object {
  /**
    * (Highstock) The dash or dot style of the crosshair's line. For possible
    * values, see this demonstration.
    */
  var dashStyle: js.UndefOr[DashStyleValue] = js.undefined
  /**
    * (Highstock) Enable or disable the vertical crosshair.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock) The marker-end defines the arrowhead that will be drawn at
    * the final vertex of the given crosshair's path.
    */
  var markerEnd: js.UndefOr[OptionsMarkerEndValue] = js.undefined
  /**
    * (Highstock) The Z index of the crosshair in annotation.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object AnnotationsMeasureTypeCrosshairYOptions {
  @scala.inline
  def apply(
    dashStyle: DashStyleValue = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    markerEnd: OptionsMarkerEndValue = null,
    zIndex: js.UndefOr[Double] = js.undefined
  ): AnnotationsMeasureTypeCrosshairYOptions = {
    val __obj = js.Dynamic.literal()
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (markerEnd != null) __obj.updateDynamic("markerEnd")(markerEnd.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsMeasureTypeCrosshairYOptions]
  }
}

