package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePropertiesDisplayvideo360advertiserlinksPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Output only. The resource name for this DisplayVideo360AdvertiserLink resource. Format: properties/{propertyId\}/displayVideo360AdvertiserLinks/{linkId\} Note: linkId is not the Display & Video 360 Advertiser ID
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink] = js.undefined
  
  /**
    * Required. The list of fields to be updated. Omitted fields will not be updated. To replace the entire entity, use one path with the string "*" to match all fields.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourcePropertiesDisplayvideo360advertiserlinksPatch {
  
  inline def apply(): ParamsResourcePropertiesDisplayvideo360advertiserlinksPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePropertiesDisplayvideo360advertiserlinksPatch]
  }
  
  extension [Self <: ParamsResourcePropertiesDisplayvideo360advertiserlinksPatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
