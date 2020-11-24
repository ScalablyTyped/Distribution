package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAppsCloudidentityDevicesV1ListClientStatesResponse extends js.Object {
  
  /** Client states meeting the list restrictions. */
  var clientStates: js.UndefOr[js.Array[GoogleAppsCloudidentityDevicesV1ClientState]] = js.native
  
  /** Token to retrieve the next page of results. Empty if there are no more results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GoogleAppsCloudidentityDevicesV1ListClientStatesResponse {
  
  @scala.inline
  def apply(): GoogleAppsCloudidentityDevicesV1ListClientStatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCloudidentityDevicesV1ListClientStatesResponse]
  }
  
  @scala.inline
  implicit class GoogleAppsCloudidentityDevicesV1ListClientStatesResponseOps[Self <: GoogleAppsCloudidentityDevicesV1ListClientStatesResponse] (val x: Self) extends AnyVal {
    
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
    def setClientStatesVarargs(value: GoogleAppsCloudidentityDevicesV1ClientState*): Self = this.set("clientStates", js.Array(value :_*))
    
    @scala.inline
    def setClientStates(value: js.Array[GoogleAppsCloudidentityDevicesV1ClientState]): Self = this.set("clientStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientStates: Self = this.set("clientStates", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
