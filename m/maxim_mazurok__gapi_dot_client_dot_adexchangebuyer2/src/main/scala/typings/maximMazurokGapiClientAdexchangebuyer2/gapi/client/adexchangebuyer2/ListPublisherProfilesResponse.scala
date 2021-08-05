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
  
  inline def apply(): ListPublisherProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPublisherProfilesResponse]
  }
  
  extension [Self <: ListPublisherProfilesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPublisherProfiles(value: js.Array[PublisherProfile]): Self = StObject.set(x, "publisherProfiles", value.asInstanceOf[js.Any])
    
    inline def setPublisherProfilesUndefined: Self = StObject.set(x, "publisherProfiles", js.undefined)
    
    inline def setPublisherProfilesVarargs(value: PublisherProfile*): Self = StObject.set(x, "publisherProfiles", js.Array(value :_*))
  }
}
