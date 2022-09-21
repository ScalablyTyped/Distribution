package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPublisherProfilesByAccountIdResponse extends StObject {
  
  /** Profiles for the requested publisher */
  var profiles: js.UndefOr[js.Array[PublisherProfileApiProto]] = js.undefined
}
object GetPublisherProfilesByAccountIdResponse {
  
  inline def apply(): GetPublisherProfilesByAccountIdResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPublisherProfilesByAccountIdResponse]
  }
  
  extension [Self <: GetPublisherProfilesByAccountIdResponse](x: Self) {
    
    inline def setProfiles(value: js.Array[PublisherProfileApiProto]): Self = StObject.set(x, "profiles", value.asInstanceOf[js.Any])
    
    inline def setProfilesUndefined: Self = StObject.set(x, "profiles", js.undefined)
    
    inline def setProfilesVarargs(value: PublisherProfileApiProto*): Self = StObject.set(x, "profiles", js.Array(value*))
  }
}
