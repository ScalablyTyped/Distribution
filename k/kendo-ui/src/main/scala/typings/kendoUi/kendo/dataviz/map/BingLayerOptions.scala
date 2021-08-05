package typings.kendoUi.kendo.dataviz.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BingLayerOptions extends StObject {
  
  var baseUrl: js.UndefOr[String] = js.undefined
  
  var imagerySet: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object BingLayerOptions {
  
  inline def apply(): BingLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BingLayerOptions]
  }
  
  extension [Self <: BingLayerOptions](x: Self) {
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    inline def setImagerySet(value: String): Self = StObject.set(x, "imagerySet", value.asInstanceOf[js.Any])
    
    inline def setImagerySetUndefined: Self = StObject.set(x, "imagerySet", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
