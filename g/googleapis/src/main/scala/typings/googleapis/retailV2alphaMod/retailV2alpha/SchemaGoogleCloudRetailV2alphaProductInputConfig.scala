package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaProductInputConfig extends StObject {
  
  /**
    * BigQuery input source.
    */
  var bigQuerySource: js.UndefOr[SchemaGoogleCloudRetailV2alphaBigQuerySource] = js.undefined
  
  /**
    * Google Cloud Storage location for the input content.
    */
  var gcsSource: js.UndefOr[SchemaGoogleCloudRetailV2alphaGcsSource] = js.undefined
  
  /**
    * The Inline source for the input content for products.
    */
  var productInlineSource: js.UndefOr[SchemaGoogleCloudRetailV2alphaProductInlineSource] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaProductInputConfig {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaProductInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaProductInputConfig]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaProductInputConfig](x: Self) {
    
    inline def setBigQuerySource(value: SchemaGoogleCloudRetailV2alphaBigQuerySource): Self = StObject.set(x, "bigQuerySource", value.asInstanceOf[js.Any])
    
    inline def setBigQuerySourceUndefined: Self = StObject.set(x, "bigQuerySource", js.undefined)
    
    inline def setGcsSource(value: SchemaGoogleCloudRetailV2alphaGcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    inline def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
    
    inline def setProductInlineSource(value: SchemaGoogleCloudRetailV2alphaProductInlineSource): Self = StObject.set(x, "productInlineSource", value.asInstanceOf[js.Any])
    
    inline def setProductInlineSourceUndefined: Self = StObject.set(x, "productInlineSource", js.undefined)
  }
}
