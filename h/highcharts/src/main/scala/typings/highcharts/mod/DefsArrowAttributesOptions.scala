package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefsArrowAttributesOptions extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var markerHeight: js.UndefOr[Double] = js.undefined
  
  var markerWidth: js.UndefOr[Double] = js.undefined
  
  var refX: js.UndefOr[Double] = js.undefined
  
  var refY: js.UndefOr[Double] = js.undefined
}
object DefsArrowAttributesOptions {
  
  inline def apply(): DefsArrowAttributesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefsArrowAttributesOptions]
  }
  
  extension [Self <: DefsArrowAttributesOptions](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMarkerHeight(value: Double): Self = StObject.set(x, "markerHeight", value.asInstanceOf[js.Any])
    
    inline def setMarkerHeightUndefined: Self = StObject.set(x, "markerHeight", js.undefined)
    
    inline def setMarkerWidth(value: Double): Self = StObject.set(x, "markerWidth", value.asInstanceOf[js.Any])
    
    inline def setMarkerWidthUndefined: Self = StObject.set(x, "markerWidth", js.undefined)
    
    inline def setRefX(value: Double): Self = StObject.set(x, "refX", value.asInstanceOf[js.Any])
    
    inline def setRefXUndefined: Self = StObject.set(x, "refX", js.undefined)
    
    inline def setRefY(value: Double): Self = StObject.set(x, "refY", value.asInstanceOf[js.Any])
    
    inline def setRefYUndefined: Self = StObject.set(x, "refY", js.undefined)
  }
}
