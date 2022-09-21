package typings.googleapis.playablelocationsV3Mod.playablelocationsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleMapsPlayablelocationsV3LogPlayerReportsRequest extends StObject {
  
  /**
    * Required. Information about the client device (for example, device model and operating system).
    */
  var clientInfo: js.UndefOr[SchemaGoogleMapsUnityClientInfo] = js.undefined
  
  /**
    * Required. Player reports. The maximum number of player reports that you can log at once is 50.
    */
  var playerReports: js.UndefOr[js.Array[SchemaGoogleMapsPlayablelocationsV3PlayerReport]] = js.undefined
  
  /**
    * Required. A string that uniquely identifies the log player reports request. This allows you to detect duplicate requests. We recommend that you use UUIDs for this value. The value must not exceed 50 characters. You should reuse the `request_id` only when retrying a request in the case of a failure. In that case, the request must be identical to the one that failed.
    */
  var requestId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleMapsPlayablelocationsV3LogPlayerReportsRequest {
  
  inline def apply(): SchemaGoogleMapsPlayablelocationsV3LogPlayerReportsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleMapsPlayablelocationsV3LogPlayerReportsRequest]
  }
  
  extension [Self <: SchemaGoogleMapsPlayablelocationsV3LogPlayerReportsRequest](x: Self) {
    
    inline def setClientInfo(value: SchemaGoogleMapsUnityClientInfo): Self = StObject.set(x, "clientInfo", value.asInstanceOf[js.Any])
    
    inline def setClientInfoUndefined: Self = StObject.set(x, "clientInfo", js.undefined)
    
    inline def setPlayerReports(value: js.Array[SchemaGoogleMapsPlayablelocationsV3PlayerReport]): Self = StObject.set(x, "playerReports", value.asInstanceOf[js.Any])
    
    inline def setPlayerReportsUndefined: Self = StObject.set(x, "playerReports", js.undefined)
    
    inline def setPlayerReportsVarargs(value: SchemaGoogleMapsPlayablelocationsV3PlayerReport*): Self = StObject.set(x, "playerReports", js.Array(value*))
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdNull: Self = StObject.set(x, "requestId", null)
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
