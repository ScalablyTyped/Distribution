package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoRenewingPlan extends StObject {
  
  /** If the subscription is currently set to auto-renew, e.g. the user has not canceled the subscription */
  var autoRenewEnabled: js.UndefOr[Boolean] = js.undefined
}
object AutoRenewingPlan {
  
  inline def apply(): AutoRenewingPlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoRenewingPlan]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoRenewingPlan] (val x: Self) extends AnyVal {
    
    inline def setAutoRenewEnabled(value: Boolean): Self = StObject.set(x, "autoRenewEnabled", value.asInstanceOf[js.Any])
    
    inline def setAutoRenewEnabledUndefined: Self = StObject.set(x, "autoRenewEnabled", js.undefined)
  }
}
