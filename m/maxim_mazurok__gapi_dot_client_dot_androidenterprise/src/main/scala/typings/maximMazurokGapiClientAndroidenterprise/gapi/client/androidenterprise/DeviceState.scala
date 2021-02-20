package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceState extends StObject {
  
  /**
    * The state of the Google account on the device. "enabled" indicates that the Google account on the device can be used to access Google services (including Google Play), while
    * "disabled" means that it cannot. A new device is initially in the "disabled" state.
    */
  var accountState: js.UndefOr[String] = js.native
}
object DeviceState {
  
  @scala.inline
  def apply(): DeviceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceState]
  }
  
  @scala.inline
  implicit class DeviceStateMutableBuilder[Self <: DeviceState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountState(value: String): Self = StObject.set(x, "accountState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountStateUndefined: Self = StObject.set(x, "accountState", js.undefined)
  }
}
