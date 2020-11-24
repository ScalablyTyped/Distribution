package typings.maximMazurokGapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListUsableSubnetworksResponse extends js.Object {
  
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
  implicit class ListUsableSubnetworksResponseOps[Self <: ListUsableSubnetworksResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setSubnetworksVarargs(value: UsableSubnetwork*): Self = this.set("subnetworks", js.Array(value :_*))
    
    @scala.inline
    def setSubnetworks(value: js.Array[UsableSubnetwork]): Self = this.set("subnetworks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetworks: Self = this.set("subnetworks", js.undefined)
  }
}
