package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPublisherProfilesByAccountIdResponse extends StObject {
  
  /** Profiles for the requested publisher */
  var profiles: js.UndefOr[js.Array[PublisherProfileApiProto]] = js.native
}
object GetPublisherProfilesByAccountIdResponse {
  
  @scala.inline
  def apply(): GetPublisherProfilesByAccountIdResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPublisherProfilesByAccountIdResponse]
  }
  
  @scala.inline
  implicit class GetPublisherProfilesByAccountIdResponseMutableBuilder[Self <: GetPublisherProfilesByAccountIdResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProfiles(value: js.Array[PublisherProfileApiProto]): Self = StObject.set(x, "profiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfilesUndefined: Self = StObject.set(x, "profiles", js.undefined)
    
    @scala.inline
    def setProfilesVarargs(value: PublisherProfileApiProto*): Self = StObject.set(x, "profiles", js.Array(value :_*))
  }
}
