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
  def apply(
    activationPolicy: String = null,
    authorizedGaeApplications: js.Array[String] = null,
    availabilityType: String = null,
    backupConfiguration: SchemaBackupConfiguration = null,
    crashSafeReplicationEnabled: js.UndefOr[Boolean] = js.undefined,
    dataDiskSizeGb: String = null,
    dataDiskType: String = null,
    databaseFlags: js.Array[SchemaDatabaseFlags] = null,
    databaseReplicationEnabled: js.UndefOr[Boolean] = js.undefined,
    ipConfiguration: SchemaIpConfiguration = null,
    kind: String = null,
    locationPreference: SchemaLocationPreference = null,
    maintenanceWindow: SchemaMaintenanceWindow = null,
    pricingPlan: String = null,
    replicationType: String = null,
    settingsVersion: String = null,
    storageAutoResize: js.UndefOr[Boolean] = js.undefined,
    storageAutoResizeLimit: String = null,
    tier: String = null,
    userLabels: StringDictionary[String] = null
  ): SchemaSettings = {
    val __obj = js.Dynamic.literal()
    if (activationPolicy != null) __obj.updateDynamic("activationPolicy")(activationPolicy.asInstanceOf[js.Any])
    if (authorizedGaeApplications != null) __obj.updateDynamic("authorizedGaeApplications")(authorizedGaeApplications.asInstanceOf[js.Any])
    if (availabilityType != null) __obj.updateDynamic("availabilityType")(availabilityType.asInstanceOf[js.Any])
    if (backupConfiguration != null) __obj.updateDynamic("backupConfiguration")(backupConfiguration.asInstanceOf[js.Any])
    if (!js.isUndefined(crashSafeReplicationEnabled)) __obj.updateDynamic("crashSafeReplicationEnabled")(crashSafeReplicationEnabled.get.asInstanceOf[js.Any])
    if (dataDiskSizeGb != null) __obj.updateDynamic("dataDiskSizeGb")(dataDiskSizeGb.asInstanceOf[js.Any])
    if (dataDiskType != null) __obj.updateDynamic("dataDiskType")(dataDiskType.asInstanceOf[js.Any])
    if (databaseFlags != null) __obj.updateDynamic("databaseFlags")(databaseFlags.asInstanceOf[js.Any])
    if (!js.isUndefined(databaseReplicationEnabled)) __obj.updateDynamic("databaseReplicationEnabled")(databaseReplicationEnabled.get.asInstanceOf[js.Any])
    if (ipConfiguration != null) __obj.updateDynamic("ipConfiguration")(ipConfiguration.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (locationPreference != null) __obj.updateDynamic("locationPreference")(locationPreference.asInstanceOf[js.Any])
    if (maintenanceWindow != null) __obj.updateDynamic("maintenanceWindow")(maintenanceWindow.asInstanceOf[js.Any])
    if (pricingPlan != null) __obj.updateDynamic("pricingPlan")(pricingPlan.asInstanceOf[js.Any])
    if (replicationType != null) __obj.updateDynamic("replicationType")(replicationType.asInstanceOf[js.Any])
    if (settingsVersion != null) __obj.updateDynamic("settingsVersion")(settingsVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(storageAutoResize)) __obj.updateDynamic("storageAutoResize")(storageAutoResize.get.asInstanceOf[js.Any])
    if (storageAutoResizeLimit != null) __obj.updateDynamic("storageAutoResizeLimit")(storageAutoResizeLimit.asInstanceOf[js.Any])
    if (tier != null) __obj.updateDynamic("tier")(tier.asInstanceOf[js.Any])
    if (userLabels != null) __obj.updateDynamic("userLabels")(userLabels.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSettings]
  }
}

