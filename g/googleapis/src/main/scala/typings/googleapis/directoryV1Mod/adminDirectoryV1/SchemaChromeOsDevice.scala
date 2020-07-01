package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.googleapis.anon.ActiveTime
import typings.googleapis.anon.CpuTemperatureInfo
import typings.googleapis.anon.CreateTime
import typings.googleapis.anon.Email
import typings.googleapis.anon.Family
import typings.googleapis.anon.ReportTime
import typings.googleapis.anon.VolumeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Chrome Os Device resource in Directory API.
  */
@js.native
trait SchemaChromeOsDevice extends js.Object {
  /**
    * List of active time ranges (Read-only)
    */
  var activeTimeRanges: js.UndefOr[js.Array[ActiveTime]] = js.native
  /**
    * AssetId specified during enrollment or through later annotation
    */
  var annotatedAssetId: js.UndefOr[String] = js.native
  /**
    * Address or location of the device as noted by the administrator
    */
  var annotatedLocation: js.UndefOr[String] = js.native
  /**
    * User of the device
    */
  var annotatedUser: js.UndefOr[String] = js.native
  /**
    * Chromebook boot mode (Read-only)
    */
  var bootMode: js.UndefOr[String] = js.native
  /**
    * Reports of CPU utilization and temperature (Read-only)
    */
  var cpuStatusReports: js.UndefOr[js.Array[CpuTemperatureInfo]] = js.native
  /**
    * List of device files to download (Read-only)
    */
  var deviceFiles: js.UndefOr[js.Array[CreateTime]] = js.native
  /**
    * Unique identifier of Chrome OS Device (Read-only)
    */
  var deviceId: js.UndefOr[String] = js.native
  /**
    * Reports of disk space and other info about mounted/connected volumes.
    */
  var diskVolumeReports: js.UndefOr[js.Array[VolumeInfo]] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Chromebook Mac Address on ethernet network interface (Read-only)
    */
  var ethernetMacAddress: js.UndefOr[String] = js.native
  /**
    * Chromebook firmware version (Read-only)
    */
  var firmwareVersion: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Date and time the device was last enrolled (Read-only)
    */
  var lastEnrollmentTime: js.UndefOr[String] = js.native
  /**
    * Date and time the device was last synchronized with the policy settings
    * in the G Suite administrator control panel (Read-only)
    */
  var lastSync: js.UndefOr[String] = js.native
  /**
    * Chromebook Mac Address on wifi network interface (Read-only)
    */
  var macAddress: js.UndefOr[String] = js.native
  /**
    * Mobile Equipment identifier for the 3G mobile card in the Chromebook
    * (Read-only)
    */
  var meid: js.UndefOr[String] = js.native
  /**
    * Chromebook Model (Read-only)
    */
  var model: js.UndefOr[String] = js.native
  /**
    * Notes added by the administrator
    */
  var notes: js.UndefOr[String] = js.native
  /**
    * Chromebook order number (Read-only)
    */
  var orderNumber: js.UndefOr[String] = js.native
  /**
    * OrgUnit of the device
    */
  var orgUnitPath: js.UndefOr[String] = js.native
  /**
    * Chromebook Os Version (Read-only)
    */
  var osVersion: js.UndefOr[String] = js.native
  /**
    * Chromebook platform version (Read-only)
    */
  var platformVersion: js.UndefOr[String] = js.native
  /**
    * List of recent device users, in descending order by last login time
    * (Read-only)
    */
  var recentUsers: js.UndefOr[js.Array[Email]] = js.native
  /**
    * Chromebook serial number (Read-only)
    */
  var serialNumber: js.UndefOr[String] = js.native
  /**
    * status of the device (Read-only)
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Final date the device will be supported (Read-only)
    */
  var supportEndDate: js.UndefOr[String] = js.native
  /**
    * Reports of amounts of available RAM memory (Read-only)
    */
  var systemRamFreeReports: js.UndefOr[js.Array[ReportTime]] = js.native
  /**
    * Total RAM on the device [in bytes] (Read-only)
    */
  var systemRamTotal: js.UndefOr[String] = js.native
  /**
    * Trusted Platform Module (TPM) (Read-only)
    */
  var tpmVersionInfo: js.UndefOr[Family] = js.native
  /**
    * Will Chromebook auto renew after support end date (Read-only)
    */
  var willAutoRenew: js.UndefOr[Boolean] = js.native
}

