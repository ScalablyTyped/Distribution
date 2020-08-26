package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationAnnotationsOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's control
    * points. Each control point inherits options from controlPointOptions
    * object. Options from the controlPointOptions can be overwritten by
    * options in a specific control point.
    */
  var controlPointOptions: js.UndefOr[AnnotationControlPointOptionsObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Allow an annotation to be
    * draggable by a user. Possible values are `'x'`, `'xy'`, `'y'` and `''`
    * (disabled).
    */
  var draggable: js.UndefOr[AnnotationDraggableValue] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Events available in annotations.
    */
  var events: js.UndefOr[NavigationAnnotationsEventsOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Sets an ID for an annotation.
    * Can be user later when removing an annotation in
    * Chart.removeAnnotation(id) method.
    */
  var id: js.UndefOr[Double | String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's labels.
    * Each label inherits options from the labelOptions object. An option from
    * the labelOptions can be overwritten by config for a specific label.
    */
  var labelOptions: js.UndefOr[NavigationAnnotationsLabelOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An array of labels for the
    * annotation. For options that apply to multiple labels, they can be added
    * to the labelOptions.
    */
  var labels: js.UndefOr[js.Array[NavigationAnnotationsLabelsOptions]] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's shapes.
    * Each shape inherits options from the shapeOptions object. An option from
    * the shapeOptions can be overwritten by config for a specific shape.
    */
  var shapeOptions: js.UndefOr[NavigationAnnotationsShapeOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An array of shapes for the
    * annotation. For options that apply to multiple shapes, then can be added
    * to the shapeOptions.
    */
  var shapes: js.UndefOr[js.Array[NavigationAnnotationsShapesOptions]] = js.native
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

object NavigationAnnotationsOptions {
  @scala.inline
  def apply(): NavigationAnnotationsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationAnnotationsOptions]
  }
  @scala.inline
  implicit class NavigationAnnotationsOptionsOps[Self <: NavigationAnnotationsOptions] (val x: Self) extends AnyVal {
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
    def setDraggable(value: AnnotationDraggableValue): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setEvents(value: NavigationAnnotationsEventsOptions): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setId(value: Double | String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLabelOptions(value: NavigationAnnotationsLabelOptions): Self = this.set("labelOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelOptions: Self = this.set("labelOptions", js.undefined)
    @scala.inline
    def setLabelsVarargs(value: NavigationAnnotationsLabelsOptions*): Self = this.set("labels", js.Array(value :_*))
    @scala.inline
    def setLabels(value: js.Array[NavigationAnnotationsLabelsOptions]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setShapeOptions(value: NavigationAnnotationsShapeOptions): Self = this.set("shapeOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShapeOptions: Self = this.set("shapeOptions", js.undefined)
    @scala.inline
    def setShapesVarargs(value: NavigationAnnotationsShapesOptions*): Self = this.set("shapes", js.Array(value :_*))
    @scala.inline
    def setShapes(value: js.Array[NavigationAnnotationsShapesOptions]): Self = this.set("shapes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShapes: Self = this.set("shapes", js.undefined)
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

