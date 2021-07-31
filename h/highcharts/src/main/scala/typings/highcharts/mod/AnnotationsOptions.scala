package typings.highcharts.mod

import typings.highcharts.anon.PartialAnimationOptionsOb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationsOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable the initial
    * animation when a series is displayed for the `annotation`. The animation
    * can also be set as a configuration object. Please note that this option
    * only applies to the initial animation. For other animations, see
    * chart.animation and the animation parameter under the API methods. The
    * following properties are supported:
    *
    * - `defer`: The animation delay time in milliseconds.
    */
  var animation: js.UndefOr[Boolean | AnnotationsAnimationOptions | PartialAnimationOptionsOb] = js.undefined
  
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
  def apply(): AnnotationsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsOptions]
  }
  
  @scala.inline
  implicit class AnnotationsOptionsMutableBuilder[Self <: AnnotationsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: Boolean | AnnotationsAnimationOptions | PartialAnimationOptionsOb): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setControlPointOptions(value: AnnotationControlPointOptionsObject): Self = StObject.set(x, "controlPointOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlPointOptionsUndefined: Self = StObject.set(x, "controlPointOptions", js.undefined)
    
    @scala.inline
    def setCrookedLine(value: AnnotationsCrookedLineOptions): Self = StObject.set(x, "crookedLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrookedLineUndefined: Self = StObject.set(x, "crookedLine", js.undefined)
    
    @scala.inline
    def setDraggable(value: AnnotationDraggableValue): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setElliottWave(value: AnnotationsElliottWaveOptions): Self = StObject.set(x, "elliottWave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElliottWaveUndefined: Self = StObject.set(x, "elliottWave", js.undefined)
    
    @scala.inline
    def setEvents(value: AnnotationsEventsOptions): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setFibonacci(value: AnnotationsFibonacciOptions): Self = StObject.set(x, "fibonacci", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFibonacciUndefined: Self = StObject.set(x, "fibonacci", js.undefined)
    
    @scala.inline
    def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInfinityLine(value: AnnotationsInfinityLineOptions): Self = StObject.set(x, "infinityLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfinityLineUndefined: Self = StObject.set(x, "infinityLine", js.undefined)
    
    @scala.inline
    def setLabelOptions(value: AnnotationsLabelOptions): Self = StObject.set(x, "labelOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelOptionsUndefined: Self = StObject.set(x, "labelOptions", js.undefined)
    
    @scala.inline
    def setLabels(value: js.Array[AnnotationsLabelsOptions]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: AnnotationsLabelsOptions*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    @scala.inline
    def setMeasure(value: AnnotationsMeasureOptions): Self = StObject.set(x, "measure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureUndefined: Self = StObject.set(x, "measure", js.undefined)
    
    @scala.inline
    def setPitchfork(value: AnnotationsPitchforkOptions): Self = StObject.set(x, "pitchfork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPitchforkUndefined: Self = StObject.set(x, "pitchfork", js.undefined)
    
    @scala.inline
    def setShapeOptions(value: AnnotationsShapeOptions): Self = StObject.set(x, "shapeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeOptionsUndefined: Self = StObject.set(x, "shapeOptions", js.undefined)
    
    @scala.inline
    def setShapes(value: js.Array[AnnotationsShapesOptions]): Self = StObject.set(x, "shapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapesUndefined: Self = StObject.set(x, "shapes", js.undefined)
    
    @scala.inline
    def setShapesVarargs(value: AnnotationsShapesOptions*): Self = StObject.set(x, "shapes", js.Array(value :_*))
    
    @scala.inline
    def setTunnel(value: AnnotationsTunnelOptions): Self = StObject.set(x, "tunnel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTunnelUndefined: Self = StObject.set(x, "tunnel", js.undefined)
    
    @scala.inline
    def setVerticalLine(value: AnnotationsVerticalLineOptions): Self = StObject.set(x, "verticalLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalLineUndefined: Self = StObject.set(x, "verticalLine", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
