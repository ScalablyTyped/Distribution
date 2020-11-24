package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoInstallConstraint extends js.Object {
  
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
  implicit class AutoInstallConstraintOps[Self <: AutoInstallConstraint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChargingStateConstraint(value: String): Self = this.set("chargingStateConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChargingStateConstraint: Self = this.set("chargingStateConstraint", js.undefined)
    
    @scala.inline
    def setDeviceIdleStateConstraint(value: String): Self = this.set("deviceIdleStateConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceIdleStateConstraint: Self = this.set("deviceIdleStateConstraint", js.undefined)
    
    @scala.inline
    def setNetworkTypeConstraint(value: String): Self = this.set("networkTypeConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkTypeConstraint: Self = this.set("networkTypeConstraint", js.undefined)
  }
}
