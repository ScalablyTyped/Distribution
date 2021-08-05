package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The status of a product, i.e., information about a product computed
  * asynchronously.
  */
trait SchemaProductStatus extends StObject {
  
  /**
    * Date on which the item has been created, in ISO 8601 format.
    */
  var creationDate: js.UndefOr[String] = js.undefined
  
  /**
    * The intended destinations for the product.
    */
  var destinationStatuses: js.UndefOr[js.Array[SchemaProductStatusDestinationStatus]] = js.undefined
  
  /**
    * Date on which the item expires in Google Shopping, in ISO 8601 format.
    */
  var googleExpirationDate: js.UndefOr[String] = js.undefined
  
  /**
    * A list of all issues associated with the product.
    */
  var itemLevelIssues: js.UndefOr[js.Array[SchemaProductStatusItemLevelIssue]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#productStatus&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Date on which the item has been last updated, in ISO 8601 format.
    */
  var lastUpdateDate: js.UndefOr[String] = js.undefined
  
  /**
    * The link to the product.
    */
  var link: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the product for which status is reported.
    */
  var productId: js.UndefOr[String] = js.undefined
  
  /**
    * The title of the product.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaProductStatus {
  
  inline def apply(): SchemaProductStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductStatus]
  }
  
  extension [Self <: SchemaProductStatus](x: Self) {
    
    inline def setCreationDate(value: String): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setDestinationStatuses(value: js.Array[SchemaProductStatusDestinationStatus]): Self = StObject.set(x, "destinationStatuses", value.asInstanceOf[js.Any])
    
    inline def setDestinationStatusesUndefined: Self = StObject.set(x, "destinationStatuses", js.undefined)
    
    inline def setDestinationStatusesVarargs(value: SchemaProductStatusDestinationStatus*): Self = StObject.set(x, "destinationStatuses", js.Array(value :_*))
    
    inline def setGoogleExpirationDate(value: String): Self = StObject.set(x, "googleExpirationDate", value.asInstanceOf[js.Any])
    
    inline def setGoogleExpirationDateUndefined: Self = StObject.set(x, "googleExpirationDate", js.undefined)
    
    inline def setItemLevelIssues(value: js.Array[SchemaProductStatusItemLevelIssue]): Self = StObject.set(x, "itemLevelIssues", value.asInstanceOf[js.Any])
    
    inline def setItemLevelIssuesUndefined: Self = StObject.set(x, "itemLevelIssues", js.undefined)
    
    inline def setItemLevelIssuesVarargs(value: SchemaProductStatusItemLevelIssue*): Self = StObject.set(x, "itemLevelIssues", js.Array(value :_*))
    
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
