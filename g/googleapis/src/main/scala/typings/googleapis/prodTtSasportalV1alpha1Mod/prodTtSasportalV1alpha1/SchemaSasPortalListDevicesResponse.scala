package typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSasPortalListDevicesResponse extends StObject {
  
  /**
    * The devices that match the request.
    */
  var devices: js.UndefOr[js.Array[SchemaSasPortalDevice]] = js.undefined
  
  /**
    * A pagination token returned from a previous call to ListDevices that indicates from where listing should continue. If the field is missing or empty, it means there is no more devices.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaSasPortalListDevicesResponse {
  
  inline def apply(): SchemaSasPortalListDevicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSasPortalListDevicesResponse]
  }
  
  extension [Self <: SchemaSasPortalListDevicesResponse](x: Self) {
    
    inline def setDevices(value: js.Array[SchemaSasPortalDevice]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    inline def setDevicesVarargs(value: SchemaSasPortalDevice*): Self = StObject.set(x, "devices", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
