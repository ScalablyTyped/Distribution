package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefsReverseArrowOptions extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var markerHeight: js.UndefOr[Double] = js.undefined
  
  var markerWidth: js.UndefOr[Double] = js.undefined
  
  var refX: js.UndefOr[Double] = js.undefined
  
  var refY: js.UndefOr[Double] = js.undefined
  
  var render: js.UndefOr[Boolean] = js.undefined
  
  var tagName: js.UndefOr[String] = js.undefined
}
object DefsReverseArrowOptions {
  
  inline def apply(): DefsReverseArrowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefsReverseArrowOptions]
  }
  
  extension [Self <: DefsReverseArrowOptions](x: Self) {
    
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
    
    inline def setRender(value: Boolean): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
  }
}
