package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountSuspensionWarning extends StObject {
  
  /**
    * The amount of time remaining to appeal an imminent suspension. After this window has elapsed, the account will be suspended. Only populated if the account suspension is in WARNING
    * state.
    */
  var appealWindow: js.UndefOr[String] = js.undefined
  
  /** Account suspension warning state. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Details about why an account is being suspended. */
  var suspensionDetails: js.UndefOr[js.Array[AccountSuspensionDetails]] = js.undefined
}
object AccountSuspensionWarning {
  
  inline def apply(): AccountSuspensionWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountSuspensionWarning]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountSuspensionWarning] (val x: Self) extends AnyVal {
    
    inline def setAppealWindow(value: String): Self = StObject.set(x, "appealWindow", value.asInstanceOf[js.Any])
    
    inline def setAppealWindowUndefined: Self = StObject.set(x, "appealWindow", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSuspensionDetails(value: js.Array[AccountSuspensionDetails]): Self = StObject.set(x, "suspensionDetails", value.asInstanceOf[js.Any])
    
    inline def setSuspensionDetailsUndefined: Self = StObject.set(x, "suspensionDetails", js.undefined)
    
    inline def setSuspensionDetailsVarargs(value: AccountSuspensionDetails*): Self = StObject.set(x, "suspensionDetails", js.Array(value*))
  }
}
