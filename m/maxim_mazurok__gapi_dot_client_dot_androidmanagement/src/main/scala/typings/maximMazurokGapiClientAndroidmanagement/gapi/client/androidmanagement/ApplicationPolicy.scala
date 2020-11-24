package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationPolicy extends js.Object {
  
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
  implicit class ApplicationPolicyOps[Self <: ApplicationPolicy] (val x: Self) extends AnyVal {
    
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
    def setAccessibleTrackIdsVarargs(value: String*): Self = this.set("accessibleTrackIds", js.Array(value :_*))
    
    @scala.inline
    def setAccessibleTrackIds(value: js.Array[String]): Self = this.set("accessibleTrackIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibleTrackIds: Self = this.set("accessibleTrackIds", js.undefined)
    
    @scala.inline
    def setConnectedWorkAndPersonalApp(value: String): Self = this.set("connectedWorkAndPersonalApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectedWorkAndPersonalApp: Self = this.set("connectedWorkAndPersonalApp", js.undefined)
    
    @scala.inline
    def setDefaultPermissionPolicy(value: String): Self = this.set("defaultPermissionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultPermissionPolicy: Self = this.set("defaultPermissionPolicy", js.undefined)
    
    @scala.inline
    def setDelegatedScopesVarargs(value: String*): Self = this.set("delegatedScopes", js.Array(value :_*))
    
    @scala.inline
    def setDelegatedScopes(value: js.Array[String]): Self = this.set("delegatedScopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelegatedScopes: Self = this.set("delegatedScopes", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setInstallType(value: String): Self = this.set("installType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstallType: Self = this.set("installType", js.undefined)
    
    @scala.inline
    def setLockTaskAllowed(value: Boolean): Self = this.set("lockTaskAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockTaskAllowed: Self = this.set("lockTaskAllowed", js.undefined)
    
    @scala.inline
    def setManagedConfiguration(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientAndroidmanagement.maximMazurokGapiClientAndroidmanagementStrings.ApplicationPolicy with TopLevel[js.Any]
    ): Self = this.set("managedConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagedConfiguration: Self = this.set("managedConfiguration", js.undefined)
    
    @scala.inline
    def setManagedConfigurationTemplate(value: ManagedConfigurationTemplate): Self = this.set("managedConfigurationTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagedConfigurationTemplate: Self = this.set("managedConfigurationTemplate", js.undefined)
    
    @scala.inline
    def setMinimumVersionCode(value: Double): Self = this.set("minimumVersionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumVersionCode: Self = this.set("minimumVersionCode", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageName: Self = this.set("packageName", js.undefined)
    
    @scala.inline
    def setPermissionGrantsVarargs(value: PermissionGrant*): Self = this.set("permissionGrants", js.Array(value :_*))
    
    @scala.inline
    def setPermissionGrants(value: js.Array[PermissionGrant]): Self = this.set("permissionGrants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionGrants: Self = this.set("permissionGrants", js.undefined)
  }
}
