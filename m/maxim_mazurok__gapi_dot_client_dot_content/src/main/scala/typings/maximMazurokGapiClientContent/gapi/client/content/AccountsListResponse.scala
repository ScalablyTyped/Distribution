package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountsListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#accountsListResponse`". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The token for the retrieval of the next page of accounts. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  var resources: js.UndefOr[js.Array[Account]] = js.undefined
}
object AccountsListResponse {
  
  inline def apply(): AccountsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountsListResponse]
  }
  
  extension [Self <: AccountsListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setResources(value: js.Array[Account]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: Account*): Self = StObject.set(x, "resources", js.Array(value*))
  }
}
