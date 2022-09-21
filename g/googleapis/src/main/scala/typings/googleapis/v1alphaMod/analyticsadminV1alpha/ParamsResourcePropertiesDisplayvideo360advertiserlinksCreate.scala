package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePropertiesDisplayvideo360advertiserlinksCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Example format: properties/1234
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink] = js.undefined
}
object ParamsResourcePropertiesDisplayvideo360advertiserlinksCreate {
  
  inline def apply(): ParamsResourcePropertiesDisplayvideo360advertiserlinksCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePropertiesDisplayvideo360advertiserlinksCreate]
  }
  
  extension [Self <: ParamsResourcePropertiesDisplayvideo360advertiserlinksCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
