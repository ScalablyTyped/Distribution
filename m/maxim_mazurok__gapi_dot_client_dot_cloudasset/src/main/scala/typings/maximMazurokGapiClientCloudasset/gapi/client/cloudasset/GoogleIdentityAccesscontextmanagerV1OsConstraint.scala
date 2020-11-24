package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleIdentityAccesscontextmanagerV1OsConstraint extends js.Object {
  
  /** The minimum allowed OS version. If not set, any version of this OS satisfies the constraint. Format: `"major.minor.patch"`. Examples: `"10.5.301"`, `"9.2.1"`. */
  var minimumVersion: js.UndefOr[String] = js.native
  
  /** Required. The allowed OS type. */
  var osType: js.UndefOr[String] = js.native
  
  /**
    * Only allows requests from devices with a verified Chrome OS. Verifications includes requirements that the device is enterprise-managed, conformant to domain policies, and the caller
    * has permission to call the API targeted by the request.
    */
  var requireVerifiedChromeOs: js.UndefOr[Boolean] = js.native
}
object GoogleIdentityAccesscontextmanagerV1OsConstraint {
  
  @scala.inline
  def apply(): GoogleIdentityAccesscontextmanagerV1OsConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleIdentityAccesscontextmanagerV1OsConstraint]
  }
  
  @scala.inline
  implicit class GoogleIdentityAccesscontextmanagerV1OsConstraintOps[Self <: GoogleIdentityAccesscontextmanagerV1OsConstraint] (val x: Self) extends AnyVal {
    
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
    def setMinimumVersion(value: String): Self = this.set("minimumVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumVersion: Self = this.set("minimumVersion", js.undefined)
    
    @scala.inline
    def setOsType(value: String): Self = this.set("osType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOsType: Self = this.set("osType", js.undefined)
    
    @scala.inline
    def setRequireVerifiedChromeOs(value: Boolean): Self = this.set("requireVerifiedChromeOs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireVerifiedChromeOs: Self = this.set("requireVerifiedChromeOs", js.undefined)
  }
}
