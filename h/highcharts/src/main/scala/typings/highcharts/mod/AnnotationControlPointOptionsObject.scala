package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationControlPointOptionsObject extends StObject {
  
  var height: js.UndefOr[Double] = js.undefined
  
  var positioner: js.UndefOr[AnnotationControlPointPositionerFunction] = js.undefined
  
  var style: js.UndefOr[
    AnnotationsControlPointStyleOptions | NavigationAnnotationsControlPointStyleOptions
  ] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object AnnotationControlPointOptionsObject {
  
  inline def apply(): AnnotationControlPointOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationControlPointOptionsObject]
  }
  
  extension [Self <: AnnotationControlPointOptionsObject](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setPositioner(value: AnnotationControlPointPositionerFunction): Self = StObject.set(x, "positioner", value.asInstanceOf[js.Any])
    
    inline def setPositionerUndefined: Self = StObject.set(x, "positioner", js.undefined)
    
    inline def setStyle(value: AnnotationsControlPointStyleOptions | NavigationAnnotationsControlPointStyleOptions): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
