package typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSasPortalSignDeviceRequest extends StObject {
  
  /**
    * Required. The device to sign. The device fields name, fcc_id and serial_number must be set. The user_id field must be set.
    */
  var device: js.UndefOr[SchemaSasPortalDevice] = js.undefined
}
object SchemaSasPortalSignDeviceRequest {
  
  inline def apply(): SchemaSasPortalSignDeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSasPortalSignDeviceRequest]
  }
  
  extension [Self <: SchemaSasPortalSignDeviceRequest](x: Self) {
    
    inline def setDevice(value: SchemaSasPortalDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
  }
}
