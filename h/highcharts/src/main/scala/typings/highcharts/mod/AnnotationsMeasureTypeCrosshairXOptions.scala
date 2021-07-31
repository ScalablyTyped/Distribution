package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationsMeasureTypeCrosshairXOptions extends StObject {
  
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
  def apply(): AnnotationsMeasureTypeCrosshairXOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsMeasureTypeCrosshairXOptions]
  }
  
  @scala.inline
  implicit class AnnotationsMeasureTypeCrosshairXOptionsMutableBuilder[Self <: AnnotationsMeasureTypeCrosshairXOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashStyle(value: DashStyleValue): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setMarkerEnd(value: String): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
