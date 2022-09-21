package typings.googleapis.manufacturersV1Mod.manufacturersV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProduct extends StObject {
  
  /**
    * Attributes of the product uploaded to the Manufacturer Center. Manually edited attributes are taken into account.
    */
  var attributes: js.UndefOr[SchemaAttributes] = js.undefined
  
  /**
    * The content language of the product as a two-letter ISO 639-1 language code (for example, en).
    */
  var contentLanguage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The status of the destinations.
    */
  var destinationStatuses: js.UndefOr[js.Array[SchemaDestinationStatus]] = js.undefined
  
  /**
    * A server-generated list of issues associated with the product.
    */
  var issues: js.UndefOr[js.Array[SchemaIssue]] = js.undefined
  
  /**
    * Name in the format `{target_country\}:{content_language\}:{product_id\}`. `target_country` - The target country of the product as a CLDR territory code (for example, US). `content_language` - The content language of the product as a two-letter ISO 639-1 language code (for example, en). `product_id` - The ID of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#id.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Parent ID in the format `accounts/{account_id\}`. `account_id` - The ID of the Manufacturer Center account.
    */
  var parent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#id.
    */
  var productId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The target country of the product as a CLDR territory code (for example, US).
    */
  var targetCountry: js.UndefOr[String | Null] = js.undefined
}
object SchemaProduct {
  
  inline def apply(): SchemaProduct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProduct]
  }
  
  extension [Self <: SchemaProduct](x: Self) {
    
    inline def setAttributes(value: SchemaAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setContentLanguage(value: String): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
    
    inline def setContentLanguageNull: Self = StObject.set(x, "contentLanguage", null)
    
    inline def setContentLanguageUndefined: Self = StObject.set(x, "contentLanguage", js.undefined)
    
    inline def setDestinationStatuses(value: js.Array[SchemaDestinationStatus]): Self = StObject.set(x, "destinationStatuses", value.asInstanceOf[js.Any])
    
    inline def setDestinationStatusesUndefined: Self = StObject.set(x, "destinationStatuses", js.undefined)
    
    inline def setDestinationStatusesVarargs(value: SchemaDestinationStatus*): Self = StObject.set(x, "destinationStatuses", js.Array(value*))
    
    inline def setIssues(value: js.Array[SchemaIssue]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    inline def setIssuesUndefined: Self = StObject.set(x, "issues", js.undefined)
    
    inline def setIssuesVarargs(value: SchemaIssue*): Self = StObject.set(x, "issues", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdNull: Self = StObject.set(x, "productId", null)
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setTargetCountry(value: String): Self = StObject.set(x, "targetCountry", value.asInstanceOf[js.Any])
    
    inline def setTargetCountryNull: Self = StObject.set(x, "targetCountry", null)
    
    inline def setTargetCountryUndefined: Self = StObject.set(x, "targetCountry", js.undefined)
  }
}
