package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePropertiesAcknowledgeuserdatacollection
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The property for which to acknowledge user data collection.
    */
  var property: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaAcknowledgeUserDataCollectionRequest] = js.undefined
}
object ParamsResourcePropertiesAcknowledgeuserdatacollection {
  
  inline def apply(): ParamsResourcePropertiesAcknowledgeuserdatacollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePropertiesAcknowledgeuserdatacollection]
  }
  
  extension [Self <: ParamsResourcePropertiesAcknowledgeuserdatacollection](x: Self) {
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleAnalyticsAdminV1alphaAcknowledgeUserDataCollectionRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
