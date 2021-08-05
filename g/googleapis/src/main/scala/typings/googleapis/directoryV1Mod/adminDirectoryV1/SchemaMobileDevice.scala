package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.googleapis.anon.DisplayName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for Mobile Device resource in Directory API.
  */
trait SchemaMobileDevice extends StObject {
  
  /**
    * Adb (USB debugging) enabled or disabled on device (Read-only)
    */
  var adbStatus: js.UndefOr[Boolean] = js.undefined
  
  /**
    * List of applications installed on Mobile Device
    */
  var applications: js.UndefOr[js.Array[DisplayName]] = js.undefined
  
  /**
    * Mobile Device Baseband version (Read-only)
    */
  var basebandVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Mobile Device Bootloader version (Read-only)
    */
  var bootloaderVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Mobile Device Brand (Read-only)
    */
  var brand: js.UndefOr[String] = js.undefined
  
  /**
    * Mobile Device Build number (Read-only)
    */
  var buildNumber: js.UndefOr[String] = js.undefined
  
  /**
    * The default locale used on the Mobile Device (Read-only)
    */
  var defaultLanguage: js.UndefOr[String] = js.undefined
  
  /**
    * Developer options enabled or disabled on device (Read-only)
    */
  var developerOptionsStatus: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Mobile Device compromised status (Read-only)
    */
  var deviceCompromisedStatus: js.UndefOr[String] = js.undefined
  
  /**
    * Mobile Device serial number (Read-only)
    */
  var deviceId: js.UndefOr[String] = js.undefined
  
  /**
    * DevicePasswordStatus (Read-only)
    */
  var devicePasswordStatus: js.UndefOr[String] = js.undefined
  
  /**
    * List of owner user&#39;s email addresses (Read-only)
    */
  var email: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Mobile Device Encryption Status (Read-only)
    */
  var encryptionStatus: js.UndefOr[String] = js.undefined
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Date and time the device was first synchronized with the policy settings
    * in the G Suite administrator control panel (Read-only)
    */
  var firstSync: js.UndefOr[String] = js.undefined
  
  /**
    * Mobile Device Hardware (Read-only)
    */
  var hardware: js.UndefOr[String] = js.undefined
  
  /**
    * Mobile Device Hardware Id (Read-only)
    */
  var hardwareId: js.UndefOr[String] = js.undefined
  
  /**
    * Mobile Device IMEI number (Read-only)
    */
  var imei: js.UndefOr[String] = js.undefined
  
  /**
    * Mobile Device Kernel version (Read-only)
    */
  var kernelVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Date and time the device was last synchronized with the policy settings
    * in the G Suite administrator control panel (Read-only)
    */
  var lastSync: js.UndefOr[String] = js.undefined
  
  /**
    * Boolean indicating if this account is on owner/primary profile or not
    * (Read-only)
    */
  var managedAccountIsOnOwnerProfile: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Mobile Device manufacturer (Read-only)
    */
  var manufacturer: js.UndefOr[String] = js.undefined
  
  /**
    * Mobile Device MEID number (Read-only)
    */
  var meid: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the model of the device
    */
  var model: js.UndefOr[String] = js.undefined
  
  /**
    * List of owner user&#39;s names (Read-only)
    */
  var name: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Mobile Device mobile or network operator (if available) (Read-only)
    */
  var networkOperator: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the mobile operating system
    */
  var os: js.UndefOr[String] = js.undefined
  
  /**
    * List of accounts added on device (Read-only)
    */
  var otherAccountsInfo: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * DMAgentPermission (Read-only)
    */
  var privilege: js.UndefOr[String] = js.undefined
  
  /**
    * Mobile Device release version version (Read-only)
    */
  var releaseVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Unique identifier of Mobile Device (Read-only)
    */
  var resourceId: js.UndefOr[String] = js.undefined
  
  /**
    * Mobile Device Security patch level (Read-only)
    */
  var securityPatchLevel: js.UndefOr[String] = js.undefined
  
