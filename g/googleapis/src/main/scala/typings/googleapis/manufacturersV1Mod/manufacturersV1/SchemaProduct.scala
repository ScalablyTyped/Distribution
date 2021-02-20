package typings.googleapis.manufacturersV1Mod.manufacturersV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Product data.
  */
@js.native
trait SchemaProduct extends StObject {
  
  /**
    * Attributes of the product uploaded to the Manufacturer Center. Manually
    * edited attributes are taken into account.
    */
  var attributes: js.UndefOr[SchemaAttributes] = js.native
  
  /**
    * The content language of the product as a two-letter ISO 639-1 language
    * code (for example, en).
    */
  var contentLanguage: js.UndefOr[String] = js.native
  
  /**
    * The status of the destinations.
    */
  var destinationStatuses: js.UndefOr[js.Array[SchemaDestinationStatus]] = js.native
  
  /**
    * A server-generated list of issues associated with the product.
    */
  var issues: js.UndefOr[js.Array[SchemaIssue]] = js.native
  
  /**
    * Name in the format `{target_country}:{content_language}:{product_id}`.
    * `target_country`   - The target country of the product as a CLDR
    * territory                      code (for example, US). `content_language`
    * - The content language of the product as a two-letter ISO 639-1 language
    * code (for example, en).  `product_id`     -   The ID of the product. For
    * more information, see
    * https://support.google.com/manufacturers/answer/6124116#id.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Parent ID in the format `accounts/{account_id}`.  `account_id` - The ID
    * of the Manufacturer Center account.
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * The ID of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#id.
    */
  var productId: js.UndefOr[String] = js.native
  
  /**
    * The target country of the product as a CLDR territory code (for example,
    * US).
    */
  var targetCountry: js.UndefOr[String] = js.native
}
object SchemaProduct {
  
  @scala.inline
  def apply(): SchemaProduct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProduct]
  }
  
  @scala.inline
  implicit class SchemaProductMutableBuilder[Self <: SchemaProduct] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: SchemaAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setContentLanguage(value: String): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLanguageUndefined: Self = StObject.set(x, "contentLanguage", js.undefined)
    
    @scala.inline
    def setDestinationStatuses(value: js.Array[SchemaDestinationStatus]): Self = StObject.set(x, "destinationStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationStatusesUndefined: Self = StObject.set(x, "destinationStatuses", js.undefined)
    
    @scala.inline
    def setDestinationStatusesVarargs(value: SchemaDestinationStatus*): Self = StObject.set(x, "destinationStatuses", js.Array(value :_*))
    
    @scala.inline
    def setIssues(value: js.Array[SchemaIssue]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuesUndefined: Self = StObject.set(x, "issues", js.undefined)
    
    @scala.inline
    def setIssuesVarargs(value: SchemaIssue*): Self = StObject.set(x, "issues", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    @scala.inline
    def setTargetCountry(value: String): Self = StObject.set(x, "targetCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetCountryUndefined: Self = StObject.set(x, "targetCountry", js.undefined)
  }
}
