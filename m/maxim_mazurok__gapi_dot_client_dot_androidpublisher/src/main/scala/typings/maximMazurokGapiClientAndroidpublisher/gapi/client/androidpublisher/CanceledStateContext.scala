package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanceledStateContext extends StObject {
  
  /** Subscription was canceled by the developer. */
  var developerInitiatedCancellation: js.UndefOr[Any] = js.undefined
  
  /** Subscription was replaced by a new subscription. */
  var replacementCancellation: js.UndefOr[Any] = js.undefined
  
  /** Subscription was canceled by the system, for example because of a billing problem. */
  var systemInitiatedCancellation: js.UndefOr[Any] = js.undefined
  
  /** Subscription was canceled by user. */
  var userInitiatedCancellation: js.UndefOr[UserInitiatedCancellation] = js.undefined
}
object CanceledStateContext {
  
  inline def apply(): CanceledStateContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanceledStateContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanceledStateContext] (val x: Self) extends AnyVal {
    
    inline def setDeveloperInitiatedCancellation(value: Any): Self = StObject.set(x, "developerInitiatedCancellation", value.asInstanceOf[js.Any])
    
    inline def setDeveloperInitiatedCancellationUndefined: Self = StObject.set(x, "developerInitiatedCancellation", js.undefined)
    
    inline def setReplacementCancellation(value: Any): Self = StObject.set(x, "replacementCancellation", value.asInstanceOf[js.Any])
    
    inline def setReplacementCancellationUndefined: Self = StObject.set(x, "replacementCancellation", js.undefined)
    
    inline def setSystemInitiatedCancellation(value: Any): Self = StObject.set(x, "systemInitiatedCancellation", value.asInstanceOf[js.Any])
    
    inline def setSystemInitiatedCancellationUndefined: Self = StObject.set(x, "systemInitiatedCancellation", js.undefined)
    
    inline def setUserInitiatedCancellation(value: UserInitiatedCancellation): Self = StObject.set(x, "userInitiatedCancellation", value.asInstanceOf[js.Any])
    
    inline def setUserInitiatedCancellationUndefined: Self = StObject.set(x, "userInitiatedCancellation", js.undefined)
  }
}
