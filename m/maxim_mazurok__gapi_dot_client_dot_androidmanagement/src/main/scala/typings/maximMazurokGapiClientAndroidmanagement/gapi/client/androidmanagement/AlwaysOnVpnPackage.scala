package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlwaysOnVpnPackage extends js.Object {
  
  /** Disallows networking when the VPN is not connected. */
  var lockdownEnabled: js.UndefOr[Boolean] = js.native
  
  /** The package name of the VPN app. */
  var packageName: js.UndefOr[String] = js.native
}
object AlwaysOnVpnPackage {
  
  @scala.inline
  def apply(): AlwaysOnVpnPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlwaysOnVpnPackage]
  }
  
  @scala.inline
  implicit class AlwaysOnVpnPackageOps[Self <: AlwaysOnVpnPackage] (val x: Self) extends AnyVal {
    
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
    def setLockdownEnabled(value: Boolean): Self = this.set("lockdownEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockdownEnabled: Self = this.set("lockdownEnabled", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageName: Self = this.set("packageName", js.undefined)
  }
}
