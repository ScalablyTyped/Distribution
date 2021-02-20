package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Device extends StObject {
  
  /** The API level of the Android platform version running on the device. */
  var apiLevel: js.UndefOr[Double] = js.native
  
  /** Reports for apps installed on the device. This information is only available when application_reports_enabled is true in the device's policy. */
  var applicationReports: js.UndefOr[js.Array[ApplicationReport]] = js.native
  
  /** The name of the policy currently applied to the device. */
  var appliedPolicyName: js.UndefOr[String] = js.native
  
  /** The version of the policy currently applied to the device. */
  var appliedPolicyVersion: js.UndefOr[String] = js.native
  
  /** The state currently applied to the device. */
  var appliedState: js.UndefOr[String] = js.native
  
  /**
    * Information about Common Criteria Mode—security standards defined in the Common Criteria for Information Technology Security Evaluation (https://www.commoncriteriaportal.org/)
    * (CC).This information is only available if statusReportingSettings.commonCriteriaModeEnabled is true in the device's policy.
    */
  var commonCriteriaModeInfo: js.UndefOr[CommonCriteriaModeInfo] = js.native
  
  /** Device settings information. This information is only available if deviceSettingsEnabled is true in the device's policy. */
  var deviceSettings: js.UndefOr[DeviceSettings] = js.native
  
  /** If the device state is DISABLED, an optional message that is displayed on the device indicating the reason the device is disabled. This field can be modified by a patch request. */
  var disabledReason: js.UndefOr[UserFacingMessage] = js.native
  
  /** Detailed information about displays on the device. This information is only available if displayInfoEnabled is true in the device's policy. */
  var displays: js.UndefOr[js.Array[Display]] = js.native
  
  /** The time of device enrollment. */
  var enrollmentTime: js.UndefOr[String] = js.native
  
  /** If the device was enrolled with an enrollment token with additional data provided, this field contains that data. */
  var enrollmentTokenData: js.UndefOr[String] = js.native
  
  /** If the device was enrolled with an enrollment token, this field contains the name of the token. */
  var enrollmentTokenName: js.UndefOr[String] = js.native
  
  /** Detailed information about the device hardware. */
  var hardwareInfo: js.UndefOr[HardwareInfo] = js.native
  
  /** Hardware status samples in chronological order. This information is only available if hardwareStatusEnabled is true in the device's policy. */
  var hardwareStatusSamples: js.UndefOr[js.Array[HardwareStatus]] = js.native
  
  /** Deprecated. */
  var lastPolicyComplianceReportTime: js.UndefOr[String] = js.native
  
  /** The last time the device fetched its policy. */
  var lastPolicySyncTime: js.UndefOr[String] = js.native
  
  /** The last time the device sent a status report. */
  var lastStatusReportTime: js.UndefOr[String] = js.native
  
  /** The type of management mode Android Device Policy takes on the device. This influences which policy settings are supported. */
  var managementMode: js.UndefOr[String] = js.native
  
  /** Events related to memory and storage measurements in chronological order. This information is only available if memoryInfoEnabled is true in the device's policy. */
  var memoryEvents: js.UndefOr[js.Array[MemoryEvent]] = js.native
  
  /** Memory information. This information is only available if memoryInfoEnabled is true in the device's policy. */
  var memoryInfo: js.UndefOr[MemoryInfo] = js.native
  
  /** The name of the device in the form enterprises/{enterpriseId}/devices/{deviceId}. */
  var name: js.UndefOr[String] = js.native
  
  /** Device network information. This information is only available if networkInfoEnabled is true in the device's policy. */
  var networkInfo: js.UndefOr[NetworkInfo] = js.native
  
  /** Details about policy settings that the device is not compliant with. */
  var nonComplianceDetails: js.UndefOr[js.Array[NonComplianceDetail]] = js.native
  
  /** Ownership of the managed device. */
  var ownership: js.UndefOr[String] = js.native
  
  /** Whether the device is compliant with its policy. */
  var policyCompliant: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the policy applied to the device, in the form enterprises/{enterpriseId}/policies/{policyId}. If not specified, the policy_name for the device's user is applied. This
    * field can be modified by a patch request. You can specify only the policyId when calling enterprises.devices.patch, as long as the policyId doesn’t contain any slashes. The rest of
    * the policy name is inferred.
    */
  var policyName: js.UndefOr[String] = js.native
  
  /** Power management events on the device in chronological order. This information is only available if powerManagementEventsEnabled is true in the device's policy. */
  var powerManagementEvents: js.UndefOr[js.Array[PowerManagementEvent]] = js.native
  
  /**
    * If the same physical device has been enrolled multiple times, this field contains its previous device names. The serial number is used as the unique identifier to determine if the
    * same physical device has enrolled previously. The names are in chronological order.
    */
  var previousDeviceNames: js.UndefOr[js.Array[String]] = js.native
  
  /** Device's security posture value that reflects how secure the device is. */
  var securityPosture: js.UndefOr[SecurityPosture] = js.native
  
  /** Detailed information about the device software. This information is only available if softwareInfoEnabled is true in the device's policy. */
  var softwareInfo: js.UndefOr[SoftwareInfo] = js.native
  
  /**
    * The state to be applied to the device. This field can be modified by a patch request. Note that when calling enterprises.devices.patch, ACTIVE and DISABLED are the only allowable
    * values. To enter the device into a DELETED state, call enterprises.devices.delete.
    */
  var state: js.UndefOr[String] = js.native
  
  /** Map of selected system properties name and value related to the device. This information is only available if systemPropertiesEnabled is true in the device's policy. */
  var systemProperties: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientAndroidmanagement.maximMazurokGapiClientAndroidmanagementStrings.Device with TopLevel[js.Any]
  ] = js.native
  
  /** The user who owns the device. */
  var user: js.UndefOr[User] = js.native
  
  /** The resource name of the user that owns this device in the form enterprises/{enterpriseId}/users/{userId}. */
  var userName: js.UndefOr[String] = js.native
}
object Device {
  
