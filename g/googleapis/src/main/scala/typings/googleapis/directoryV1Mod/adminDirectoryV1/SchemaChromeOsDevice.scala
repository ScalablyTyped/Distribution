package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.googleapis.anon.ActiveTime
import typings.googleapis.anon.CpuTemperatureInfo
import typings.googleapis.anon.CreateTime
import typings.googleapis.anon.Email
import typings.googleapis.anon.Family
import typings.googleapis.anon.ReportTime
import typings.googleapis.anon.VolumeInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for Chrome Os Device resource in Directory API.
  */
trait SchemaChromeOsDevice extends StObject {
  
  /**
    * List of active time ranges (Read-only)
    */
  var activeTimeRanges: js.UndefOr[js.Array[ActiveTime]] = js.undefined
  
  /**
    * AssetId specified during enrollment or through later annotation
    */
  var annotatedAssetId: js.UndefOr[String] = js.undefined
  
  /**
    * Address or location of the device as noted by the administrator
    */
  var annotatedLocation: js.UndefOr[String] = js.undefined
  
  /**
    * User of the device
    */
  var annotatedUser: js.UndefOr[String] = js.undefined
  
  /**
    * Chromebook boot mode (Read-only)
    */
  var bootMode: js.UndefOr[String] = js.undefined
  
  /**
    * Reports of CPU utilization and temperature (Read-only)
    */
  var cpuStatusReports: js.UndefOr[js.Array[CpuTemperatureInfo]] = js.undefined
  
  /**
    * List of device files to download (Read-only)
    */
  var deviceFiles: js.UndefOr[js.Array[CreateTime]] = js.undefined
  
  /**
    * Unique identifier of Chrome OS Device (Read-only)
    */
  var deviceId: js.UndefOr[String] = js.undefined
  
  /**
    * Reports of disk space and other info about mounted/connected volumes.
    */
  var diskVolumeReports: js.UndefOr[js.Array[VolumeInfo]] = js.undefined
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Chromebook Mac Address on ethernet network interface (Read-only)
    */
  var ethernetMacAddress: js.UndefOr[String] = js.undefined
  
  /**
    * Chromebook firmware version (Read-only)
    */
  var firmwareVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Date and time the device was last enrolled (Read-only)
    */
  var lastEnrollmentTime: js.UndefOr[String] = js.undefined
  
  /**
    * Date and time the device was last synchronized with the policy settings
    * in the G Suite administrator control panel (Read-only)
    */
  var lastSync: js.UndefOr[String] = js.undefined
  
  /**
    * Chromebook Mac Address on wifi network interface (Read-only)
    */
  var macAddress: js.UndefOr[String] = js.undefined
  
  /**
    * Mobile Equipment identifier for the 3G mobile card in the Chromebook
    * (Read-only)
    */
  var meid: js.UndefOr[String] = js.undefined
  
  /**
    * Chromebook Model (Read-only)
    */
  var model: js.UndefOr[String] = js.undefined
  
  /**
    * Notes added by the administrator
    */
  var notes: js.UndefOr[String] = js.undefined
  
  /**
    * Chromebook order number (Read-only)
    */
  var orderNumber: js.UndefOr[String] = js.undefined
  
  /**
    * OrgUnit of the device
    */
  var orgUnitPath: js.UndefOr[String] = js.undefined
  
  /**
    * Chromebook Os Version (Read-only)
    */
  var osVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Chromebook platform version (Read-only)
    */
  var platformVersion: js.UndefOr[String] = js.undefined
  
  /**
    * List of recent device users, in descending order by last login time
    * (Read-only)
    */
  var recentUsers: js.UndefOr[js.Array[Email]] = js.undefined
  
  /**
    * Chromebook serial number (Read-only)
    */
  var serialNumber: js.UndefOr[String] = js.undefined
  
  /**
    * status of the device (Read-only)
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * Final date the device will be supported (Read-only)
    */
  var supportEndDate: js.UndefOr[String] = js.undefined
  
  /**
    * Reports of amounts of available RAM memory (Read-only)
    */
  var systemRamFreeReports: js.UndefOr[js.Array[ReportTime]] = js.undefined
  
  /**
    * Total RAM on the device [in bytes] (Read-only)
    */
  var systemRamTotal: js.UndefOr[String] = js.undefined
  
  /**
    * Trusted Platform Module (TPM) (Read-only)
    */
  var tpmVersionInfo: js.UndefOr[Family] = js.undefined
  
  /**
    * Will Chromebook auto renew after support end date (Read-only)
    */
  var willAutoRenew: js.UndefOr[Boolean] = js.undefined
}
object SchemaChromeOsDevice {
  
