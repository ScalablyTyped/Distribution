package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.googleapis.anon.PackageName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMobileDevice extends StObject {
  
  /**
    * Adb (USB debugging) enabled or disabled on device (Read-only)
    */
  var adbStatus: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The list of applications installed on an Android mobile device. It is not applicable to Google Sync and iOS devices. The list includes any Android applications that access Google Workspace data. When updating an applications list, it is important to note that updates replace the existing list. If the Android device has two existing applications and the API updates the list with five applications, the is now the updated list of five applications.
    */
  var applications: js.UndefOr[js.Array[PackageName] | Null] = js.undefined
  
  /**
    * The device's baseband version.
    */
  var basebandVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Mobile Device Bootloader version (Read-only)
    */
  var bootloaderVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Mobile Device Brand (Read-only)
    */
  var brand: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The device's operating system build number.
    */
  var buildNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The default locale used on the device.
    */
  var defaultLanguage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Developer options enabled or disabled on device (Read-only)
    */
  var developerOptionsStatus: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The compromised device status.
    */
  var deviceCompromisedStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The serial number for a Google Sync mobile device. For Android and iOS devices, this is a software generated unique identifier.
    */
  var deviceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * DevicePasswordStatus (Read-only)
    */
  var devicePasswordStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of owner's email addresses. If your application needs the current list of user emails, use the [get](/admin-sdk/directory/v1/reference/mobiledevices/get.html) method. For additional information, see the [retrieve a user](/admin-sdk/directory/v1/guides/manage-users#get_user) method.
    */
  var email: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Mobile Device Encryption Status (Read-only)
    */
  var encryptionStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Date and time the device was first synchronized with the policy settings in the G Suite administrator control panel (Read-only)
    */
  var firstSync: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Mobile Device Hardware (Read-only)
    */
  var hardware: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The IMEI/MEID unique identifier for Android hardware. It is not applicable to Google Sync devices. When adding an Android mobile device, this is an optional property. When updating one of these devices, this is a read-only property.
    */
  var hardwareId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The device's IMEI number.
    */
  var imei: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The device's kernel version.
    */
  var kernelVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the API resource. For Mobiledevices resources, the value is `admin#directory#mobiledevice`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Date and time the device was last synchronized with the policy settings in the G Suite administrator control panel (Read-only)
    */
  var lastSync: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Boolean indicating if this account is on owner/primary profile or not.
    */
  var managedAccountIsOnOwnerProfile: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Mobile Device manufacturer (Read-only)
    */
  var manufacturer: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The device's MEID number.
    */
  var meid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The mobile device's model name, for example Nexus S. This property can be [updated](/admin-sdk/directory/v1/reference/mobiledevices/update.html). For more information, see the [Developer's Guide](/admin-sdk/directory/v1/guides/manage-mobile=devices#update_mobile_device).
    */
  var model: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of the owner's user names. If your application needs the current list of device owner names, use the [get](/admin-sdk/directory/v1/reference/mobiledevices/get.html) method. For more information about retrieving mobile device user information, see the [Developer's Guide](/admin-sdk/directory/v1/guides/manage-users#get_user).
    */
  var name: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Mobile Device mobile or network operator (if available) (Read-only)
    */
  var networkOperator: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The mobile device's operating system, for example IOS 4.3 or Android 2.3.5. This property can be [updated](/admin-sdk/directory/v1/reference/mobiledevices/update.html). For more information, see the [Developer's Guide](/admin-sdk/directory/v1/guides/manage-mobile-devices#update_mobile_device).
    */
  var os: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of accounts added on device (Read-only)
    */
  var otherAccountsInfo: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * DMAgentPermission (Read-only)
    */
  var privilege: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Mobile Device release version version (Read-only)
    */
  var releaseVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique ID the API service uses to identify the mobile device.
    */
  var resourceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Mobile Device Security patch level (Read-only)
    */
  var securityPatchLevel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The device's serial number.
    */
  var serialNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The device's status.
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Work profile supported on device (Read-only)
    */
  var supportsWorkProfile: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The type of mobile device.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unknown sources enabled or disabled on device (Read-only)
    */
  var unknownSourcesStatus: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Gives information about the device such as `os` version. This property can be [updated](/admin-sdk/directory/v1/reference/mobiledevices/update.html). For more information, see the [Developer's Guide](/admin-sdk/directory/v1/guides/manage-mobile-devices#update_mobile_device).
    */
  var userAgent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The device's MAC address on Wi-Fi networks.
    */
  var wifiMacAddress: js.UndefOr[String | Null] = js.undefined
}
object SchemaMobileDevice {
  
  inline def apply(): SchemaMobileDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMobileDevice]
  }
  
  extension [Self <: SchemaMobileDevice](x: Self) {
    
    inline def setAdbStatus(value: Boolean): Self = StObject.set(x, "adbStatus", value.asInstanceOf[js.Any])
    
    inline def setAdbStatusNull: Self = StObject.set(x, "adbStatus", null)
    
    inline def setAdbStatusUndefined: Self = StObject.set(x, "adbStatus", js.undefined)
    
    inline def setApplications(value: js.Array[PackageName]): Self = StObject.set(x, "applications", value.asInstanceOf[js.Any])
    
    inline def setApplicationsNull: Self = StObject.set(x, "applications", null)
    
    inline def setApplicationsUndefined: Self = StObject.set(x, "applications", js.undefined)
    
    inline def setApplicationsVarargs(value: PackageName*): Self = StObject.set(x, "applications", js.Array(value*))
    
    inline def setBasebandVersion(value: String): Self = StObject.set(x, "basebandVersion", value.asInstanceOf[js.Any])
    
    inline def setBasebandVersionNull: Self = StObject.set(x, "basebandVersion", null)
    
    inline def setBasebandVersionUndefined: Self = StObject.set(x, "basebandVersion", js.undefined)
    
    inline def setBootloaderVersion(value: String): Self = StObject.set(x, "bootloaderVersion", value.asInstanceOf[js.Any])
    
    inline def setBootloaderVersionNull: Self = StObject.set(x, "bootloaderVersion", null)
    
    inline def setBootloaderVersionUndefined: Self = StObject.set(x, "bootloaderVersion", js.undefined)
    
    inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setBrandNull: Self = StObject.set(x, "brand", null)
    
    inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    
    inline def setBuildNumber(value: String): Self = StObject.set(x, "buildNumber", value.asInstanceOf[js.Any])
    
    inline def setBuildNumberNull: Self = StObject.set(x, "buildNumber", null)
    
    inline def setBuildNumberUndefined: Self = StObject.set(x, "buildNumber", js.undefined)
    
    inline def setDefaultLanguage(value: String): Self = StObject.set(x, "defaultLanguage", value.asInstanceOf[js.Any])
    
    inline def setDefaultLanguageNull: Self = StObject.set(x, "defaultLanguage", null)
    
    inline def setDefaultLanguageUndefined: Self = StObject.set(x, "defaultLanguage", js.undefined)
    
    inline def setDeveloperOptionsStatus(value: Boolean): Self = StObject.set(x, "developerOptionsStatus", value.asInstanceOf[js.Any])
    
    inline def setDeveloperOptionsStatusNull: Self = StObject.set(x, "developerOptionsStatus", null)
    
    inline def setDeveloperOptionsStatusUndefined: Self = StObject.set(x, "developerOptionsStatus", js.undefined)
    
    inline def setDeviceCompromisedStatus(value: String): Self = StObject.set(x, "deviceCompromisedStatus", value.asInstanceOf[js.Any])
    
    inline def setDeviceCompromisedStatusNull: Self = StObject.set(x, "deviceCompromisedStatus", null)
    
    inline def setDeviceCompromisedStatusUndefined: Self = StObject.set(x, "deviceCompromisedStatus", js.undefined)
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdNull: Self = StObject.set(x, "deviceId", null)
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setDevicePasswordStatus(value: String): Self = StObject.set(x, "devicePasswordStatus", value.asInstanceOf[js.Any])
    
    inline def setDevicePasswordStatusNull: Self = StObject.set(x, "devicePasswordStatus", null)
    
    inline def setDevicePasswordStatusUndefined: Self = StObject.set(x, "devicePasswordStatus", js.undefined)
    
    inline def setEmail(value: js.Array[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEmailVarargs(value: String*): Self = StObject.set(x, "email", js.Array(value*))
    
    inline def setEncryptionStatus(value: String): Self = StObject.set(x, "encryptionStatus", value.asInstanceOf[js.Any])
    
    inline def setEncryptionStatusNull: Self = StObject.set(x, "encryptionStatus", null)
    
    inline def setEncryptionStatusUndefined: Self = StObject.set(x, "encryptionStatus", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setFirstSync(value: String): Self = StObject.set(x, "firstSync", value.asInstanceOf[js.Any])
    
    inline def setFirstSyncNull: Self = StObject.set(x, "firstSync", null)
    
    inline def setFirstSyncUndefined: Self = StObject.set(x, "firstSync", js.undefined)
    
    inline def setHardware(value: String): Self = StObject.set(x, "hardware", value.asInstanceOf[js.Any])
    
    inline def setHardwareId(value: String): Self = StObject.set(x, "hardwareId", value.asInstanceOf[js.Any])
    
    inline def setHardwareIdNull: Self = StObject.set(x, "hardwareId", null)
    
    inline def setHardwareIdUndefined: Self = StObject.set(x, "hardwareId", js.undefined)
    
    inline def setHardwareNull: Self = StObject.set(x, "hardware", null)
    
    inline def setHardwareUndefined: Self = StObject.set(x, "hardware", js.undefined)
    
    inline def setImei(value: String): Self = StObject.set(x, "imei", value.asInstanceOf[js.Any])
    
    inline def setImeiNull: Self = StObject.set(x, "imei", null)
    
    inline def setImeiUndefined: Self = StObject.set(x, "imei", js.undefined)
    
    inline def setKernelVersion(value: String): Self = StObject.set(x, "kernelVersion", value.asInstanceOf[js.Any])
    
    inline def setKernelVersionNull: Self = StObject.set(x, "kernelVersion", null)
    
    inline def setKernelVersionUndefined: Self = StObject.set(x, "kernelVersion", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLastSync(value: String): Self = StObject.set(x, "lastSync", value.asInstanceOf[js.Any])
    
    inline def setLastSyncNull: Self = StObject.set(x, "lastSync", null)
    
    inline def setLastSyncUndefined: Self = StObject.set(x, "lastSync", js.undefined)
    
    inline def setManagedAccountIsOnOwnerProfile(value: Boolean): Self = StObject.set(x, "managedAccountIsOnOwnerProfile", value.asInstanceOf[js.Any])
    
    inline def setManagedAccountIsOnOwnerProfileNull: Self = StObject.set(x, "managedAccountIsOnOwnerProfile", null)
    
    inline def setManagedAccountIsOnOwnerProfileUndefined: Self = StObject.set(x, "managedAccountIsOnOwnerProfile", js.undefined)
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerNull: Self = StObject.set(x, "manufacturer", null)
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setMeid(value: String): Self = StObject.set(x, "meid", value.asInstanceOf[js.Any])
    
    inline def setMeidNull: Self = StObject.set(x, "meid", null)
    
    inline def setMeidUndefined: Self = StObject.set(x, "meid", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelNull: Self = StObject.set(x, "model", null)
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setName(value: js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value*))
    
    inline def setNetworkOperator(value: String): Self = StObject.set(x, "networkOperator", value.asInstanceOf[js.Any])
    
    inline def setNetworkOperatorNull: Self = StObject.set(x, "networkOperator", null)
    
    inline def setNetworkOperatorUndefined: Self = StObject.set(x, "networkOperator", js.undefined)
    
    inline def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setOsNull: Self = StObject.set(x, "os", null)
    
    inline def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
    
    inline def setOtherAccountsInfo(value: js.Array[String]): Self = StObject.set(x, "otherAccountsInfo", value.asInstanceOf[js.Any])
    
    inline def setOtherAccountsInfoNull: Self = StObject.set(x, "otherAccountsInfo", null)
    
    inline def setOtherAccountsInfoUndefined: Self = StObject.set(x, "otherAccountsInfo", js.undefined)
    
    inline def setOtherAccountsInfoVarargs(value: String*): Self = StObject.set(x, "otherAccountsInfo", js.Array(value*))
    
    inline def setPrivilege(value: String): Self = StObject.set(x, "privilege", value.asInstanceOf[js.Any])
    
    inline def setPrivilegeNull: Self = StObject.set(x, "privilege", null)
    
    inline def setPrivilegeUndefined: Self = StObject.set(x, "privilege", js.undefined)
    
    inline def setReleaseVersion(value: String): Self = StObject.set(x, "releaseVersion", value.asInstanceOf[js.Any])
    
    inline def setReleaseVersionNull: Self = StObject.set(x, "releaseVersion", null)
    
    inline def setReleaseVersionUndefined: Self = StObject.set(x, "releaseVersion", js.undefined)
    
    inline def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdNull: Self = StObject.set(x, "resourceId", null)
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setSecurityPatchLevel(value: String): Self = StObject.set(x, "securityPatchLevel", value.asInstanceOf[js.Any])
    
    inline def setSecurityPatchLevelNull: Self = StObject.set(x, "securityPatchLevel", null)
    
    inline def setSecurityPatchLevelUndefined: Self = StObject.set(x, "securityPatchLevel", js.undefined)
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberNull: Self = StObject.set(x, "serialNumber", null)
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSupportsWorkProfile(value: Boolean): Self = StObject.set(x, "supportsWorkProfile", value.asInstanceOf[js.Any])
    
    inline def setSupportsWorkProfileNull: Self = StObject.set(x, "supportsWorkProfile", null)
    
    inline def setSupportsWorkProfileUndefined: Self = StObject.set(x, "supportsWorkProfile", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnknownSourcesStatus(value: Boolean): Self = StObject.set(x, "unknownSourcesStatus", value.asInstanceOf[js.Any])
    
    inline def setUnknownSourcesStatusNull: Self = StObject.set(x, "unknownSourcesStatus", null)
    
    inline def setUnknownSourcesStatusUndefined: Self = StObject.set(x, "unknownSourcesStatus", js.undefined)
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setUserAgentNull: Self = StObject.set(x, "userAgent", null)
    
    inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    
    inline def setWifiMacAddress(value: String): Self = StObject.set(x, "wifiMacAddress", value.asInstanceOf[js.Any])
    
    inline def setWifiMacAddressNull: Self = StObject.set(x, "wifiMacAddress", null)
    
    inline def setWifiMacAddressUndefined: Self = StObject.set(x, "wifiMacAddress", js.undefined)
  }
}