  @scala.inline
  def apply(): Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Device]
  }
  
  @scala.inline
  implicit class DeviceMutableBuilder[Self <: Device] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiLevel(value: Double): Self = StObject.set(x, "apiLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiLevelUndefined: Self = StObject.set(x, "apiLevel", js.undefined)
    
    @scala.inline
    def setApplicationReports(value: js.Array[ApplicationReport]): Self = StObject.set(x, "applicationReports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationReportsUndefined: Self = StObject.set(x, "applicationReports", js.undefined)
    
    @scala.inline
    def setApplicationReportsVarargs(value: ApplicationReport*): Self = StObject.set(x, "applicationReports", js.Array(value :_*))
    
    @scala.inline
    def setAppliedPolicyName(value: String): Self = StObject.set(x, "appliedPolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppliedPolicyNameUndefined: Self = StObject.set(x, "appliedPolicyName", js.undefined)
    
    @scala.inline
    def setAppliedPolicyVersion(value: String): Self = StObject.set(x, "appliedPolicyVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppliedPolicyVersionUndefined: Self = StObject.set(x, "appliedPolicyVersion", js.undefined)
    
    @scala.inline
    def setAppliedState(value: String): Self = StObject.set(x, "appliedState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppliedStateUndefined: Self = StObject.set(x, "appliedState", js.undefined)
    
    @scala.inline
    def setCommonCriteriaModeInfo(value: CommonCriteriaModeInfo): Self = StObject.set(x, "commonCriteriaModeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonCriteriaModeInfoUndefined: Self = StObject.set(x, "commonCriteriaModeInfo", js.undefined)
    
    @scala.inline
    def setDeviceSettings(value: DeviceSettings): Self = StObject.set(x, "deviceSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceSettingsUndefined: Self = StObject.set(x, "deviceSettings", js.undefined)
    
    @scala.inline
    def setDisabledReason(value: UserFacingMessage): Self = StObject.set(x, "disabledReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledReasonUndefined: Self = StObject.set(x, "disabledReason", js.undefined)
    
    @scala.inline
    def setDisplays(value: js.Array[Display]): Self = StObject.set(x, "displays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplaysUndefined: Self = StObject.set(x, "displays", js.undefined)
    
    @scala.inline
    def setDisplaysVarargs(value: Display*): Self = StObject.set(x, "displays", js.Array(value :_*))
    
    @scala.inline
    def setEnrollmentTime(value: String): Self = StObject.set(x, "enrollmentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnrollmentTimeUndefined: Self = StObject.set(x, "enrollmentTime", js.undefined)
    
    @scala.inline
    def setEnrollmentTokenData(value: String): Self = StObject.set(x, "enrollmentTokenData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnrollmentTokenDataUndefined: Self = StObject.set(x, "enrollmentTokenData", js.undefined)
    
    @scala.inline
    def setEnrollmentTokenName(value: String): Self = StObject.set(x, "enrollmentTokenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnrollmentTokenNameUndefined: Self = StObject.set(x, "enrollmentTokenName", js.undefined)
    
    @scala.inline
    def setHardwareInfo(value: HardwareInfo): Self = StObject.set(x, "hardwareInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHardwareInfoUndefined: Self = StObject.set(x, "hardwareInfo", js.undefined)
    
    @scala.inline
    def setHardwareStatusSamples(value: js.Array[HardwareStatus]): Self = StObject.set(x, "hardwareStatusSamples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHardwareStatusSamplesUndefined: Self = StObject.set(x, "hardwareStatusSamples", js.undefined)
    
    @scala.inline
    def setHardwareStatusSamplesVarargs(value: HardwareStatus*): Self = StObject.set(x, "hardwareStatusSamples", js.Array(value :_*))
    
    @scala.inline
    def setLastPolicyComplianceReportTime(value: String): Self = StObject.set(x, "lastPolicyComplianceReportTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastPolicyComplianceReportTimeUndefined: Self = StObject.set(x, "lastPolicyComplianceReportTime", js.undefined)
    
    @scala.inline
    def setLastPolicySyncTime(value: String): Self = StObject.set(x, "lastPolicySyncTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastPolicySyncTimeUndefined: Self = StObject.set(x, "lastPolicySyncTime", js.undefined)
    
    @scala.inline
    def setLastStatusReportTime(value: String): Self = StObject.set(x, "lastStatusReportTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastStatusReportTimeUndefined: Self = StObject.set(x, "lastStatusReportTime", js.undefined)
    
    @scala.inline
    def setManagementMode(value: String): Self = StObject.set(x, "managementMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagementModeUndefined: Self = StObject.set(x, "managementMode", js.undefined)
    
    @scala.inline
    def setMemoryEvents(value: js.Array[MemoryEvent]): Self = StObject.set(x, "memoryEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryEventsUndefined: Self = StObject.set(x, "memoryEvents", js.undefined)
    
    @scala.inline
    def setMemoryEventsVarargs(value: MemoryEvent*): Self = StObject.set(x, "memoryEvents", js.Array(value :_*))
    
    @scala.inline
    def setMemoryInfo(value: MemoryInfo): Self = StObject.set(x, "memoryInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryInfoUndefined: Self = StObject.set(x, "memoryInfo", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNetworkInfo(value: NetworkInfo): Self = StObject.set(x, "networkInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInfoUndefined: Self = StObject.set(x, "networkInfo", js.undefined)
    
    @scala.inline
    def setNonComplianceDetails(value: js.Array[NonComplianceDetail]): Self = StObject.set(x, "nonComplianceDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonComplianceDetailsUndefined: Self = StObject.set(x, "nonComplianceDetails", js.undefined)
    
    @scala.inline
    def setNonComplianceDetailsVarargs(value: NonComplianceDetail*): Self = StObject.set(x, "nonComplianceDetails", js.Array(value :_*))
    
    @scala.inline
    def setOwnership(value: String): Self = StObject.set(x, "ownership", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnershipUndefined: Self = StObject.set(x, "ownership", js.undefined)
    
    @scala.inline
    def setPolicyCompliant(value: Boolean): Self = StObject.set(x, "policyCompliant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyCompliantUndefined: Self = StObject.set(x, "policyCompliant", js.undefined)
    
    @scala.inline
    def setPolicyName(value: String): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyNameUndefined: Self = StObject.set(x, "policyName", js.undefined)
    
    @scala.inline
    def setPowerManagementEvents(value: js.Array[PowerManagementEvent]): Self = StObject.set(x, "powerManagementEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerManagementEventsUndefined: Self = StObject.set(x, "powerManagementEvents", js.undefined)
    
    @scala.inline
    def setPowerManagementEventsVarargs(value: PowerManagementEvent*): Self = StObject.set(x, "powerManagementEvents", js.Array(value :_*))
    
    @scala.inline
    def setPreviousDeviceNames(value: js.Array[String]): Self = StObject.set(x, "previousDeviceNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousDeviceNamesUndefined: Self = StObject.set(x, "previousDeviceNames", js.undefined)
    
    @scala.inline
    def setPreviousDeviceNamesVarargs(value: String*): Self = StObject.set(x, "previousDeviceNames", js.Array(value :_*))
    
    @scala.inline
    def setSecurityPosture(value: SecurityPosture): Self = StObject.set(x, "securityPosture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityPostureUndefined: Self = StObject.set(x, "securityPosture", js.undefined)
    
    @scala.inline
    def setSoftwareInfo(value: SoftwareInfo): Self = StObject.set(x, "softwareInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftwareInfoUndefined: Self = StObject.set(x, "softwareInfo", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setSystemProperties(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientAndroidmanagement.maximMazurokGapiClientAndroidmanagementStrings.Device with TopLevel[js.Any]
    ): Self = StObject.set(x, "systemProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemPropertiesUndefined: Self = StObject.set(x, "systemProperties", js.undefined)
    
    @scala.inline
    def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
