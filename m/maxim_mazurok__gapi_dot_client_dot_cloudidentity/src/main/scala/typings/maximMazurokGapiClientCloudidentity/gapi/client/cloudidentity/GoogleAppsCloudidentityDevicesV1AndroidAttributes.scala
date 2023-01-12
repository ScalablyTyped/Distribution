package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsCloudidentityDevicesV1AndroidAttributes extends StObject {
  
  /** Whether applications from unknown sources can be installed on device. */
  var enabledUnknownSources: js.UndefOr[Boolean] = js.undefined
  
  /** Whether this account is on an owner/primary profile. For phones, only true for owner profiles. Android 4+ devices can have secondary or restricted user profiles. */
  var ownerProfileAccount: js.UndefOr[Boolean] = js.undefined
  
  /** Ownership privileges on device. */
  var ownershipPrivilege: js.UndefOr[String] = js.undefined
  
  /** Whether device supports Android work profiles. If false, this service will not block access to corp data even if an administrator turns on the "Enforce Work Profile" policy. */
  var supportsWorkProfile: js.UndefOr[Boolean] = js.undefined
}
object GoogleAppsCloudidentityDevicesV1AndroidAttributes {
  
  inline def apply(): GoogleAppsCloudidentityDevicesV1AndroidAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCloudidentityDevicesV1AndroidAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAppsCloudidentityDevicesV1AndroidAttributes] (val x: Self) extends AnyVal {
    
    inline def setEnabledUnknownSources(value: Boolean): Self = StObject.set(x, "enabledUnknownSources", value.asInstanceOf[js.Any])
    
    inline def setEnabledUnknownSourcesUndefined: Self = StObject.set(x, "enabledUnknownSources", js.undefined)
    
    inline def setOwnerProfileAccount(value: Boolean): Self = StObject.set(x, "ownerProfileAccount", value.asInstanceOf[js.Any])
    
    inline def setOwnerProfileAccountUndefined: Self = StObject.set(x, "ownerProfileAccount", js.undefined)
    
    inline def setOwnershipPrivilege(value: String): Self = StObject.set(x, "ownershipPrivilege", value.asInstanceOf[js.Any])
    
    inline def setOwnershipPrivilegeUndefined: Self = StObject.set(x, "ownershipPrivilege", js.undefined)
    
    inline def setSupportsWorkProfile(value: Boolean): Self = StObject.set(x, "supportsWorkProfile", value.asInstanceOf[js.Any])
    
    inline def setSupportsWorkProfileUndefined: Self = StObject.set(x, "supportsWorkProfile", js.undefined)
  }
}
