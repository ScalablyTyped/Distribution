package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountsListLinksResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "`content#accountsListLinksResponse`".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of available links.
    */
  var links: js.UndefOr[js.Array[SchemaLinkedAccount]] = js.undefined
  
  /**
    * The token for the retrieval of the next page of links.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaAccountsListLinksResponse {
  
  inline def apply(): SchemaAccountsListLinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountsListLinksResponse]
  }
  
  extension [Self <: SchemaAccountsListLinksResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLinks(value: js.Array[SchemaLinkedAccount]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setLinksVarargs(value: SchemaLinkedAccount*): Self = StObject.set(x, "links", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
