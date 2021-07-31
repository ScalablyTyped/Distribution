package typings.maximMazurokGapiClientCloudbilling.gapi.client.cloudbilling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Service extends StObject {
  
  /** The business under which the service is offered. Ex. "businessEntities/GCP", "businessEntities/Maps" */
  var businessEntityName: js.UndefOr[String] = js.undefined
  
  /** A human readable display name for this service. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The resource name for the service. Example: "services/DA34-426B-A397" */
  var name: js.UndefOr[String] = js.undefined
  
  /** The identifier for the service. Example: "DA34-426B-A397" */
  var serviceId: js.UndefOr[String] = js.undefined
}
object Service {
  
  @scala.inline
  def apply(): Service = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Service]
  }
  
  @scala.inline
  implicit class ServiceMutableBuilder[Self <: Service] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBusinessEntityName(value: String): Self = StObject.set(x, "businessEntityName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusinessEntityNameUndefined: Self = StObject.set(x, "businessEntityName", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceIdUndefined: Self = StObject.set(x, "serviceId", js.undefined)
  }
}
