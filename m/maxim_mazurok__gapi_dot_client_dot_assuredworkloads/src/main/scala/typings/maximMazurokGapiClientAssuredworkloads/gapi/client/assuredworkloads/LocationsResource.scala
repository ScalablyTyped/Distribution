package typings.maximMazurokGapiClientAssuredworkloads.gapi.client.assuredworkloads

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationsResource extends StObject {
  
  var operations: OperationsResource
  
  var workloads: WorkloadsResource
}
object LocationsResource {
  
  @scala.inline
  def apply(operations: OperationsResource, workloads: WorkloadsResource): LocationsResource = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any], workloads = workloads.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
  
  @scala.inline
  implicit class LocationsResourceMutableBuilder[Self <: LocationsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperations(value: OperationsResource): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkloads(value: WorkloadsResource): Self = StObject.set(x, "workloads", value.asInstanceOf[js.Any])
  }
}
