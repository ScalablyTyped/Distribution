package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Policy extends StObject {
  
  /** Account types that can't be managed by the user. */
  var accountTypesWithManagementDisabled: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Whether adding new users and profiles is disabled. */
  var addUserDisabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether adjusting the master volume is disabled. Also mutes the device. */
  var adjustVolumeDisabled: js.UndefOr[Boolean] = js.undefined
  
  /** Security policies set to secure values by default. To maintain the security posture of a device, we don't recommend overriding any of the default values. */
  var advancedSecurityOverrides: js.UndefOr[AdvancedSecurityOverrides] = js.undefined
  
  /** Configuration for an always-on VPN connection. Use with vpn_config_disabled to prevent modification of this setting. */
  var alwaysOnVpnPackage: js.UndefOr[AlwaysOnVpnPackage] = js.undefined
  
  /**
    * The app tracks for Android Device Policy the device can access. The device receives the latest version among all accessible tracks. If no tracks are specified, then the device only
    * uses the production track.
    */
  var androidDevicePolicyTracks: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Deprecated. Use autoUpdateMode instead.When autoUpdateMode is set to AUTO_UPDATE_POSTPONED or AUTO_UPDATE_HIGH_PRIORITY, this field has no effect.The app auto update policy, which
    * controls when automatic app updates can be applied.
    */
  var appAutoUpdatePolicy: js.UndefOr[String] = js.undefined
  
  /** Policy applied to apps. */
  var applications: js.UndefOr[js.Array[ApplicationPolicy]] = js.undefined
  
  /** Whether auto date, time, and time zone are enabled on a company-owned device. If this is set, then autoTimeRequired is ignored. */
  var autoDateAndTimeZone: js.UndefOr[String] = js.undefined
  
  /** Whether auto time is required, which prevents the user from manually setting the date and time. If autoDateAndTimeZone is set, this field is ignored. */
  var autoTimeRequired: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether applications other than the ones configured in applications are blocked from being installed. When set, applications that were installed under a previous policy but no
    * longer appear in the policy are automatically uninstalled.
    */
  var blockApplicationsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether configuring bluetooth is disabled. */
  var bluetoothConfigDisabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether bluetooth contact sharing is disabled. */
  var bluetoothContactSharingDisabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether bluetooth is disabled. Prefer this setting over bluetooth_config_disabled because bluetooth_config_disabled can be bypassed by the user. */
  var bluetoothDisabled: js.UndefOr[Boolean] = js.undefined
  
  /** Controls the use of the camera and whether the user has access to the camera access toggle. */
  var cameraAccess: js.UndefOr[String] = js.undefined
  
  /**
    * If camera_access is set to any value other than CAMERA_ACCESS_UNSPECIFIED, this has no effect. Otherwise this field controls whether cameras are disabled: If true, all cameras are
    * disabled, otherwise they are available. For fully managed devices this field applies for all apps on the device. For work profiles, this field applies only to apps in the work
    * profile, and the camera access of apps outside the work profile is unaffected.
    */
  var cameraDisabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether configuring cell broadcast is disabled. */
  var cellBroadcastsConfigDisabled: js.UndefOr[Boolean] = js.undefined
  
  /** Rules for determining apps' access to private keys. See ChoosePrivateKeyRule for details. */
  var choosePrivateKeyRules: js.UndefOr[js.Array[ChoosePrivateKeyRule]] = js.undefined
  
  /**
    * Rules declaring which mitigating actions to take when a device is not compliant with its policy. When the conditions for multiple rules are satisfied, all of the mitigating actions
    * for the rules are taken. There is a maximum limit of 100 rules. Use policy enforcement rules instead.
    */
  var complianceRules: js.UndefOr[js.Array[ComplianceRule]] = js.undefined
  
  /** Whether creating windows besides app windows is disabled. */
  var createWindowsDisabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether configuring user credentials is disabled. */
  var credentialsConfigDisabled: js.UndefOr[Boolean] = js.undefined
  
  /** Cross-profile policies applied on the device. */
  var crossProfilePolicies: js.UndefOr[CrossProfilePolicies] = js.undefined
  
  /** Whether roaming data services are disabled. */
  var dataRoamingDisabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the user is allowed to enable debugging features. */
  var debuggingFeaturesAllowed: js.UndefOr[Boolean] = js.undefined
  
  /** The default permission policy for runtime permission requests. */
  var defaultPermissionPolicy: js.UndefOr[String] = js.undefined
  
  /** The device owner information to be shown on the lock screen. */
  var deviceOwnerLockScreenInfo: js.UndefOr[UserFacingMessage] = js.undefined
  
  /** Whether encryption is enabled */
  var encryptionPolicy: js.UndefOr[String] = js.undefined
  
  /** Whether app verification is force-enabled. */
  var ensureVerifyAppsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether factory resetting from settings is disabled. */
  var factoryResetDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Email addresses of device administrators for factory reset protection. When the device is factory reset, it will require one of these admins to log in with the Google account email
    * and password to unlock the device. If no admins are specified, the device won't provide factory reset protection.
    */
  var frpAdminEmails: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Whether the user is allowed to have fun. Controls whether the Easter egg game in Settings is disabled. */
  var funDisabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether user installation of apps is disabled. */
  var installAppsDisabled: js.UndefOr[Boolean] = js.undefined
  
  /** This field has no effect. */
  var installUnknownSourcesAllowed: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the keyguard is disabled. */
  var keyguardDisabled: js.UndefOr[Boolean] = js.undefined
  
  /** Disabled keyguard customizations, such as widgets. */
  var keyguardDisabledFeatures: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Whether the kiosk custom launcher is enabled. This replaces the home screen with a launcher that locks down the device to the apps installed via the applications setting. Apps
    * appear on a single page in alphabetical order. Use kioskCustomization to further configure the kiosk device behavior.
    */
  var kioskCustomLauncherEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Settings controlling the behavior of a device in kiosk mode. To enable kiosk mode, set kioskCustomLauncherEnabled to true or specify an app in the policy with installType KIOSK. */
  var kioskCustomization: js.UndefOr[KioskCustomization] = js.undefined
  
  /** The degree of location detection enabled. */
  var locationMode: js.UndefOr[String] = js.undefined
  
  /** A message displayed to the user in the device administators settings screen. */
  var longSupportMessage: js.UndefOr[UserFacingMessage] = js.undefined
  
  /** Maximum time in milliseconds for user activity until the device locks. A value of 0 means there is no restriction. */
  var maximumTimeToLock: js.UndefOr[String] = js.undefined
  
  /** Controls the use of the microphone and whether the user has access to the microphone access toggle. This applies only on fully managed devices. */
  var microphoneAccess: js.UndefOr[String] = js.undefined
  
  /** The minimum allowed Android API level. */
  var minimumApiLevel: js.UndefOr[Double] = js.undefined
  
  /** Whether configuring mobile networks is disabled. */
  var mobileNetworksConfigDisabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether adding or removing accounts is disabled. */
  var modifyAccountsDisabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the user mounting physical external media is disabled. */
  var mountPhysicalMediaDisabled: js.UndefOr[Boolean] = js.undefined
  
  /** The name of the policy in the form enterprises/{enterpriseId}/policies/{policyId}. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the network escape hatch is enabled. If a network connection can't be made at boot time, the escape hatch prompts the user to temporarily connect to a network in order to
    * refresh the device policy. After applying policy, the temporary network will be forgotten and the device will continue booting. This prevents being unable to connect to a network if
    * there is no suitable network in the last policy and the device boots into an app in lock task mode, or the user is otherwise unable to reach device settings.Note: Setting
    * wifiConfigDisabled to true will override this setting under specific circumstances. Please see wifiConfigDisabled for further details.
    */
  var networkEscapeHatchEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether resetting network settings is disabled. */
  var networkResetDisabled: js.UndefOr[Boolean] = js.undefined
  
  /** This feature is not generally available. */
  var oncCertificateProviders: js.UndefOr[js.Array[OncCertificateProvider]] = js.undefined
  
  /** Network configuration for the device. See configure networks for more information. */
  var openNetworkConfiguration: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
  
  /** Whether using NFC to beam data from apps is disabled. */
  var outgoingBeamDisabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether outgoing calls are disabled. */
  var outgoingCallsDisabled: js.UndefOr[Boolean] = js.undefined
  
  /** Password requirement policies. Different policies can be set for work profile or fully managed devices by setting the password_scope field in the policy. */
  var passwordPolicies: js.UndefOr[js.Array[PasswordRequirements]] = js.undefined
  
  /**
    * Password requirements. The field password_requirements.require_password_unlock must not be set. DEPRECATED - Use passwordPolicies.Note:Complexity-based values of PasswordQuality,
    * that is, COMPLEXITY_LOW, COMPLEXITY_MEDIUM, and COMPLEXITY_HIGH, cannot be used here. unified_lock_settings cannot be used here.
    */
  var passwordRequirements: js.UndefOr[PasswordRequirements] = js.undefined
  
  /** Explicit permission or group grants or denials for all apps. These values override the default_permission_policy. */
  var permissionGrants: js.UndefOr[js.Array[PermissionGrant]] = js.undefined
  
  /**
    * Specifies permitted accessibility services. If the field is not set, any accessibility service can be used. If the field is set, only the accessibility services in this list and the
    * system's built-in accessibility service can be used. In particular, if the field is set to empty, only the system's built-in accessibility servicess can be used. This can be set on
    * fully managed devices and on work profiles. When applied to a work profile, this affects both the personal profile and the work profile.
    */
  var permittedAccessibilityServices: js.UndefOr[PackageNameList] = js.undefined
  
  /** If present, only the input methods provided by packages in this list are permitted. If this field is present, but the list is empty, then only system input methods are permitted. */
  var permittedInputMethods: js.UndefOr[PackageNameList] = js.undefined
  
  /** Default intent handler activities. */
  var persistentPreferredActivities: js.UndefOr[js.Array[PersistentPreferredActivity]] = js.undefined
  
  /** Policies managing personal usage on a company-owned device. */
  var personalUsagePolicies: js.UndefOr[PersonalUsagePolicies] = js.undefined
  
  /** This mode controls which apps are available to the user in the Play Store and the behavior on the device when apps are removed from the policy. */
  var playStoreMode: js.UndefOr[String] = js.undefined
  
  /** Rules that define the behavior when a particular policy can not be applied on device */
  var policyEnforcementRules: js.UndefOr[js.Array[PolicyEnforcementRule]] = js.undefined
  
  /**
    * Controls whether preferential network service is enabled on the work profile. For example, an organization may have an agreement with a carrier that all of the work data from its
    * employees' devices will be sent via a network service dedicated for enterprise use. An example of a supported preferential network service is the enterprise slice on 5G networks.
    * This has no effect on fully managed devices.
    */
  var preferentialNetworkService: js.UndefOr[String] = js.undefined
  
  /**
    * Allows showing UI on a device for a user to choose a private key alias if there are no matching rules in ChoosePrivateKeyRules. For devices below Android P, setting this may leave
    * enterprise keys vulnerable.
    */
  var privateKeySelectionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The network-independent global HTTP proxy. Typically proxies should be configured per-network in open_network_configuration. However for unusual configurations like general internal
    * filtering a global HTTP proxy may be useful. If the proxy is not accessible, network access may break. The global proxy is only a recommendation and some apps may ignore it.
    */
  var recommendedGlobalProxy: js.UndefOr[ProxyInfo] = js.undefined
  
  /** Whether removing other users is disabled. */
  var removeUserDisabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether rebooting the device into safe boot is disabled. */
  var safeBootDisabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether screen capture is disabled. */
  var screenCaptureDisabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether changing the user icon is disabled. */
  var setUserIconDisabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether changing the wallpaper is disabled. */
  var setWallpaperDisabled: js.UndefOr[Boolean] = js.undefined
  
  /** Action to take during the setup process. At most one action may be specified. */
  var setupActions: js.UndefOr[js.Array[SetupAction]] = js.undefined
  
  /** Whether location sharing is disabled. */
  var shareLocationDisabled: js.UndefOr[Boolean] = js.undefined
  
  /** A message displayed to the user in the settings screen wherever functionality has been disabled by the admin. If the message is longer than 200 characters it may be truncated. */
  var shortSupportMessage: js.UndefOr[UserFacingMessage] = js.undefined
  
  /** Flag to skip hints on the first use. Enterprise admin can enable the system recommendation for apps to skip their user tutorial and other introductory hints on first start-up. */
  var skipFirstUseHintsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether sending and receiving SMS messages is disabled. */
  var smsDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the status bar is disabled. This disables notifications, quick settings, and other screen overlays that allow escape from full-screen mode. DEPRECATED. To disable the status
    * bar on a kiosk device, use InstallType KIOSK or kioskCustomLauncherEnabled.
    */
  var statusBarDisabled: js.UndefOr[Boolean] = js.undefined
  
  /** Status reporting settings */
  var statusReportingSettings: js.UndefOr[StatusReportingSettings] = js.undefined
  
  /**
    * The battery plugged in modes for which the device stays on. When using this setting, it is recommended to clear maximum_time_to_lock so that the device doesn't lock itself while it
    * stays on.
    */
  var stayOnPluggedModes: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The system update policy, which controls how OS updates are applied. If the update type is WINDOWED, the update window will automatically apply to Play app updates as well. */
  var systemUpdate: js.UndefOr[SystemUpdate] = js.undefined
  
  /** Whether configuring tethering and portable hotspots is disabled. */
  var tetheringConfigDisabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether user uninstallation of applications is disabled. */
  var uninstallAppsDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If microphone_access is set to any value other than MICROPHONE_ACCESS_UNSPECIFIED, this has no effect. Otherwise this field controls whether microphones are disabled: If true, all
    * microphones are disabled, otherwise they are available. This is available only on fully managed devices.
    */
  var unmuteMicrophoneDisabled: js.UndefOr[Boolean] = js.undefined
  
  /** Configuration of device activity logging. */
  var usageLog: js.UndefOr[UsageLog] = js.undefined
  
  /** Whether transferring files over USB is disabled. */
  var usbFileTransferDisabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether USB storage is enabled. Deprecated. */
  var usbMassStorageEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** The version of the policy. This is a read-only field. The version is incremented each time the policy is updated. */
  var version: js.UndefOr[String] = js.undefined
  
  /** Whether configuring VPN is disabled. */
  var vpnConfigDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether configuring Wi-Fi access points is disabled.Note: If a network connection can't be made at boot time and configuring Wi-Fi is disabled then network escape hatch will be
    * shown in order to refresh the device policy (see networkEscapeHatchEnabled).
    */
  var wifiConfigDisabled: js.UndefOr[Boolean] = js.undefined
  
  /** DEPRECATED - Use wifi_config_disabled. */
  var wifiConfigsLockdownEnabled: js.UndefOr[Boolean] = js.undefined
}
object Policy {
  
