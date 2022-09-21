package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServicesTenancyunitsDeleteproject
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the tenancy unit. Such as 'services/service.googleapis.com/projects/12345/tenancyUnits/abcd'.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDeleteTenantProjectRequest] = js.undefined
}
object ParamsResourceServicesTenancyunitsDeleteproject {
  
  inline def apply(): ParamsResourceServicesTenancyunitsDeleteproject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesTenancyunitsDeleteproject]
  }
  
  extension [Self <: ParamsResourceServicesTenancyunitsDeleteproject](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaDeleteTenantProjectRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
