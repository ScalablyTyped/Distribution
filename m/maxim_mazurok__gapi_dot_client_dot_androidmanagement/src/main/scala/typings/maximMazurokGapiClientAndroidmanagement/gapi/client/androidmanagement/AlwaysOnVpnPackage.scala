package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlwaysOnVpnPackage extends StObject {
  
  /** Disallows networking when the VPN is not connected. */
  var lockdownEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** The package name of the VPN app. */
  var packageName: js.UndefOr[String] = js.undefined
}
object AlwaysOnVpnPackage {
  
  inline def apply(): AlwaysOnVpnPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlwaysOnVpnPackage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlwaysOnVpnPackage] (val x: Self) extends AnyVal {
    
    inline def setLockdownEnabled(value: Boolean): Self = StObject.set(x, "lockdownEnabled", value.asInstanceOf[js.Any])
    
    inline def setLockdownEnabledUndefined: Self = StObject.set(x, "lockdownEnabled", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
  }
}
