package typings.googleapis.sasportalV1alpha1Mod.sasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSasPortalCreateSignedDeviceRequest extends StObject {
  
  /**
    * Required. JSON Web Token signed using a CPI private key. Payload must be the JSON encoding of the device. The user_id field must be set.
    */
  var encodedDevice: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Unique installer id (CPI ID) from the Certified Professional Installers database.
    */
  var installerId: js.UndefOr[String | Null] = js.undefined
}
object SchemaSasPortalCreateSignedDeviceRequest {
  
  inline def apply(): SchemaSasPortalCreateSignedDeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSasPortalCreateSignedDeviceRequest]
  }
  
  extension [Self <: SchemaSasPortalCreateSignedDeviceRequest](x: Self) {
    
    inline def setEncodedDevice(value: String): Self = StObject.set(x, "encodedDevice", value.asInstanceOf[js.Any])
    
    inline def setEncodedDeviceNull: Self = StObject.set(x, "encodedDevice", null)
    
    inline def setEncodedDeviceUndefined: Self = StObject.set(x, "encodedDevice", js.undefined)
    
    inline def setInstallerId(value: String): Self = StObject.set(x, "installerId", value.asInstanceOf[js.Any])
    
    inline def setInstallerIdNull: Self = StObject.set(x, "installerId", null)
    
    inline def setInstallerIdUndefined: Self = StObject.set(x, "installerId", js.undefined)
  }
}
