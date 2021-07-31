package typings.leafletGeosearch.mod

import typings.leafletGeosearch.anon.Raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenStreetMapProviderReverseSearch extends StObject {
  
  var data: Raw
}
object OpenStreetMapProviderReverseSearch {
  
  @scala.inline
  def apply(data: Raw): OpenStreetMapProviderReverseSearch = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenStreetMapProviderReverseSearch]
  }
  
  @scala.inline
  implicit class OpenStreetMapProviderReverseSearchMutableBuilder[Self <: OpenStreetMapProviderReverseSearch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Raw): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
