package typings.googleapis.v1betaMod.accesscontextmanagerV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A restriction on the OS type and version of devices making requests.
  */
trait SchemaOsConstraint extends StObject {
  
  /**
    * The minimum allowed OS version. If not set, any version of this OS
    * satisfies the constraint. Format: `&quot;major.minor.patch&quot;`.
    * Examples: `&quot;10.5.301&quot;`, `&quot;9.2.1&quot;`.
    */
  var minimumVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The allowed OS type.
    */
  var osType: js.UndefOr[String] = js.undefined
  
  /**
    * Only allows requests from devices with a verified Chrome OS.
    * Verifications includes requirements that the device is
    * enterprise-managed, conformant to Dasher domain policies, and the caller
    * has permission to call the API targeted by the request.
    */
  var requireVerifiedChromeOs: js.UndefOr[Boolean] = js.undefined
}
object SchemaOsConstraint {
  
  inline def apply(): SchemaOsConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOsConstraint]
  }
  
  extension [Self <: SchemaOsConstraint](x: Self) {
    
    inline def setMinimumVersion(value: String): Self = StObject.set(x, "minimumVersion", value.asInstanceOf[js.Any])
    
    inline def setMinimumVersionUndefined: Self = StObject.set(x, "minimumVersion", js.undefined)
    
    inline def setOsType(value: String): Self = StObject.set(x, "osType", value.asInstanceOf[js.Any])
    
    inline def setOsTypeUndefined: Self = StObject.set(x, "osType", js.undefined)
    
    inline def setRequireVerifiedChromeOs(value: Boolean): Self = StObject.set(x, "requireVerifiedChromeOs", value.asInstanceOf[js.Any])
    
    inline def setRequireVerifiedChromeOsUndefined: Self = StObject.set(x, "requireVerifiedChromeOs", js.undefined)
  }
}
