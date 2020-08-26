package typings.googleapis.v1betaMod.accesscontextmanagerV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@js.native
trait SchemaDevicePolicy extends js.Object {
  /**
    * Allowed device management levels, an empty list allows all management
    * levels.
    */
  var allowedDeviceManagementLevels: js.UndefOr[js.Array[String]] = js.native
  /**
    * Allowed encryptions statuses, an empty list allows all statuses.
    */
  var allowedEncryptionStatuses: js.UndefOr[js.Array[String]] = js.native
  /**
    * Allowed OS versions, an empty list allows all types and all versions.
    */
  var osConstraints: js.UndefOr[js.Array[SchemaOsConstraint]] = js.native
  /**
    * Whether the device needs to be approved by the customer admin.
    */
  var requireAdminApproval: js.UndefOr[Boolean] = js.native
  /**
    * Whether the device needs to be corp owned.
    */
  var requireCorpOwned: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not screenlock is required for the DevicePolicy to be true.
    * Defaults to `false`.
    */
  var requireScreenlock: js.UndefOr[Boolean] = js.native
}

object SchemaDevicePolicy {
  @scala.inline
  def apply(): SchemaDevicePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDevicePolicy]
  }
  @scala.inline
  implicit class SchemaDevicePolicyOps[Self <: SchemaDevicePolicy] (val x: Self) extends AnyVal {
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
    def setAllowedDeviceManagementLevelsVarargs(value: String*): Self = this.set("allowedDeviceManagementLevels", js.Array(value :_*))
    @scala.inline
    def setAllowedDeviceManagementLevels(value: js.Array[String]): Self = this.set("allowedDeviceManagementLevels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedDeviceManagementLevels: Self = this.set("allowedDeviceManagementLevels", js.undefined)
    @scala.inline
    def setAllowedEncryptionStatusesVarargs(value: String*): Self = this.set("allowedEncryptionStatuses", js.Array(value :_*))
    @scala.inline
    def setAllowedEncryptionStatuses(value: js.Array[String]): Self = this.set("allowedEncryptionStatuses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedEncryptionStatuses: Self = this.set("allowedEncryptionStatuses", js.undefined)
    @scala.inline
    def setOsConstraintsVarargs(value: SchemaOsConstraint*): Self = this.set("osConstraints", js.Array(value :_*))
    @scala.inline
    def setOsConstraints(value: js.Array[SchemaOsConstraint]): Self = this.set("osConstraints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOsConstraints: Self = this.set("osConstraints", js.undefined)
    @scala.inline
    def setRequireAdminApproval(value: Boolean): Self = this.set("requireAdminApproval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireAdminApproval: Self = this.set("requireAdminApproval", js.undefined)
    @scala.inline
    def setRequireCorpOwned(value: Boolean): Self = this.set("requireCorpOwned", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireCorpOwned: Self = this.set("requireCorpOwned", js.undefined)
    @scala.inline
    def setRequireScreenlock(value: Boolean): Self = this.set("requireScreenlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireScreenlock: Self = this.set("requireScreenlock", js.undefined)
  }
  
}

