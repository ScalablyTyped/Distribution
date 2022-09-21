package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaGcsSource extends StObject {
  
  /**
    * The schema to use when parsing the data from the source. Supported values for product imports: * `product` (default): One JSON Product per line. Each product must have a valid Product.id. * `product_merchant_center`: See [Importing catalog data from Merchant Center](https://cloud.google.com/retail/recommendations-ai/docs/upload-catalog#mc). Supported values for user events imports: * `user_event` (default): One JSON UserEvent per line. * `user_event_ga360`: Using https://support.google.com/analytics/answer/3437719. Supported values for control imports: * `control` (default): One JSON Control per line. Supported values for catalog attribute imports: * `catalog_attribute` (default): One CSV CatalogAttribute per line.
    */
  var dataSchema: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Google Cloud Storage URIs to input files. URI can be up to 2000 characters long. URIs can match the full object path (for example, `gs://bucket/directory/object.json`) or a pattern matching one or more files, such as `gs://bucket/directory/x.json`. A request can contain at most 100 files, and each file can be up to 2 GB. See [Importing product information](https://cloud.google.com/retail/recommendations-ai/docs/upload-catalog) for the expected file format and setup instructions.
    */
  var inputUris: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2betaGcsSource {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaGcsSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaGcsSource]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaGcsSource](x: Self) {
    
    inline def setDataSchema(value: String): Self = StObject.set(x, "dataSchema", value.asInstanceOf[js.Any])
    
    inline def setDataSchemaNull: Self = StObject.set(x, "dataSchema", null)
    
    inline def setDataSchemaUndefined: Self = StObject.set(x, "dataSchema", js.undefined)
    
    inline def setInputUris(value: js.Array[String]): Self = StObject.set(x, "inputUris", value.asInstanceOf[js.Any])
    
    inline def setInputUrisNull: Self = StObject.set(x, "inputUris", null)
    
    inline def setInputUrisUndefined: Self = StObject.set(x, "inputUris", js.undefined)
    
    inline def setInputUrisVarargs(value: String*): Self = StObject.set(x, "inputUris", js.Array(value*))
  }
}
