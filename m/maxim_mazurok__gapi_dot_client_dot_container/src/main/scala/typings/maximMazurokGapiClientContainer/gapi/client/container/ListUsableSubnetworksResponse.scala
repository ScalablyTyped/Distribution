package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListUsableSubnetworksResponse extends StObject {
  
  /**
    * This token allows you to get the next page of results for list requests. If the number of results is larger than `page_size`, use the `next_page_token` as a value for the query
    * parameter `page_token` in the next request. The value will become empty when there are no more pages.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** A list of usable subnetworks in the specified network project. */
  var subnetworks: js.UndefOr[js.Array[UsableSubnetwork]] = js.native
}
object ListUsableSubnetworksResponse {
  
  @scala.inline
  def apply(): ListUsableSubnetworksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUsableSubnetworksResponse]
  }
  
  @scala.inline
  implicit class ListUsableSubnetworksResponseMutableBuilder[Self <: ListUsableSubnetworksResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSubnetworks(value: js.Array[UsableSubnetwork]): Self = StObject.set(x, "subnetworks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetworksUndefined: Self = StObject.set(x, "subnetworks", js.undefined)
    
    @scala.inline
    def setSubnetworksVarargs(value: UsableSubnetwork*): Self = StObject.set(x, "subnetworks", js.Array(value :_*))
  }
}
