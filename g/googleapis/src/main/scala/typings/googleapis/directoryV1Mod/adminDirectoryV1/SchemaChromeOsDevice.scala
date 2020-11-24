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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaChromeOsDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChromeOsDevice]
  }
  
  @scala.inline
  implicit class SchemaChromeOsDeviceOps[Self <: SchemaChromeOsDevice] (val x: Self) extends AnyVal {
    
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
    def setActiveTimeRangesVarargs(value: ActiveTime*): Self = this.set("activeTimeRanges", js.Array(value :_*))
    
    @scala.inline
    def setActiveTimeRanges(value: js.Array[ActiveTime]): Self = this.set("activeTimeRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveTimeRanges: Self = this.set("activeTimeRanges", js.undefined)
    
    @scala.inline
    def setAnnotatedAssetId(value: String): Self = this.set("annotatedAssetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotatedAssetId: Self = this.set("annotatedAssetId", js.undefined)
    
    @scala.inline
    def setAnnotatedLocation(value: String): Self = this.set("annotatedLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotatedLocation: Self = this.set("annotatedLocation", js.undefined)
    
    @scala.inline
    def setAnnotatedUser(value: String): Self = this.set("annotatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotatedUser: Self = this.set("annotatedUser", js.undefined)
    
    @scala.inline
    def setBootMode(value: String): Self = this.set("bootMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBootMode: Self = this.set("bootMode", js.undefined)
    
    @scala.inline
    def setCpuStatusReportsVarargs(value: CpuTemperatureInfo*): Self = this.set("cpuStatusReports", js.Array(value :_*))
    
    @scala.inline
    def setCpuStatusReports(value: js.Array[CpuTemperatureInfo]): Self = this.set("cpuStatusReports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpuStatusReports: Self = this.set("cpuStatusReports", js.undefined)
    
    @scala.inline
    def setDeviceFilesVarargs(value: CreateTime*): Self = this.set("deviceFiles", js.Array(value :_*))
    
    @scala.inline
    def setDeviceFiles(value: js.Array[CreateTime]): Self = this.set("deviceFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceFiles: Self = this.set("deviceFiles", js.undefined)
    
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
    
    @scala.inline
    def setDiskVolumeReportsVarargs(value: VolumeInfo*): Self = this.set("diskVolumeReports", js.Array(value :_*))
    
    @scala.inline
    def setDiskVolumeReports(value: js.Array[VolumeInfo]): Self = this.set("diskVolumeReports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskVolumeReports: Self = this.set("diskVolumeReports", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setEthernetMacAddress(value: String): Self = this.set("ethernetMacAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEthernetMacAddress: Self = this.set("ethernetMacAddress", js.undefined)
    
    @scala.inline
    def setFirmwareVersion(value: String): Self = this.set("firmwareVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirmwareVersion: Self = this.set("firmwareVersion", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLastEnrollmentTime(value: String): Self = this.set("lastEnrollmentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastEnrollmentTime: Self = this.set("lastEnrollmentTime", js.undefined)
    
    @scala.inline
    def setLastSync(value: String): Self = this.set("lastSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastSync: Self = this.set("lastSync", js.undefined)
    
    @scala.inline
    def setMacAddress(value: String): Self = this.set("macAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMacAddress: Self = this.set("macAddress", js.undefined)
    
    @scala.inline
    def setMeid(value: String): Self = this.set("meid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeid: Self = this.set("meid", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    
    @scala.inline
    def setOrderNumber(value: String): Self = this.set("orderNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderNumber: Self = this.set("orderNumber", js.undefined)
    
    @scala.inline
    def setOrgUnitPath(value: String): Self = this.set("orgUnitPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrgUnitPath: Self = this.set("orgUnitPath", js.undefined)
    
    @scala.inline
    def setOsVersion(value: String): Self = this.set("osVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOsVersion: Self = this.set("osVersion", js.undefined)
    
    @scala.inline
    def setPlatformVersion(value: String): Self = this.set("platformVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatformVersion: Self = this.set("platformVersion", js.undefined)
    
    @scala.inline
    def setRecentUsersVarargs(value: Email*): Self = this.set("recentUsers", js.Array(value :_*))
    
    @scala.inline
    def setRecentUsers(value: js.Array[Email]): Self = this.set("recentUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecentUsers: Self = this.set("recentUsers", js.undefined)
    
    @scala.inline
    def setSerialNumber(value: String): Self = this.set("serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerialNumber: Self = this.set("serialNumber", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSupportEndDate(value: String): Self = this.set("supportEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportEndDate: Self = this.set("supportEndDate", js.undefined)
    
    @scala.inline
    def setSystemRamFreeReportsVarargs(value: ReportTime*): Self = this.set("systemRamFreeReports", js.Array(value :_*))
    
    @scala.inline
    def setSystemRamFreeReports(value: js.Array[ReportTime]): Self = this.set("systemRamFreeReports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemRamFreeReports: Self = this.set("systemRamFreeReports", js.undefined)
    
    @scala.inline
    def setSystemRamTotal(value: String): Self = this.set("systemRamTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemRamTotal: Self = this.set("systemRamTotal", js.undefined)
    
    @scala.inline
    def setTpmVersionInfo(value: Family): Self = this.set("tpmVersionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTpmVersionInfo: Self = this.set("tpmVersionInfo", js.undefined)
    
    @scala.inline
    def setWillAutoRenew(value: Boolean): Self = this.set("willAutoRenew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWillAutoRenew: Self = this.set("willAutoRenew", js.undefined)
  }
}
