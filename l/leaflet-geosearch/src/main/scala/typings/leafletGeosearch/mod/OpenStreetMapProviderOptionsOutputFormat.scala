package typings.leafletGeosearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenStreetMapProviderOptionsOutputFormat extends StObject {
  
  var json_callback: js.UndefOr[String] = js.undefined
}
object OpenStreetMapProviderOptionsOutputFormat {
  
  inline def apply(): OpenStreetMapProviderOptionsOutputFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenStreetMapProviderOptionsOutputFormat]
  }
  
  extension [Self <: OpenStreetMapProviderOptionsOutputFormat](x: Self) {
    
    inline def setJson_callback(value: String): Self = StObject.set(x, "json_callback", value.asInstanceOf[js.Any])
    
    inline def setJson_callbackUndefined: Self = StObject.set(x, "json_callback", js.undefined)
  }
}
