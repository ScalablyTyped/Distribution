package typings.googleapis.v1betaMod.accesscontextmanagerV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `DevicePolicy` specifies device specific restrictions necessary to acquire
  * a given access level. A `DevicePolicy` specifies requirements for requests
  * from devices to be granted access levels, it does not do any enforcement on
  * the device. `DevicePolicy` acts as an AND over all specified fields, and
  * each repeated field is an OR over its elements. Any unset fields are
  * ignored. For example, if the proto is { os_type : DESKTOP_WINDOWS, os_type
  * : DESKTOP_LINUX, encryption_status: ENCRYPTED}, then the DevicePolicy will
  * be true for requests originating from encrypted Linux desktops and
  * encrypted Windows desktops.
  */
trait SchemaDevicePolicy extends StObject {
  
  /**
    * Allowed device management levels, an empty list allows all management
    * levels.
    */
  var allowedDeviceManagementLevels: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Allowed encryptions statuses, an empty list allows all statuses.
    */
  var allowedEncryptionStatuses: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Allowed OS versions, an empty list allows all types and all versions.
    */
  var osConstraints: js.UndefOr[js.Array[SchemaOsConstraint]] = js.undefined
  
  /**
    * Whether the device needs to be approved by the customer admin.
    */
  var requireAdminApproval: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the device needs to be corp owned.
    */
  var requireCorpOwned: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether or not screenlock is required for the DevicePolicy to be true.
    * Defaults to `false`.
    */
  var requireScreenlock: js.UndefOr[Boolean] = js.undefined
}
object SchemaDevicePolicy {
  
  @scala.inline
  def apply(): SchemaDevicePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDevicePolicy]
  }
  
  @scala.inline
  implicit class SchemaDevicePolicyMutableBuilder[Self <: SchemaDevicePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedDeviceManagementLevels(value: js.Array[String]): Self = StObject.set(x, "allowedDeviceManagementLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedDeviceManagementLevelsUndefined: Self = StObject.set(x, "allowedDeviceManagementLevels", js.undefined)
    
    @scala.inline
    def setAllowedDeviceManagementLevelsVarargs(value: String*): Self = StObject.set(x, "allowedDeviceManagementLevels", js.Array(value :_*))
    
    @scala.inline
    def setAllowedEncryptionStatuses(value: js.Array[String]): Self = StObject.set(x, "allowedEncryptionStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedEncryptionStatusesUndefined: Self = StObject.set(x, "allowedEncryptionStatuses", js.undefined)
    
    @scala.inline
    def setAllowedEncryptionStatusesVarargs(value: String*): Self = StObject.set(x, "allowedEncryptionStatuses", js.Array(value :_*))
    
    @scala.inline
    def setOsConstraints(value: js.Array[SchemaOsConstraint]): Self = StObject.set(x, "osConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsConstraintsUndefined: Self = StObject.set(x, "osConstraints", js.undefined)
    
    @scala.inline
    def setOsConstraintsVarargs(value: SchemaOsConstraint*): Self = StObject.set(x, "osConstraints", js.Array(value :_*))
    
    @scala.inline
    def setRequireAdminApproval(value: Boolean): Self = StObject.set(x, "requireAdminApproval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireAdminApprovalUndefined: Self = StObject.set(x, "requireAdminApproval", js.undefined)
    
    @scala.inline
    def setRequireCorpOwned(value: Boolean): Self = StObject.set(x, "requireCorpOwned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireCorpOwnedUndefined: Self = StObject.set(x, "requireCorpOwned", js.undefined)
    
    @scala.inline
    def setRequireScreenlock(value: Boolean): Self = StObject.set(x, "requireScreenlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireScreenlockUndefined: Self = StObject.set(x, "requireScreenlock", js.undefined)
  }
}
