package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPublisherProfilesResponse extends StObject {
  
  /** List pagination support */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of matching publisher profiles. */
  var publisherProfiles: js.UndefOr[js.Array[PublisherProfile]] = js.undefined
}
object ListPublisherProfilesResponse {
  
  @scala.inline
  def apply(): ListPublisherProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPublisherProfilesResponse]
  }
  
  @scala.inline
  implicit class ListPublisherProfilesResponseMutableBuilder[Self <: ListPublisherProfilesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setPublisherProfiles(value: js.Array[PublisherProfile]): Self = StObject.set(x, "publisherProfiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherProfilesUndefined: Self = StObject.set(x, "publisherProfiles", js.undefined)
    
    @scala.inline
    def setPublisherProfilesVarargs(value: PublisherProfile*): Self = StObject.set(x, "publisherProfiles", js.Array(value :_*))
  }
}
