package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusReportingSettings extends StObject {
  
  /** Application reporting settings. Only applicable if application_reports_enabled is true. */
  var applicationReportingSettings: js.UndefOr[ApplicationReportingSettings] = js.undefined
  
  /** Whether app reports are enabled. */
  var applicationReportsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether Common Criteria Mode reporting is enabled. */
  var commonCriteriaModeEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether device settings reporting is enabled. */
  var deviceSettingsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether displays reporting is enabled. Report data is not available for personally owned devices with work profiles. */
  var displayInfoEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether hardware status reporting is enabled. Report data is not available for personally owned devices with work profiles. */
  var hardwareStatusEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether memory reporting is enabled. */
  var memoryInfoEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether network info reporting is enabled. */
  var networkInfoEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether power management event reporting is enabled. Report data is not available for personally owned devices with work profiles. */
  var powerManagementEventsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether software info reporting is enabled. */
  var softwareInfoEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether system properties reporting is enabled. */
  var systemPropertiesEnabled: js.UndefOr[Boolean] = js.undefined
}
object StatusReportingSettings {
  
  inline def apply(): StatusReportingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusReportingSettings]
  }
  
  extension [Self <: StatusReportingSettings](x: Self) {
    
    inline def setApplicationReportingSettings(value: ApplicationReportingSettings): Self = StObject.set(x, "applicationReportingSettings", value.asInstanceOf[js.Any])
    
    inline def setApplicationReportingSettingsUndefined: Self = StObject.set(x, "applicationReportingSettings", js.undefined)
    
    inline def setApplicationReportsEnabled(value: Boolean): Self = StObject.set(x, "applicationReportsEnabled", value.asInstanceOf[js.Any])
    
    inline def setApplicationReportsEnabledUndefined: Self = StObject.set(x, "applicationReportsEnabled", js.undefined)
    
    inline def setCommonCriteriaModeEnabled(value: Boolean): Self = StObject.set(x, "commonCriteriaModeEnabled", value.asInstanceOf[js.Any])
    
    inline def setCommonCriteriaModeEnabledUndefined: Self = StObject.set(x, "commonCriteriaModeEnabled", js.undefined)
    
    inline def setDeviceSettingsEnabled(value: Boolean): Self = StObject.set(x, "deviceSettingsEnabled", value.asInstanceOf[js.Any])
    
    inline def setDeviceSettingsEnabledUndefined: Self = StObject.set(x, "deviceSettingsEnabled", js.undefined)
    
    inline def setDisplayInfoEnabled(value: Boolean): Self = StObject.set(x, "displayInfoEnabled", value.asInstanceOf[js.Any])
    
    inline def setDisplayInfoEnabledUndefined: Self = StObject.set(x, "displayInfoEnabled", js.undefined)
    
    inline def setHardwareStatusEnabled(value: Boolean): Self = StObject.set(x, "hardwareStatusEnabled", value.asInstanceOf[js.Any])
    
    inline def setHardwareStatusEnabledUndefined: Self = StObject.set(x, "hardwareStatusEnabled", js.undefined)
    
    inline def setMemoryInfoEnabled(value: Boolean): Self = StObject.set(x, "memoryInfoEnabled", value.asInstanceOf[js.Any])
    
    inline def setMemoryInfoEnabledUndefined: Self = StObject.set(x, "memoryInfoEnabled", js.undefined)
    
    inline def setNetworkInfoEnabled(value: Boolean): Self = StObject.set(x, "networkInfoEnabled", value.asInstanceOf[js.Any])
    
    inline def setNetworkInfoEnabledUndefined: Self = StObject.set(x, "networkInfoEnabled", js.undefined)
    
    inline def setPowerManagementEventsEnabled(value: Boolean): Self = StObject.set(x, "powerManagementEventsEnabled", value.asInstanceOf[js.Any])
    
    inline def setPowerManagementEventsEnabledUndefined: Self = StObject.set(x, "powerManagementEventsEnabled", js.undefined)
    
    inline def setSoftwareInfoEnabled(value: Boolean): Self = StObject.set(x, "softwareInfoEnabled", value.asInstanceOf[js.Any])
    
    inline def setSoftwareInfoEnabledUndefined: Self = StObject.set(x, "softwareInfoEnabled", js.undefined)
    
    inline def setSystemPropertiesEnabled(value: Boolean): Self = StObject.set(x, "systemPropertiesEnabled", value.asInstanceOf[js.Any])
    
    inline def setSystemPropertiesEnabledUndefined: Self = StObject.set(x, "systemPropertiesEnabled", js.undefined)
  }
}
