package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2ProductInputConfig extends StObject {
  
  /**
    * BigQuery input source.
    */
  var bigQuerySource: js.UndefOr[SchemaGoogleCloudRetailV2BigQuerySource] = js.undefined
  
  /**
    * Google Cloud Storage location for the input content.
    */
  var gcsSource: js.UndefOr[SchemaGoogleCloudRetailV2GcsSource] = js.undefined
  
  /**
    * The Inline source for the input content for products.
    */
  var productInlineSource: js.UndefOr[SchemaGoogleCloudRetailV2ProductInlineSource] = js.undefined
}
object SchemaGoogleCloudRetailV2ProductInputConfig {
  
  inline def apply(): SchemaGoogleCloudRetailV2ProductInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2ProductInputConfig]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2ProductInputConfig](x: Self) {
    
    inline def setBigQuerySource(value: SchemaGoogleCloudRetailV2BigQuerySource): Self = StObject.set(x, "bigQuerySource", value.asInstanceOf[js.Any])
    
    inline def setBigQuerySourceUndefined: Self = StObject.set(x, "bigQuerySource", js.undefined)
    
    inline def setGcsSource(value: SchemaGoogleCloudRetailV2GcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    inline def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
    
    inline def setProductInlineSource(value: SchemaGoogleCloudRetailV2ProductInlineSource): Self = StObject.set(x, "productInlineSource", value.asInstanceOf[js.Any])
    
    inline def setProductInlineSourceUndefined: Self = StObject.set(x, "productInlineSource", js.undefined)
  }
}
