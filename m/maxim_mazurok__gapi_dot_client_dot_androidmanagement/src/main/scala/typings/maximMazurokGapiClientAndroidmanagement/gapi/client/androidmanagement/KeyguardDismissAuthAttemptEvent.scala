package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyguardDismissAuthAttemptEvent extends StObject {
  
  /** Whether a strong form of authentication (password, PIN, or pattern) was used to unlock device. */
  var strongAuthMethodUsed: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the unlock attempt was successful. */
  var success: js.UndefOr[Boolean] = js.undefined
}
object KeyguardDismissAuthAttemptEvent {
  
  inline def apply(): KeyguardDismissAuthAttemptEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyguardDismissAuthAttemptEvent]
  }
  
  extension [Self <: KeyguardDismissAuthAttemptEvent](x: Self) {
    
    inline def setStrongAuthMethodUsed(value: Boolean): Self = StObject.set(x, "strongAuthMethodUsed", value.asInstanceOf[js.Any])
    
    inline def setStrongAuthMethodUsedUndefined: Self = StObject.set(x, "strongAuthMethodUsed", js.undefined)
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
