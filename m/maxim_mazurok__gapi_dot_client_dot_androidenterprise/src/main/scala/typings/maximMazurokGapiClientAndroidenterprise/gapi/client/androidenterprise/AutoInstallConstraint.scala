package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoInstallConstraint extends StObject {
  
  /** Charging state constraint. */
  var chargingStateConstraint: js.UndefOr[String] = js.undefined
  
  /** Device idle state constraint. */
  var deviceIdleStateConstraint: js.UndefOr[String] = js.undefined
  
  /** Network type constraint. */
  var networkTypeConstraint: js.UndefOr[String] = js.undefined
}
object AutoInstallConstraint {
  
  inline def apply(): AutoInstallConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoInstallConstraint]
  }
  
  extension [Self <: AutoInstallConstraint](x: Self) {
    
    inline def setChargingStateConstraint(value: String): Self = StObject.set(x, "chargingStateConstraint", value.asInstanceOf[js.Any])
    
    inline def setChargingStateConstraintUndefined: Self = StObject.set(x, "chargingStateConstraint", js.undefined)
    
    inline def setDeviceIdleStateConstraint(value: String): Self = StObject.set(x, "deviceIdleStateConstraint", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdleStateConstraintUndefined: Self = StObject.set(x, "deviceIdleStateConstraint", js.undefined)
    
    inline def setNetworkTypeConstraint(value: String): Self = StObject.set(x, "networkTypeConstraint", value.asInstanceOf[js.Any])
    
    inline def setNetworkTypeConstraintUndefined: Self = StObject.set(x, "networkTypeConstraint", js.undefined)
  }
}
