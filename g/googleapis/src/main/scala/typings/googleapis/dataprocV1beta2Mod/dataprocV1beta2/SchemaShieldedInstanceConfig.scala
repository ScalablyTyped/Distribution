package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaShieldedInstanceConfig extends StObject {
  
  /**
    * Optional. Defines whether instances have integrity monitoring enabled.
    */
  var enableIntegrityMonitoring: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. Defines whether instances have Secure Boot enabled.
    */
  var enableSecureBoot: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. Defines whether instances have the vTPM enabled.
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
