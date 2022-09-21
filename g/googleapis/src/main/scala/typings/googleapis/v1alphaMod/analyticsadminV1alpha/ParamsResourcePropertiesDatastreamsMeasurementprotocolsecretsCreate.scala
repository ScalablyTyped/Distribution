package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent resource where this secret will be created. Format: properties/{property\}/dataStreams/{dataStream\}
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret] = js.undefined
}
object ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsCreate {
  
  inline def apply(): ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsCreate]
  }
  
  extension [Self <: ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
