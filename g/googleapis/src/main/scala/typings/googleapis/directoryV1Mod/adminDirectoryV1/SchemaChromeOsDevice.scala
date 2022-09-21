package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.googleapis.anon.ActiveTime
import typings.googleapis.anon.Architecture
import typings.googleapis.anon.CpuTemperatureInfo
import typings.googleapis.anon.CreateTime
import typings.googleapis.anon.Email
import typings.googleapis.anon.Family
import typings.googleapis.anon.IpAddress
import typings.googleapis.anon.ReportTime
import typings.googleapis.anon.VolumeInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChromeOsDevice extends StObject {
  
  /**
    * List of active time ranges (Read-only).
    */
  var activeTimeRanges: js.UndefOr[js.Array[ActiveTime] | Null] = js.undefined
  
  /**
    * The asset identifier as noted by an administrator or specified during enrollment.
    */
  var annotatedAssetId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The address or location of the device as noted by the administrator. Maximum length is `200` characters. Empty values are allowed.
    */
  var annotatedLocation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user of the device as noted by the administrator. Maximum length is 100 characters. Empty values are allowed.
    */
  var annotatedUser: js.UndefOr[String | Null] = js.undefined
  
  /**
    * (Read-only) The timestamp after which the device will stop receiving Chrome updates or support
    */
  var autoUpdateExpiration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The boot mode for the device. The possible values are: * `Verified`: The device is running a valid version of the Chrome OS. * `Dev`: The devices's developer hardware switch is enabled. When booted, the device has a command line shell. For an example of a developer switch, see the [Chromebook developer information](https://www.chromium.org/chromium-os/developer-information-for-chrome-os-devices/samsung-series-5-chromebook#TOC-Developer-switch).
    */
  var bootMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Information regarding CPU specs in the device.
    */
  var cpuInfo: js.UndefOr[js.Array[Architecture] | Null] = js.undefined
  
  /**
    * Reports of CPU utilization and temperature (Read-only)
    */
  var cpuStatusReports: js.UndefOr[js.Array[CpuTemperatureInfo] | Null] = js.undefined
  
  /**
    * List of device files to download (Read-only)
    */
  var deviceFiles: js.UndefOr[js.Array[CreateTime] | Null] = js.undefined
  
  /**
    * The unique ID of the Chrome device.
    */
  var deviceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Reports of disk space and other info about mounted/connected volumes.
    */
  var diskVolumeReports: js.UndefOr[js.Array[VolumeInfo] | Null] = js.undefined
  
  /**
    * (Read-only) Built-in MAC address for the docking station that the device connected to. Factory sets Media access control address (MAC address) assigned for use by a dock. It is reserved specifically for MAC pass through device policy. The format is twelve (12) hexadecimal digits without any delimiter (uppercase letters). This is only relevant for some devices.
    */
  var dockMacAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The device's MAC address on the ethernet network interface.
    */
  var ethernetMacAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * (Read-only) MAC address used by the Chromebook’s internal ethernet port, and for onboard network (ethernet) interface. The format is twelve (12) hexadecimal digits without any delimiter (uppercase letters). This is only relevant for some devices.
    */
  var ethernetMacAddress0: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Chrome device's firmware version.
    */
  var firmwareVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Date and time for the first time the device was enrolled.
    */
  var firstEnrollmentTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of resource. For the Chromeosdevices resource, the value is `admin#directory#chromeosdevice`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Date and time the device was last enrolled (Read-only)
    */
  var lastEnrollmentTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Contains last known network (Read-only)
    */
  var lastKnownNetwork: js.UndefOr[js.Array[IpAddress] | Null] = js.undefined
  
  /**
    * Date and time the device was last synchronized with the policy settings in the G Suite administrator control panel (Read-only)
    */
  var lastSync: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The device's wireless MAC address. If the device does not have this information, it is not included in the response.
    */
  var macAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * (Read-only) The date the device was manufactured in yyyy-mm-dd format.
    */
  var manufactureDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Mobile Equipment Identifier (MEID) or the International Mobile Equipment Identity (IMEI) for the 3G mobile card in a mobile device. A MEID/IMEI is typically used when adding a device to a wireless carrier's post-pay service plan. If the device does not have this information, this property is not included in the response. For more information on how to export a MEID/IMEI list, see the [Developer's Guide](/admin-sdk/directory/v1/guides/manage-chrome-devices.html#export_meid).
    */
  var meid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The device's model information. If the device does not have this information, this property is not included in the response.
    */
  var model: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Notes about this device added by the administrator. This property can be [searched](https://support.google.com/chrome/a/answer/1698333) with the [list](/admin-sdk/directory/v1/reference/chromeosdevices/list) method's `query` parameter. Maximum length is 500 characters. Empty values are allowed.
    */
  var notes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The device's order number. Only devices directly purchased from Google have an order number.
    */
  var orderNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique ID of the organizational unit. orgUnitPath is the human readable version of orgUnitId. While orgUnitPath may change by renaming an organizational unit within the path, orgUnitId is unchangeable for one organizational unit. This property can be [updated](/admin-sdk/directory/v1/guides/manage-chrome-devices#move_chrome_devices_to_ou) using the API. For more information about how to create an organizational structure for your device, see the [administration help center](https://support.google.com/a/answer/182433).
    */
  var orgUnitId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The full parent path with the organizational unit's name associated with the device. Path names are case insensitive. If the parent organizational unit is the top-level organization, it is represented as a forward slash, `/`. This property can be [updated](/admin-sdk/directory/v1/guides/manage-chrome-devices#move_chrome_devices_to_ou) using the API. For more information about how to create an organizational structure for your device, see the [administration help center](https://support.google.com/a/answer/182433).
    */
  var orgUnitPath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The status of the OS updates for the device.
    */
  var osUpdateStatus: js.UndefOr[SchemaOsUpdateStatus] = js.undefined
  
  /**
    * The Chrome device's operating system version.
    */
  var osVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Chrome device's platform version.
    */
  var platformVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of recent device users, in descending order, by last login time.
    */
  var recentUsers: js.UndefOr[js.Array[Email] | Null] = js.undefined
  
  /**
    * List of screenshot files to download. Type is always "SCREENSHOT_FILE". (Read-only)
    */
  var screenshotFiles: js.UndefOr[js.Array[CreateTime] | Null] = js.undefined
  
  /**
    * The Chrome device serial number entered when the device was enabled. This value is the same as the Admin console's *Serial Number* in the *Chrome OS Devices* tab.
    */
  var serialNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The status of the device.
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Final date the device will be supported (Read-only)
    */
  var supportEndDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Reports of amounts of available RAM memory (Read-only)
    */
  var systemRamFreeReports: js.UndefOr[js.Array[ReportTime] | Null] = js.undefined
  
  /**
    * Total RAM on the device [in bytes] (Read-only)
    */
  var systemRamTotal: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Trusted Platform Module (TPM) (Read-only)
    */
  var tpmVersionInfo: js.UndefOr[Family | Null] = js.undefined
  
  /**
    * Determines if the device will auto renew its support after the support end date. This is a read-only property.
    */
  var willAutoRenew: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaChromeOsDevice {
  
  inline def apply(): SchemaChromeOsDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChromeOsDevice]
  }
  
  extension [Self <: SchemaChromeOsDevice](x: Self) {
    
    inline def setActiveTimeRanges(value: js.Array[ActiveTime]): Self = StObject.set(x, "activeTimeRanges", value.asInstanceOf[js.Any])
    
    inline def setActiveTimeRangesNull: Self = StObject.set(x, "activeTimeRanges", null)
    
    inline def setActiveTimeRangesUndefined: Self = StObject.set(x, "activeTimeRanges", js.undefined)
    
    inline def setActiveTimeRangesVarargs(value: ActiveTime*): Self = StObject.set(x, "activeTimeRanges", js.Array(value*))
    
    inline def setAnnotatedAssetId(value: String): Self = StObject.set(x, "annotatedAssetId", value.asInstanceOf[js.Any])
    
    inline def setAnnotatedAssetIdNull: Self = StObject.set(x, "annotatedAssetId", null)
    
    inline def setAnnotatedAssetIdUndefined: Self = StObject.set(x, "annotatedAssetId", js.undefined)
    
    inline def setAnnotatedLocation(value: String): Self = StObject.set(x, "annotatedLocation", value.asInstanceOf[js.Any])
    
    inline def setAnnotatedLocationNull: Self = StObject.set(x, "annotatedLocation", null)
    
    inline def setAnnotatedLocationUndefined: Self = StObject.set(x, "annotatedLocation", js.undefined)
    
    inline def setAnnotatedUser(value: String): Self = StObject.set(x, "annotatedUser", value.asInstanceOf[js.Any])
    
    inline def setAnnotatedUserNull: Self = StObject.set(x, "annotatedUser", null)
    
    inline def setAnnotatedUserUndefined: Self = StObject.set(x, "annotatedUser", js.undefined)
    
    inline def setAutoUpdateExpiration(value: String): Self = StObject.set(x, "autoUpdateExpiration", value.asInstanceOf[js.Any])
    
    inline def setAutoUpdateExpirationNull: Self = StObject.set(x, "autoUpdateExpiration", null)
    
    inline def setAutoUpdateExpirationUndefined: Self = StObject.set(x, "autoUpdateExpiration", js.undefined)
    
    inline def setBootMode(value: String): Self = StObject.set(x, "bootMode", value.asInstanceOf[js.Any])
    
    inline def setBootModeNull: Self = StObject.set(x, "bootMode", null)
    
    inline def setBootModeUndefined: Self = StObject.set(x, "bootMode", js.undefined)
    
    inline def setCpuInfo(value: js.Array[Architecture]): Self = StObject.set(x, "cpuInfo", value.asInstanceOf[js.Any])
    
    inline def setCpuInfoNull: Self = StObject.set(x, "cpuInfo", null)
    
    inline def setCpuInfoUndefined: Self = StObject.set(x, "cpuInfo", js.undefined)
    
    inline def setCpuInfoVarargs(value: Architecture*): Self = StObject.set(x, "cpuInfo", js.Array(value*))
    
    inline def setCpuStatusReports(value: js.Array[CpuTemperatureInfo]): Self = StObject.set(x, "cpuStatusReports", value.asInstanceOf[js.Any])
    
    inline def setCpuStatusReportsNull: Self = StObject.set(x, "cpuStatusReports", null)
    
    inline def setCpuStatusReportsUndefined: Self = StObject.set(x, "cpuStatusReports", js.undefined)
    
    inline def setCpuStatusReportsVarargs(value: CpuTemperatureInfo*): Self = StObject.set(x, "cpuStatusReports", js.Array(value*))
    
    inline def setDeviceFiles(value: js.Array[CreateTime]): Self = StObject.set(x, "deviceFiles", value.asInstanceOf[js.Any])
    
    inline def setDeviceFilesNull: Self = StObject.set(x, "deviceFiles", null)
    
    inline def setDeviceFilesUndefined: Self = StObject.set(x, "deviceFiles", js.undefined)
    
    inline def setDeviceFilesVarargs(value: CreateTime*): Self = StObject.set(x, "deviceFiles", js.Array(value*))
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdNull: Self = StObject.set(x, "deviceId", null)
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setDiskVolumeReports(value: js.Array[VolumeInfo]): Self = StObject.set(x, "diskVolumeReports", value.asInstanceOf[js.Any])
    
    inline def setDiskVolumeReportsNull: Self = StObject.set(x, "diskVolumeReports", null)
    
    inline def setDiskVolumeReportsUndefined: Self = StObject.set(x, "diskVolumeReports", js.undefined)
    
    inline def setDiskVolumeReportsVarargs(value: VolumeInfo*): Self = StObject.set(x, "diskVolumeReports", js.Array(value*))
    
    inline def setDockMacAddress(value: String): Self = StObject.set(x, "dockMacAddress", value.asInstanceOf[js.Any])
    
    inline def setDockMacAddressNull: Self = StObject.set(x, "dockMacAddress", null)
    
    inline def setDockMacAddressUndefined: Self = StObject.set(x, "dockMacAddress", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setEthernetMacAddress(value: String): Self = StObject.set(x, "ethernetMacAddress", value.asInstanceOf[js.Any])
    
    inline def setEthernetMacAddress0(value: String): Self = StObject.set(x, "ethernetMacAddress0", value.asInstanceOf[js.Any])
    
    inline def setEthernetMacAddress0Null: Self = StObject.set(x, "ethernetMacAddress0", null)
    
    inline def setEthernetMacAddress0Undefined: Self = StObject.set(x, "ethernetMacAddress0", js.undefined)
    
    inline def setEthernetMacAddressNull: Self = StObject.set(x, "ethernetMacAddress", null)
    
    inline def setEthernetMacAddressUndefined: Self = StObject.set(x, "ethernetMacAddress", js.undefined)
    
    inline def setFirmwareVersion(value: String): Self = StObject.set(x, "firmwareVersion", value.asInstanceOf[js.Any])
    
    inline def setFirmwareVersionNull: Self = StObject.set(x, "firmwareVersion", null)
    
    inline def setFirmwareVersionUndefined: Self = StObject.set(x, "firmwareVersion", js.undefined)
    
    inline def setFirstEnrollmentTime(value: String): Self = StObject.set(x, "firstEnrollmentTime", value.asInstanceOf[js.Any])
    
    inline def setFirstEnrollmentTimeNull: Self = StObject.set(x, "firstEnrollmentTime", null)
    
    inline def setFirstEnrollmentTimeUndefined: Self = StObject.set(x, "firstEnrollmentTime", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLastEnrollmentTime(value: String): Self = StObject.set(x, "lastEnrollmentTime", value.asInstanceOf[js.Any])
    
    inline def setLastEnrollmentTimeNull: Self = StObject.set(x, "lastEnrollmentTime", null)
    
    inline def setLastEnrollmentTimeUndefined: Self = StObject.set(x, "lastEnrollmentTime", js.undefined)
    
    inline def setLastKnownNetwork(value: js.Array[IpAddress]): Self = StObject.set(x, "lastKnownNetwork", value.asInstanceOf[js.Any])
    
    inline def setLastKnownNetworkNull: Self = StObject.set(x, "lastKnownNetwork", null)
    
    inline def setLastKnownNetworkUndefined: Self = StObject.set(x, "lastKnownNetwork", js.undefined)
    
    inline def setLastKnownNetworkVarargs(value: IpAddress*): Self = StObject.set(x, "lastKnownNetwork", js.Array(value*))
    
    inline def setLastSync(value: String): Self = StObject.set(x, "lastSync", value.asInstanceOf[js.Any])
    
    inline def setLastSyncNull: Self = StObject.set(x, "lastSync", null)
    
    inline def setLastSyncUndefined: Self = StObject.set(x, "lastSync", js.undefined)
    
    inline def setMacAddress(value: String): Self = StObject.set(x, "macAddress", value.asInstanceOf[js.Any])
    
    inline def setMacAddressNull: Self = StObject.set(x, "macAddress", null)
    
    inline def setMacAddressUndefined: Self = StObject.set(x, "macAddress", js.undefined)
    
    inline def setManufactureDate(value: String): Self = StObject.set(x, "manufactureDate", value.asInstanceOf[js.Any])
    
    inline def setManufactureDateNull: Self = StObject.set(x, "manufactureDate", null)
    
    inline def setManufactureDateUndefined: Self = StObject.set(x, "manufactureDate", js.undefined)
    
    inline def setMeid(value: String): Self = StObject.set(x, "meid", value.asInstanceOf[js.Any])
    
    inline def setMeidNull: Self = StObject.set(x, "meid", null)
    
    inline def setMeidUndefined: Self = StObject.set(x, "meid", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelNull: Self = StObject.set(x, "model", null)
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesNull: Self = StObject.set(x, "notes", null)
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setOrderNumber(value: String): Self = StObject.set(x, "orderNumber", value.asInstanceOf[js.Any])
    
    inline def setOrderNumberNull: Self = StObject.set(x, "orderNumber", null)
    
    inline def setOrderNumberUndefined: Self = StObject.set(x, "orderNumber", js.undefined)
    
    inline def setOrgUnitId(value: String): Self = StObject.set(x, "orgUnitId", value.asInstanceOf[js.Any])
    
    inline def setOrgUnitIdNull: Self = StObject.set(x, "orgUnitId", null)
    
    inline def setOrgUnitIdUndefined: Self = StObject.set(x, "orgUnitId", js.undefined)
    
    inline def setOrgUnitPath(value: String): Self = StObject.set(x, "orgUnitPath", value.asInstanceOf[js.Any])
    
    inline def setOrgUnitPathNull: Self = StObject.set(x, "orgUnitPath", null)
    
    inline def setOrgUnitPathUndefined: Self = StObject.set(x, "orgUnitPath", js.undefined)
    
    inline def setOsUpdateStatus(value: SchemaOsUpdateStatus): Self = StObject.set(x, "osUpdateStatus", value.asInstanceOf[js.Any])
    
    inline def setOsUpdateStatusUndefined: Self = StObject.set(x, "osUpdateStatus", js.undefined)
    
    inline def setOsVersion(value: String): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
    
    inline def setOsVersionNull: Self = StObject.set(x, "osVersion", null)
    
    inline def setOsVersionUndefined: Self = StObject.set(x, "osVersion", js.undefined)
    
    inline def setPlatformVersion(value: String): Self = StObject.set(x, "platformVersion", value.asInstanceOf[js.Any])
    
    inline def setPlatformVersionNull: Self = StObject.set(x, "platformVersion", null)
    
    inline def setPlatformVersionUndefined: Self = StObject.set(x, "platformVersion", js.undefined)
    
    inline def setRecentUsers(value: js.Array[Email]): Self = StObject.set(x, "recentUsers", value.asInstanceOf[js.Any])
    
    inline def setRecentUsersNull: Self = StObject.set(x, "recentUsers", null)
    
    inline def setRecentUsersUndefined: Self = StObject.set(x, "recentUsers", js.undefined)
    
    inline def setRecentUsersVarargs(value: Email*): Self = StObject.set(x, "recentUsers", js.Array(value*))
    
    inline def setScreenshotFiles(value: js.Array[CreateTime]): Self = StObject.set(x, "screenshotFiles", value.asInstanceOf[js.Any])
    
    inline def setScreenshotFilesNull: Self = StObject.set(x, "screenshotFiles", null)
    
    inline def setScreenshotFilesUndefined: Self = StObject.set(x, "screenshotFiles", js.undefined)
    
    inline def setScreenshotFilesVarargs(value: CreateTime*): Self = StObject.set(x, "screenshotFiles", js.Array(value*))
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberNull: Self = StObject.set(x, "serialNumber", null)
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSupportEndDate(value: String): Self = StObject.set(x, "supportEndDate", value.asInstanceOf[js.Any])
    
    inline def setSupportEndDateNull: Self = StObject.set(x, "supportEndDate", null)
    
    inline def setSupportEndDateUndefined: Self = StObject.set(x, "supportEndDate", js.undefined)
    
    inline def setSystemRamFreeReports(value: js.Array[ReportTime]): Self = StObject.set(x, "systemRamFreeReports", value.asInstanceOf[js.Any])
    
    inline def setSystemRamFreeReportsNull: Self = StObject.set(x, "systemRamFreeReports", null)
    
    inline def setSystemRamFreeReportsUndefined: Self = StObject.set(x, "systemRamFreeReports", js.undefined)
    
    inline def setSystemRamFreeReportsVarargs(value: ReportTime*): Self = StObject.set(x, "systemRamFreeReports", js.Array(value*))
    
    inline def setSystemRamTotal(value: String): Self = StObject.set(x, "systemRamTotal", value.asInstanceOf[js.Any])
    
    inline def setSystemRamTotalNull: Self = StObject.set(x, "systemRamTotal", null)
    
    inline def setSystemRamTotalUndefined: Self = StObject.set(x, "systemRamTotal", js.undefined)
    
    inline def setTpmVersionInfo(value: Family): Self = StObject.set(x, "tpmVersionInfo", value.asInstanceOf[js.Any])
    
    inline def setTpmVersionInfoNull: Self = StObject.set(x, "tpmVersionInfo", null)
    
    inline def setTpmVersionInfoUndefined: Self = StObject.set(x, "tpmVersionInfo", js.undefined)
    
    inline def setWillAutoRenew(value: Boolean): Self = StObject.set(x, "willAutoRenew", value.asInstanceOf[js.Any])
    
    inline def setWillAutoRenewNull: Self = StObject.set(x, "willAutoRenew", null)
    
    inline def setWillAutoRenewUndefined: Self = StObject.set(x, "willAutoRenew", js.undefined)
  }
}
