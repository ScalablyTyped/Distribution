package typings.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListConnectionProfilesResponse extends StObject {
  
  /** The response list of connection profiles. */
  var connectionProfiles: js.UndefOr[js.Array[ConnectionProfile]] = js.native
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** Locations that could not be reached. */
  var unreachable: js.UndefOr[js.Array[String]] = js.native
}
object ListConnectionProfilesResponse {
  
  @scala.inline
  def apply(): ListConnectionProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConnectionProfilesResponse]
  }
  
  @scala.inline
  implicit class ListConnectionProfilesResponseMutableBuilder[Self <: ListConnectionProfilesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionProfiles(value: js.Array[ConnectionProfile]): Self = StObject.set(x, "connectionProfiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionProfilesUndefined: Self = StObject.set(x, "connectionProfiles", js.undefined)
    
    @scala.inline
    def setConnectionProfilesVarargs(value: ConnectionProfile*): Self = StObject.set(x, "connectionProfiles", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    @scala.inline
    def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value :_*))
  }
}
