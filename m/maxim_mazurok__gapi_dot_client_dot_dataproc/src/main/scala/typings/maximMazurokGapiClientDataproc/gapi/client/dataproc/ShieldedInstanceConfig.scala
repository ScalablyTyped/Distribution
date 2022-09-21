package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShieldedInstanceConfig extends StObject {
  
  /** Optional. Defines whether instances have integrity monitoring enabled. */
  var enableIntegrityMonitoring: js.UndefOr[Boolean] = js.undefined
  
  /** Optional. Defines whether instances have Secure Boot enabled. */
  var enableSecureBoot: js.UndefOr[Boolean] = js.undefined
  
  /** Optional. Defines whether instances have the vTPM enabled. */
  var enableVtpm: js.UndefOr[Boolean] = js.undefined
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
    
    inline def setEnableVtpm(value: Boolean): Self = StObject.set(x, "enableVtpm", value.asInstanceOf[js.Any])
    
    inline def setEnableVtpmUndefined: Self = StObject.set(x, "enableVtpm", js.undefined)
  }
}
