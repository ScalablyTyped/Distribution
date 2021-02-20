package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatusReportingSettings extends StObject {
  
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
  implicit class StatusReportingSettingsMutableBuilder[Self <: StatusReportingSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationReportingSettings(value: ApplicationReportingSettings): Self = StObject.set(x, "applicationReportingSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationReportingSettingsUndefined: Self = StObject.set(x, "applicationReportingSettings", js.undefined)
    
    @scala.inline
    def setApplicationReportsEnabled(value: Boolean): Self = StObject.set(x, "applicationReportsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationReportsEnabledUndefined: Self = StObject.set(x, "applicationReportsEnabled", js.undefined)
    
    @scala.inline
    def setCommonCriteriaModeEnabled(value: Boolean): Self = StObject.set(x, "commonCriteriaModeEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonCriteriaModeEnabledUndefined: Self = StObject.set(x, "commonCriteriaModeEnabled", js.undefined)
    
    @scala.inline
    def setDeviceSettingsEnabled(value: Boolean): Self = StObject.set(x, "deviceSettingsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceSettingsEnabledUndefined: Self = StObject.set(x, "deviceSettingsEnabled", js.undefined)
    
    @scala.inline
    def setDisplayInfoEnabled(value: Boolean): Self = StObject.set(x, "displayInfoEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayInfoEnabledUndefined: Self = StObject.set(x, "displayInfoEnabled", js.undefined)
    
    @scala.inline
    def setHardwareStatusEnabled(value: Boolean): Self = StObject.set(x, "hardwareStatusEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHardwareStatusEnabledUndefined: Self = StObject.set(x, "hardwareStatusEnabled", js.undefined)
    
    @scala.inline
    def setMemoryInfoEnabled(value: Boolean): Self = StObject.set(x, "memoryInfoEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryInfoEnabledUndefined: Self = StObject.set(x, "memoryInfoEnabled", js.undefined)
    
    @scala.inline
    def setNetworkInfoEnabled(value: Boolean): Self = StObject.set(x, "networkInfoEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInfoEnabledUndefined: Self = StObject.set(x, "networkInfoEnabled", js.undefined)
    
    @scala.inline
    def setPowerManagementEventsEnabled(value: Boolean): Self = StObject.set(x, "powerManagementEventsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerManagementEventsEnabledUndefined: Self = StObject.set(x, "powerManagementEventsEnabled", js.undefined)
    
    @scala.inline
    def setSoftwareInfoEnabled(value: Boolean): Self = StObject.set(x, "softwareInfoEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftwareInfoEnabledUndefined: Self = StObject.set(x, "softwareInfoEnabled", js.undefined)
    
    @scala.inline
    def setSystemPropertiesEnabled(value: Boolean): Self = StObject.set(x, "systemPropertiesEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemPropertiesEnabledUndefined: Self = StObject.set(x, "systemPropertiesEnabled", js.undefined)
  }
}
