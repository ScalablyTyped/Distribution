package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.googleapis.anon.DisplayName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Mobile Device resource in Directory API.
  */
@js.native
trait SchemaMobileDevice extends js.Object {
  /**
    * Adb (USB debugging) enabled or disabled on device (Read-only)
    */
  var adbStatus: js.UndefOr[Boolean] = js.native
  /**
    * List of applications installed on Mobile Device
    */
  var applications: js.UndefOr[js.Array[DisplayName]] = js.native
  /**
    * Mobile Device Baseband version (Read-only)
    */
  var basebandVersion: js.UndefOr[String] = js.native
  /**
    * Mobile Device Bootloader version (Read-only)
    */
  var bootloaderVersion: js.UndefOr[String] = js.native
  /**
    * Mobile Device Brand (Read-only)
    */
  var brand: js.UndefOr[String] = js.native
  /**
    * Mobile Device Build number (Read-only)
    */
  var buildNumber: js.UndefOr[String] = js.native
  /**
    * The default locale used on the Mobile Device (Read-only)
    */
  var defaultLanguage: js.UndefOr[String] = js.native
  /**
    * Developer options enabled or disabled on device (Read-only)
    */
  var developerOptionsStatus: js.UndefOr[Boolean] = js.native
  /**
    * Mobile Device compromised status (Read-only)
    */
  var deviceCompromisedStatus: js.UndefOr[String] = js.native
  /**
    * Mobile Device serial number (Read-only)
    */
  var deviceId: js.UndefOr[String] = js.native
  /**
    * DevicePasswordStatus (Read-only)
    */
  var devicePasswordStatus: js.UndefOr[String] = js.native
  /**
    * List of owner user&#39;s email addresses (Read-only)
    */
  var email: js.UndefOr[js.Array[String]] = js.native
  /**
    * Mobile Device Encryption Status (Read-only)
    */
  var encryptionStatus: js.UndefOr[String] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Date and time the device was first synchronized with the policy settings
    * in the G Suite administrator control panel (Read-only)
    */
  var firstSync: js.UndefOr[String] = js.native
  /**
    * Mobile Device Hardware (Read-only)
    */
  var hardware: js.UndefOr[String] = js.native
  /**
    * Mobile Device Hardware Id (Read-only)
    */
  var hardwareId: js.UndefOr[String] = js.native
  /**
    * Mobile Device IMEI number (Read-only)
    */
  var imei: js.UndefOr[String] = js.native
  /**
    * Mobile Device Kernel version (Read-only)
    */
  var kernelVersion: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Date and time the device was last synchronized with the policy settings
    * in the G Suite administrator control panel (Read-only)
    */
  var lastSync: js.UndefOr[String] = js.native
  /**
    * Boolean indicating if this account is on owner/primary profile or not
    * (Read-only)
    */
  var managedAccountIsOnOwnerProfile: js.UndefOr[Boolean] = js.native
  /**
    * Mobile Device manufacturer (Read-only)
    */
  var manufacturer: js.UndefOr[String] = js.native
  /**
    * Mobile Device MEID number (Read-only)
    */
  var meid: js.UndefOr[String] = js.native
  /**
    * Name of the model of the device
    */
  var model: js.UndefOr[String] = js.native
  /**
    * List of owner user&#39;s names (Read-only)
    */
  var name: js.UndefOr[js.Array[String]] = js.native
  /**
    * Mobile Device mobile or network operator (if available) (Read-only)
    */
  var networkOperator: js.UndefOr[String] = js.native
  /**
    * Name of the mobile operating system
    */
  var os: js.UndefOr[String] = js.native
  /**
    * List of accounts added on device (Read-only)
    */
  var otherAccountsInfo: js.UndefOr[js.Array[String]] = js.native
  /**
    * DMAgentPermission (Read-only)
    */
  var privilege: js.UndefOr[String] = js.native
  /**
    * Mobile Device release version version (Read-only)
    */
  var releaseVersion: js.UndefOr[String] = js.native
  /**
    * Unique identifier of Mobile Device (Read-only)
    */
  var resourceId: js.UndefOr[String] = js.native
  /**
    * Mobile Device Security patch level (Read-only)
    */
  var securityPatchLevel: js.UndefOr[String] = js.native
  /**
    * Mobile Device SSN or Serial Number (Read-only)
    */
  var serialNumber: js.UndefOr[String] = js.native
  /**
    * Status of the device (Read-only)
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Work profile supported on device (Read-only)
    */
  var supportsWorkProfile: js.UndefOr[Boolean] = js.native
  /**
    * The type of device (Read-only)
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Unknown sources enabled or disabled on device (Read-only)
    */
  var unknownSourcesStatus: js.UndefOr[Boolean] = js.native
  /**
    * Mobile Device user agent
    */
  var userAgent: js.UndefOr[String] = js.native
  /**
    * Mobile Device WiFi MAC address (Read-only)
    */
  var wifiMacAddress: js.UndefOr[String] = js.native
}

