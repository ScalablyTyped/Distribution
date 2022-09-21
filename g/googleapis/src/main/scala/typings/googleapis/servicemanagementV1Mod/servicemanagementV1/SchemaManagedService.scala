package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManagedService extends StObject {
  
  /**
    * ID of the project that produces and owns this service.
    */
  var producerProjectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the service. See the [overview](https://cloud.google.com/service-infrastructure/docs/overview) for naming requirements.
    */
  var serviceName: js.UndefOr[String | Null] = js.undefined
}
object SchemaManagedService {
  
  inline def apply(): SchemaManagedService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedService]
  }
  
  extension [Self <: SchemaManagedService](x: Self) {
    
    inline def setProducerProjectId(value: String): Self = StObject.set(x, "producerProjectId", value.asInstanceOf[js.Any])
    
    inline def setProducerProjectIdNull: Self = StObject.set(x, "producerProjectId", null)
    
    inline def setProducerProjectIdUndefined: Self = StObject.set(x, "producerProjectId", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameNull: Self = StObject.set(x, "serviceName", null)
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
