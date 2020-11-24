package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAppsCloudidentityDevicesV1Device extends js.Object {
  
  /** Output only. Attributes specific to Android devices. */
  var androidSpecificAttributes: js.UndefOr[GoogleAppsCloudidentityDevicesV1AndroidAttributes] = js.native
  
  /** Asset tag of the device. */
  var assetTag: js.UndefOr[String] = js.native
  
  /** Output only. Baseband version of the device. */
  var basebandVersion: js.UndefOr[String] = js.native
  
  /** Output only. Device bootloader version. Example: 0.6.7. */
  var bootloaderVersion: js.UndefOr[String] = js.native
  
  /** Output only. Device brand. Example: Samsung. */
  var brand: js.UndefOr[String] = js.native
  
  /** Output only. Build number of the device. */
  var buildNumber: js.UndefOr[String] = js.native
  
  /** Output only. Represents whether the Device is compromised. */
  var compromisedState: js.UndefOr[String] = js.native
  
  /** Output only. When the Company-Owned device was imported. This field is empty for BYOD devices. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Output only. Type of device. */
  var deviceType: js.UndefOr[String] = js.native
  
  /** Output only. Whether developer options is enabled on device. */
  var enabledDeveloperOptions: js.UndefOr[Boolean] = js.native
  
  /** Output only. Whether USB debugging is enabled on device. */
  var enabledUsbDebugging: js.UndefOr[Boolean] = js.native
  
  /** Output only. Device encryption state. */
  var encryptionState: js.UndefOr[String] = js.native
  
  /** Output only. IMEI number of device if GSM device; empty otherwise. */
  var imei: js.UndefOr[String] = js.native
  
  /** Output only. Kernel version of the device. */
  var kernelVersion: js.UndefOr[String] = js.native
  
  /** Most recent time when device synced with this service. */
  var lastSyncTime: js.UndefOr[String] = js.native
  
  /** Output only. Management state of the device */
  var managementState: js.UndefOr[String] = js.native
  
  /** Output only. Device manufacturer. Example: Motorola. */
  var manufacturer: js.UndefOr[String] = js.native
  
  /** Output only. MEID number of device if CDMA device; empty otherwise. */
  var meid: js.UndefOr[String] = js.native
  
  /** Output only. Model name of device. Example: Pixel 3. */
  var model: js.UndefOr[String] = js.native
  
  /**
    * Output only. [Resource name](https://cloud.google.com/apis/design/resource_names) of the Device in format: `devices/{device_id}`, where device_id is the unique id assigned to the
    * Device.
    */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. Mobile or network operator of device, if available. */
  var networkOperator: js.UndefOr[String] = js.native
  
  /** Output only. OS version of the device. Example: Android 8.1.0. */
  var osVersion: js.UndefOr[String] = js.native
  
  /**
    * Output only. Domain name for Google accounts on device. Type for other accounts on device. On Android, will only be populated if |ownership_privilege| is |PROFILE_OWNER| or
    * |DEVICE_OWNER|. Does not include the account signed in to the device policy app if that account's domain has only one account. Examples: "com.example", "xyz.com".
    */
  var otherAccounts: js.UndefOr[js.Array[String]] = js.native
  
  /** Output only. Whether the device is owned by the company or an individual */
  var ownerType: js.UndefOr[String] = js.native
  
  /** Output only. OS release version. Example: 6.0. */
  var releaseVersion: js.UndefOr[String] = js.native
  
  /** Output only. OS security patch update time on device. */
  var securityPatchTime: js.UndefOr[String] = js.native
  
  /** Serial Number of device. Example: HT82V1A01076. */
  var serialNumber: js.UndefOr[String] = js.native
  
  /** WiFi MAC addresses of device. */
  var wifiMacAddresses: js.UndefOr[js.Array[String]] = js.native
}
object GoogleAppsCloudidentityDevicesV1Device {
  
  @scala.inline
  def apply(): GoogleAppsCloudidentityDevicesV1Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCloudidentityDevicesV1Device]
  }
  
  @scala.inline
  implicit class GoogleAppsCloudidentityDevicesV1DeviceOps[Self <: GoogleAppsCloudidentityDevicesV1Device] (val x: Self) extends AnyVal {
    
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
    def setAndroidSpecificAttributes(value: GoogleAppsCloudidentityDevicesV1AndroidAttributes): Self = this.set("androidSpecificAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroidSpecificAttributes: Self = this.set("androidSpecificAttributes", js.undefined)
    
    @scala.inline
    def setAssetTag(value: String): Self = this.set("assetTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetTag: Self = this.set("assetTag", js.undefined)
    
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
    def setCompromisedState(value: String): Self = this.set("compromisedState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompromisedState: Self = this.set("compromisedState", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDeviceType(value: String): Self = this.set("deviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceType: Self = this.set("deviceType", js.undefined)
    
    @scala.inline
    def setEnabledDeveloperOptions(value: Boolean): Self = this.set("enabledDeveloperOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabledDeveloperOptions: Self = this.set("enabledDeveloperOptions", js.undefined)
    
    @scala.inline
    def setEnabledUsbDebugging(value: Boolean): Self = this.set("enabledUsbDebugging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabledUsbDebugging: Self = this.set("enabledUsbDebugging", js.undefined)
    
    @scala.inline
    def setEncryptionState(value: String): Self = this.set("encryptionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionState: Self = this.set("encryptionState", js.undefined)
    
    @scala.inline
    def setImei(value: String): Self = this.set("imei", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImei: Self = this.set("imei", js.undefined)
    
    @scala.inline
    def setKernelVersion(value: String): Self = this.set("kernelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKernelVersion: Self = this.set("kernelVersion", js.undefined)
    
    @scala.inline
    def setLastSyncTime(value: String): Self = this.set("lastSyncTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastSyncTime: Self = this.set("lastSyncTime", js.undefined)
    
    @scala.inline
    def setManagementState(value: String): Self = this.set("managementState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagementState: Self = this.set("managementState", js.undefined)
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNetworkOperator(value: String): Self = this.set("networkOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkOperator: Self = this.set("networkOperator", js.undefined)
    
    @scala.inline
    def setOsVersion(value: String): Self = this.set("osVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOsVersion: Self = this.set("osVersion", js.undefined)
    
    @scala.inline
    def setOtherAccountsVarargs(value: String*): Self = this.set("otherAccounts", js.Array(value :_*))
    
    @scala.inline
    def setOtherAccounts(value: js.Array[String]): Self = this.set("otherAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOtherAccounts: Self = this.set("otherAccounts", js.undefined)
    
    @scala.inline
    def setOwnerType(value: String): Self = this.set("ownerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerType: Self = this.set("ownerType", js.undefined)
    
    @scala.inline
    def setReleaseVersion(value: String): Self = this.set("releaseVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReleaseVersion: Self = this.set("releaseVersion", js.undefined)
    
    @scala.inline
    def setSecurityPatchTime(value: String): Self = this.set("securityPatchTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityPatchTime: Self = this.set("securityPatchTime", js.undefined)
    
    @scala.inline
    def setSerialNumber(value: String): Self = this.set("serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerialNumber: Self = this.set("serialNumber", js.undefined)
    
    @scala.inline
    def setWifiMacAddressesVarargs(value: String*): Self = this.set("wifiMacAddresses", js.Array(value :_*))
    
    @scala.inline
    def setWifiMacAddresses(value: js.Array[String]): Self = this.set("wifiMacAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWifiMacAddresses: Self = this.set("wifiMacAddresses", js.undefined)
  }
}
