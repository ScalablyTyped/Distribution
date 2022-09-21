package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Output only. Resource name of this secret. This secret may be a child of any type of stream. Format: properties/{property\}/dataStreams/{dataStream\}/measurementProtocolSecrets/{measurementProtocolSecret\}
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret] = js.undefined
  
  /**
    * The list of fields to be updated. Omitted fields will not be updated.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsPatch {
  
  inline def apply(): ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsPatch]
  }
  
  extension [Self <: ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsPatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