object SchemaChromeOsDevice {
  @scala.inline
  def apply(
    activeTimeRanges: js.Array[ActiveTime] = null,
    annotatedAssetId: String = null,
    annotatedLocation: String = null,
    annotatedUser: String = null,
    bootMode: String = null,
    cpuStatusReports: js.Array[CpuTemperatureInfo] = null,
    deviceFiles: js.Array[CreateTime] = null,
    deviceId: String = null,
    diskVolumeReports: js.Array[VolumeInfo] = null,
    etag: String = null,
    ethernetMacAddress: String = null,
    firmwareVersion: String = null,
    kind: String = null,
    lastEnrollmentTime: String = null,
    lastSync: String = null,
    macAddress: String = null,
    meid: String = null,
    model: String = null,
    notes: String = null,
    orderNumber: String = null,
    orgUnitPath: String = null,
    osVersion: String = null,
    platformVersion: String = null,
    recentUsers: js.Array[Email] = null,
    serialNumber: String = null,
    status: String = null,
    supportEndDate: String = null,
    systemRamFreeReports: js.Array[ReportTime] = null,
    systemRamTotal: String = null,
    tpmVersionInfo: Family = null,
    willAutoRenew: js.UndefOr[Boolean] = js.undefined
  ): SchemaChromeOsDevice = {
    val __obj = js.Dynamic.literal()
    if (activeTimeRanges != null) __obj.updateDynamic("activeTimeRanges")(activeTimeRanges.asInstanceOf[js.Any])
    if (annotatedAssetId != null) __obj.updateDynamic("annotatedAssetId")(annotatedAssetId.asInstanceOf[js.Any])
    if (annotatedLocation != null) __obj.updateDynamic("annotatedLocation")(annotatedLocation.asInstanceOf[js.Any])
    if (annotatedUser != null) __obj.updateDynamic("annotatedUser")(annotatedUser.asInstanceOf[js.Any])
    if (bootMode != null) __obj.updateDynamic("bootMode")(bootMode.asInstanceOf[js.Any])
    if (cpuStatusReports != null) __obj.updateDynamic("cpuStatusReports")(cpuStatusReports.asInstanceOf[js.Any])
    if (deviceFiles != null) __obj.updateDynamic("deviceFiles")(deviceFiles.asInstanceOf[js.Any])
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (diskVolumeReports != null) __obj.updateDynamic("diskVolumeReports")(diskVolumeReports.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (ethernetMacAddress != null) __obj.updateDynamic("ethernetMacAddress")(ethernetMacAddress.asInstanceOf[js.Any])
    if (firmwareVersion != null) __obj.updateDynamic("firmwareVersion")(firmwareVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastEnrollmentTime != null) __obj.updateDynamic("lastEnrollmentTime")(lastEnrollmentTime.asInstanceOf[js.Any])
    if (lastSync != null) __obj.updateDynamic("lastSync")(lastSync.asInstanceOf[js.Any])
    if (macAddress != null) __obj.updateDynamic("macAddress")(macAddress.asInstanceOf[js.Any])
    if (meid != null) __obj.updateDynamic("meid")(meid.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (orderNumber != null) __obj.updateDynamic("orderNumber")(orderNumber.asInstanceOf[js.Any])
    if (orgUnitPath != null) __obj.updateDynamic("orgUnitPath")(orgUnitPath.asInstanceOf[js.Any])
    if (osVersion != null) __obj.updateDynamic("osVersion")(osVersion.asInstanceOf[js.Any])
    if (platformVersion != null) __obj.updateDynamic("platformVersion")(platformVersion.asInstanceOf[js.Any])
    if (recentUsers != null) __obj.updateDynamic("recentUsers")(recentUsers.asInstanceOf[js.Any])
    if (serialNumber != null) __obj.updateDynamic("serialNumber")(serialNumber.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (supportEndDate != null) __obj.updateDynamic("supportEndDate")(supportEndDate.asInstanceOf[js.Any])
    if (systemRamFreeReports != null) __obj.updateDynamic("systemRamFreeReports")(systemRamFreeReports.asInstanceOf[js.Any])
    if (systemRamTotal != null) __obj.updateDynamic("systemRamTotal")(systemRamTotal.asInstanceOf[js.Any])
    if (tpmVersionInfo != null) __obj.updateDynamic("tpmVersionInfo")(tpmVersionInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(willAutoRenew)) __obj.updateDynamic("willAutoRenew")(willAutoRenew.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaChromeOsDevice]
  }
}

