package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationMetadata extends StObject {
  
  /** App Engine flexible environment is available in the given location.@OutputOnly */
  var flexibleEnvironmentAvailable: js.UndefOr[Boolean] = js.undefined
  
  /** Output only. Search API (https://cloud.google.com/appengine/docs/standard/python/search) is available in the given location. */
  var searchApiAvailable: js.UndefOr[Boolean] = js.undefined
  
  /** App Engine standard environment is available in the given location.@OutputOnly */
  var standardEnvironmentAvailable: js.UndefOr[Boolean] = js.undefined
}
object LocationMetadata {
  
  inline def apply(): LocationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationMetadata]
  }
  
  extension [Self <: LocationMetadata](x: Self) {
    
    inline def setFlexibleEnvironmentAvailable(value: Boolean): Self = StObject.set(x, "flexibleEnvironmentAvailable", value.asInstanceOf[js.Any])
    
    inline def setFlexibleEnvironmentAvailableUndefined: Self = StObject.set(x, "flexibleEnvironmentAvailable", js.undefined)
    
    inline def setSearchApiAvailable(value: Boolean): Self = StObject.set(x, "searchApiAvailable", value.asInstanceOf[js.Any])
    
    inline def setSearchApiAvailableUndefined: Self = StObject.set(x, "searchApiAvailable", js.undefined)
    
    inline def setStandardEnvironmentAvailable(value: Boolean): Self = StObject.set(x, "standardEnvironmentAvailable", value.asInstanceOf[js.Any])
    
    inline def setStandardEnvironmentAvailableUndefined: Self = StObject.set(x, "standardEnvironmentAvailable", js.undefined)
  }
}
