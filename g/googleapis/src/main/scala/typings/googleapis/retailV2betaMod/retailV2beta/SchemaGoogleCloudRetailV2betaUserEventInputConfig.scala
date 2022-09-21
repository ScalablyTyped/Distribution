package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaUserEventInputConfig extends StObject {
  
  /**
    * Required. BigQuery input source.
    */
  var bigQuerySource: js.UndefOr[SchemaGoogleCloudRetailV2betaBigQuerySource] = js.undefined
  
  /**
    * Required. Google Cloud Storage location for the input content.
    */
  var gcsSource: js.UndefOr[SchemaGoogleCloudRetailV2betaGcsSource] = js.undefined
  
  /**
    * Required. The Inline source for the input content for UserEvents.
    */
  var userEventInlineSource: js.UndefOr[SchemaGoogleCloudRetailV2betaUserEventInlineSource] = js.undefined
}
object SchemaGoogleCloudRetailV2betaUserEventInputConfig {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaUserEventInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaUserEventInputConfig]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaUserEventInputConfig](x: Self) {
    
    inline def setBigQuerySource(value: SchemaGoogleCloudRetailV2betaBigQuerySource): Self = StObject.set(x, "bigQuerySource", value.asInstanceOf[js.Any])
    
    inline def setBigQuerySourceUndefined: Self = StObject.set(x, "bigQuerySource", js.undefined)
    
    inline def setGcsSource(value: SchemaGoogleCloudRetailV2betaGcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    inline def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
    
    inline def setUserEventInlineSource(value: SchemaGoogleCloudRetailV2betaUserEventInlineSource): Self = StObject.set(x, "userEventInlineSource", value.asInstanceOf[js.Any])
    
    inline def setUserEventInlineSourceUndefined: Self = StObject.set(x, "userEventInlineSource", js.undefined)
  }
}
