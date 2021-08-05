package typings.leafletGeosearch.mod

import typings.leafletGeosearch.anon.Raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenStreetMapProviderReverseSearch extends StObject {
  
  var data: Raw
}
object OpenStreetMapProviderReverseSearch {
  
  inline def apply(data: Raw): OpenStreetMapProviderReverseSearch = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenStreetMapProviderReverseSearch]
  }
  
  extension [Self <: OpenStreetMapProviderReverseSearch](x: Self) {
    
    inline def setData(value: Raw): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
