package typings.googleapis.manufacturersV1Mod.manufacturersV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Product data.
  */
@js.native
trait SchemaProduct extends js.Object {
  
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
  implicit class SchemaProductOps[Self <: SchemaProduct] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttributes(value: SchemaAttributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setContentLanguage(value: String): Self = this.set("contentLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentLanguage: Self = this.set("contentLanguage", js.undefined)
    
    @scala.inline
    def setDestinationStatusesVarargs(value: SchemaDestinationStatus*): Self = this.set("destinationStatuses", js.Array(value :_*))
    
    @scala.inline
    def setDestinationStatuses(value: js.Array[SchemaDestinationStatus]): Self = this.set("destinationStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationStatuses: Self = this.set("destinationStatuses", js.undefined)
    
    @scala.inline
    def setIssuesVarargs(value: SchemaIssue*): Self = this.set("issues", js.Array(value :_*))
    
    @scala.inline
    def setIssues(value: js.Array[SchemaIssue]): Self = this.set("issues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssues: Self = this.set("issues", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    
    @scala.inline
    def setTargetCountry(value: String): Self = this.set("targetCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetCountry: Self = this.set("targetCountry", js.undefined)
  }
}
