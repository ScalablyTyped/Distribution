package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenPagination extends StObject {
  
  /** Tokens to pass to the standard list field 'page_token'. Whenever available, tokens are preferred over manipulating start_index. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  var previousPageToken: js.UndefOr[String] = js.native
}
object TokenPagination {
  
  @scala.inline
  def apply(): TokenPagination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenPagination]
  }
  
  @scala.inline
  implicit class TokenPaginationMutableBuilder[Self <: TokenPagination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setPreviousPageToken(value: String): Self = StObject.set(x, "previousPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousPageTokenUndefined: Self = StObject.set(x, "previousPageToken", js.undefined)
  }
}
