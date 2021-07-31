package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationMetadata extends StObject {
  
  /** App Engine flexible environment is available in the given location.@OutputOnly */
  var flexibleEnvironmentAvailable: js.UndefOr[Boolean] = js.undefined
  
  /** App Engine standard environment is available in the given location.@OutputOnly */
  var standardEnvironmentAvailable: js.UndefOr[Boolean] = js.undefined
}
object LocationMetadata {
  
  @scala.inline
  def apply(): LocationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationMetadata]
  }
  
  @scala.inline
  implicit class LocationMetadataMutableBuilder[Self <: LocationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlexibleEnvironmentAvailable(value: Boolean): Self = StObject.set(x, "flexibleEnvironmentAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexibleEnvironmentAvailableUndefined: Self = StObject.set(x, "flexibleEnvironmentAvailable", js.undefined)
    
    @scala.inline
    def setStandardEnvironmentAvailable(value: Boolean): Self = StObject.set(x, "standardEnvironmentAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardEnvironmentAvailableUndefined: Self = StObject.set(x, "standardEnvironmentAvailable", js.undefined)
  }
}