  inline def apply(): Policy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Policy]
  }
  
  extension [Self <: Policy](x: Self) {
    
    inline def setAccountTypesWithManagementDisabled(value: js.Array[String]): Self = StObject.set(x, "accountTypesWithManagementDisabled", value.asInstanceOf[js.Any])
    
    inline def setAccountTypesWithManagementDisabledUndefined: Self = StObject.set(x, "accountTypesWithManagementDisabled", js.undefined)
    
    inline def setAccountTypesWithManagementDisabledVarargs(value: String*): Self = StObject.set(x, "accountTypesWithManagementDisabled", js.Array(value*))
    
    inline def setAddUserDisabled(value: Boolean): Self = StObject.set(x, "addUserDisabled", value.asInstanceOf[js.Any])
    
    inline def setAddUserDisabledUndefined: Self = StObject.set(x, "addUserDisabled", js.undefined)
    
    inline def setAdjustVolumeDisabled(value: Boolean): Self = StObject.set(x, "adjustVolumeDisabled", value.asInstanceOf[js.Any])
    
    inline def setAdjustVolumeDisabledUndefined: Self = StObject.set(x, "adjustVolumeDisabled", js.undefined)
    
    inline def setAdvancedSecurityOverrides(value: AdvancedSecurityOverrides): Self = StObject.set(x, "advancedSecurityOverrides", value.asInstanceOf[js.Any])
    
    inline def setAdvancedSecurityOverridesUndefined: Self = StObject.set(x, "advancedSecurityOverrides", js.undefined)
    
    inline def setAlwaysOnVpnPackage(value: AlwaysOnVpnPackage): Self = StObject.set(x, "alwaysOnVpnPackage", value.asInstanceOf[js.Any])
    
    inline def setAlwaysOnVpnPackageUndefined: Self = StObject.set(x, "alwaysOnVpnPackage", js.undefined)
    
    inline def setAndroidDevicePolicyTracks(value: js.Array[String]): Self = StObject.set(x, "androidDevicePolicyTracks", value.asInstanceOf[js.Any])
    
    inline def setAndroidDevicePolicyTracksUndefined: Self = StObject.set(x, "androidDevicePolicyTracks", js.undefined)
    
    inline def setAndroidDevicePolicyTracksVarargs(value: String*): Self = StObject.set(x, "androidDevicePolicyTracks", js.Array(value*))
    
    inline def setAppAutoUpdatePolicy(value: String): Self = StObject.set(x, "appAutoUpdatePolicy", value.asInstanceOf[js.Any])
    
    inline def setAppAutoUpdatePolicyUndefined: Self = StObject.set(x, "appAutoUpdatePolicy", js.undefined)
    
    inline def setApplications(value: js.Array[ApplicationPolicy]): Self = StObject.set(x, "applications", value.asInstanceOf[js.Any])
    
    inline def setApplicationsUndefined: Self = StObject.set(x, "applications", js.undefined)
    
    inline def setApplicationsVarargs(value: ApplicationPolicy*): Self = StObject.set(x, "applications", js.Array(value*))
    
    inline def setAutoDateAndTimeZone(value: String): Self = StObject.set(x, "autoDateAndTimeZone", value.asInstanceOf[js.Any])
    
    inline def setAutoDateAndTimeZoneUndefined: Self = StObject.set(x, "autoDateAndTimeZone", js.undefined)
    
    inline def setAutoTimeRequired(value: Boolean): Self = StObject.set(x, "autoTimeRequired", value.asInstanceOf[js.Any])
    
    inline def setAutoTimeRequiredUndefined: Self = StObject.set(x, "autoTimeRequired", js.undefined)
    
    inline def setBlockApplicationsEnabled(value: Boolean): Self = StObject.set(x, "blockApplicationsEnabled", value.asInstanceOf[js.Any])
    
    inline def setBlockApplicationsEnabledUndefined: Self = StObject.set(x, "blockApplicationsEnabled", js.undefined)
    
    inline def setBluetoothConfigDisabled(value: Boolean): Self = StObject.set(x, "bluetoothConfigDisabled", value.asInstanceOf[js.Any])
    
    inline def setBluetoothConfigDisabledUndefined: Self = StObject.set(x, "bluetoothConfigDisabled", js.undefined)
    
    inline def setBluetoothContactSharingDisabled(value: Boolean): Self = StObject.set(x, "bluetoothContactSharingDisabled", value.asInstanceOf[js.Any])
    
    inline def setBluetoothContactSharingDisabledUndefined: Self = StObject.set(x, "bluetoothContactSharingDisabled", js.undefined)
    
    inline def setBluetoothDisabled(value: Boolean): Self = StObject.set(x, "bluetoothDisabled", value.asInstanceOf[js.Any])
    
    inline def setBluetoothDisabledUndefined: Self = StObject.set(x, "bluetoothDisabled", js.undefined)
    
    inline def setCameraAccess(value: String): Self = StObject.set(x, "cameraAccess", value.asInstanceOf[js.Any])
    
    inline def setCameraAccessUndefined: Self = StObject.set(x, "cameraAccess", js.undefined)
    
    inline def setCameraDisabled(value: Boolean): Self = StObject.set(x, "cameraDisabled", value.asInstanceOf[js.Any])
    
    inline def setCameraDisabledUndefined: Self = StObject.set(x, "cameraDisabled", js.undefined)
    
    inline def setCellBroadcastsConfigDisabled(value: Boolean): Self = StObject.set(x, "cellBroadcastsConfigDisabled", value.asInstanceOf[js.Any])
    
    inline def setCellBroadcastsConfigDisabledUndefined: Self = StObject.set(x, "cellBroadcastsConfigDisabled", js.undefined)
    
    inline def setChoosePrivateKeyRules(value: js.Array[ChoosePrivateKeyRule]): Self = StObject.set(x, "choosePrivateKeyRules", value.asInstanceOf[js.Any])
    
    inline def setChoosePrivateKeyRulesUndefined: Self = StObject.set(x, "choosePrivateKeyRules", js.undefined)
    
    inline def setChoosePrivateKeyRulesVarargs(value: ChoosePrivateKeyRule*): Self = StObject.set(x, "choosePrivateKeyRules", js.Array(value*))
    
    inline def setComplianceRules(value: js.Array[ComplianceRule]): Self = StObject.set(x, "complianceRules", value.asInstanceOf[js.Any])
    
    inline def setComplianceRulesUndefined: Self = StObject.set(x, "complianceRules", js.undefined)
    
    inline def setComplianceRulesVarargs(value: ComplianceRule*): Self = StObject.set(x, "complianceRules", js.Array(value*))
    
    inline def setCreateWindowsDisabled(value: Boolean): Self = StObject.set(x, "createWindowsDisabled", value.asInstanceOf[js.Any])
    
    inline def setCreateWindowsDisabledUndefined: Self = StObject.set(x, "createWindowsDisabled", js.undefined)
    
    inline def setCredentialsConfigDisabled(value: Boolean): Self = StObject.set(x, "credentialsConfigDisabled", value.asInstanceOf[js.Any])
    
    inline def setCredentialsConfigDisabledUndefined: Self = StObject.set(x, "credentialsConfigDisabled", js.undefined)
    
    inline def setCrossProfilePolicies(value: CrossProfilePolicies): Self = StObject.set(x, "crossProfilePolicies", value.asInstanceOf[js.Any])
    
    inline def setCrossProfilePoliciesUndefined: Self = StObject.set(x, "crossProfilePolicies", js.undefined)
    
    inline def setDataRoamingDisabled(value: Boolean): Self = StObject.set(x, "dataRoamingDisabled", value.asInstanceOf[js.Any])
    
    inline def setDataRoamingDisabledUndefined: Self = StObject.set(x, "dataRoamingDisabled", js.undefined)
    
    inline def setDebuggingFeaturesAllowed(value: Boolean): Self = StObject.set(x, "debuggingFeaturesAllowed", value.asInstanceOf[js.Any])
    
    inline def setDebuggingFeaturesAllowedUndefined: Self = StObject.set(x, "debuggingFeaturesAllowed", js.undefined)
    
    inline def setDefaultPermissionPolicy(value: String): Self = StObject.set(x, "defaultPermissionPolicy", value.asInstanceOf[js.Any])
    
    inline def setDefaultPermissionPolicyUndefined: Self = StObject.set(x, "defaultPermissionPolicy", js.undefined)
    
    inline def setDeviceOwnerLockScreenInfo(value: UserFacingMessage): Self = StObject.set(x, "deviceOwnerLockScreenInfo", value.asInstanceOf[js.Any])
    
    inline def setDeviceOwnerLockScreenInfoUndefined: Self = StObject.set(x, "deviceOwnerLockScreenInfo", js.undefined)
    
    inline def setEncryptionPolicy(value: String): Self = StObject.set(x, "encryptionPolicy", value.asInstanceOf[js.Any])
    
    inline def setEncryptionPolicyUndefined: Self = StObject.set(x, "encryptionPolicy", js.undefined)
    
    inline def setEnsureVerifyAppsEnabled(value: Boolean): Self = StObject.set(x, "ensureVerifyAppsEnabled", value.asInstanceOf[js.Any])
    
    inline def setEnsureVerifyAppsEnabledUndefined: Self = StObject.set(x, "ensureVerifyAppsEnabled", js.undefined)
    
    inline def setFactoryResetDisabled(value: Boolean): Self = StObject.set(x, "factoryResetDisabled", value.asInstanceOf[js.Any])
    
    inline def setFactoryResetDisabledUndefined: Self = StObject.set(x, "factoryResetDisabled", js.undefined)
    
    inline def setFrpAdminEmails(value: js.Array[String]): Self = StObject.set(x, "frpAdminEmails", value.asInstanceOf[js.Any])
    
    inline def setFrpAdminEmailsUndefined: Self = StObject.set(x, "frpAdminEmails", js.undefined)
    
    inline def setFrpAdminEmailsVarargs(value: String*): Self = StObject.set(x, "frpAdminEmails", js.Array(value*))
    
    inline def setFunDisabled(value: Boolean): Self = StObject.set(x, "funDisabled", value.asInstanceOf[js.Any])
    
    inline def setFunDisabledUndefined: Self = StObject.set(x, "funDisabled", js.undefined)
    
    inline def setInstallAppsDisabled(value: Boolean): Self = StObject.set(x, "installAppsDisabled", value.asInstanceOf[js.Any])
    
    inline def setInstallAppsDisabledUndefined: Self = StObject.set(x, "installAppsDisabled", js.undefined)
    
    inline def setInstallUnknownSourcesAllowed(value: Boolean): Self = StObject.set(x, "installUnknownSourcesAllowed", value.asInstanceOf[js.Any])
    
    inline def setInstallUnknownSourcesAllowedUndefined: Self = StObject.set(x, "installUnknownSourcesAllowed", js.undefined)
    
    inline def setKeyguardDisabled(value: Boolean): Self = StObject.set(x, "keyguardDisabled", value.asInstanceOf[js.Any])
    
    inline def setKeyguardDisabledFeatures(value: js.Array[String]): Self = StObject.set(x, "keyguardDisabledFeatures", value.asInstanceOf[js.Any])
    
    inline def setKeyguardDisabledFeaturesUndefined: Self = StObject.set(x, "keyguardDisabledFeatures", js.undefined)
    
    inline def setKeyguardDisabledFeaturesVarargs(value: String*): Self = StObject.set(x, "keyguardDisabledFeatures", js.Array(value*))
    
    inline def setKeyguardDisabledUndefined: Self = StObject.set(x, "keyguardDisabled", js.undefined)
    
    inline def setKioskCustomLauncherEnabled(value: Boolean): Self = StObject.set(x, "kioskCustomLauncherEnabled", value.asInstanceOf[js.Any])
    
    inline def setKioskCustomLauncherEnabledUndefined: Self = StObject.set(x, "kioskCustomLauncherEnabled", js.undefined)
    
    inline def setKioskCustomization(value: KioskCustomization): Self = StObject.set(x, "kioskCustomization", value.asInstanceOf[js.Any])
    
    inline def setKioskCustomizationUndefined: Self = StObject.set(x, "kioskCustomization", js.undefined)
    
    inline def setLocationMode(value: String): Self = StObject.set(x, "locationMode", value.asInstanceOf[js.Any])
    
    inline def setLocationModeUndefined: Self = StObject.set(x, "locationMode", js.undefined)
    
    inline def setLongSupportMessage(value: UserFacingMessage): Self = StObject.set(x, "longSupportMessage", value.asInstanceOf[js.Any])
    
    inline def setLongSupportMessageUndefined: Self = StObject.set(x, "longSupportMessage", js.undefined)
    
    inline def setMaximumTimeToLock(value: String): Self = StObject.set(x, "maximumTimeToLock", value.asInstanceOf[js.Any])
    
    inline def setMaximumTimeToLockUndefined: Self = StObject.set(x, "maximumTimeToLock", js.undefined)
    
    inline def setMicrophoneAccess(value: String): Self = StObject.set(x, "microphoneAccess", value.asInstanceOf[js.Any])
    
    inline def setMicrophoneAccessUndefined: Self = StObject.set(x, "microphoneAccess", js.undefined)
    
    inline def setMinimumApiLevel(value: Double): Self = StObject.set(x, "minimumApiLevel", value.asInstanceOf[js.Any])
    
    inline def setMinimumApiLevelUndefined: Self = StObject.set(x, "minimumApiLevel", js.undefined)
    
    inline def setMobileNetworksConfigDisabled(value: Boolean): Self = StObject.set(x, "mobileNetworksConfigDisabled", value.asInstanceOf[js.Any])
    
    inline def setMobileNetworksConfigDisabledUndefined: Self = StObject.set(x, "mobileNetworksConfigDisabled", js.undefined)
    
    inline def setModifyAccountsDisabled(value: Boolean): Self = StObject.set(x, "modifyAccountsDisabled", value.asInstanceOf[js.Any])
    
    inline def setModifyAccountsDisabledUndefined: Self = StObject.set(x, "modifyAccountsDisabled", js.undefined)
    
    inline def setMountPhysicalMediaDisabled(value: Boolean): Self = StObject.set(x, "mountPhysicalMediaDisabled", value.asInstanceOf[js.Any])
    
    inline def setMountPhysicalMediaDisabledUndefined: Self = StObject.set(x, "mountPhysicalMediaDisabled", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetworkEscapeHatchEnabled(value: Boolean): Self = StObject.set(x, "networkEscapeHatchEnabled", value.asInstanceOf[js.Any])
    
    inline def setNetworkEscapeHatchEnabledUndefined: Self = StObject.set(x, "networkEscapeHatchEnabled", js.undefined)
    
    inline def setNetworkResetDisabled(value: Boolean): Self = StObject.set(x, "networkResetDisabled", value.asInstanceOf[js.Any])
    
    inline def setNetworkResetDisabledUndefined: Self = StObject.set(x, "networkResetDisabled", js.undefined)
    
    inline def setOncCertificateProviders(value: js.Array[OncCertificateProvider]): Self = StObject.set(x, "oncCertificateProviders", value.asInstanceOf[js.Any])
    
    inline def setOncCertificateProvidersUndefined: Self = StObject.set(x, "oncCertificateProviders", js.undefined)
    
    inline def setOncCertificateProvidersVarargs(value: OncCertificateProvider*): Self = StObject.set(x, "oncCertificateProviders", js.Array(value*))
    
    inline def setOpenNetworkConfiguration(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "openNetworkConfiguration", value.asInstanceOf[js.Any])
    
    inline def setOpenNetworkConfigurationUndefined: Self = StObject.set(x, "openNetworkConfiguration", js.undefined)
    
    inline def setOutgoingBeamDisabled(value: Boolean): Self = StObject.set(x, "outgoingBeamDisabled", value.asInstanceOf[js.Any])
    
    inline def setOutgoingBeamDisabledUndefined: Self = StObject.set(x, "outgoingBeamDisabled", js.undefined)
    
    inline def setOutgoingCallsDisabled(value: Boolean): Self = StObject.set(x, "outgoingCallsDisabled", value.asInstanceOf[js.Any])
    
    inline def setOutgoingCallsDisabledUndefined: Self = StObject.set(x, "outgoingCallsDisabled", js.undefined)
    
    inline def setPasswordPolicies(value: js.Array[PasswordRequirements]): Self = StObject.set(x, "passwordPolicies", value.asInstanceOf[js.Any])
    
    inline def setPasswordPoliciesUndefined: Self = StObject.set(x, "passwordPolicies", js.undefined)
    
    inline def setPasswordPoliciesVarargs(value: PasswordRequirements*): Self = StObject.set(x, "passwordPolicies", js.Array(value*))
    
    inline def setPasswordRequirements(value: PasswordRequirements): Self = StObject.set(x, "passwordRequirements", value.asInstanceOf[js.Any])
    
    inline def setPasswordRequirementsUndefined: Self = StObject.set(x, "passwordRequirements", js.undefined)
    
    inline def setPermissionGrants(value: js.Array[PermissionGrant]): Self = StObject.set(x, "permissionGrants", value.asInstanceOf[js.Any])
    
    inline def setPermissionGrantsUndefined: Self = StObject.set(x, "permissionGrants", js.undefined)
    
    inline def setPermissionGrantsVarargs(value: PermissionGrant*): Self = StObject.set(x, "permissionGrants", js.Array(value*))
    
    inline def setPermittedAccessibilityServices(value: PackageNameList): Self = StObject.set(x, "permittedAccessibilityServices", value.asInstanceOf[js.Any])
    
    inline def setPermittedAccessibilityServicesUndefined: Self = StObject.set(x, "permittedAccessibilityServices", js.undefined)
    
    inline def setPermittedInputMethods(value: PackageNameList): Self = StObject.set(x, "permittedInputMethods", value.asInstanceOf[js.Any])
    
    inline def setPermittedInputMethodsUndefined: Self = StObject.set(x, "permittedInputMethods", js.undefined)
    
    inline def setPersistentPreferredActivities(value: js.Array[PersistentPreferredActivity]): Self = StObject.set(x, "persistentPreferredActivities", value.asInstanceOf[js.Any])
    
    inline def setPersistentPreferredActivitiesUndefined: Self = StObject.set(x, "persistentPreferredActivities", js.undefined)
    
    inline def setPersistentPreferredActivitiesVarargs(value: PersistentPreferredActivity*): Self = StObject.set(x, "persistentPreferredActivities", js.Array(value*))
    
    inline def setPersonalUsagePolicies(value: PersonalUsagePolicies): Self = StObject.set(x, "personalUsagePolicies", value.asInstanceOf[js.Any])
    
    inline def setPersonalUsagePoliciesUndefined: Self = StObject.set(x, "personalUsagePolicies", js.undefined)
    
    inline def setPlayStoreMode(value: String): Self = StObject.set(x, "playStoreMode", value.asInstanceOf[js.Any])
    
    inline def setPlayStoreModeUndefined: Self = StObject.set(x, "playStoreMode", js.undefined)
    
    inline def setPolicyEnforcementRules(value: js.Array[PolicyEnforcementRule]): Self = StObject.set(x, "policyEnforcementRules", value.asInstanceOf[js.Any])
    
    inline def setPolicyEnforcementRulesUndefined: Self = StObject.set(x, "policyEnforcementRules", js.undefined)
    
    inline def setPolicyEnforcementRulesVarargs(value: PolicyEnforcementRule*): Self = StObject.set(x, "policyEnforcementRules", js.Array(value*))
    
    inline def setPreferentialNetworkService(value: String): Self = StObject.set(x, "preferentialNetworkService", value.asInstanceOf[js.Any])
    
    inline def setPreferentialNetworkServiceUndefined: Self = StObject.set(x, "preferentialNetworkService", js.undefined)
    
    inline def setPrivateKeySelectionEnabled(value: Boolean): Self = StObject.set(x, "privateKeySelectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeySelectionEnabledUndefined: Self = StObject.set(x, "privateKeySelectionEnabled", js.undefined)
    
    inline def setRecommendedGlobalProxy(value: ProxyInfo): Self = StObject.set(x, "recommendedGlobalProxy", value.asInstanceOf[js.Any])
    
    inline def setRecommendedGlobalProxyUndefined: Self = StObject.set(x, "recommendedGlobalProxy", js.undefined)
    
    inline def setRemoveUserDisabled(value: Boolean): Self = StObject.set(x, "removeUserDisabled", value.asInstanceOf[js.Any])
    
    inline def setRemoveUserDisabledUndefined: Self = StObject.set(x, "removeUserDisabled", js.undefined)
    
    inline def setSafeBootDisabled(value: Boolean): Self = StObject.set(x, "safeBootDisabled", value.asInstanceOf[js.Any])
    
    inline def setSafeBootDisabledUndefined: Self = StObject.set(x, "safeBootDisabled", js.undefined)
    
    inline def setScreenCaptureDisabled(value: Boolean): Self = StObject.set(x, "screenCaptureDisabled", value.asInstanceOf[js.Any])
    
    inline def setScreenCaptureDisabledUndefined: Self = StObject.set(x, "screenCaptureDisabled", js.undefined)
    
    inline def setSetUserIconDisabled(value: Boolean): Self = StObject.set(x, "setUserIconDisabled", value.asInstanceOf[js.Any])
    
    inline def setSetUserIconDisabledUndefined: Self = StObject.set(x, "setUserIconDisabled", js.undefined)
    
    inline def setSetWallpaperDisabled(value: Boolean): Self = StObject.set(x, "setWallpaperDisabled", value.asInstanceOf[js.Any])
    
    inline def setSetWallpaperDisabledUndefined: Self = StObject.set(x, "setWallpaperDisabled", js.undefined)
    
    inline def setSetupActions(value: js.Array[SetupAction]): Self = StObject.set(x, "setupActions", value.asInstanceOf[js.Any])
    
    inline def setSetupActionsUndefined: Self = StObject.set(x, "setupActions", js.undefined)
    
    inline def setSetupActionsVarargs(value: SetupAction*): Self = StObject.set(x, "setupActions", js.Array(value*))
    
    inline def setShareLocationDisabled(value: Boolean): Self = StObject.set(x, "shareLocationDisabled", value.asInstanceOf[js.Any])
    
    inline def setShareLocationDisabledUndefined: Self = StObject.set(x, "shareLocationDisabled", js.undefined)
    
    inline def setShortSupportMessage(value: UserFacingMessage): Self = StObject.set(x, "shortSupportMessage", value.asInstanceOf[js.Any])
    
    inline def setShortSupportMessageUndefined: Self = StObject.set(x, "shortSupportMessage", js.undefined)
    
    inline def setSkipFirstUseHintsEnabled(value: Boolean): Self = StObject.set(x, "skipFirstUseHintsEnabled", value.asInstanceOf[js.Any])
    
    inline def setSkipFirstUseHintsEnabledUndefined: Self = StObject.set(x, "skipFirstUseHintsEnabled", js.undefined)
    
    inline def setSmsDisabled(value: Boolean): Self = StObject.set(x, "smsDisabled", value.asInstanceOf[js.Any])
    
    inline def setSmsDisabledUndefined: Self = StObject.set(x, "smsDisabled", js.undefined)
    
    inline def setStatusBarDisabled(value: Boolean): Self = StObject.set(x, "statusBarDisabled", value.asInstanceOf[js.Any])
    
    inline def setStatusBarDisabledUndefined: Self = StObject.set(x, "statusBarDisabled", js.undefined)
    
    inline def setStatusReportingSettings(value: StatusReportingSettings): Self = StObject.set(x, "statusReportingSettings", value.asInstanceOf[js.Any])
    
    inline def setStatusReportingSettingsUndefined: Self = StObject.set(x, "statusReportingSettings", js.undefined)
    
    inline def setStayOnPluggedModes(value: js.Array[String]): Self = StObject.set(x, "stayOnPluggedModes", value.asInstanceOf[js.Any])
    
    inline def setStayOnPluggedModesUndefined: Self = StObject.set(x, "stayOnPluggedModes", js.undefined)
    
    inline def setStayOnPluggedModesVarargs(value: String*): Self = StObject.set(x, "stayOnPluggedModes", js.Array(value*))
    
    inline def setSystemUpdate(value: SystemUpdate): Self = StObject.set(x, "systemUpdate", value.asInstanceOf[js.Any])
    
    inline def setSystemUpdateUndefined: Self = StObject.set(x, "systemUpdate", js.undefined)
    
    inline def setTetheringConfigDisabled(value: Boolean): Self = StObject.set(x, "tetheringConfigDisabled", value.asInstanceOf[js.Any])
    
    inline def setTetheringConfigDisabledUndefined: Self = StObject.set(x, "tetheringConfigDisabled", js.undefined)
    
    inline def setUninstallAppsDisabled(value: Boolean): Self = StObject.set(x, "uninstallAppsDisabled", value.asInstanceOf[js.Any])
    
    inline def setUninstallAppsDisabledUndefined: Self = StObject.set(x, "uninstallAppsDisabled", js.undefined)
    
    inline def setUnmuteMicrophoneDisabled(value: Boolean): Self = StObject.set(x, "unmuteMicrophoneDisabled", value.asInstanceOf[js.Any])
    
    inline def setUnmuteMicrophoneDisabledUndefined: Self = StObject.set(x, "unmuteMicrophoneDisabled", js.undefined)
    
    inline def setUsageLog(value: UsageLog): Self = StObject.set(x, "usageLog", value.asInstanceOf[js.Any])
    
    inline def setUsageLogUndefined: Self = StObject.set(x, "usageLog", js.undefined)
    
    inline def setUsbFileTransferDisabled(value: Boolean): Self = StObject.set(x, "usbFileTransferDisabled", value.asInstanceOf[js.Any])
    
    inline def setUsbFileTransferDisabledUndefined: Self = StObject.set(x, "usbFileTransferDisabled", js.undefined)
    
    inline def setUsbMassStorageEnabled(value: Boolean): Self = StObject.set(x, "usbMassStorageEnabled", value.asInstanceOf[js.Any])
    
    inline def setUsbMassStorageEnabledUndefined: Self = StObject.set(x, "usbMassStorageEnabled", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVpnConfigDisabled(value: Boolean): Self = StObject.set(x, "vpnConfigDisabled", value.asInstanceOf[js.Any])
    
    inline def setVpnConfigDisabledUndefined: Self = StObject.set(x, "vpnConfigDisabled", js.undefined)
    
    inline def setWifiConfigDisabled(value: Boolean): Self = StObject.set(x, "wifiConfigDisabled", value.asInstanceOf[js.Any])
    
    inline def setWifiConfigDisabledUndefined: Self = StObject.set(x, "wifiConfigDisabled", js.undefined)
    
    inline def setWifiConfigsLockdownEnabled(value: Boolean): Self = StObject.set(x, "wifiConfigsLockdownEnabled", value.asInstanceOf[js.Any])
    
    inline def setWifiConfigsLockdownEnabledUndefined: Self = StObject.set(x, "wifiConfigsLockdownEnabled", js.undefined)
  }
}
