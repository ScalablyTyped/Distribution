package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPublisherProfilesResponse extends js.Object {
  
  /** List pagination support */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The list of matching publisher profiles. */
  var publisherProfiles: js.UndefOr[js.Array[PublisherProfile]] = js.native
}
object ListPublisherProfilesResponse {
  
  @scala.inline
  def apply(): ListPublisherProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPublisherProfilesResponse]
  }
  
  @scala.inline
  implicit class ListPublisherProfilesResponseOps[Self <: ListPublisherProfilesResponse] (val x: Self) extends AnyVal {
    
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
    def setPublisherProfilesVarargs(value: PublisherProfile*): Self = this.set("publisherProfiles", js.Array(value :_*))
    
    @scala.inline
    def setPublisherProfiles(value: js.Array[PublisherProfile]): Self = this.set("publisherProfiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublisherProfiles: Self = this.set("publisherProfiles", js.undefined)
  }
}
