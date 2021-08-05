package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for profiles visible to the buyer.
  */
trait SchemaListPublisherProfilesResponse extends StObject {
  
  /**
    * List pagination support
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The list of matching publisher profiles.
    */
  var publisherProfiles: js.UndefOr[js.Array[SchemaPublisherProfile]] = js.undefined
}
object SchemaListPublisherProfilesResponse {
  
  inline def apply(): SchemaListPublisherProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPublisherProfilesResponse]
  }
  
  extension [Self <: SchemaListPublisherProfilesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPublisherProfiles(value: js.Array[SchemaPublisherProfile]): Self = StObject.set(x, "publisherProfiles", value.asInstanceOf[js.Any])
    
    inline def setPublisherProfilesUndefined: Self = StObject.set(x, "publisherProfiles", js.undefined)
    
    inline def setPublisherProfilesVarargs(value: SchemaPublisherProfile*): Self = StObject.set(x, "publisherProfiles", js.Array(value :_*))
  }
}
