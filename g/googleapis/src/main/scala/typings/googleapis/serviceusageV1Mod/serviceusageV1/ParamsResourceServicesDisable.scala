package typings.googleapis.serviceusageV1Mod.serviceusageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServicesDisable
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the consumer and service to disable the service on. The enable and disable methods currently only support projects. An example name would be: `projects/123/services/serviceusage.googleapis.com` where `123` is the project number.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDisableServiceRequest] = js.undefined
}
object ParamsResourceServicesDisable {
  
  inline def apply(): ParamsResourceServicesDisable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesDisable]
  }
  
  extension [Self <: ParamsResourceServicesDisable](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaDisableServiceRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
