package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoInstallConstraint extends StObject {
  
  /** Charging state constraint. */
  var chargingStateConstraint: js.UndefOr[String] = js.native
  
  /** Device idle state constraint. */
  var deviceIdleStateConstraint: js.UndefOr[String] = js.native
  
  /** Network type constraint. */
  var networkTypeConstraint: js.UndefOr[String] = js.native
}
object AutoInstallConstraint {
  
  @scala.inline
  def apply(): AutoInstallConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoInstallConstraint]
  }
  
  @scala.inline
  implicit class AutoInstallConstraintMutableBuilder[Self <: AutoInstallConstraint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChargingStateConstraint(value: String): Self = StObject.set(x, "chargingStateConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChargingStateConstraintUndefined: Self = StObject.set(x, "chargingStateConstraint", js.undefined)
    
    @scala.inline
    def setDeviceIdleStateConstraint(value: String): Self = StObject.set(x, "deviceIdleStateConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdleStateConstraintUndefined: Self = StObject.set(x, "deviceIdleStateConstraint", js.undefined)
    
    @scala.inline
    def setNetworkTypeConstraint(value: String): Self = StObject.set(x, "networkTypeConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkTypeConstraintUndefined: Self = StObject.set(x, "networkTypeConstraint", js.undefined)
  }
}
