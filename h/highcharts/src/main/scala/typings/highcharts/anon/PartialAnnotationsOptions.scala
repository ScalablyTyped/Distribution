package typings.highcharts.anon

import typings.highcharts.mod.AnnotationControlPointOptionsObject
import typings.highcharts.mod.AnnotationDraggableValue
import typings.highcharts.mod.AnnotationsAnimationOptions
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<highcharts.highcharts.AnnotationsOptions> */
@js.native
trait PartialAnnotationsOptions extends js.Object {
  
  var animation: js.UndefOr[Boolean | AnnotationsAnimationOptions | PartialAnimationOptionsOb] = js.native
  
  var controlPointOptions: js.UndefOr[AnnotationControlPointOptionsObject] = js.native
  
  var crookedLine: js.UndefOr[AnnotationsCrookedLineOptions] = js.native
  
  var draggable: js.UndefOr[AnnotationDraggableValue] = js.native
  
  var elliottWave: js.UndefOr[AnnotationsElliottWaveOptions] = js.native
  
  var events: js.UndefOr[AnnotationsEventsOptions] = js.native
  
  var fibonacci: js.UndefOr[AnnotationsFibonacciOptions] = js.native
  
  var id: js.UndefOr[Double | String] = js.native
  
  var infinityLine: js.UndefOr[AnnotationsInfinityLineOptions] = js.native
  
  var labelOptions: js.UndefOr[AnnotationsLabelOptions] = js.native
  
  var labels: js.UndefOr[js.Array[AnnotationsLabelsOptions]] = js.native
  
  var measure: js.UndefOr[AnnotationsMeasureOptions] = js.native
  
  var pitchfork: js.UndefOr[AnnotationsPitchforkOptions] = js.native
  
  var shapeOptions: js.UndefOr[AnnotationsShapeOptions] = js.native
  
  var shapes: js.UndefOr[js.Array[AnnotationsShapesOptions]] = js.native
  
  var tunnel: js.UndefOr[AnnotationsTunnelOptions] = js.native
  
  var verticalLine: js.UndefOr[AnnotationsVerticalLineOptions] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object PartialAnnotationsOptions {
  
  @scala.inline
  def apply(): PartialAnnotationsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAnnotationsOptions]
  }
  
  @scala.inline
  implicit class PartialAnnotationsOptionsOps[Self <: PartialAnnotationsOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimation(value: Boolean | AnnotationsAnimationOptions | PartialAnimationOptionsOb): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
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
