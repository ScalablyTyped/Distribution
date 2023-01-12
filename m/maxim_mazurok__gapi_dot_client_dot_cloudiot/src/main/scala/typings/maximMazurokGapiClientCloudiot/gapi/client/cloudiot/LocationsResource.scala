package typings.maximMazurokGapiClientCloudiot.gapi.client.cloudiot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationsResource extends StObject {
  
  var registries: RegistriesResource
}
object LocationsResource {
  
  inline def apply(registries: RegistriesResource): LocationsResource = {
    val __obj = js.Dynamic.literal(registries = registries.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocationsResource] (val x: Self) extends AnyVal {
    
    inline def setRegistries(value: RegistriesResource): Self = StObject.set(x, "registries", value.asInstanceOf[js.Any])
  }
}
