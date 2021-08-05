package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsCloudidentityDevicesV1ListClientStatesResponse extends StObject {
  
  /** Client states meeting the list restrictions. */
  var clientStates: js.UndefOr[js.Array[GoogleAppsCloudidentityDevicesV1ClientState]] = js.undefined
  
  /** Token to retrieve the next page of results. Empty if there are no more results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleAppsCloudidentityDevicesV1ListClientStatesResponse {
  
  inline def apply(): GoogleAppsCloudidentityDevicesV1ListClientStatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCloudidentityDevicesV1ListClientStatesResponse]
  }
  
  extension [Self <: GoogleAppsCloudidentityDevicesV1ListClientStatesResponse](x: Self) {
    
    inline def setClientStates(value: js.Array[GoogleAppsCloudidentityDevicesV1ClientState]): Self = StObject.set(x, "clientStates", value.asInstanceOf[js.Any])
    
    inline def setClientStatesUndefined: Self = StObject.set(x, "clientStates", js.undefined)
    
    inline def setClientStatesVarargs(value: GoogleAppsCloudidentityDevicesV1ClientState*): Self = StObject.set(x, "clientStates", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
