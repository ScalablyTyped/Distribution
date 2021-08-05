package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationsResource extends StObject {
  
  var builds: BuildsResource
  
  var operations: OperationsResource
}
object LocationsResource {
  
  inline def apply(builds: BuildsResource, operations: OperationsResource): LocationsResource = {
    val __obj = js.Dynamic.literal(builds = builds.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
  
  extension [Self <: LocationsResource](x: Self) {
    
    inline def setBuilds(value: BuildsResource): Self = StObject.set(x, "builds", value.asInstanceOf[js.Any])
    
    inline def setOperations(value: OperationsResource): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
  }
}
