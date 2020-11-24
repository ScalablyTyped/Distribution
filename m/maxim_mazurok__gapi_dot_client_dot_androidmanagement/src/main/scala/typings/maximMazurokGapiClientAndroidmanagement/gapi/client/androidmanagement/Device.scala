package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Device extends js.Object {
  
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
  implicit class DeviceOps[Self <: Device] (val x: Self) extends AnyVal {
    
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
    def setApiLevel(value: Double): Self = this.set("apiLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiLevel: Self = this.set("apiLevel", js.undefined)
    
    @scala.inline
    def setApplicationReportsVarargs(value: ApplicationReport*): Self = this.set("applicationReports", js.Array(value :_*))
    
    @scala.inline
    def setApplicationReports(value: js.Array[ApplicationReport]): Self = this.set("applicationReports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationReports: Self = this.set("applicationReports", js.undefined)
    
    @scala.inline
    def setAppliedPolicyName(value: String): Self = this.set("appliedPolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppliedPolicyName: Self = this.set("appliedPolicyName", js.undefined)
    
    @scala.inline
    def setAppliedPolicyVersion(value: String): Self = this.set("appliedPolicyVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppliedPolicyVersion: Self = this.set("appliedPolicyVersion", js.undefined)
    
    @scala.inline
    def setAppliedState(value: String): Self = this.set("appliedState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppliedState: Self = this.set("appliedState", js.undefined)
    
    @scala.inline
    def setCommonCriteriaModeInfo(value: CommonCriteriaModeInfo): Self = this.set("commonCriteriaModeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonCriteriaModeInfo: Self = this.set("commonCriteriaModeInfo", js.undefined)
    
    @scala.inline
    def setDeviceSettings(value: DeviceSettings): Self = this.set("deviceSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceSettings: Self = this.set("deviceSettings", js.undefined)
    
    @scala.inline
    def setDisabledReason(value: UserFacingMessage): Self = this.set("disabledReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledReason: Self = this.set("disabledReason", js.undefined)
    
    @scala.inline
    def setDisplaysVarargs(value: Display*): Self = this.set("displays", js.Array(value :_*))
    
    @scala.inline
    def setDisplays(value: js.Array[Display]): Self = this.set("displays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplays: Self = this.set("displays", js.undefined)
    
    @scala.inline
    def setEnrollmentTime(value: String): Self = this.set("enrollmentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnrollmentTime: Self = this.set("enrollmentTime", js.undefined)
    
    @scala.inline
    def setEnrollmentTokenData(value: String): Self = this.set("enrollmentTokenData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnrollmentTokenData: Self = this.set("enrollmentTokenData", js.undefined)
    
    @scala.inline
    def setEnrollmentTokenName(value: String): Self = this.set("enrollmentTokenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnrollmentTokenName: Self = this.set("enrollmentTokenName", js.undefined)
    
    @scala.inline
    def setHardwareInfo(value: HardwareInfo): Self = this.set("hardwareInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHardwareInfo: Self = this.set("hardwareInfo", js.undefined)
    
    @scala.inline
    def setHardwareStatusSamplesVarargs(value: HardwareStatus*): Self = this.set("hardwareStatusSamples", js.Array(value :_*))
    
    @scala.inline
    def setHardwareStatusSamples(value: js.Array[HardwareStatus]): Self = this.set("hardwareStatusSamples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHardwareStatusSamples: Self = this.set("hardwareStatusSamples", js.undefined)
    
    @scala.inline
    def setLastPolicyComplianceReportTime(value: String): Self = this.set("lastPolicyComplianceReportTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastPolicyComplianceReportTime: Self = this.set("lastPolicyComplianceReportTime", js.undefined)
    
    @scala.inline
    def setLastPolicySyncTime(value: String): Self = this.set("lastPolicySyncTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastPolicySyncTime: Self = this.set("lastPolicySyncTime", js.undefined)
    
    @scala.inline
    def setLastStatusReportTime(value: String): Self = this.set("lastStatusReportTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastStatusReportTime: Self = this.set("lastStatusReportTime", js.undefined)
    
    @scala.inline
    def setManagementMode(value: String): Self = this.set("managementMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagementMode: Self = this.set("managementMode", js.undefined)
    
    @scala.inline
    def setMemoryEventsVarargs(value: MemoryEvent*): Self = this.set("memoryEvents", js.Array(value :_*))
    
    @scala.inline
    def setMemoryEvents(value: js.Array[MemoryEvent]): Self = this.set("memoryEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemoryEvents: Self = this.set("memoryEvents", js.undefined)
    
    @scala.inline
    def setMemoryInfo(value: MemoryInfo): Self = this.set("memoryInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemoryInfo: Self = this.set("memoryInfo", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNetworkInfo(value: NetworkInfo): Self = this.set("networkInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkInfo: Self = this.set("networkInfo", js.undefined)
    
    @scala.inline
    def setNonComplianceDetailsVarargs(value: NonComplianceDetail*): Self = this.set("nonComplianceDetails", js.Array(value :_*))
    
    @scala.inline
    def setNonComplianceDetails(value: js.Array[NonComplianceDetail]): Self = this.set("nonComplianceDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonComplianceDetails: Self = this.set("nonComplianceDetails", js.undefined)
    
    @scala.inline
    def setOwnership(value: String): Self = this.set("ownership", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnership: Self = this.set("ownership", js.undefined)
    
    @scala.inline
    def setPolicyCompliant(value: Boolean): Self = this.set("policyCompliant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyCompliant: Self = this.set("policyCompliant", js.undefined)
    
    @scala.inline
    def setPolicyName(value: String): Self = this.set("policyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyName: Self = this.set("policyName", js.undefined)
    
    @scala.inline
    def setPowerManagementEventsVarargs(value: PowerManagementEvent*): Self = this.set("powerManagementEvents", js.Array(value :_*))
    
    @scala.inline
    def setPowerManagementEvents(value: js.Array[PowerManagementEvent]): Self = this.set("powerManagementEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePowerManagementEvents: Self = this.set("powerManagementEvents", js.undefined)
    
    @scala.inline
    def setPreviousDeviceNamesVarargs(value: String*): Self = this.set("previousDeviceNames", js.Array(value :_*))
    
    @scala.inline
    def setPreviousDeviceNames(value: js.Array[String]): Self = this.set("previousDeviceNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousDeviceNames: Self = this.set("previousDeviceNames", js.undefined)
    
    @scala.inline
    def setSecurityPosture(value: SecurityPosture): Self = this.set("securityPosture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityPosture: Self = this.set("securityPosture", js.undefined)
    
    @scala.inline
    def setSoftwareInfo(value: SoftwareInfo): Self = this.set("softwareInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSoftwareInfo: Self = this.set("softwareInfo", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setSystemProperties(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientAndroidmanagement.maximMazurokGapiClientAndroidmanagementStrings.Device with TopLevel[js.Any]
    ): Self = this.set("systemProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemProperties: Self = this.set("systemProperties", js.undefined)
    
    @scala.inline
    def setUser(value: User): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
    
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserName: Self = this.set("userName", js.undefined)
  }
}
