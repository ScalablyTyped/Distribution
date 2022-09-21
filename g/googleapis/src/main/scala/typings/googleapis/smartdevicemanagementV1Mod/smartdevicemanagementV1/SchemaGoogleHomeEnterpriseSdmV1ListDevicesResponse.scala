package typings.googleapis.smartdevicemanagementV1Mod.smartdevicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleHomeEnterpriseSdmV1ListDevicesResponse extends StObject {
  
  /**
    * The list of devices.
    */
  var devices: js.UndefOr[js.Array[SchemaGoogleHomeEnterpriseSdmV1Device]] = js.undefined
  
  /**
    * The pagination token to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleHomeEnterpriseSdmV1ListDevicesResponse {
  
  inline def apply(): SchemaGoogleHomeEnterpriseSdmV1ListDevicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleHomeEnterpriseSdmV1ListDevicesResponse]
  }
  
  extension [Self <: SchemaGoogleHomeEnterpriseSdmV1ListDevicesResponse](x: Self) {
    
    inline def setDevices(value: js.Array[SchemaGoogleHomeEnterpriseSdmV1Device]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    inline def setDevicesVarargs(value: SchemaGoogleHomeEnterpriseSdmV1Device*): Self = StObject.set(x, "devices", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
