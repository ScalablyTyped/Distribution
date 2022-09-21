package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaShieldedInstanceConfig extends StObject {
  
  /**
    * Defines whether the instance has integrity monitoring enabled. Enabled by default.
    */
  var enableIntegrityMonitoring: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Defines whether the instance has Secure Boot enabled. Disabled by default.
    */
  var enableSecureBoot: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Defines whether the instance has the vTPM enabled. Enabled by default.
    */
  var enableVtpm: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaShieldedInstanceConfig {
  
  inline def apply(): SchemaShieldedInstanceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShieldedInstanceConfig]
  }
  
  extension [Self <: SchemaShieldedInstanceConfig](x: Self) {
    
    inline def setEnableIntegrityMonitoring(value: Boolean): Self = StObject.set(x, "enableIntegrityMonitoring", value.asInstanceOf[js.Any])
    
    inline def setEnableIntegrityMonitoringNull: Self = StObject.set(x, "enableIntegrityMonitoring", null)
    
    inline def setEnableIntegrityMonitoringUndefined: Self = StObject.set(x, "enableIntegrityMonitoring", js.undefined)
    
    inline def setEnableSecureBoot(value: Boolean): Self = StObject.set(x, "enableSecureBoot", value.asInstanceOf[js.Any])
    
    inline def setEnableSecureBootNull: Self = StObject.set(x, "enableSecureBoot", null)
    
    inline def setEnableSecureBootUndefined: Self = StObject.set(x, "enableSecureBoot", js.undefined)
    
    inline def setEnableVtpm(value: Boolean): Self = StObject.set(x, "enableVtpm", value.asInstanceOf[js.Any])
    
    inline def setEnableVtpmNull: Self = StObject.set(x, "enableVtpm", null)
    
    inline def setEnableVtpmUndefined: Self = StObject.set(x, "enableVtpm", js.undefined)
  }
}
