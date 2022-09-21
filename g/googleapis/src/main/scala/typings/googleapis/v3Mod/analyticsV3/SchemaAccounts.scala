package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccounts extends StObject {
  
  /**
    * A list of accounts.
    */
  var items: js.UndefOr[js.Array[SchemaAccount]] = js.undefined
  
  /**
    * The maximum number of entries the response can contain, regardless of the actual number of entries returned. Its value ranges from 1 to 1000 with a value of 1000 by default, or otherwise specified by the max-results query parameter.
    */
  var itemsPerPage: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Collection type.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Next link for this account collection.
    */
  var nextLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Previous link for this account collection.
    */
  var previousLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The starting index of the entries, which is 1 by default or otherwise specified by the start-index query parameter.
    */
  var startIndex: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The total number of results for the query, regardless of the number of results in the response.
    */
  var totalResults: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Email ID of the authenticated user
    */
  var username: js.UndefOr[String | Null] = js.undefined
}
object SchemaAccounts {
  
  inline def apply(): SchemaAccounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccounts]
  }
  
  extension [Self <: SchemaAccounts](x: Self) {
    
    inline def setItems(value: js.Array[SchemaAccount]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsPerPage(value: Double): Self = StObject.set(x, "itemsPerPage", value.asInstanceOf[js.Any])
    
    inline def setItemsPerPageNull: Self = StObject.set(x, "itemsPerPage", null)
    
    inline def setItemsPerPageUndefined: Self = StObject.set(x, "itemsPerPage", js.undefined)
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaAccount*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextLink(value: String): Self = StObject.set(x, "nextLink", value.asInstanceOf[js.Any])
    
    inline def setNextLinkNull: Self = StObject.set(x, "nextLink", null)
    
    inline def setNextLinkUndefined: Self = StObject.set(x, "nextLink", js.undefined)
    
    inline def setPreviousLink(value: String): Self = StObject.set(x, "previousLink", value.asInstanceOf[js.Any])
    
    inline def setPreviousLinkNull: Self = StObject.set(x, "previousLink", null)
    
    inline def setPreviousLinkUndefined: Self = StObject.set(x, "previousLink", js.undefined)
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexNull: Self = StObject.set(x, "startIndex", null)
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    inline def setTotalResults(value: Double): Self = StObject.set(x, "totalResults", value.asInstanceOf[js.Any])
    
    inline def setTotalResultsNull: Self = StObject.set(x, "totalResults", null)
    
    inline def setTotalResultsUndefined: Self = StObject.set(x, "totalResults", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameNull: Self = StObject.set(x, "username", null)
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
