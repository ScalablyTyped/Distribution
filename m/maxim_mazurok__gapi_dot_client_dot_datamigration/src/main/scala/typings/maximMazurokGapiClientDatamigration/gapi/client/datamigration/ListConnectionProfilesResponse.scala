package typings.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListConnectionProfilesResponse extends js.Object {
  
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
  implicit class ListConnectionProfilesResponseOps[Self <: ListConnectionProfilesResponse] (val x: Self) extends AnyVal {
    
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
    def setConnectionProfilesVarargs(value: ConnectionProfile*): Self = this.set("connectionProfiles", js.Array(value :_*))
    
    @scala.inline
    def setConnectionProfiles(value: js.Array[ConnectionProfile]): Self = this.set("connectionProfiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionProfiles: Self = this.set("connectionProfiles", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setUnreachableVarargs(value: String*): Self = this.set("unreachable", js.Array(value :_*))
    
    @scala.inline
    def setUnreachable(value: js.Array[String]): Self = this.set("unreachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnreachable: Self = this.set("unreachable", js.undefined)
  }
}