  @scala.inline
  def apply(): SchemaChromeOsDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChromeOsDevice]
  }
  
  @scala.inline
  implicit class SchemaChromeOsDeviceMutableBuilder[Self <: SchemaChromeOsDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveTimeRanges(value: js.Array[ActiveTime]): Self = StObject.set(x, "activeTimeRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveTimeRangesUndefined: Self = StObject.set(x, "activeTimeRanges", js.undefined)
    
    @scala.inline
    def setActiveTimeRangesVarargs(value: ActiveTime*): Self = StObject.set(x, "activeTimeRanges", js.Array(value :_*))
    
    @scala.inline
    def setAnnotatedAssetId(value: String): Self = StObject.set(x, "annotatedAssetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotatedAssetIdUndefined: Self = StObject.set(x, "annotatedAssetId", js.undefined)
    
    @scala.inline
    def setAnnotatedLocation(value: String): Self = StObject.set(x, "annotatedLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotatedLocationUndefined: Self = StObject.set(x, "annotatedLocation", js.undefined)
    
    @scala.inline
    def setAnnotatedUser(value: String): Self = StObject.set(x, "annotatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotatedUserUndefined: Self = StObject.set(x, "annotatedUser", js.undefined)
    
    @scala.inline
    def setBootMode(value: String): Self = StObject.set(x, "bootMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootModeUndefined: Self = StObject.set(x, "bootMode", js.undefined)
    
    @scala.inline
    def setCpuStatusReports(value: js.Array[CpuTemperatureInfo]): Self = StObject.set(x, "cpuStatusReports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuStatusReportsUndefined: Self = StObject.set(x, "cpuStatusReports", js.undefined)
    
    @scala.inline
    def setCpuStatusReportsVarargs(value: CpuTemperatureInfo*): Self = StObject.set(x, "cpuStatusReports", js.Array(value :_*))
    
    @scala.inline
    def setDeviceFiles(value: js.Array[CreateTime]): Self = StObject.set(x, "deviceFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceFilesUndefined: Self = StObject.set(x, "deviceFiles", js.undefined)
    
    @scala.inline
    def setDeviceFilesVarargs(value: CreateTime*): Self = StObject.set(x, "deviceFiles", js.Array(value :_*))
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    @scala.inline
    def setDiskVolumeReports(value: js.Array[VolumeInfo]): Self = StObject.set(x, "diskVolumeReports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskVolumeReportsUndefined: Self = StObject.set(x, "diskVolumeReports", js.undefined)
    
    @scala.inline
    def setDiskVolumeReportsVarargs(value: VolumeInfo*): Self = StObject.set(x, "diskVolumeReports", js.Array(value :_*))
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setEthernetMacAddress(value: String): Self = StObject.set(x, "ethernetMacAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEthernetMacAddressUndefined: Self = StObject.set(x, "ethernetMacAddress", js.undefined)
    
    @scala.inline
    def setFirmwareVersion(value: String): Self = StObject.set(x, "firmwareVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirmwareVersionUndefined: Self = StObject.set(x, "firmwareVersion", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLastEnrollmentTime(value: String): Self = StObject.set(x, "lastEnrollmentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastEnrollmentTimeUndefined: Self = StObject.set(x, "lastEnrollmentTime", js.undefined)
    
    @scala.inline
    def setLastSync(value: String): Self = StObject.set(x, "lastSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSyncUndefined: Self = StObject.set(x, "lastSync", js.undefined)
    
    @scala.inline
    def setMacAddress(value: String): Self = StObject.set(x, "macAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacAddressUndefined: Self = StObject.set(x, "macAddress", js.undefined)
    
    @scala.inline
    def setMeid(value: String): Self = StObject.set(x, "meid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeidUndefined: Self = StObject.set(x, "meid", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setOrderNumber(value: String): Self = StObject.set(x, "orderNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderNumberUndefined: Self = StObject.set(x, "orderNumber", js.undefined)
    
    @scala.inline
    def setOrgUnitPath(value: String): Self = StObject.set(x, "orgUnitPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrgUnitPathUndefined: Self = StObject.set(x, "orgUnitPath", js.undefined)
    
    @scala.inline
    def setOsVersion(value: String): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsVersionUndefined: Self = StObject.set(x, "osVersion", js.undefined)
    
    @scala.inline
    def setPlatformVersion(value: String): Self = StObject.set(x, "platformVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformVersionUndefined: Self = StObject.set(x, "platformVersion", js.undefined)
    
    @scala.inline
    def setRecentUsers(value: js.Array[Email]): Self = StObject.set(x, "recentUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecentUsersUndefined: Self = StObject.set(x, "recentUsers", js.undefined)
    
    @scala.inline
    def setRecentUsersVarargs(value: Email*): Self = StObject.set(x, "recentUsers", js.Array(value :_*))
    
    @scala.inline
    def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSupportEndDate(value: String): Self = StObject.set(x, "supportEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportEndDateUndefined: Self = StObject.set(x, "supportEndDate", js.undefined)
    
    @scala.inline
    def setSystemRamFreeReports(value: js.Array[ReportTime]): Self = StObject.set(x, "systemRamFreeReports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemRamFreeReportsUndefined: Self = StObject.set(x, "systemRamFreeReports", js.undefined)
    
    @scala.inline
    def setSystemRamFreeReportsVarargs(value: ReportTime*): Self = StObject.set(x, "systemRamFreeReports", js.Array(value :_*))
    
    @scala.inline
    def setSystemRamTotal(value: String): Self = StObject.set(x, "systemRamTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemRamTotalUndefined: Self = StObject.set(x, "systemRamTotal", js.undefined)
    
    @scala.inline
    def setTpmVersionInfo(value: Family): Self = StObject.set(x, "tpmVersionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTpmVersionInfoUndefined: Self = StObject.set(x, "tpmVersionInfo", js.undefined)
    
    @scala.inline
    def setWillAutoRenew(value: Boolean): Self = StObject.set(x, "willAutoRenew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWillAutoRenewUndefined: Self = StObject.set(x, "willAutoRenew", js.undefined)
  }
}
