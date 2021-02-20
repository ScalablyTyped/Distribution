package typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OsConstraint extends StObject {
  
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
object OsConstraint {
  
  @scala.inline
  def apply(): OsConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OsConstraint]
  }
  
  @scala.inline
  implicit class OsConstraintMutableBuilder[Self <: OsConstraint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinimumVersion(value: String): Self = StObject.set(x, "minimumVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumVersionUndefined: Self = StObject.set(x, "minimumVersion", js.undefined)
    
    @scala.inline
    def setOsType(value: String): Self = StObject.set(x, "osType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsTypeUndefined: Self = StObject.set(x, "osType", js.undefined)
    
    @scala.inline
    def setRequireVerifiedChromeOs(value: Boolean): Self = StObject.set(x, "requireVerifiedChromeOs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireVerifiedChromeOsUndefined: Self = StObject.set(x, "requireVerifiedChromeOs", js.undefined)
  }
}
