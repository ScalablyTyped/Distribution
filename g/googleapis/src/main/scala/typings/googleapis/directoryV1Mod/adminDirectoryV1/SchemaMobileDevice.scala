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
  def apply(
    adbStatus: js.UndefOr[Boolean] = js.undefined,
    applications: js.Array[DisplayName] = null,
    basebandVersion: String = null,
    bootloaderVersion: String = null,
    brand: String = null,
    buildNumber: String = null,
    defaultLanguage: String = null,
    developerOptionsStatus: js.UndefOr[Boolean] = js.undefined,
    deviceCompromisedStatus: String = null,
    deviceId: String = null,
    devicePasswordStatus: String = null,
    email: js.Array[String] = null,
    encryptionStatus: String = null,
    etag: String = null,
    firstSync: String = null,
    hardware: String = null,
    hardwareId: String = null,
    imei: String = null,
    kernelVersion: String = null,
    kind: String = null,
    lastSync: String = null,
    managedAccountIsOnOwnerProfile: js.UndefOr[Boolean] = js.undefined,
    manufacturer: String = null,
    meid: String = null,
    model: String = null,
    name: js.Array[String] = null,
    networkOperator: String = null,
    os: String = null,
    otherAccountsInfo: js.Array[String] = null,
    privilege: String = null,
    releaseVersion: String = null,
    resourceId: String = null,
    securityPatchLevel: String = null,
    serialNumber: String = null,
    status: String = null,
    supportsWorkProfile: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    unknownSourcesStatus: js.UndefOr[Boolean] = js.undefined,
    userAgent: String = null,
    wifiMacAddress: String = null
  ): SchemaMobileDevice = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adbStatus)) __obj.updateDynamic("adbStatus")(adbStatus.get.asInstanceOf[js.Any])
    if (applications != null) __obj.updateDynamic("applications")(applications.asInstanceOf[js.Any])
    if (basebandVersion != null) __obj.updateDynamic("basebandVersion")(basebandVersion.asInstanceOf[js.Any])
    if (bootloaderVersion != null) __obj.updateDynamic("bootloaderVersion")(bootloaderVersion.asInstanceOf[js.Any])
    if (brand != null) __obj.updateDynamic("brand")(brand.asInstanceOf[js.Any])
    if (buildNumber != null) __obj.updateDynamic("buildNumber")(buildNumber.asInstanceOf[js.Any])
    if (defaultLanguage != null) __obj.updateDynamic("defaultLanguage")(defaultLanguage.asInstanceOf[js.Any])
    if (!js.isUndefined(developerOptionsStatus)) __obj.updateDynamic("developerOptionsStatus")(developerOptionsStatus.get.asInstanceOf[js.Any])
    if (deviceCompromisedStatus != null) __obj.updateDynamic("deviceCompromisedStatus")(deviceCompromisedStatus.asInstanceOf[js.Any])
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (devicePasswordStatus != null) __obj.updateDynamic("devicePasswordStatus")(devicePasswordStatus.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (encryptionStatus != null) __obj.updateDynamic("encryptionStatus")(encryptionStatus.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (firstSync != null) __obj.updateDynamic("firstSync")(firstSync.asInstanceOf[js.Any])
    if (hardware != null) __obj.updateDynamic("hardware")(hardware.asInstanceOf[js.Any])
    if (hardwareId != null) __obj.updateDynamic("hardwareId")(hardwareId.asInstanceOf[js.Any])
    if (imei != null) __obj.updateDynamic("imei")(imei.asInstanceOf[js.Any])
    if (kernelVersion != null) __obj.updateDynamic("kernelVersion")(kernelVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastSync != null) __obj.updateDynamic("lastSync")(lastSync.asInstanceOf[js.Any])
    if (!js.isUndefined(managedAccountIsOnOwnerProfile)) __obj.updateDynamic("managedAccountIsOnOwnerProfile")(managedAccountIsOnOwnerProfile.get.asInstanceOf[js.Any])
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer.asInstanceOf[js.Any])
    if (meid != null) __obj.updateDynamic("meid")(meid.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (networkOperator != null) __obj.updateDynamic("networkOperator")(networkOperator.asInstanceOf[js.Any])
    if (os != null) __obj.updateDynamic("os")(os.asInstanceOf[js.Any])
    if (otherAccountsInfo != null) __obj.updateDynamic("otherAccountsInfo")(otherAccountsInfo.asInstanceOf[js.Any])
    if (privilege != null) __obj.updateDynamic("privilege")(privilege.asInstanceOf[js.Any])
    if (releaseVersion != null) __obj.updateDynamic("releaseVersion")(releaseVersion.asInstanceOf[js.Any])
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    if (securityPatchLevel != null) __obj.updateDynamic("securityPatchLevel")(securityPatchLevel.asInstanceOf[js.Any])
    if (serialNumber != null) __obj.updateDynamic("serialNumber")(serialNumber.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsWorkProfile)) __obj.updateDynamic("supportsWorkProfile")(supportsWorkProfile.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(unknownSourcesStatus)) __obj.updateDynamic("unknownSourcesStatus")(unknownSourcesStatus.get.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    if (wifiMacAddress != null) __obj.updateDynamic("wifiMacAddress")(wifiMacAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMobileDevice]
  }
}

