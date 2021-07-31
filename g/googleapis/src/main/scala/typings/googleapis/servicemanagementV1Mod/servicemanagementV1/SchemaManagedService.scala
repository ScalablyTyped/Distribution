package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The full representation of a Service that is managed by Google Service
  * Management.
  */
trait SchemaManagedService extends StObject {
  
  /**
    * ID of the project that produces and owns this service.
    */
  var producerProjectId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the service. See the [overview](/service-management/overview)
    * for naming requirements.
    */
  var serviceName: js.UndefOr[String] = js.undefined
}
object SchemaManagedService {
  
  @scala.inline
  def apply(): SchemaManagedService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedService]
  }
  
  @scala.inline
  implicit class SchemaManagedServiceMutableBuilder[Self <: SchemaManagedService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProducerProjectId(value: String): Self = StObject.set(x, "producerProjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProducerProjectIdUndefined: Self = StObject.set(x, "producerProjectId", js.undefined)
    
    @scala.inline
    def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
