package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountsListLinksResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#accountsListLinksResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The list of available links. */
  var links: js.UndefOr[js.Array[LinkedAccount]] = js.undefined
  
  /** The token for the retrieval of the next page of links. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object AccountsListLinksResponse {
  
  inline def apply(): AccountsListLinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountsListLinksResponse]
  }
  
  extension [Self <: AccountsListLinksResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLinks(value: js.Array[LinkedAccount]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setLinksVarargs(value: LinkedAccount*): Self = StObject.set(x, "links", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
