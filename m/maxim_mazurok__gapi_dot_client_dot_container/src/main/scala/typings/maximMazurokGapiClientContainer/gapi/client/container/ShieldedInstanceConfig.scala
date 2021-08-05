package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShieldedInstanceConfig extends StObject {
  
  /**
    * Defines whether the instance has integrity monitoring enabled. Enables monitoring and attestation of the boot integrity of the instance. The attestation is performed against the
    * integrity policy baseline. This baseline is initially derived from the implicitly trusted boot image when the instance is created.
    */
  var enableIntegrityMonitoring: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines whether the instance has Secure Boot enabled. Secure Boot helps ensure that the system only runs authentic software by verifying the digital signature of all boot
    * components, and halting the boot process if signature verification fails.
    */
  var enableSecureBoot: js.UndefOr[Boolean] = js.undefined
}
object ShieldedInstanceConfig {
  
  inline def apply(): ShieldedInstanceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShieldedInstanceConfig]
  }
  
  extension [Self <: ShieldedInstanceConfig](x: Self) {
    
    inline def setEnableIntegrityMonitoring(value: Boolean): Self = StObject.set(x, "enableIntegrityMonitoring", value.asInstanceOf[js.Any])
    
    inline def setEnableIntegrityMonitoringUndefined: Self = StObject.set(x, "enableIntegrityMonitoring", js.undefined)
    
    inline def setEnableSecureBoot(value: Boolean): Self = StObject.set(x, "enableSecureBoot", value.asInstanceOf[js.Any])
    
    inline def setEnableSecureBootUndefined: Self = StObject.set(x, "enableSecureBoot", js.undefined)
  }
}
