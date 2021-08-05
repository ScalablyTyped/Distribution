package typings.maximMazurokGapiClientComposer.gapi.client.composer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationsResource extends StObject {
  
  var environments: EnvironmentsResource
  
  var imageVersions: ImageVersionsResource
  
  var operations: OperationsResource
}
object LocationsResource {
  
  inline def apply(
    environments: EnvironmentsResource,
    imageVersions: ImageVersionsResource,
    operations: OperationsResource
  ): LocationsResource = {
    val __obj = js.Dynamic.literal(environments = environments.asInstanceOf[js.Any], imageVersions = imageVersions.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
  
  extension [Self <: LocationsResource](x: Self) {
    
    inline def setEnvironments(value: EnvironmentsResource): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
    
    inline def setImageVersions(value: ImageVersionsResource): Self = StObject.set(x, "imageVersions", value.asInstanceOf[js.Any])
    
    inline def setOperations(value: OperationsResource): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
  }
}
