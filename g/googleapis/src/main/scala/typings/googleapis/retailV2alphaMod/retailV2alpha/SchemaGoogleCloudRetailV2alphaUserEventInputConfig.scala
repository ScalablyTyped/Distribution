package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaUserEventInputConfig extends StObject {
  
  /**
    * Required. BigQuery input source.
    */
  var bigQuerySource: js.UndefOr[SchemaGoogleCloudRetailV2alphaBigQuerySource] = js.undefined
  
  /**
    * Required. Google Cloud Storage location for the input content.
    */
  var gcsSource: js.UndefOr[SchemaGoogleCloudRetailV2alphaGcsSource] = js.undefined
  
  /**
    * Required. The Inline source for the input content for UserEvents.
    */
  var userEventInlineSource: js.UndefOr[SchemaGoogleCloudRetailV2alphaUserEventInlineSource] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaUserEventInputConfig {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaUserEventInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaUserEventInputConfig]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaUserEventInputConfig](x: Self) {
    
    inline def setBigQuerySource(value: SchemaGoogleCloudRetailV2alphaBigQuerySource): Self = StObject.set(x, "bigQuerySource", value.asInstanceOf[js.Any])
    
    inline def setBigQuerySourceUndefined: Self = StObject.set(x, "bigQuerySource", js.undefined)
    
    inline def setGcsSource(value: SchemaGoogleCloudRetailV2alphaGcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    inline def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
    
    inline def setUserEventInlineSource(value: SchemaGoogleCloudRetailV2alphaUserEventInlineSource): Self = StObject.set(x, "userEventInlineSource", value.asInstanceOf[js.Any])
    
    inline def setUserEventInlineSourceUndefined: Self = StObject.set(x, "userEventInlineSource", js.undefined)
  }
}
