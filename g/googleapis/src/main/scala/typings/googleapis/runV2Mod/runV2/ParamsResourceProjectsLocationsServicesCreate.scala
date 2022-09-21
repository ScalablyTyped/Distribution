package typings.googleapis.runV2Mod.runV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsServicesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The location and project in which this service should be created. Format: projects/{projectnumber\}/locations/{location\} Only lowercase, digits, and hyphens; must begin with letter, and may not end with hyphen; must contain fewer than 50 characters.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudRunV2Service] = js.undefined
  
  /**
    * Required. The unique identifier for the Service. The name of the service becomes {parent\}/services/{service_id\}.
    */
  var serviceId: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates that the request should be validated and default values populated, without persisting the request or creating any resources.
    */
  var validateOnly: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceProjectsLocationsServicesCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsServicesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsServicesCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsServicesCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudRunV2Service): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    inline def setServiceIdUndefined: Self = StObject.set(x, "serviceId", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
