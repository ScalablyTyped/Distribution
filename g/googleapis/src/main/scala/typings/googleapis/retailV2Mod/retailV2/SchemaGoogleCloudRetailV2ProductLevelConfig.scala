package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2ProductLevelConfig extends StObject {
  
  /**
    * The type of Products allowed to be ingested into the catalog. Acceptable values are: * `primary` (default): You can ingest Products of all types. When ingesting a Product, its type will default to Product.Type.PRIMARY if unset. * `variant` (incompatible with Retail Search): You can only ingest Product.Type.VARIANT Products. This means Product.primary_product_id cannot be empty. If this field is set to an invalid value other than these, an INVALID_ARGUMENT error is returned. If this field is `variant` and merchant_center_product_id_field is `itemGroupId`, an INVALID_ARGUMENT error is returned. See [Product levels](https://cloud.google.com/retail/docs/catalog#product-levels) for more details.
    */
  var ingestionProductType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Which field of [Merchant Center Product](/bigquery-transfer/docs/merchant-center-products-schema) should be imported as Product.id. Acceptable values are: * `offerId` (default): Import `offerId` as the product ID. * `itemGroupId`: Import `itemGroupId` as the product ID. Notice that Retail API will choose one item from the ones with the same `itemGroupId`, and use it to represent the item group. If this field is set to an invalid value other than these, an INVALID_ARGUMENT error is returned. If this field is `itemGroupId` and ingestion_product_type is `variant`, an INVALID_ARGUMENT error is returned. See [Product levels](https://cloud.google.com/retail/docs/catalog#product-levels) for more details.
    */
  var merchantCenterProductIdField: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2ProductLevelConfig {
  
  inline def apply(): SchemaGoogleCloudRetailV2ProductLevelConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2ProductLevelConfig]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2ProductLevelConfig](x: Self) {
    
    inline def setIngestionProductType(value: String): Self = StObject.set(x, "ingestionProductType", value.asInstanceOf[js.Any])
    
    inline def setIngestionProductTypeNull: Self = StObject.set(x, "ingestionProductType", null)
    
    inline def setIngestionProductTypeUndefined: Self = StObject.set(x, "ingestionProductType", js.undefined)
    
    inline def setMerchantCenterProductIdField(value: String): Self = StObject.set(x, "merchantCenterProductIdField", value.asInstanceOf[js.Any])
    
    inline def setMerchantCenterProductIdFieldNull: Self = StObject.set(x, "merchantCenterProductIdField", null)
    
    inline def setMerchantCenterProductIdFieldUndefined: Self = StObject.set(x, "merchantCenterProductIdField", js.undefined)
  }
}
