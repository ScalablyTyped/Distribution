package typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DevicePolicy extends StObject {
  
  /** Allowed device management levels, an empty list allows all management levels. */
  var allowedDeviceManagementLevels: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Allowed encryptions statuses, an empty list allows all statuses. */
  var allowedEncryptionStatuses: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Allowed OS versions, an empty list allows all types and all versions. */
  var osConstraints: js.UndefOr[js.Array[OsConstraint]] = js.undefined
  
  /** Whether the device needs to be approved by the customer admin. */
  var requireAdminApproval: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the device needs to be corp owned. */
  var requireCorpOwned: js.UndefOr[Boolean] = js.undefined
  
  /** Whether or not screenlock is required for the DevicePolicy to be true. Defaults to `false`. */
  var requireScreenlock: js.UndefOr[Boolean] = js.undefined
}
object DevicePolicy {
  
  inline def apply(): DevicePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DevicePolicy]
  }
  
  extension [Self <: DevicePolicy](x: Self) {
    
    inline def setAllowedDeviceManagementLevels(value: js.Array[String]): Self = StObject.set(x, "allowedDeviceManagementLevels", value.asInstanceOf[js.Any])
    
    inline def setAllowedDeviceManagementLevelsUndefined: Self = StObject.set(x, "allowedDeviceManagementLevels", js.undefined)
    
    inline def setAllowedDeviceManagementLevelsVarargs(value: String*): Self = StObject.set(x, "allowedDeviceManagementLevels", js.Array(value*))
    
    inline def setAllowedEncryptionStatuses(value: js.Array[String]): Self = StObject.set(x, "allowedEncryptionStatuses", value.asInstanceOf[js.Any])
    
    inline def setAllowedEncryptionStatusesUndefined: Self = StObject.set(x, "allowedEncryptionStatuses", js.undefined)
    
    inline def setAllowedEncryptionStatusesVarargs(value: String*): Self = StObject.set(x, "allowedEncryptionStatuses", js.Array(value*))
    
    inline def setOsConstraints(value: js.Array[OsConstraint]): Self = StObject.set(x, "osConstraints", value.asInstanceOf[js.Any])
    
    inline def setOsConstraintsUndefined: Self = StObject.set(x, "osConstraints", js.undefined)
    
    inline def setOsConstraintsVarargs(value: OsConstraint*): Self = StObject.set(x, "osConstraints", js.Array(value*))
    
    inline def setRequireAdminApproval(value: Boolean): Self = StObject.set(x, "requireAdminApproval", value.asInstanceOf[js.Any])
    
    inline def setRequireAdminApprovalUndefined: Self = StObject.set(x, "requireAdminApproval", js.undefined)
    
    inline def setRequireCorpOwned(value: Boolean): Self = StObject.set(x, "requireCorpOwned", value.asInstanceOf[js.Any])
    
    inline def setRequireCorpOwnedUndefined: Self = StObject.set(x, "requireCorpOwned", js.undefined)
    
    inline def setRequireScreenlock(value: Boolean): Self = StObject.set(x, "requireScreenlock", value.asInstanceOf[js.Any])
    
    inline def setRequireScreenlockUndefined: Self = StObject.set(x, "requireScreenlock", js.undefined)
  }
}
