package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoInstallPolicy extends js.Object {
  
  /** The constraints for auto-installing the app. You can specify a maximum of one constraint. */
  var autoInstallConstraint: js.UndefOr[js.Array[AutoInstallConstraint]] = js.native
  
  /** The auto-install mode. If unset defaults to "doNotAutoInstall". */
  var autoInstallMode: js.UndefOr[String] = js.native
  
  /** The priority of the install, as an unsigned integer. A lower number means higher priority. */
  var autoInstallPriority: js.UndefOr[Double] = js.native
  
  /**
    * The minimum version of the app. If a lower version of the app is installed, then the app will be auto-updated according to the auto-install constraints, instead of waiting for the
    * regular auto-update. You can set a minimum version code for at most 20 apps per device.
    */
  var minimumVersionCode: js.UndefOr[Double] = js.native
}
object AutoInstallPolicy {
  
  @scala.inline
  def apply(): AutoInstallPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoInstallPolicy]
  }
  
  @scala.inline
  implicit class AutoInstallPolicyOps[Self <: AutoInstallPolicy] (val x: Self) extends AnyVal {
    
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
    def setAutoInstallConstraintVarargs(value: AutoInstallConstraint*): Self = this.set("autoInstallConstraint", js.Array(value :_*))
    
    @scala.inline
    def setAutoInstallConstraint(value: js.Array[AutoInstallConstraint]): Self = this.set("autoInstallConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoInstallConstraint: Self = this.set("autoInstallConstraint", js.undefined)
    
    @scala.inline
    def setAutoInstallMode(value: String): Self = this.set("autoInstallMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoInstallMode: Self = this.set("autoInstallMode", js.undefined)
    
    @scala.inline
    def setAutoInstallPriority(value: Double): Self = this.set("autoInstallPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoInstallPriority: Self = this.set("autoInstallPriority", js.undefined)
    
    @scala.inline
    def setMinimumVersionCode(value: Double): Self = this.set("minimumVersionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumVersionCode: Self = this.set("minimumVersionCode", js.undefined)
  }
}