  /**
    * Mobile Device SSN or Serial Number (Read-only)
    */
  var serialNumber: js.UndefOr[String] = js.undefined
  
  /**
    * Status of the device (Read-only)
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * Work profile supported on device (Read-only)
    */
  var supportsWorkProfile: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The type of device (Read-only)
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Unknown sources enabled or disabled on device (Read-only)
    */
  var unknownSourcesStatus: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Mobile Device user agent
    */
  var userAgent: js.UndefOr[String] = js.undefined
  
  /**
    * Mobile Device WiFi MAC address (Read-only)
    */
  var wifiMacAddress: js.UndefOr[String] = js.undefined
}
object SchemaMobileDevice {
  
  inline def apply(): SchemaMobileDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMobileDevice]
  }
  
  extension [Self <: SchemaMobileDevice](x: Self) {
    
    inline def setAdbStatus(value: Boolean): Self = StObject.set(x, "adbStatus", value.asInstanceOf[js.Any])
    
    inline def setAdbStatusUndefined: Self = StObject.set(x, "adbStatus", js.undefined)
    
    inline def setApplications(value: js.Array[DisplayName]): Self = StObject.set(x, "applications", value.asInstanceOf[js.Any])
    
    inline def setApplicationsUndefined: Self = StObject.set(x, "applications", js.undefined)
    
    inline def setApplicationsVarargs(value: DisplayName*): Self = StObject.set(x, "applications", js.Array(value :_*))
    
    inline def setBasebandVersion(value: String): Self = StObject.set(x, "basebandVersion", value.asInstanceOf[js.Any])
    
    inline def setBasebandVersionUndefined: Self = StObject.set(x, "basebandVersion", js.undefined)
    
    inline def setBootloaderVersion(value: String): Self = StObject.set(x, "bootloaderVersion", value.asInstanceOf[js.Any])
    
    inline def setBootloaderVersionUndefined: Self = StObject.set(x, "bootloaderVersion", js.undefined)
    
    inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    
    inline def setBuildNumber(value: String): Self = StObject.set(x, "buildNumber", value.asInstanceOf[js.Any])
    
    inline def setBuildNumberUndefined: Self = StObject.set(x, "buildNumber", js.undefined)
    
    inline def setDefaultLanguage(value: String): Self = StObject.set(x, "defaultLanguage", value.asInstanceOf[js.Any])
    
    inline def setDefaultLanguageUndefined: Self = StObject.set(x, "defaultLanguage", js.undefined)
    
    inline def setDeveloperOptionsStatus(value: Boolean): Self = StObject.set(x, "developerOptionsStatus", value.asInstanceOf[js.Any])
    
    inline def setDeveloperOptionsStatusUndefined: Self = StObject.set(x, "developerOptionsStatus", js.undefined)
    
    inline def setDeviceCompromisedStatus(value: String): Self = StObject.set(x, "deviceCompromisedStatus", value.asInstanceOf[js.Any])
    
    inline def setDeviceCompromisedStatusUndefined: Self = StObject.set(x, "deviceCompromisedStatus", js.undefined)
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setDevicePasswordStatus(value: String): Self = StObject.set(x, "devicePasswordStatus", value.asInstanceOf[js.Any])
    
    inline def setDevicePasswordStatusUndefined: Self = StObject.set(x, "devicePasswordStatus", js.undefined)
    
    inline def setEmail(value: js.Array[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEmailVarargs(value: String*): Self = StObject.set(x, "email", js.Array(value :_*))
    
    inline def setEncryptionStatus(value: String): Self = StObject.set(x, "encryptionStatus", value.asInstanceOf[js.Any])
    
    inline def setEncryptionStatusUndefined: Self = StObject.set(x, "encryptionStatus", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setFirstSync(value: String): Self = StObject.set(x, "firstSync", value.asInstanceOf[js.Any])
    
    inline def setFirstSyncUndefined: Self = StObject.set(x, "firstSync", js.undefined)
    
    inline def setHardware(value: String): Self = StObject.set(x, "hardware", value.asInstanceOf[js.Any])
    
    inline def setHardwareId(value: String): Self = StObject.set(x, "hardwareId", value.asInstanceOf[js.Any])
    
    inline def setHardwareIdUndefined: Self = StObject.set(x, "hardwareId", js.undefined)
    
    inline def setHardwareUndefined: Self = StObject.set(x, "hardware", js.undefined)
    
    inline def setImei(value: String): Self = StObject.set(x, "imei", value.asInstanceOf[js.Any])
    
    inline def setImeiUndefined: Self = StObject.set(x, "imei", js.undefined)
    
    inline def setKernelVersion(value: String): Self = StObject.set(x, "kernelVersion", value.asInstanceOf[js.Any])
    
    inline def setKernelVersionUndefined: Self = StObject.set(x, "kernelVersion", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLastSync(value: String): Self = StObject.set(x, "lastSync", value.asInstanceOf[js.Any])
    
    inline def setLastSyncUndefined: Self = StObject.set(x, "lastSync", js.undefined)
    
    inline def setManagedAccountIsOnOwnerProfile(value: Boolean): Self = StObject.set(x, "managedAccountIsOnOwnerProfile", value.asInstanceOf[js.Any])
    
    inline def setManagedAccountIsOnOwnerProfileUndefined: Self = StObject.set(x, "managedAccountIsOnOwnerProfile", js.undefined)
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setMeid(value: String): Self = StObject.set(x, "meid", value.asInstanceOf[js.Any])
    
    inline def setMeidUndefined: Self = StObject.set(x, "meid", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setName(value: js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value :_*))
    
    inline def setNetworkOperator(value: String): Self = StObject.set(x, "networkOperator", value.asInstanceOf[js.Any])
    
    inline def setNetworkOperatorUndefined: Self = StObject.set(x, "networkOperator", js.undefined)
    
    inline def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
    
    inline def setOtherAccountsInfo(value: js.Array[String]): Self = StObject.set(x, "otherAccountsInfo", value.asInstanceOf[js.Any])
    
    inline def setOtherAccountsInfoUndefined: Self = StObject.set(x, "otherAccountsInfo", js.undefined)
    
    inline def setOtherAccountsInfoVarargs(value: String*): Self = StObject.set(x, "otherAccountsInfo", js.Array(value :_*))
    
    inline def setPrivilege(value: String): Self = StObject.set(x, "privilege", value.asInstanceOf[js.Any])
    
    inline def setPrivilegeUndefined: Self = StObject.set(x, "privilege", js.undefined)
    
    inline def setReleaseVersion(value: String): Self = StObject.set(x, "releaseVersion", value.asInstanceOf[js.Any])
    
    inline def setReleaseVersionUndefined: Self = StObject.set(x, "releaseVersion", js.undefined)
    
    inline def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setSecurityPatchLevel(value: String): Self = StObject.set(x, "securityPatchLevel", value.asInstanceOf[js.Any])
    
    inline def setSecurityPatchLevelUndefined: Self = StObject.set(x, "securityPatchLevel", js.undefined)
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSupportsWorkProfile(value: Boolean): Self = StObject.set(x, "supportsWorkProfile", value.asInstanceOf[js.Any])
    
    inline def setSupportsWorkProfileUndefined: Self = StObject.set(x, "supportsWorkProfile", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnknownSourcesStatus(value: Boolean): Self = StObject.set(x, "unknownSourcesStatus", value.asInstanceOf[js.Any])
    
    inline def setUnknownSourcesStatusUndefined: Self = StObject.set(x, "unknownSourcesStatus", js.undefined)
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    
    inline def setWifiMacAddress(value: String): Self = StObject.set(x, "wifiMacAddress", value.asInstanceOf[js.Any])
    
    inline def setWifiMacAddressUndefined: Self = StObject.set(x, "wifiMacAddress", js.undefined)
  }
}
