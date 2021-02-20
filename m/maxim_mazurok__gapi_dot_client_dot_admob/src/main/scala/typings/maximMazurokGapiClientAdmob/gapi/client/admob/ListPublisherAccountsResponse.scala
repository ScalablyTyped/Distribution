package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPublisherAccountsResponse extends StObject {
  
  /** Publisher that the client credentials can access. */
  var account: js.UndefOr[js.Array[PublisherAccount]] = js.native
  
  /** If not empty, indicates that there might be more accounts for the request; you must pass this value in a new `ListPublisherAccountsRequest`. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListPublisherAccountsResponse {
  
  @scala.inline
  def apply(): ListPublisherAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPublisherAccountsResponse]
  }
  
  @scala.inline
  implicit class ListPublisherAccountsResponseMutableBuilder[Self <: ListPublisherAccountsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: js.Array[PublisherAccount]): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    @scala.inline
    def setAccountVarargs(value: PublisherAccount*): Self = StObject.set(x, "account", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
