package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceState extends StObject {
  
  /**
    * The state of the Google account on the device. "enabled" indicates that the Google account on the device can be used to access Google services (including Google Play), while
    * "disabled" means that it cannot. A new device is initially in the "disabled" state.
    */
  var accountState: js.UndefOr[String] = js.undefined
}
object DeviceState {
  
  inline def apply(): DeviceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceState]
  }
  
  extension [Self <: DeviceState](x: Self) {
    
    inline def setAccountState(value: String): Self = StObject.set(x, "accountState", value.asInstanceOf[js.Any])
    
    inline def setAccountStateUndefined: Self = StObject.set(x, "accountState", js.undefined)
  }
}
