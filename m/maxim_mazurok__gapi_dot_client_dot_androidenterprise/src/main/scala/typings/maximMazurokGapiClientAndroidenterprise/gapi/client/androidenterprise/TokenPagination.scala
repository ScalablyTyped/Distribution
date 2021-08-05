package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenPagination extends StObject {
  
  /** Tokens to pass to the standard list field 'page_token'. Whenever available, tokens are preferred over manipulating start_index. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  var previousPageToken: js.UndefOr[String] = js.undefined
}
object TokenPagination {
  
  inline def apply(): TokenPagination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenPagination]
  }
  
  extension [Self <: TokenPagination](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPreviousPageToken(value: String): Self = StObject.set(x, "previousPageToken", value.asInstanceOf[js.Any])
    
    inline def setPreviousPageTokenUndefined: Self = StObject.set(x, "previousPageToken", js.undefined)
  }
}
