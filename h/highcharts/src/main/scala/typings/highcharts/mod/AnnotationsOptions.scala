package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationsOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's control
    * points. Each control point inherits options from controlPointOptions
    * object. Options from the controlPointOptions can be overwritten by
    * options in a specific control point.
    */
  var controlPointOptions: js.UndefOr[AnnotationControlPointOptionsObject] = js.native
  /**
    * (Highstock) A crooked line annotation.
    */
  var crookedLine: js.UndefOr[AnnotationsCrookedLineOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Allow an annotation to be
    * draggable by a user. Possible values are `'x'`, `'xy'`, `'y'` and `''`
    * (disabled).
    */
  var draggable: js.UndefOr[AnnotationDraggableValue] = js.native
  /**
    * (Highstock) An elliott wave annotation.
    */
  var elliottWave: js.UndefOr[AnnotationsElliottWaveOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Events available in annotations.
    */
  var events: js.UndefOr[AnnotationsEventsOptions] = js.native
  /**
    * (Highstock) A fibonacci annotation.
    */
  var fibonacci: js.UndefOr[AnnotationsFibonacciOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Sets an ID for an annotation.
    * Can be user later when removing an annotation in
    * Chart.removeAnnotation(id) method.
    */
  var id: js.UndefOr[Double | String] = js.native
  /**
    * (Highstock) An infinity line annotation.
    */
  var infinityLine: js.UndefOr[AnnotationsInfinityLineOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's labels.
    * Each label inherits options from the labelOptions object. An option from
    * the labelOptions can be overwritten by config for a specific label.
    */
  var labelOptions: js.UndefOr[AnnotationsLabelOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An array of labels for the
    * annotation. For options that apply to multiple labels, they can be added
    * to the labelOptions.
    */
  var labels: js.UndefOr[js.Array[AnnotationsLabelsOptions]] = js.native
  /**
    * (Highstock) A measure annotation.
    */
  var measure: js.UndefOr[AnnotationsMeasureOptions] = js.native
  /**
    * (Highstock) A pitchfork annotation.
    */
  var pitchfork: js.UndefOr[AnnotationsPitchforkOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's shapes.
    * Each shape inherits options from the shapeOptions object. An option from
    * the shapeOptions can be overwritten by config for a specific shape.
    */
  var shapeOptions: js.UndefOr[AnnotationsShapeOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An array of shapes for the
    * annotation. For options that apply to multiple shapes, then can be added
    * to the shapeOptions.
    */
  var shapes: js.UndefOr[js.Array[AnnotationsShapesOptions]] = js.native
  /**
    * (Highstock) A tunnel annotation.
    */
  var tunnel: js.UndefOr[AnnotationsTunnelOptions] = js.native
  /**
    * (Highstock) A vertical line annotation.
    */
  var verticalLine: js.UndefOr[AnnotationsVerticalLineOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether the annotation is
    * visible.
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The Z index of the annotation.
    */
  var zIndex: js.UndefOr[Double] = js.native
}

object AnnotationsOptions {
  @scala.inline
  def apply(): AnnotationsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsOptions]
  }
  @scala.inline
  implicit class AnnotationsOptionsOps[Self <: AnnotationsOptions] (val x: Self) extends AnyVal {
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
    def setControlPointOptions(value: AnnotationControlPointOptionsObject): Self = this.set("controlPointOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlPointOptions: Self = this.set("controlPointOptions", js.undefined)
    @scala.inline
    def setCrookedLine(value: AnnotationsCrookedLineOptions): Self = this.set("crookedLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrookedLine: Self = this.set("crookedLine", js.undefined)
    @scala.inline
    def setDraggable(value: AnnotationDraggableValue): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setElliottWave(value: AnnotationsElliottWaveOptions): Self = this.set("elliottWave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElliottWave: Self = this.set("elliottWave", js.undefined)
    @scala.inline
    def setEvents(value: AnnotationsEventsOptions): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setFibonacci(value: AnnotationsFibonacciOptions): Self = this.set("fibonacci", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFibonacci: Self = this.set("fibonacci", js.undefined)
    @scala.inline
    def setId(value: Double | String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInfinityLine(value: AnnotationsInfinityLineOptions): Self = this.set("infinityLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfinityLine: Self = this.set("infinityLine", js.undefined)
    @scala.inline
    def setLabelOptions(value: AnnotationsLabelOptions): Self = this.set("labelOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelOptions: Self = this.set("labelOptions", js.undefined)
    @scala.inline
    def setLabelsVarargs(value: AnnotationsLabelsOptions*): Self = this.set("labels", js.Array(value :_*))
    @scala.inline
    def setLabels(value: js.Array[AnnotationsLabelsOptions]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setMeasure(value: AnnotationsMeasureOptions): Self = this.set("measure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeasure: Self = this.set("measure", js.undefined)
    @scala.inline
    def setPitchfork(value: AnnotationsPitchforkOptions): Self = this.set("pitchfork", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePitchfork: Self = this.set("pitchfork", js.undefined)
    @scala.inline
    def setShapeOptions(value: AnnotationsShapeOptions): Self = this.set("shapeOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShapeOptions: Self = this.set("shapeOptions", js.undefined)
    @scala.inline
    def setShapesVarargs(value: AnnotationsShapesOptions*): Self = this.set("shapes", js.Array(value :_*))
    @scala.inline
    def setShapes(value: js.Array[AnnotationsShapesOptions]): Self = this.set("shapes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShapes: Self = this.set("shapes", js.undefined)
    @scala.inline
    def setTunnel(value: AnnotationsTunnelOptions): Self = this.set("tunnel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTunnel: Self = this.set("tunnel", js.undefined)
    @scala.inline
    def setVerticalLine(value: AnnotationsVerticalLineOptions): Self = this.set("verticalLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalLine: Self = this.set("verticalLine", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

