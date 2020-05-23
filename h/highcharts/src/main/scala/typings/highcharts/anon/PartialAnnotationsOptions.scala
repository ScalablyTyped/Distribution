package typings.highcharts.anon

import typings.highcharts.mod.AnnotationControlPointOptionsObject
import typings.highcharts.mod.AnnotationDraggableValue
import typings.highcharts.mod.AnnotationsCrookedLineOptions
import typings.highcharts.mod.AnnotationsElliottWaveOptions
import typings.highcharts.mod.AnnotationsEventsOptions
import typings.highcharts.mod.AnnotationsFibonacciOptions
import typings.highcharts.mod.AnnotationsInfinityLineOptions
import typings.highcharts.mod.AnnotationsLabelOptions
import typings.highcharts.mod.AnnotationsLabelsOptions
import typings.highcharts.mod.AnnotationsMeasureOptions
import typings.highcharts.mod.AnnotationsPitchforkOptions
import typings.highcharts.mod.AnnotationsShapeOptions
import typings.highcharts.mod.AnnotationsShapesOptions
import typings.highcharts.mod.AnnotationsTunnelOptions
import typings.highcharts.mod.AnnotationsVerticalLineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<highcharts.highcharts.AnnotationsOptions> */
trait PartialAnnotationsOptions extends js.Object {
  var controlPointOptions: js.UndefOr[AnnotationControlPointOptionsObject] = js.undefined
  var crookedLine: js.UndefOr[AnnotationsCrookedLineOptions] = js.undefined
  var draggable: js.UndefOr[AnnotationDraggableValue] = js.undefined
  var elliottWave: js.UndefOr[AnnotationsElliottWaveOptions] = js.undefined
  var events: js.UndefOr[AnnotationsEventsOptions] = js.undefined
  var fibonacci: js.UndefOr[AnnotationsFibonacciOptions] = js.undefined
  var id: js.UndefOr[Double | String] = js.undefined
  var infinityLine: js.UndefOr[AnnotationsInfinityLineOptions] = js.undefined
  var labelOptions: js.UndefOr[AnnotationsLabelOptions] = js.undefined
  var labels: js.UndefOr[js.Array[AnnotationsLabelsOptions]] = js.undefined
  var measure: js.UndefOr[AnnotationsMeasureOptions] = js.undefined
  var pitchfork: js.UndefOr[AnnotationsPitchforkOptions] = js.undefined
  var shapeOptions: js.UndefOr[AnnotationsShapeOptions] = js.undefined
  var shapes: js.UndefOr[js.Array[AnnotationsShapesOptions]] = js.undefined
  var tunnel: js.UndefOr[AnnotationsTunnelOptions] = js.undefined
  var verticalLine: js.UndefOr[AnnotationsVerticalLineOptions] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object PartialAnnotationsOptions {
  @scala.inline
  def apply(
    controlPointOptions: AnnotationControlPointOptionsObject = null,
    crookedLine: AnnotationsCrookedLineOptions = null,
    draggable: AnnotationDraggableValue = null,
    elliottWave: AnnotationsElliottWaveOptions = null,
    events: AnnotationsEventsOptions = null,
    fibonacci: AnnotationsFibonacciOptions = null,
    id: Double | String = null,
    infinityLine: AnnotationsInfinityLineOptions = null,
    labelOptions: AnnotationsLabelOptions = null,
    labels: js.Array[AnnotationsLabelsOptions] = null,
    measure: AnnotationsMeasureOptions = null,
    pitchfork: AnnotationsPitchforkOptions = null,
    shapeOptions: AnnotationsShapeOptions = null,
    shapes: js.Array[AnnotationsShapesOptions] = null,
    tunnel: AnnotationsTunnelOptions = null,
    verticalLine: AnnotationsVerticalLineOptions = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): PartialAnnotationsOptions = {
    val __obj = js.Dynamic.literal()
    if (controlPointOptions != null) __obj.updateDynamic("controlPointOptions")(controlPointOptions.asInstanceOf[js.Any])
    if (crookedLine != null) __obj.updateDynamic("crookedLine")(crookedLine.asInstanceOf[js.Any])
    if (draggable != null) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (elliottWave != null) __obj.updateDynamic("elliottWave")(elliottWave.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (fibonacci != null) __obj.updateDynamic("fibonacci")(fibonacci.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (infinityLine != null) __obj.updateDynamic("infinityLine")(infinityLine.asInstanceOf[js.Any])
    if (labelOptions != null) __obj.updateDynamic("labelOptions")(labelOptions.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (measure != null) __obj.updateDynamic("measure")(measure.asInstanceOf[js.Any])
    if (pitchfork != null) __obj.updateDynamic("pitchfork")(pitchfork.asInstanceOf[js.Any])
    if (shapeOptions != null) __obj.updateDynamic("shapeOptions")(shapeOptions.asInstanceOf[js.Any])
    if (shapes != null) __obj.updateDynamic("shapes")(shapes.asInstanceOf[js.Any])
    if (tunnel != null) __obj.updateDynamic("tunnel")(tunnel.asInstanceOf[js.Any])
    if (verticalLine != null) __obj.updateDynamic("verticalLine")(verticalLine.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialAnnotationsOptions]
  }
}

