package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationPolicy extends StObject {
  
  /**
    * List of the app’s track IDs that a device belonging to the enterprise can access. If the list contains multiple track IDs, devices receive the latest version among all accessible
    * tracks. If the list contains no track IDs, devices only have access to the app’s production track. More details about each track are available in AppTrackInfo.
    */
  var accessibleTrackIds: js.UndefOr[js.Array[String]] = js.native
  
  /** Controls whether the app can communicate with itself across a device’s work and personal profiles, subject to user consent. */
  var connectedWorkAndPersonalApp: js.UndefOr[String] = js.native
  
  /**
    * The default policy for all permissions requested by the app. If specified, this overrides the policy-level default_permission_policy which applies to all apps. It does not override
    * the permission_grants which applies to all apps.
    */
  var defaultPermissionPolicy: js.UndefOr[String] = js.native
  
  /** The scopes delegated to the app from Android Device Policy. */
  var delegatedScopes: js.UndefOr[js.Array[String]] = js.native
  
  /** Whether the app is disabled. When disabled, the app data is still preserved. */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /** The type of installation to perform. */
  var installType: js.UndefOr[String] = js.native
  
  /** Whether the app is allowed to lock itself in full-screen mode. DEPRECATED. Use InstallType KIOSK or kioskCustomLauncherEnabled to to configure a dedicated device. */
  var lockTaskAllowed: js.UndefOr[Boolean] = js.native
  
  /**
    * Managed configuration applied to the app. The format for the configuration is dictated by the ManagedProperty values supported by the app. Each field name in the managed
    * configuration must match the key field of the ManagedProperty. The field value must be compatible with the type of the ManagedProperty: *type* *JSON value* BOOL true or false STRING
    * string INTEGER number CHOICE string MULTISELECT array of strings HIDDEN string BUNDLE_ARRAY array of objects
    */
  var managedConfiguration: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientAndroidmanagement.maximMazurokGapiClientAndroidmanagementStrings.ApplicationPolicy with TopLevel[js.Any]
  ] = js.native
  
  /** The managed configurations template for the app, saved from the managed configurations iframe. This field is ignored if managed_configuration is set. */
  var managedConfigurationTemplate: js.UndefOr[ManagedConfigurationTemplate] = js.native
  
  /**
    * The minimum version of the app that runs on the device. If set, the device attempts to update the app to at least this version code. If the app is not up-to-date, the device will
    * contain a NonComplianceDetail with non_compliance_reason set to APP_NOT_UPDATED. The app must already be published to Google Play with a version code greater than or equal to this
    * value. At most 20 apps may specify a minimum version code per policy.
    */
  var minimumVersionCode: js.UndefOr[Double] = js.native
  
  /** The package name of the app. For example, com.google.android.youtube for the YouTube app. */
  var packageName: js.UndefOr[String] = js.native
  
  /** Explicit permission grants or denials for the app. These values override the default_permission_policy and permission_grants which apply to all apps. */
  var permissionGrants: js.UndefOr[js.Array[PermissionGrant]] = js.native
}
object ApplicationPolicy {
  
  @scala.inline
  def apply(): ApplicationPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationPolicy]
  }
  
  @scala.inline
  implicit class ApplicationPolicyMutableBuilder[Self <: ApplicationPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibleTrackIds(value: js.Array[String]): Self = StObject.set(x, "accessibleTrackIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibleTrackIdsUndefined: Self = StObject.set(x, "accessibleTrackIds", js.undefined)
    
    @scala.inline
    def setAccessibleTrackIdsVarargs(value: String*): Self = StObject.set(x, "accessibleTrackIds", js.Array(value :_*))
    
    @scala.inline
    def setConnectedWorkAndPersonalApp(value: String): Self = StObject.set(x, "connectedWorkAndPersonalApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectedWorkAndPersonalAppUndefined: Self = StObject.set(x, "connectedWorkAndPersonalApp", js.undefined)
    
    @scala.inline
    def setDefaultPermissionPolicy(value: String): Self = StObject.set(x, "defaultPermissionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPermissionPolicyUndefined: Self = StObject.set(x, "defaultPermissionPolicy", js.undefined)
    
    @scala.inline
    def setDelegatedScopes(value: js.Array[String]): Self = StObject.set(x, "delegatedScopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegatedScopesUndefined: Self = StObject.set(x, "delegatedScopes", js.undefined)
    
    @scala.inline
    def setDelegatedScopesVarargs(value: String*): Self = StObject.set(x, "delegatedScopes", js.Array(value :_*))
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setInstallType(value: String): Self = StObject.set(x, "installType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallTypeUndefined: Self = StObject.set(x, "installType", js.undefined)
    
    @scala.inline
    def setLockTaskAllowed(value: Boolean): Self = StObject.set(x, "lockTaskAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockTaskAllowedUndefined: Self = StObject.set(x, "lockTaskAllowed", js.undefined)
    
    @scala.inline
    def setManagedConfiguration(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientAndroidmanagement.maximMazurokGapiClientAndroidmanagementStrings.ApplicationPolicy with TopLevel[js.Any]
    ): Self = StObject.set(x, "managedConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedConfigurationTemplate(value: ManagedConfigurationTemplate): Self = StObject.set(x, "managedConfigurationTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedConfigurationTemplateUndefined: Self = StObject.set(x, "managedConfigurationTemplate", js.undefined)
    
    @scala.inline
    def setManagedConfigurationUndefined: Self = StObject.set(x, "managedConfiguration", js.undefined)
    
    @scala.inline
    def setMinimumVersionCode(value: Double): Self = StObject.set(x, "minimumVersionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumVersionCodeUndefined: Self = StObject.set(x, "minimumVersionCode", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    @scala.inline
    def setPermissionGrants(value: js.Array[PermissionGrant]): Self = StObject.set(x, "permissionGrants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionGrantsUndefined: Self = StObject.set(x, "permissionGrants", js.undefined)
    
    @scala.inline
    def setPermissionGrantsVarargs(value: PermissionGrant*): Self = StObject.set(x, "permissionGrants", js.Array(value :_*))
  }
}
