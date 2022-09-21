package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaProductInputConfig extends StObject {
  
  /**
    * BigQuery input source.
    */
  var bigQuerySource: js.UndefOr[SchemaGoogleCloudRetailV2betaBigQuerySource] = js.undefined
  
  /**
    * Google Cloud Storage location for the input content.
    */
  var gcsSource: js.UndefOr[SchemaGoogleCloudRetailV2betaGcsSource] = js.undefined
  
  /**
    * The Inline source for the input content for products.
    */
  var productInlineSource: js.UndefOr[SchemaGoogleCloudRetailV2betaProductInlineSource] = js.undefined
}
object SchemaGoogleCloudRetailV2betaProductInputConfig {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaProductInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaProductInputConfig]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaProductInputConfig](x: Self) {
    
    inline def setBigQuerySource(value: SchemaGoogleCloudRetailV2betaBigQuerySource): Self = StObject.set(x, "bigQuerySource", value.asInstanceOf[js.Any])
    
    inline def setBigQuerySourceUndefined: Self = StObject.set(x, "bigQuerySource", js.undefined)
    
    inline def setGcsSource(value: SchemaGoogleCloudRetailV2betaGcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    inline def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
    
    inline def setProductInlineSource(value: SchemaGoogleCloudRetailV2betaProductInlineSource): Self = StObject.set(x, "productInlineSource", value.asInstanceOf[js.Any])
    
    inline def setProductInlineSourceUndefined: Self = StObject.set(x, "productInlineSource", js.undefined)
  }
}
