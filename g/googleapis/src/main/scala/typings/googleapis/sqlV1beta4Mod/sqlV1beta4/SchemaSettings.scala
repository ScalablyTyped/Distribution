package typings.googleapis.sqlV1beta4Mod.sqlV1beta4

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSettings extends StObject {
  
  /**
    * The activation policy specifies when the instance is activated; it is applicable only when the instance state is RUNNABLE. Valid values: *ALWAYS*: The instance is on, and remains so even in the absence of connection requests. *NEVER*: The instance is off; it is not activated, even if a connection request arrives.
    */
  var activationPolicy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The App Engine app IDs that can access this instance. (Deprecated) Applied to First Generation instances only.
    */
  var authorizedGaeApplications: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Availability type. Potential values: *ZONAL*: The instance serves data from only one zone. Outages in that zone affect data accessibility. *REGIONAL*: The instance can serve data from more than one zone in a region (it is highly available). For more information, see Overview of the High Availability Configuration.
    */
  var availabilityType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The daily backup configuration for the instance.
    */
  var backupConfiguration: js.UndefOr[SchemaBackupConfiguration] = js.undefined
  
  /**
    * The name of server Instance collation.
    */
  var collation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Configuration specific to read replica instances. Indicates whether database flags for crash-safe replication are enabled. This property was only applicable to First Generation instances.
    */
  var crashSafeReplicationEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The size of data disk, in GB. The data disk size minimum is 10GB.
    */
  var dataDiskSizeGb: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of data disk: PD_SSD (default) or PD_HDD. Not used for First Generation instances.
    */
  var dataDiskType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The database flags passed to the instance at startup.
    */
  var databaseFlags: js.UndefOr[js.Array[SchemaDatabaseFlags]] = js.undefined
  
  /**
    * Configuration specific to read replica instances. Indicates whether replication is enabled or not.
    */
  var databaseReplicationEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The settings for IP Management. This allows to enable or disable the instance IP and manage which external networks can connect to the instance. The IPv4 address cannot be disabled for Second Generation instances.
    */
  var ipConfiguration: js.UndefOr[SchemaIpConfiguration] = js.undefined
  
  /**
    * This is always *sql#settings*.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The location preference settings. This allows the instance to be located as near as possible to either an App Engine app or Compute Engine zone for better performance. App Engine co-location was only applicable to First Generation instances.
    */
  var locationPreference: js.UndefOr[SchemaLocationPreference] = js.undefined
  
  /**
    * The maintenance window for this instance. This specifies when the instance can be restarted for maintenance purposes.
    */
  var maintenanceWindow: js.UndefOr[SchemaMaintenanceWindow] = js.undefined
  
  /**
    * The pricing plan for this instance. This can be either *PER_USE* or *PACKAGE*. Only *PER_USE* is supported for Second Generation instances.
    */
  var pricingPlan: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of replication this instance uses. This can be either *ASYNCHRONOUS* or *SYNCHRONOUS*. (Deprecated_ This property was only applicable to First Generation instances.
    */
  var replicationType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The version of instance settings. This is a required field for update method to make sure concurrent updates are handled properly. During update, use the most recent settingsVersion value for this instance and do not try to update this value.
    */
  var settingsVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Configuration to increase storage size automatically. The default value is true.
    */
  var storageAutoResize: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The maximum size to which storage capacity can be automatically increased. The default value is 0, which specifies that there is no limit.
    */
  var storageAutoResizeLimit: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The tier (or machine type) for this instance, for example *db-n1-standard-1* (MySQL instances) or *db-custom-1-3840* (PostgreSQL instances).
    */
  var tier: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User-provided labels, represented as a dictionary where each label is a single key value pair.
    */
  var userLabels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaSettings {
  
  inline def apply(): SchemaSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSettings]
  }
  
  extension [Self <: SchemaSettings](x: Self) {
    
    inline def setActivationPolicy(value: String): Self = StObject.set(x, "activationPolicy", value.asInstanceOf[js.Any])
    
    inline def setActivationPolicyNull: Self = StObject.set(x, "activationPolicy", null)
    
    inline def setActivationPolicyUndefined: Self = StObject.set(x, "activationPolicy", js.undefined)
    
    inline def setAuthorizedGaeApplications(value: js.Array[String]): Self = StObject.set(x, "authorizedGaeApplications", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedGaeApplicationsNull: Self = StObject.set(x, "authorizedGaeApplications", null)
    
    inline def setAuthorizedGaeApplicationsUndefined: Self = StObject.set(x, "authorizedGaeApplications", js.undefined)
    
    inline def setAuthorizedGaeApplicationsVarargs(value: String*): Self = StObject.set(x, "authorizedGaeApplications", js.Array(value*))
    
    inline def setAvailabilityType(value: String): Self = StObject.set(x, "availabilityType", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityTypeNull: Self = StObject.set(x, "availabilityType", null)
    
    inline def setAvailabilityTypeUndefined: Self = StObject.set(x, "availabilityType", js.undefined)
    
    inline def setBackupConfiguration(value: SchemaBackupConfiguration): Self = StObject.set(x, "backupConfiguration", value.asInstanceOf[js.Any])
    
    inline def setBackupConfigurationUndefined: Self = StObject.set(x, "backupConfiguration", js.undefined)
    
    inline def setCollation(value: String): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    inline def setCollationNull: Self = StObject.set(x, "collation", null)
    
    inline def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    inline def setCrashSafeReplicationEnabled(value: Boolean): Self = StObject.set(x, "crashSafeReplicationEnabled", value.asInstanceOf[js.Any])
    
    inline def setCrashSafeReplicationEnabledNull: Self = StObject.set(x, "crashSafeReplicationEnabled", null)
    
    inline def setCrashSafeReplicationEnabledUndefined: Self = StObject.set(x, "crashSafeReplicationEnabled", js.undefined)
    
    inline def setDataDiskSizeGb(value: String): Self = StObject.set(x, "dataDiskSizeGb", value.asInstanceOf[js.Any])
    
    inline def setDataDiskSizeGbNull: Self = StObject.set(x, "dataDiskSizeGb", null)
    
    inline def setDataDiskSizeGbUndefined: Self = StObject.set(x, "dataDiskSizeGb", js.undefined)
    
    inline def setDataDiskType(value: String): Self = StObject.set(x, "dataDiskType", value.asInstanceOf[js.Any])
    
    inline def setDataDiskTypeNull: Self = StObject.set(x, "dataDiskType", null)
    
    inline def setDataDiskTypeUndefined: Self = StObject.set(x, "dataDiskType", js.undefined)
    
    inline def setDatabaseFlags(value: js.Array[SchemaDatabaseFlags]): Self = StObject.set(x, "databaseFlags", value.asInstanceOf[js.Any])
    
    inline def setDatabaseFlagsUndefined: Self = StObject.set(x, "databaseFlags", js.undefined)
    
    inline def setDatabaseFlagsVarargs(value: SchemaDatabaseFlags*): Self = StObject.set(x, "databaseFlags", js.Array(value*))
    
    inline def setDatabaseReplicationEnabled(value: Boolean): Self = StObject.set(x, "databaseReplicationEnabled", value.asInstanceOf[js.Any])
    
    inline def setDatabaseReplicationEnabledNull: Self = StObject.set(x, "databaseReplicationEnabled", null)
    
    inline def setDatabaseReplicationEnabledUndefined: Self = StObject.set(x, "databaseReplicationEnabled", js.undefined)
    
    inline def setIpConfiguration(value: SchemaIpConfiguration): Self = StObject.set(x, "ipConfiguration", value.asInstanceOf[js.Any])
    
    inline def setIpConfigurationUndefined: Self = StObject.set(x, "ipConfiguration", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLocationPreference(value: SchemaLocationPreference): Self = StObject.set(x, "locationPreference", value.asInstanceOf[js.Any])
    
    inline def setLocationPreferenceUndefined: Self = StObject.set(x, "locationPreference", js.undefined)
    
    inline def setMaintenanceWindow(value: SchemaMaintenanceWindow): Self = StObject.set(x, "maintenanceWindow", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceWindowUndefined: Self = StObject.set(x, "maintenanceWindow", js.undefined)
    
    inline def setPricingPlan(value: String): Self = StObject.set(x, "pricingPlan", value.asInstanceOf[js.Any])
    
    inline def setPricingPlanNull: Self = StObject.set(x, "pricingPlan", null)
    
    inline def setPricingPlanUndefined: Self = StObject.set(x, "pricingPlan", js.undefined)
    
    inline def setReplicationType(value: String): Self = StObject.set(x, "replicationType", value.asInstanceOf[js.Any])
    
    inline def setReplicationTypeNull: Self = StObject.set(x, "replicationType", null)
    
    inline def setReplicationTypeUndefined: Self = StObject.set(x, "replicationType", js.undefined)
    
    inline def setSettingsVersion(value: String): Self = StObject.set(x, "settingsVersion", value.asInstanceOf[js.Any])
    
    inline def setSettingsVersionNull: Self = StObject.set(x, "settingsVersion", null)
    
    inline def setSettingsVersionUndefined: Self = StObject.set(x, "settingsVersion", js.undefined)
    
    inline def setStorageAutoResize(value: Boolean): Self = StObject.set(x, "storageAutoResize", value.asInstanceOf[js.Any])
    
    inline def setStorageAutoResizeLimit(value: String): Self = StObject.set(x, "storageAutoResizeLimit", value.asInstanceOf[js.Any])
    
    inline def setStorageAutoResizeLimitNull: Self = StObject.set(x, "storageAutoResizeLimit", null)
    
    inline def setStorageAutoResizeLimitUndefined: Self = StObject.set(x, "storageAutoResizeLimit", js.undefined)
    
    inline def setStorageAutoResizeNull: Self = StObject.set(x, "storageAutoResize", null)
    
    inline def setStorageAutoResizeUndefined: Self = StObject.set(x, "storageAutoResize", js.undefined)
    
    inline def setTier(value: String): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    inline def setTierNull: Self = StObject.set(x, "tier", null)
    
    inline def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
    
    inline def setUserLabels(value: StringDictionary[String]): Self = StObject.set(x, "userLabels", value.asInstanceOf[js.Any])
    
    inline def setUserLabelsNull: Self = StObject.set(x, "userLabels", null)
    
    inline def setUserLabelsUndefined: Self = StObject.set(x, "userLabels", js.undefined)
  }
}
