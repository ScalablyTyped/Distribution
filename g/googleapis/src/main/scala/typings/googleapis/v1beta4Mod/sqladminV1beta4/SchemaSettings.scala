package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database instance settings.
  */
@js.native
trait SchemaSettings extends js.Object {
  /**
    * The activation policy specifies when the instance is activated; it is
    * applicable only when the instance state is RUNNABLE. Valid values:
    * ALWAYS: The instance is on, and remains so even in the absence of
    * connection requests. NEVER: The instance is off; it is not activated,
    * even if a connection request arrives. ON_DEMAND: First Generation
    * instances only. The instance responds to incoming requests, and turns
    * itself off when not in use. Instances with PER_USE pricing turn off after
    * 15 minutes of inactivity. Instances with PER_PACKAGE pricing turn off
    * after 12 hours of inactivity.
    */
  var activationPolicy: js.UndefOr[String] = js.native
  /**
    * The App Engine app IDs that can access this instance. First Generation
    * instances only.
    */
  var authorizedGaeApplications: js.UndefOr[js.Array[String]] = js.native
  /**
    * Availability type (PostgreSQL instances only). Potential values: ZONAL:
    * The instance serves data from only one zone. Outages in that zone affect
    * data accessibility. REGIONAL: The instance can serve data from more than
    * one zone in a region (it is highly available). For more information, see
    * Overview of the High Availability Configuration.
    */
  var availabilityType: js.UndefOr[String] = js.native
  /**
    * The daily backup configuration for the instance.
    */
  var backupConfiguration: js.UndefOr[SchemaBackupConfiguration] = js.native
  /**
    * Configuration specific to read replica instances. Indicates whether
    * database flags for crash-safe replication are enabled. This property is
    * only applicable to First Generation instances.
    */
  var crashSafeReplicationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The size of data disk, in GB. The data disk size minimum is 10GB. Not
    * used for First Generation instances.
    */
  var dataDiskSizeGb: js.UndefOr[String] = js.native
  /**
    * The type of data disk: PD_SSD (default) or PD_HDD. Not used for First
    * Generation instances.
    */
  var dataDiskType: js.UndefOr[String] = js.native
  /**
    * The database flags passed to the instance at startup.
    */
  var databaseFlags: js.UndefOr[js.Array[SchemaDatabaseFlags]] = js.native
  /**
    * Configuration specific to read replica instances. Indicates whether
    * replication is enabled or not.
    */
  var databaseReplicationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The settings for IP Management. This allows to enable or disable the
    * instance IP and manage which external networks can connect to the
    * instance. The IPv4 address cannot be disabled for Second Generation
    * instances.
    */
  var ipConfiguration: js.UndefOr[SchemaIpConfiguration] = js.native
  /**
    * This is always sql#settings.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The location preference settings. This allows the instance to be located
    * as near as possible to either an App Engine app or Compute Engine zone
    * for better performance. App Engine co-location is only applicable to
    * First Generation instances.
    */
  var locationPreference: js.UndefOr[SchemaLocationPreference] = js.native
  /**
    * The maintenance window for this instance. This specifies when the
    * instance can be restarted for maintenance purposes. Not used for First
    * Generation instances.
    */
  var maintenanceWindow: js.UndefOr[SchemaMaintenanceWindow] = js.native
  /**
    * The pricing plan for this instance. This can be either PER_USE or
    * PACKAGE. Only PER_USE is supported for Second Generation instances.
    */
  var pricingPlan: js.UndefOr[String] = js.native
  /**
    * The type of replication this instance uses. This can be either
    * ASYNCHRONOUS or SYNCHRONOUS. This property is only applicable to First
    * Generation instances.
    */
  var replicationType: js.UndefOr[String] = js.native
  /**
    * The version of instance settings. This is a required field for update
    * method to make sure concurrent updates are handled properly. During
    * update, use the most recent settingsVersion value for this instance and
    * do not try to update this value.
    */
  var settingsVersion: js.UndefOr[String] = js.native
  /**
    * Configuration to increase storage size automatically. The default value
    * is true. Not used for First Generation instances.
    */
  var storageAutoResize: js.UndefOr[Boolean] = js.native
  /**
    * The maximum size to which storage capacity can be automatically
    * increased. The default value is 0, which specifies that there is no
    * limit. Not used for First Generation instances.
    */
  var storageAutoResizeLimit: js.UndefOr[String] = js.native
  /**
    * The tier (or machine type) for this instance, for example
    * db-n1-standard-1 (MySQL instances) or db-custom-1-3840 (PostgreSQL
    * instances). For MySQL instances, this property determines whether the
    * instance is First or Second Generation. For more information, see
    * Instance Settings.
    */
  var tier: js.UndefOr[String] = js.native
  /**
    * User-provided labels, represented as a dictionary where each label is a
    * single key value pair.
    */
  var userLabels: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaSettings {
  @scala.inline
  def apply(): SchemaSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSettings]
  }
  @scala.inline
  implicit class SchemaSettingsOps[Self <: SchemaSettings] (val x: Self) extends AnyVal {
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
    def setActivationPolicy(value: String): Self = this.set("activationPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivationPolicy: Self = this.set("activationPolicy", js.undefined)
    @scala.inline
    def setAuthorizedGaeApplicationsVarargs(value: String*): Self = this.set("authorizedGaeApplications", js.Array(value :_*))
    @scala.inline
    def setAuthorizedGaeApplications(value: js.Array[String]): Self = this.set("authorizedGaeApplications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizedGaeApplications: Self = this.set("authorizedGaeApplications", js.undefined)
    @scala.inline
    def setAvailabilityType(value: String): Self = this.set("availabilityType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityType: Self = this.set("availabilityType", js.undefined)
    @scala.inline
    def setBackupConfiguration(value: SchemaBackupConfiguration): Self = this.set("backupConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupConfiguration: Self = this.set("backupConfiguration", js.undefined)
    @scala.inline
    def setCrashSafeReplicationEnabled(value: Boolean): Self = this.set("crashSafeReplicationEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrashSafeReplicationEnabled: Self = this.set("crashSafeReplicationEnabled", js.undefined)
    @scala.inline
    def setDataDiskSizeGb(value: String): Self = this.set("dataDiskSizeGb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataDiskSizeGb: Self = this.set("dataDiskSizeGb", js.undefined)
    @scala.inline
    def setDataDiskType(value: String): Self = this.set("dataDiskType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataDiskType: Self = this.set("dataDiskType", js.undefined)
    @scala.inline
    def setDatabaseFlagsVarargs(value: SchemaDatabaseFlags*): Self = this.set("databaseFlags", js.Array(value :_*))
    @scala.inline
    def setDatabaseFlags(value: js.Array[SchemaDatabaseFlags]): Self = this.set("databaseFlags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabaseFlags: Self = this.set("databaseFlags", js.undefined)
    @scala.inline
    def setDatabaseReplicationEnabled(value: Boolean): Self = this.set("databaseReplicationEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabaseReplicationEnabled: Self = this.set("databaseReplicationEnabled", js.undefined)
    @scala.inline
    def setIpConfiguration(value: SchemaIpConfiguration): Self = this.set("ipConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpConfiguration: Self = this.set("ipConfiguration", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLocationPreference(value: SchemaLocationPreference): Self = this.set("locationPreference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationPreference: Self = this.set("locationPreference", js.undefined)
    @scala.inline
    def setMaintenanceWindow(value: SchemaMaintenanceWindow): Self = this.set("maintenanceWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaintenanceWindow: Self = this.set("maintenanceWindow", js.undefined)
    @scala.inline
    def setPricingPlan(value: String): Self = this.set("pricingPlan", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePricingPlan: Self = this.set("pricingPlan", js.undefined)
    @scala.inline
    def setReplicationType(value: String): Self = this.set("replicationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationType: Self = this.set("replicationType", js.undefined)
    @scala.inline
    def setSettingsVersion(value: String): Self = this.set("settingsVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettingsVersion: Self = this.set("settingsVersion", js.undefined)
    @scala.inline
    def setStorageAutoResize(value: Boolean): Self = this.set("storageAutoResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageAutoResize: Self = this.set("storageAutoResize", js.undefined)
    @scala.inline
    def setStorageAutoResizeLimit(value: String): Self = this.set("storageAutoResizeLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageAutoResizeLimit: Self = this.set("storageAutoResizeLimit", js.undefined)
    @scala.inline
    def setTier(value: String): Self = this.set("tier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTier: Self = this.set("tier", js.undefined)
    @scala.inline
    def setUserLabels(value: StringDictionary[String]): Self = this.set("userLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserLabels: Self = this.set("userLabels", js.undefined)
  }
  
}

