package typings.googleapis.serviceusageV1Mod.serviceusageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for the `BatchEnableServices` method.
  */
trait SchemaBatchEnableServicesRequest extends StObject {
  
  /**
    * The identifiers of the services to enable on the project.  A valid
    * identifier would be: serviceusage.googleapis.com  Enabling services
    * requires that each service is public or is shared with the user enabling
    * the service.  Two or more services must be specified. To enable a single
    * service, use the `EnableService` method instead.  A single request can
    * enable a maximum of 20 services at a time. If more than 20 services are
    * specified, the request will fail, and no state changes will occur.
    */
  var serviceIds: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaBatchEnableServicesRequest {
  
  @scala.inline
  def apply(): SchemaBatchEnableServicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchEnableServicesRequest]
  }
  
  @scala.inline
  implicit class SchemaBatchEnableServicesRequestMutableBuilder[Self <: SchemaBatchEnableServicesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceIds(value: js.Array[String]): Self = StObject.set(x, "serviceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceIdsUndefined: Self = StObject.set(x, "serviceIds", js.undefined)
    
    @scala.inline
    def setServiceIdsVarargs(value: String*): Self = StObject.set(x, "serviceIds", js.Array(value :_*))
  }
}
