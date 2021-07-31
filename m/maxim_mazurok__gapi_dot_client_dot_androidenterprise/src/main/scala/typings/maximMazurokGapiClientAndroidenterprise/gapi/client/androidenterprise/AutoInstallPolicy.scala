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
  
  @scala.inline
  def apply(): AutoInstallPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoInstallPolicy]
  }
  
  @scala.inline
  implicit class AutoInstallPolicyMutableBuilder[Self <: AutoInstallPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoInstallConstraint(value: js.Array[AutoInstallConstraint]): Self = StObject.set(x, "autoInstallConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoInstallConstraintUndefined: Self = StObject.set(x, "autoInstallConstraint", js.undefined)
    
    @scala.inline
    def setAutoInstallConstraintVarargs(value: AutoInstallConstraint*): Self = StObject.set(x, "autoInstallConstraint", js.Array(value :_*))
    
    @scala.inline
    def setAutoInstallMode(value: String): Self = StObject.set(x, "autoInstallMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoInstallModeUndefined: Self = StObject.set(x, "autoInstallMode", js.undefined)
    
    @scala.inline
    def setAutoInstallPriority(value: Double): Self = StObject.set(x, "autoInstallPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoInstallPriorityUndefined: Self = StObject.set(x, "autoInstallPriority", js.undefined)
    
    @scala.inline
    def setMinimumVersionCode(value: Double): Self = StObject.set(x, "minimumVersionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumVersionCodeUndefined: Self = StObject.set(x, "minimumVersionCode", js.undefined)
  }
}
