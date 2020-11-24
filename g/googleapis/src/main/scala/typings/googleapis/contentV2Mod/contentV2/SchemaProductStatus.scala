package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The status of a product, i.e., information about a product computed
  * asynchronously.
  */
@js.native
trait SchemaProductStatus extends js.Object {
  
  /**
    * Date on which the item has been created, in ISO 8601 format.
    */
  var creationDate: js.UndefOr[String] = js.native
  
  /**
    * DEPRECATED - never populated
    */
  var dataQualityIssues: js.UndefOr[js.Array[SchemaProductStatusDataQualityIssue]] = js.native
  
  /**
    * The intended destinations for the product.
    */
  var destinationStatuses: js.UndefOr[js.Array[SchemaProductStatusDestinationStatus]] = js.native
  
  /**
    * Date on which the item expires in Google Shopping, in ISO 8601 format.
    */
  var googleExpirationDate: js.UndefOr[String] = js.native
  
  /**
    * A list of all issues associated with the product.
    */
  var itemLevelIssues: js.UndefOr[js.Array[SchemaProductStatusItemLevelIssue]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#productStatus&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Date on which the item has been last updated, in ISO 8601 format.
    */
  var lastUpdateDate: js.UndefOr[String] = js.native
  
  /**
    * The link to the product.
    */
  var link: js.UndefOr[String] = js.native
  
  /**
    * Product data after applying all the join inputs.
    */
  var product: js.UndefOr[SchemaProduct] = js.native
  
  /**
    * The ID of the product for which status is reported.
    */
  var productId: js.UndefOr[String] = js.native
  
  /**
    * The title of the product.
    */
  var title: js.UndefOr[String] = js.native
}
object SchemaProductStatus {
  
  @scala.inline
  def apply(): SchemaProductStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductStatus]
  }
  
  @scala.inline
  implicit class SchemaProductStatusOps[Self <: SchemaProductStatus] (val x: Self) extends AnyVal {
    
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
    def setCreationDate(value: String): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    
    @scala.inline
    def setDataQualityIssuesVarargs(value: SchemaProductStatusDataQualityIssue*): Self = this.set("dataQualityIssues", js.Array(value :_*))
    
    @scala.inline
    def setDataQualityIssues(value: js.Array[SchemaProductStatusDataQualityIssue]): Self = this.set("dataQualityIssues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataQualityIssues: Self = this.set("dataQualityIssues", js.undefined)
    
    @scala.inline
    def setDestinationStatusesVarargs(value: SchemaProductStatusDestinationStatus*): Self = this.set("destinationStatuses", js.Array(value :_*))
    
    @scala.inline
    def setDestinationStatuses(value: js.Array[SchemaProductStatusDestinationStatus]): Self = this.set("destinationStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationStatuses: Self = this.set("destinationStatuses", js.undefined)
    
    @scala.inline
    def setGoogleExpirationDate(value: String): Self = this.set("googleExpirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleExpirationDate: Self = this.set("googleExpirationDate", js.undefined)
    
    @scala.inline
    def setItemLevelIssuesVarargs(value: SchemaProductStatusItemLevelIssue*): Self = this.set("itemLevelIssues", js.Array(value :_*))
    
    @scala.inline
    def setItemLevelIssues(value: js.Array[SchemaProductStatusItemLevelIssue]): Self = this.set("itemLevelIssues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemLevelIssues: Self = this.set("itemLevelIssues", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLastUpdateDate(value: String): Self = this.set("lastUpdateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdateDate: Self = this.set("lastUpdateDate", js.undefined)
    
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setProduct(value: SchemaProduct): Self = this.set("product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProduct: Self = this.set("product", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
