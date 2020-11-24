package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatusReportingSettings extends js.Object {
  
  /** Application reporting settings. Only applicable if application_reports_enabled is true. */
  var applicationReportingSettings: js.UndefOr[ApplicationReportingSettings] = js.native
  
  /** Whether app reports are enabled. */
  var applicationReportsEnabled: js.UndefOr[Boolean] = js.native
  
  /** Whether Common Criteria Mode reporting is enabled. */
  var commonCriteriaModeEnabled: js.UndefOr[Boolean] = js.native
  
  /** Whether device settings reporting is enabled. */
  var deviceSettingsEnabled: js.UndefOr[Boolean] = js.native
  
  /** Whether displays reporting is enabled. Report data is not available for personally owned devices with work profiles. */
  var displayInfoEnabled: js.UndefOr[Boolean] = js.native
  
  /** Whether hardware status reporting is enabled. Report data is not available for personally owned devices with work profiles. */
  var hardwareStatusEnabled: js.UndefOr[Boolean] = js.native
  
  /** Whether memory reporting is enabled. */
  var memoryInfoEnabled: js.UndefOr[Boolean] = js.native
  
  /** Whether network info reporting is enabled. */
  var networkInfoEnabled: js.UndefOr[Boolean] = js.native
  
  /** Whether power management event reporting is enabled. Report data is not available for personally owned devices with work profiles. */
  var powerManagementEventsEnabled: js.UndefOr[Boolean] = js.native
  
  /** Whether software info reporting is enabled. */
  var softwareInfoEnabled: js.UndefOr[Boolean] = js.native
  
  /** Whether system properties reporting is enabled. */
  var systemPropertiesEnabled: js.UndefOr[Boolean] = js.native
}
object StatusReportingSettings {
  
  @scala.inline
  def apply(): StatusReportingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusReportingSettings]
  }
  
  @scala.inline
  implicit class StatusReportingSettingsOps[Self <: StatusReportingSettings] (val x: Self) extends AnyVal {
    
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
    def setApplicationReportingSettings(value: ApplicationReportingSettings): Self = this.set("applicationReportingSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationReportingSettings: Self = this.set("applicationReportingSettings", js.undefined)
    
    @scala.inline
    def setApplicationReportsEnabled(value: Boolean): Self = this.set("applicationReportsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationReportsEnabled: Self = this.set("applicationReportsEnabled", js.undefined)
    
    @scala.inline
    def setCommonCriteriaModeEnabled(value: Boolean): Self = this.set("commonCriteriaModeEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonCriteriaModeEnabled: Self = this.set("commonCriteriaModeEnabled", js.undefined)
    
    @scala.inline
    def setDeviceSettingsEnabled(value: Boolean): Self = this.set("deviceSettingsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceSettingsEnabled: Self = this.set("deviceSettingsEnabled", js.undefined)
    
    @scala.inline
    def setDisplayInfoEnabled(value: Boolean): Self = this.set("displayInfoEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayInfoEnabled: Self = this.set("displayInfoEnabled", js.undefined)
    
    @scala.inline
    def setHardwareStatusEnabled(value: Boolean): Self = this.set("hardwareStatusEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHardwareStatusEnabled: Self = this.set("hardwareStatusEnabled", js.undefined)
    
    @scala.inline
    def setMemoryInfoEnabled(value: Boolean): Self = this.set("memoryInfoEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemoryInfoEnabled: Self = this.set("memoryInfoEnabled", js.undefined)
    
    @scala.inline
    def setNetworkInfoEnabled(value: Boolean): Self = this.set("networkInfoEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkInfoEnabled: Self = this.set("networkInfoEnabled", js.undefined)
    
    @scala.inline
    def setPowerManagementEventsEnabled(value: Boolean): Self = this.set("powerManagementEventsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePowerManagementEventsEnabled: Self = this.set("powerManagementEventsEnabled", js.undefined)
    
    @scala.inline
    def setSoftwareInfoEnabled(value: Boolean): Self = this.set("softwareInfoEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSoftwareInfoEnabled: Self = this.set("softwareInfoEnabled", js.undefined)
    
    @scala.inline
    def setSystemPropertiesEnabled(value: Boolean): Self = this.set("systemPropertiesEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemPropertiesEnabled: Self = this.set("systemPropertiesEnabled", js.undefined)
  }
}
