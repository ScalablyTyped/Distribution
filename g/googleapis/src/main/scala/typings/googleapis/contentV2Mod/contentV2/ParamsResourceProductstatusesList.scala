package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProductstatusesList
  extends StObject
     with StandardParameters {
  
  /**
    * If set, only issues for the specified destinations are returned, otherwise only issues for the Shopping destination.
    */
  var destinations: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Flag to include full product data in the results of the list request. The default value is false.
    */
  var includeAttributes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Flag to include the invalid inserted items in the result of the list request. By default the invalid items are not shown (the default value is false).
    */
  var includeInvalidInsertedItems: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum number of product statuses to return in the response, used for paging.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * The ID of the account that contains the products. This account cannot be a multi-client account.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /**
    * The token returned by the previous request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceProductstatusesList {
  
  inline def apply(): ParamsResourceProductstatusesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProductstatusesList]
  }
  
  extension [Self <: ParamsResourceProductstatusesList](x: Self) {
    
    inline def setDestinations(value: js.Array[String]): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsUndefined: Self = StObject.set(x, "destinations", js.undefined)
    
    inline def setDestinationsVarargs(value: String*): Self = StObject.set(x, "destinations", js.Array(value*))
    
    inline def setIncludeAttributes(value: Boolean): Self = StObject.set(x, "includeAttributes", value.asInstanceOf[js.Any])
    
    inline def setIncludeAttributesUndefined: Self = StObject.set(x, "includeAttributes", js.undefined)
    
    inline def setIncludeInvalidInsertedItems(value: Boolean): Self = StObject.set(x, "includeInvalidInsertedItems", value.asInstanceOf[js.Any])
    
    inline def setIncludeInvalidInsertedItemsUndefined: Self = StObject.set(x, "includeInvalidInsertedItems", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
