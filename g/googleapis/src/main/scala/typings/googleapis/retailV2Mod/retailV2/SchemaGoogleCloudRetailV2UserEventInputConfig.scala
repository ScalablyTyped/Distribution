package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2UserEventInputConfig extends StObject {
  
  /**
    * Required. BigQuery input source.
    */
  var bigQuerySource: js.UndefOr[SchemaGoogleCloudRetailV2BigQuerySource] = js.undefined
  
  /**
    * Required. Google Cloud Storage location for the input content.
    */
  var gcsSource: js.UndefOr[SchemaGoogleCloudRetailV2GcsSource] = js.undefined
  
  /**
    * Required. The Inline source for the input content for UserEvents.
    */
  var userEventInlineSource: js.UndefOr[SchemaGoogleCloudRetailV2UserEventInlineSource] = js.undefined
}
object SchemaGoogleCloudRetailV2UserEventInputConfig {
  
  inline def apply(): SchemaGoogleCloudRetailV2UserEventInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2UserEventInputConfig]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2UserEventInputConfig](x: Self) {
    
    inline def setBigQuerySource(value: SchemaGoogleCloudRetailV2BigQuerySource): Self = StObject.set(x, "bigQuerySource", value.asInstanceOf[js.Any])
    
    inline def setBigQuerySourceUndefined: Self = StObject.set(x, "bigQuerySource", js.undefined)
    
    inline def setGcsSource(value: SchemaGoogleCloudRetailV2GcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    inline def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
    
    inline def setUserEventInlineSource(value: SchemaGoogleCloudRetailV2UserEventInlineSource): Self = StObject.set(x, "userEventInlineSource", value.asInstanceOf[js.Any])
    
    inline def setUserEventInlineSourceUndefined: Self = StObject.set(x, "userEventInlineSource", js.undefined)
  }
}
