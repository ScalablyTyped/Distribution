package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's control
    * points. Each control point inherits options from controlPointOptions
    * object. Options from the controlPointOptions can be overwritten by
    * options in a specific control point.
    */
  var controlPointOptions: js.UndefOr[AnnotationControlPointOptionsObject] = js.undefined
  /**
    * (Highstock) A crooked line annotation.
    */
  var crookedLine: js.UndefOr[AnnotationsCrookedLineOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Allow an annotation to be
    * draggable by a user. Possible values are `'x'`, `'xy'`, `'y'` and `''`
    * (disabled).
    */
  var draggable: js.UndefOr[AnnotationDraggableValue] = js.undefined
  /**
    * (Highstock) An elliott wave annotation.
    */
  var elliottWave: js.UndefOr[AnnotationsElliottWaveOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Events available in annotations.
    */
  var events: js.UndefOr[AnnotationsEventsOptions] = js.undefined
  /**
    * (Highstock) A fibonacci annotation.
    */
  var fibonacci: js.UndefOr[AnnotationsFibonacciOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Sets an ID for an annotation.
    * Can be user later when removing an annotation in
    * Chart.removeAnnotation(id) method.
    */
  var id: js.UndefOr[Double | String] = js.undefined
  /**
    * (Highstock) An infinity line annotation.
    */
  var infinityLine: js.UndefOr[AnnotationsInfinityLineOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's labels.
    * Each label inherits options from the labelOptions object. An option from
    * the labelOptions can be overwritten by config for a specific label.
    */
  var labelOptions: js.UndefOr[AnnotationsLabelOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An array of labels for the
    * annotation. For options that apply to multiple labels, they can be added
    * to the labelOptions.
    */
  var labels: js.UndefOr[js.Array[AnnotationsLabelsOptions]] = js.undefined
  /**
    * (Highstock) A measure annotation.
    */
  var measure: js.UndefOr[AnnotationsMeasureOptions] = js.undefined
  /**
    * (Highstock) A pitchfork annotation.
    */
  var pitchfork: js.UndefOr[AnnotationsPitchforkOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's shapes.
    * Each shape inherits options from the shapeOptions object. An option from
    * the shapeOptions can be overwritten by config for a specific shape.
    */
  var shapeOptions: js.UndefOr[AnnotationsShapeOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An array of shapes for the
    * annotation. For options that apply to multiple shapes, then can be added
    * to the shapeOptions.
    */
  var shapes: js.UndefOr[js.Array[AnnotationsShapesOptions]] = js.undefined
  /**
    * (Highstock) A tunnel annotation.
    */
  var tunnel: js.UndefOr[AnnotationsTunnelOptions] = js.undefined
  /**
    * (Highstock) A vertical line annotation.
    */
  var verticalLine: js.UndefOr[AnnotationsVerticalLineOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether the annotation is
    * visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The Z index of the annotation.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object AnnotationsOptions {
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
  ): AnnotationsOptions = {
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
    __obj.asInstanceOf[AnnotationsOptions]
  }
}

