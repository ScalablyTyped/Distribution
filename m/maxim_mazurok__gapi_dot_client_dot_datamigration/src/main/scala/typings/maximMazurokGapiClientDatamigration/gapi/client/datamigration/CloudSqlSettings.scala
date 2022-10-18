package typings.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudSqlSettings extends StObject {
  
  /**
    * The activation policy specifies when the instance is activated; it is applicable only when the instance state is 'RUNNABLE'. Valid values: 'ALWAYS': The instance is on, and remains
    * so even in the absence of connection requests. `NEVER`: The instance is off; it is not activated, even if a connection request arrives.
    */
  var activationPolicy: js.UndefOr[String] = js.undefined
  
  /**
    * [default: ON] If you enable this setting, Cloud SQL checks your available storage every 30 seconds. If the available storage falls below a threshold size, Cloud SQL automatically
    * adds additional storage capacity. If the available storage repeatedly falls below the threshold size, Cloud SQL continues to add storage until it reaches the maximum of 30 TB.
    */
  var autoStorageIncrease: js.UndefOr[Boolean] = js.undefined
  
  /** The KMS key name used for the csql instance. */
  var cmekKeyName: js.UndefOr[String] = js.undefined
  
  /** The Cloud SQL default instance level collation. */
  var collation: js.UndefOr[String] = js.undefined
  
  /** The storage capacity available to the database, in GB. The minimum (and default) size is 10GB. */
  var dataDiskSizeGb: js.UndefOr[String] = js.undefined
  
  /** The type of storage: `PD_SSD` (default) or `PD_HDD`. */
  var dataDiskType: js.UndefOr[String] = js.undefined
  
  /** The database flags passed to the Cloud SQL instance at startup. An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }. */
  var databaseFlags: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** The database engine type and version. */
  var databaseVersion: js.UndefOr[String] = js.undefined
  
  /** The settings for IP Management. This allows to enable or disable the instance IP and manage which external networks can connect to the instance. The IPv4 address cannot be disabled. */
  var ipConfig: js.UndefOr[SqlIpConfig] = js.undefined
  
  /** Input only. Initial root password. */
  var rootPassword: js.UndefOr[String] = js.undefined
  
  /** Output only. Indicates If this connection profile root password is stored. */
  var rootPasswordSet: js.UndefOr[Boolean] = js.undefined
  
  /** The Database Migration Service source connection profile ID, in the format: `projects/my_project_name/locations/us-central1/connectionProfiles/connection_profile_ID` */
  var sourceId: js.UndefOr[String] = js.undefined
  
  /** The maximum size to which storage capacity can be automatically increased. The default value is 0, which specifies that there is no limit. */
  var storageAutoResizeLimit: js.UndefOr[String] = js.undefined
  
  /**
    * The tier (or machine type) for this instance, for example: `db-n1-standard-1` (MySQL instances) or `db-custom-1-3840` (PostgreSQL instances). For more information, see [Cloud SQL
    * Instance Settings](https://cloud.google.com/sql/docs/mysql/instance-settings).
    */
  var tier: js.UndefOr[String] = js.undefined
  
  /**
    * The resource labels for a Cloud SQL instance to use to annotate any related underlying resources such as Compute Engine VMs. An object containing a list of "key": "value" pairs.
    * Example: `{ "name": "wrench", "mass": "18kg", "count": "3" }`.
    */
  var userLabels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** The Google Cloud Platform zone where your Cloud SQL datdabse instance is located. */
  var zone: js.UndefOr[String] = js.undefined
}
object CloudSqlSettings {
  
  inline def apply(): CloudSqlSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudSqlSettings]
  }
  
  extension [Self <: CloudSqlSettings](x: Self) {
    
    inline def setActivationPolicy(value: String): Self = StObject.set(x, "activationPolicy", value.asInstanceOf[js.Any])
    
    inline def setActivationPolicyUndefined: Self = StObject.set(x, "activationPolicy", js.undefined)
    
    inline def setAutoStorageIncrease(value: Boolean): Self = StObject.set(x, "autoStorageIncrease", value.asInstanceOf[js.Any])
    
    inline def setAutoStorageIncreaseUndefined: Self = StObject.set(x, "autoStorageIncrease", js.undefined)
    
    inline def setCmekKeyName(value: String): Self = StObject.set(x, "cmekKeyName", value.asInstanceOf[js.Any])
    
    inline def setCmekKeyNameUndefined: Self = StObject.set(x, "cmekKeyName", js.undefined)
    
    inline def setCollation(value: String): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    inline def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    inline def setDataDiskSizeGb(value: String): Self = StObject.set(x, "dataDiskSizeGb", value.asInstanceOf[js.Any])
    
    inline def setDataDiskSizeGbUndefined: Self = StObject.set(x, "dataDiskSizeGb", js.undefined)
    
    inline def setDataDiskType(value: String): Self = StObject.set(x, "dataDiskType", value.asInstanceOf[js.Any])
    
    inline def setDataDiskTypeUndefined: Self = StObject.set(x, "dataDiskType", js.undefined)
    
    inline def setDatabaseFlags(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "databaseFlags", value.asInstanceOf[js.Any])
    
    inline def setDatabaseFlagsUndefined: Self = StObject.set(x, "databaseFlags", js.undefined)
    
    inline def setDatabaseVersion(value: String): Self = StObject.set(x, "databaseVersion", value.asInstanceOf[js.Any])
    
    inline def setDatabaseVersionUndefined: Self = StObject.set(x, "databaseVersion", js.undefined)
    
    inline def setIpConfig(value: SqlIpConfig): Self = StObject.set(x, "ipConfig", value.asInstanceOf[js.Any])
    
    inline def setIpConfigUndefined: Self = StObject.set(x, "ipConfig", js.undefined)
    
    inline def setRootPassword(value: String): Self = StObject.set(x, "rootPassword", value.asInstanceOf[js.Any])
    
    inline def setRootPasswordSet(value: Boolean): Self = StObject.set(x, "rootPasswordSet", value.asInstanceOf[js.Any])
    
    inline def setRootPasswordSetUndefined: Self = StObject.set(x, "rootPasswordSet", js.undefined)
    
    inline def setRootPasswordUndefined: Self = StObject.set(x, "rootPassword", js.undefined)
    
    inline def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setSourceIdUndefined: Self = StObject.set(x, "sourceId", js.undefined)
    
    inline def setStorageAutoResizeLimit(value: String): Self = StObject.set(x, "storageAutoResizeLimit", value.asInstanceOf[js.Any])
    
    inline def setStorageAutoResizeLimitUndefined: Self = StObject.set(x, "storageAutoResizeLimit", js.undefined)
    
    inline def setTier(value: String): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    inline def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
    
    inline def setUserLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "userLabels", value.asInstanceOf[js.Any])
    
    inline def setUserLabelsUndefined: Self = StObject.set(x, "userLabels", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
