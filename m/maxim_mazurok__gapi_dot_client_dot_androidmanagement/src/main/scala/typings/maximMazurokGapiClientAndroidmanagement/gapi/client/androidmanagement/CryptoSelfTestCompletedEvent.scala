package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CryptoSelfTestCompletedEvent extends StObject {
  
  /** Whether the test succeeded. */
  var success: js.UndefOr[Boolean] = js.undefined
}
object CryptoSelfTestCompletedEvent {
  
  inline def apply(): CryptoSelfTestCompletedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CryptoSelfTestCompletedEvent]
  }
  
  extension [Self <: CryptoSelfTestCompletedEvent](x: Self) {
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
