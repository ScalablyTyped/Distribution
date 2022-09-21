package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServicesTenancyunitsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. services/{service\}/{collection id\}/{resource id\} {collection id\} is the cloud resource collection type representing the service consumer, for example 'projects', or 'organizations'. {resource id\} is the consumer numeric id, such as project number: '123456'. {service\} the name of a managed service, such as 'service.googleapis.com'. Enables service binding using the new tenancy unit.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCreateTenancyUnitRequest] = js.undefined
}
object ParamsResourceServicesTenancyunitsCreate {
  
  inline def apply(): ParamsResourceServicesTenancyunitsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesTenancyunitsCreate]
  }
  
  extension [Self <: ParamsResourceServicesTenancyunitsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaCreateTenancyUnitRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