object SchemaMobileDevice {
  @scala.inline
  def apply(): SchemaMobileDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMobileDevice]
  }
  @scala.inline
  implicit class SchemaMobileDeviceOps[Self <: SchemaMobileDevice] (val x: Self) extends AnyVal {
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
    def setAdbStatus(value: Boolean): Self = this.set("adbStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdbStatus: Self = this.set("adbStatus", js.undefined)
    @scala.inline
    def setApplicationsVarargs(value: DisplayName*): Self = this.set("applications", js.Array(value :_*))
    @scala.inline
    def setApplications(value: js.Array[DisplayName]): Self = this.set("applications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplications: Self = this.set("applications", js.undefined)
    @scala.inline
    def setBasebandVersion(value: String): Self = this.set("basebandVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasebandVersion: Self = this.set("basebandVersion", js.undefined)
    @scala.inline
    def setBootloaderVersion(value: String): Self = this.set("bootloaderVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBootloaderVersion: Self = this.set("bootloaderVersion", js.undefined)
    @scala.inline
    def setBrand(value: String): Self = this.set("brand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrand: Self = this.set("brand", js.undefined)
    @scala.inline
    def setBuildNumber(value: String): Self = this.set("buildNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuildNumber: Self = this.set("buildNumber", js.undefined)
    @scala.inline
    def setDefaultLanguage(value: String): Self = this.set("defaultLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultLanguage: Self = this.set("defaultLanguage", js.undefined)
    @scala.inline
    def setDeveloperOptionsStatus(value: Boolean): Self = this.set("developerOptionsStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeveloperOptionsStatus: Self = this.set("developerOptionsStatus", js.undefined)
    @scala.inline
    def setDeviceCompromisedStatus(value: String): Self = this.set("deviceCompromisedStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceCompromisedStatus: Self = this.set("deviceCompromisedStatus", js.undefined)
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
    @scala.inline
    def setDevicePasswordStatus(value: String): Self = this.set("devicePasswordStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevicePasswordStatus: Self = this.set("devicePasswordStatus", js.undefined)
    @scala.inline
    def setEmailVarargs(value: String*): Self = this.set("email", js.Array(value :_*))
    @scala.inline
    def setEmail(value: js.Array[String]): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setEncryptionStatus(value: String): Self = this.set("encryptionStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionStatus: Self = this.set("encryptionStatus", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setFirstSync(value: String): Self = this.set("firstSync", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstSync: Self = this.set("firstSync", js.undefined)
    @scala.inline
    def setHardware(value: String): Self = this.set("hardware", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHardware: Self = this.set("hardware", js.undefined)
    @scala.inline
    def setHardwareId(value: String): Self = this.set("hardwareId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHardwareId: Self = this.set("hardwareId", js.undefined)
    @scala.inline
    def setImei(value: String): Self = this.set("imei", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImei: Self = this.set("imei", js.undefined)
    @scala.inline
    def setKernelVersion(value: String): Self = this.set("kernelVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKernelVersion: Self = this.set("kernelVersion", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLastSync(value: String): Self = this.set("lastSync", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastSync: Self = this.set("lastSync", js.undefined)
    @scala.inline
    def setManagedAccountIsOnOwnerProfile(value: Boolean): Self = this.set("managedAccountIsOnOwnerProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedAccountIsOnOwnerProfile: Self = this.set("managedAccountIsOnOwnerProfile", js.undefined)
    @scala.inline
    def setManufacturer(value: String): Self = this.set("manufacturer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManufacturer: Self = this.set("manufacturer", js.undefined)
    @scala.inline
    def setMeid(value: String): Self = this.set("meid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeid: Self = this.set("meid", js.undefined)
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setNameVarargs(value: String*): Self = this.set("name", js.Array(value :_*))
    @scala.inline
    def setName(value: js.Array[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNetworkOperator(value: String): Self = this.set("networkOperator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkOperator: Self = this.set("networkOperator", js.undefined)
    @scala.inline
    def setOs(value: String): Self = this.set("os", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOs: Self = this.set("os", js.undefined)
    @scala.inline
    def setOtherAccountsInfoVarargs(value: String*): Self = this.set("otherAccountsInfo", js.Array(value :_*))
    @scala.inline
    def setOtherAccountsInfo(value: js.Array[String]): Self = this.set("otherAccountsInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOtherAccountsInfo: Self = this.set("otherAccountsInfo", js.undefined)
    @scala.inline
    def setPrivilege(value: String): Self = this.set("privilege", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivilege: Self = this.set("privilege", js.undefined)
    @scala.inline
    def setReleaseVersion(value: String): Self = this.set("releaseVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReleaseVersion: Self = this.set("releaseVersion", js.undefined)
    @scala.inline
    def setResourceId(value: String): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceId: Self = this.set("resourceId", js.undefined)
    @scala.inline
    def setSecurityPatchLevel(value: String): Self = this.set("securityPatchLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityPatchLevel: Self = this.set("securityPatchLevel", js.undefined)
    @scala.inline
    def setSerialNumber(value: String): Self = this.set("serialNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerialNumber: Self = this.set("serialNumber", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setSupportsWorkProfile(value: Boolean): Self = this.set("supportsWorkProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportsWorkProfile: Self = this.set("supportsWorkProfile", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUnknownSourcesStatus(value: Boolean): Self = this.set("unknownSourcesStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnknownSourcesStatus: Self = this.set("unknownSourcesStatus", js.undefined)
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserAgent: Self = this.set("userAgent", js.undefined)
    @scala.inline
    def setWifiMacAddress(value: String): Self = this.set("wifiMacAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWifiMacAddress: Self = this.set("wifiMacAddress", js.undefined)
  }
  
}

