package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsCloudidentityDevicesV1Device extends StObject {
  
  /** Output only. Attributes specific to Android devices. */
  var androidSpecificAttributes: js.UndefOr[GoogleAppsCloudidentityDevicesV1AndroidAttributes] = js.undefined
  
  /** Asset tag of the device. */
  var assetTag: js.UndefOr[String] = js.undefined
  
  /** Output only. Baseband version of the device. */
  var basebandVersion: js.UndefOr[String] = js.undefined
  
  /** Output only. Device bootloader version. Example: 0.6.7. */
  var bootloaderVersion: js.UndefOr[String] = js.undefined
  
  /** Output only. Device brand. Example: Samsung. */
  var brand: js.UndefOr[String] = js.undefined
  
  /** Output only. Build number of the device. */
  var buildNumber: js.UndefOr[String] = js.undefined
  
  /** Output only. Represents whether the Device is compromised. */
  var compromisedState: js.UndefOr[String] = js.undefined
  
  /** Output only. When the Company-Owned device was imported. This field is empty for BYOD devices. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Output only. Type of device. */
  var deviceType: js.UndefOr[String] = js.undefined
  
  /** Output only. Whether developer options is enabled on device. */
  var enabledDeveloperOptions: js.UndefOr[Boolean] = js.undefined
  
  /** Output only. Whether USB debugging is enabled on device. */
  var enabledUsbDebugging: js.UndefOr[Boolean] = js.undefined
  
  /** Output only. Device encryption state. */
  var encryptionState: js.UndefOr[String] = js.undefined
  
  /** Output only. IMEI number of device if GSM device; empty otherwise. */
  var imei: js.UndefOr[String] = js.undefined
  
  /** Output only. Kernel version of the device. */
  var kernelVersion: js.UndefOr[String] = js.undefined
  
  /** Most recent time when device synced with this service. */
  var lastSyncTime: js.UndefOr[String] = js.undefined
  
  /** Output only. Management state of the device */
  var managementState: js.UndefOr[String] = js.undefined
  
  /** Output only. Device manufacturer. Example: Motorola. */
  var manufacturer: js.UndefOr[String] = js.undefined
  
  /** Output only. MEID number of device if CDMA device; empty otherwise. */
  var meid: js.UndefOr[String] = js.undefined
  
  /** Output only. Model name of device. Example: Pixel 3. */
  var model: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. [Resource name](https://cloud.google.com/apis/design/resource_names) of the Device in format: `devices/{device_id}`, where device_id is the unique id assigned to the
    * Device.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. Mobile or network operator of device, if available. */
  var networkOperator: js.UndefOr[String] = js.undefined
  
  /** Output only. OS version of the device. Example: Android 8.1.0. */
  var osVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Domain name for Google accounts on device. Type for other accounts on device. On Android, will only be populated if |ownership_privilege| is |PROFILE_OWNER| or
    * |DEVICE_OWNER|. Does not include the account signed in to the device policy app if that account's domain has only one account. Examples: "com.example", "xyz.com".
    */
  var otherAccounts: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Output only. Whether the device is owned by the company or an individual */
  var ownerType: js.UndefOr[String] = js.undefined
  
  /** Output only. OS release version. Example: 6.0. */
  var releaseVersion: js.UndefOr[String] = js.undefined
  
  /** Output only. OS security patch update time on device. */
  var securityPatchTime: js.UndefOr[String] = js.undefined
  
  /** Serial Number of device. Example: HT82V1A01076. */
  var serialNumber: js.UndefOr[String] = js.undefined
  
  /** WiFi MAC addresses of device. */
  var wifiMacAddresses: js.UndefOr[js.Array[String]] = js.undefined
}
object GoogleAppsCloudidentityDevicesV1Device {
  
  @scala.inline
  def apply(): GoogleAppsCloudidentityDevicesV1Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCloudidentityDevicesV1Device]
  }
  
  @scala.inline
  implicit class GoogleAppsCloudidentityDevicesV1DeviceMutableBuilder[Self <: GoogleAppsCloudidentityDevicesV1Device] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroidSpecificAttributes(value: GoogleAppsCloudidentityDevicesV1AndroidAttributes): Self = StObject.set(x, "androidSpecificAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidSpecificAttributesUndefined: Self = StObject.set(x, "androidSpecificAttributes", js.undefined)
    
    @scala.inline
    def setAssetTag(value: String): Self = StObject.set(x, "assetTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetTagUndefined: Self = StObject.set(x, "assetTag", js.undefined)
    
    @scala.inline
    def setBasebandVersion(value: String): Self = StObject.set(x, "basebandVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasebandVersionUndefined: Self = StObject.set(x, "basebandVersion", js.undefined)
    
    @scala.inline
    def setBootloaderVersion(value: String): Self = StObject.set(x, "bootloaderVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootloaderVersionUndefined: Self = StObject.set(x, "bootloaderVersion", js.undefined)
    
    @scala.inline
    def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    
    @scala.inline
    def setBuildNumber(value: String): Self = StObject.set(x, "buildNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildNumberUndefined: Self = StObject.set(x, "buildNumber", js.undefined)
    
    @scala.inline
    def setCompromisedState(value: String): Self = StObject.set(x, "compromisedState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompromisedStateUndefined: Self = StObject.set(x, "compromisedState", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDeviceType(value: String): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceTypeUndefined: Self = StObject.set(x, "deviceType", js.undefined)
    
    @scala.inline
    def setEnabledDeveloperOptions(value: Boolean): Self = StObject.set(x, "enabledDeveloperOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledDeveloperOptionsUndefined: Self = StObject.set(x, "enabledDeveloperOptions", js.undefined)
    
    @scala.inline
    def setEnabledUsbDebugging(value: Boolean): Self = StObject.set(x, "enabledUsbDebugging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUsbDebuggingUndefined: Self = StObject.set(x, "enabledUsbDebugging", js.undefined)
    
    @scala.inline
    def setEncryptionState(value: String): Self = StObject.set(x, "encryptionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionStateUndefined: Self = StObject.set(x, "encryptionState", js.undefined)
    
    @scala.inline
    def setImei(value: String): Self = StObject.set(x, "imei", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImeiUndefined: Self = StObject.set(x, "imei", js.undefined)
    
    @scala.inline
    def setKernelVersion(value: String): Self = StObject.set(x, "kernelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelVersionUndefined: Self = StObject.set(x, "kernelVersion", js.undefined)
    
    @scala.inline
    def setLastSyncTime(value: String): Self = StObject.set(x, "lastSyncTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSyncTimeUndefined: Self = StObject.set(x, "lastSyncTime", js.undefined)
    
    @scala.inline
    def setManagementState(value: String): Self = StObject.set(x, "managementState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagementStateUndefined: Self = StObject.set(x, "managementState", js.undefined)
    
    @scala.inline
    def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    @scala.inline
    def setMeid(value: String): Self = StObject.set(x, "meid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeidUndefined: Self = StObject.set(x, "meid", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNetworkOperator(value: String): Self = StObject.set(x, "networkOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkOperatorUndefined: Self = StObject.set(x, "networkOperator", js.undefined)
    
    @scala.inline
    def setOsVersion(value: String): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsVersionUndefined: Self = StObject.set(x, "osVersion", js.undefined)
    
    @scala.inline
    def setOtherAccounts(value: js.Array[String]): Self = StObject.set(x, "otherAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherAccountsUndefined: Self = StObject.set(x, "otherAccounts", js.undefined)
    
    @scala.inline
    def setOtherAccountsVarargs(value: String*): Self = StObject.set(x, "otherAccounts", js.Array(value :_*))
    
    @scala.inline
    def setOwnerType(value: String): Self = StObject.set(x, "ownerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerTypeUndefined: Self = StObject.set(x, "ownerType", js.undefined)
    
    @scala.inline
    def setReleaseVersion(value: String): Self = StObject.set(x, "releaseVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseVersionUndefined: Self = StObject.set(x, "releaseVersion", js.undefined)
    
    @scala.inline
    def setSecurityPatchTime(value: String): Self = StObject.set(x, "securityPatchTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityPatchTimeUndefined: Self = StObject.set(x, "securityPatchTime", js.undefined)
    
    @scala.inline
    def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    @scala.inline
    def setWifiMacAddresses(value: js.Array[String]): Self = StObject.set(x, "wifiMacAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWifiMacAddressesUndefined: Self = StObject.set(x, "wifiMacAddresses", js.undefined)
    
    @scala.inline
    def setWifiMacAddressesVarargs(value: String*): Self = StObject.set(x, "wifiMacAddresses", js.Array(value :_*))
  }
}
