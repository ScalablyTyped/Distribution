package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductStatus extends StObject {
  
  /** Date on which the item has been created, in ISO 8601 format. */
  var creationDate: js.UndefOr[String] = js.undefined
  
  /** The intended destinations for the product. */
  var destinationStatuses: js.UndefOr[js.Array[ProductStatusDestinationStatus]] = js.undefined
  
  /** Date on which the item expires in Google Shopping, in ISO 8601 format. */
  var googleExpirationDate: js.UndefOr[String] = js.undefined
  
  /** A list of all issues associated with the product. */
  var itemLevelIssues: js.UndefOr[js.Array[ProductStatusItemLevelIssue]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#productStatus`" */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Date on which the item has been last updated, in ISO 8601 format. */
  var lastUpdateDate: js.UndefOr[String] = js.undefined
  
  /** The link to the product. */
  var link: js.UndefOr[String] = js.undefined
  
  /** The ID of the product for which status is reported. */
  var productId: js.UndefOr[String] = js.undefined
  
  /** The title of the product. */
  var title: js.UndefOr[String] = js.undefined
}
object ProductStatus {
  
  inline def apply(): ProductStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProductStatus] (val x: Self) extends AnyVal {
    
    inline def setCreationDate(value: String): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setDestinationStatuses(value: js.Array[ProductStatusDestinationStatus]): Self = StObject.set(x, "destinationStatuses", value.asInstanceOf[js.Any])
    
    inline def setDestinationStatusesUndefined: Self = StObject.set(x, "destinationStatuses", js.undefined)
    
    inline def setDestinationStatusesVarargs(value: ProductStatusDestinationStatus*): Self = StObject.set(x, "destinationStatuses", js.Array(value*))
    
    inline def setGoogleExpirationDate(value: String): Self = StObject.set(x, "googleExpirationDate", value.asInstanceOf[js.Any])
    
    inline def setGoogleExpirationDateUndefined: Self = StObject.set(x, "googleExpirationDate", js.undefined)
    
    inline def setItemLevelIssues(value: js.Array[ProductStatusItemLevelIssue]): Self = StObject.set(x, "itemLevelIssues", value.asInstanceOf[js.Any])
    
    inline def setItemLevelIssuesUndefined: Self = StObject.set(x, "itemLevelIssues", js.undefined)
    
    inline def setItemLevelIssuesVarargs(value: ProductStatusItemLevelIssue*): Self = StObject.set(x, "itemLevelIssues", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLastUpdateDate(value: String): Self = StObject.set(x, "lastUpdateDate", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateDateUndefined: Self = StObject.set(x, "lastUpdateDate", js.undefined)
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
