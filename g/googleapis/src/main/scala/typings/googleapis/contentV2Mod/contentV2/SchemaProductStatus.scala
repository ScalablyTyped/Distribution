package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The status of a product, i.e., information about a product computed
  * asynchronously.
  */
@js.native
trait SchemaProductStatus extends StObject {
  
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
  implicit class SchemaProductStatusMutableBuilder[Self <: SchemaProductStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: String): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    @scala.inline
    def setDataQualityIssues(value: js.Array[SchemaProductStatusDataQualityIssue]): Self = StObject.set(x, "dataQualityIssues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataQualityIssuesUndefined: Self = StObject.set(x, "dataQualityIssues", js.undefined)
    
    @scala.inline
    def setDataQualityIssuesVarargs(value: SchemaProductStatusDataQualityIssue*): Self = StObject.set(x, "dataQualityIssues", js.Array(value :_*))
    
    @scala.inline
    def setDestinationStatuses(value: js.Array[SchemaProductStatusDestinationStatus]): Self = StObject.set(x, "destinationStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationStatusesUndefined: Self = StObject.set(x, "destinationStatuses", js.undefined)
    
    @scala.inline
    def setDestinationStatusesVarargs(value: SchemaProductStatusDestinationStatus*): Self = StObject.set(x, "destinationStatuses", js.Array(value :_*))
    
    @scala.inline
    def setGoogleExpirationDate(value: String): Self = StObject.set(x, "googleExpirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleExpirationDateUndefined: Self = StObject.set(x, "googleExpirationDate", js.undefined)
    
    @scala.inline
    def setItemLevelIssues(value: js.Array[SchemaProductStatusItemLevelIssue]): Self = StObject.set(x, "itemLevelIssues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemLevelIssuesUndefined: Self = StObject.set(x, "itemLevelIssues", js.undefined)
    
    @scala.inline
    def setItemLevelIssuesVarargs(value: SchemaProductStatusItemLevelIssue*): Self = StObject.set(x, "itemLevelIssues", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLastUpdateDate(value: String): Self = StObject.set(x, "lastUpdateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateDateUndefined: Self = StObject.set(x, "lastUpdateDate", js.undefined)
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    @scala.inline
    def setProduct(value: SchemaProduct): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    @scala.inline
    def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
