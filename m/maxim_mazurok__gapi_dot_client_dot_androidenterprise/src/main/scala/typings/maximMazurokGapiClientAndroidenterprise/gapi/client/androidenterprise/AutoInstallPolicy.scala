package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoInstallPolicy extends StObject {
  
  /** The constraints for auto-installing the app. You can specify a maximum of one constraint. */
  var autoInstallConstraint: js.UndefOr[js.Array[AutoInstallConstraint]] = js.undefined
  
  /** The auto-install mode. If unset defaults to "doNotAutoInstall". */
  var autoInstallMode: js.UndefOr[String] = js.undefined
  
  /** The priority of the install, as an unsigned integer. A lower number means higher priority. */
  var autoInstallPriority: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum version of the app. If a lower version of the app is installed, then the app will be auto-updated according to the auto-install constraints, instead of waiting for the
    * regular auto-update. You can set a minimum version code for at most 20 apps per device.
    */
  var minimumVersionCode: js.UndefOr[Double] = js.undefined
}
object AutoInstallPolicy {
  
  inline def apply(): AutoInstallPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoInstallPolicy]
  }
  
  extension [Self <: AutoInstallPolicy](x: Self) {
    
    inline def setAutoInstallConstraint(value: js.Array[AutoInstallConstraint]): Self = StObject.set(x, "autoInstallConstraint", value.asInstanceOf[js.Any])
    
    inline def setAutoInstallConstraintUndefined: Self = StObject.set(x, "autoInstallConstraint", js.undefined)
    
    inline def setAutoInstallConstraintVarargs(value: AutoInstallConstraint*): Self = StObject.set(x, "autoInstallConstraint", js.Array(value*))
    
    inline def setAutoInstallMode(value: String): Self = StObject.set(x, "autoInstallMode", value.asInstanceOf[js.Any])
    
    inline def setAutoInstallModeUndefined: Self = StObject.set(x, "autoInstallMode", js.undefined)
    
    inline def setAutoInstallPriority(value: Double): Self = StObject.set(x, "autoInstallPriority", value.asInstanceOf[js.Any])
    
    inline def setAutoInstallPriorityUndefined: Self = StObject.set(x, "autoInstallPriority", js.undefined)
    
    inline def setMinimumVersionCode(value: Double): Self = StObject.set(x, "minimumVersionCode", value.asInstanceOf[js.Any])
    
    inline def setMinimumVersionCodeUndefined: Self = StObject.set(x, "minimumVersionCode", js.undefined)
  }
}
