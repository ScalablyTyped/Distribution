package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductStatus extends StObject {
  
  /** Date on which the item has been created, in ISO 8601 format. */
  var creationDate: js.UndefOr[String] = js.native
  
  /** The intended destinations for the product. */
  var destinationStatuses: js.UndefOr[js.Array[ProductStatusDestinationStatus]] = js.native
  
  /** Date on which the item expires in Google Shopping, in ISO 8601 format. */
  var googleExpirationDate: js.UndefOr[String] = js.native
  
  /** A list of all issues associated with the product. */
  var itemLevelIssues: js.UndefOr[js.Array[ProductStatusItemLevelIssue]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#productStatus`" */
  var kind: js.UndefOr[String] = js.native
  
  /** Date on which the item has been last updated, in ISO 8601 format. */
  var lastUpdateDate: js.UndefOr[String] = js.native
  
  /** The link to the product. */
  var link: js.UndefOr[String] = js.native
  
  /** The ID of the product for which status is reported. */
  var productId: js.UndefOr[String] = js.native
  
  /** The title of the product. */
  var title: js.UndefOr[String] = js.native
}
object ProductStatus {
  
  @scala.inline
  def apply(): ProductStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductStatus]
  }
  
  @scala.inline
  implicit class ProductStatusMutableBuilder[Self <: ProductStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: String): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    @scala.inline
    def setDestinationStatuses(value: js.Array[ProductStatusDestinationStatus]): Self = StObject.set(x, "destinationStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationStatusesUndefined: Self = StObject.set(x, "destinationStatuses", js.undefined)
    
    @scala.inline
    def setDestinationStatusesVarargs(value: ProductStatusDestinationStatus*): Self = StObject.set(x, "destinationStatuses", js.Array(value :_*))
    
    @scala.inline
    def setGoogleExpirationDate(value: String): Self = StObject.set(x, "googleExpirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleExpirationDateUndefined: Self = StObject.set(x, "googleExpirationDate", js.undefined)
    
    @scala.inline
    def setItemLevelIssues(value: js.Array[ProductStatusItemLevelIssue]): Self = StObject.set(x, "itemLevelIssues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemLevelIssuesUndefined: Self = StObject.set(x, "itemLevelIssues", js.undefined)
    
    @scala.inline
    def setItemLevelIssuesVarargs(value: ProductStatusItemLevelIssue*): Self = StObject.set(x, "itemLevelIssues", js.Array(value :_*))
    
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
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
