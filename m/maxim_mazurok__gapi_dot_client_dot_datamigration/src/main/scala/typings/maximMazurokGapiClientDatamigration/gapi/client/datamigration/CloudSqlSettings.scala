package typings.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudSqlSettings extends StObject {
  
  /**
    * The activation policy specifies when the instance is activated; it is applicable only when the instance state is 'RUNNABLE'. Valid values: 'ALWAYS': The instance is on, and remains
    * so even in the absence of connection requests. `NEVER`: The instance is off; it is not activated, even if a connection request arrives.
    */
  var activationPolicy: js.UndefOr[String] = js.native
  
  /**
    * [default: ON] If you enable this setting, Cloud SQL checks your available storage every 30 seconds. If the available storage falls below a threshold size, Cloud SQL automatically
    * adds additional storage capacity. If the available storage repeatedly falls below the threshold size, Cloud SQL continues to add storage until it reaches the maximum of 30 TB.
    */
  var autoStorageIncrease: js.UndefOr[Boolean] = js.native
  
  /** The storage capacity available to the database, in GB. The minimum (and default) size is 10GB. */
  var dataDiskSizeGb: js.UndefOr[String] = js.native
  
  /** The type of storage: `PD_SSD` (default) or `PD_HDD`. */
  var dataDiskType: js.UndefOr[String] = js.native
  
  /** The database flags passed to the Cloud SQL instance at startup. An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }. */
  var databaseFlags: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDatamigration.maximMazurokGapiClientDatamigrationStrings.CloudSqlSettings with TopLevel[js.Any]
  ] = js.native
  
  /** The database engine type and version (such as `MYSQL_5_7` / `POSTGRES_9_6`). */
  var databaseVersion: js.UndefOr[String] = js.native
  
  /** The settings for IP Management. This allows to enable or disable the instance IP and manage which external networks can connect to the instance. The IPv4 address cannot be disabled. */
  var ipConfig: js.UndefOr[SqlIpConfig] = js.native
  
  /** Input only. Initial root password. */
  var rootPassword: js.UndefOr[String] = js.native
  
  /** Output only. Indicates If this connection profile root password is stored. */
  var rootPasswordSet: js.UndefOr[Boolean] = js.native
  
  /** The Database Migration Service source connection profile ID, in the format: `projects/my_project_name/locations/us-central1/connectionProfiles/connection_profile_ID` */
  var sourceId: js.UndefOr[String] = js.native
  
  /** The maximum size to which storage capacity can be automatically increased. The default value is 0, which specifies that there is no limit. */
  var storageAutoResizeLimit: js.UndefOr[String] = js.native
  
  /**
    * The tier (or machine type) for this instance, for example: `db-n1-standard-1` (MySQL instances) or `db-custom-1-3840` (PostgreSQL instances). For more information, see [Cloud SQL
    * Instance Settings](https://cloud.google.com/sql/docs/mysql/instance-settings).
    */
  var tier: js.UndefOr[String] = js.native
  
  /**
    * The resource labels for a Cloud SQL instance to use to annotate any related underlying resources such as Compute Engine VMs. An object containing a list of "key": "value" pairs.
    * Example: `{ "name": "wrench", "mass": "18kg", "count": "3" }`.
    */
  var userLabels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDatamigration.maximMazurokGapiClientDatamigrationStrings.CloudSqlSettings with TopLevel[js.Any]
  ] = js.native
  
  /** The Google Cloud Platform zone where your Cloud SQL datdabse instance is located. */
  var zone: js.UndefOr[String] = js.native
}
object CloudSqlSettings {
  
  @scala.inline
  def apply(): CloudSqlSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudSqlSettings]
  }
  
  @scala.inline
  implicit class CloudSqlSettingsMutableBuilder[Self <: CloudSqlSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivationPolicy(value: String): Self = StObject.set(x, "activationPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivationPolicyUndefined: Self = StObject.set(x, "activationPolicy", js.undefined)
    
    @scala.inline
    def setAutoStorageIncrease(value: Boolean): Self = StObject.set(x, "autoStorageIncrease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoStorageIncreaseUndefined: Self = StObject.set(x, "autoStorageIncrease", js.undefined)
    
    @scala.inline
    def setDataDiskSizeGb(value: String): Self = StObject.set(x, "dataDiskSizeGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataDiskSizeGbUndefined: Self = StObject.set(x, "dataDiskSizeGb", js.undefined)
    
    @scala.inline
    def setDataDiskType(value: String): Self = StObject.set(x, "dataDiskType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataDiskTypeUndefined: Self = StObject.set(x, "dataDiskType", js.undefined)
    
    @scala.inline
    def setDatabaseFlags(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDatamigration.maximMazurokGapiClientDatamigrationStrings.CloudSqlSettings with TopLevel[js.Any]
    ): Self = StObject.set(x, "databaseFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseFlagsUndefined: Self = StObject.set(x, "databaseFlags", js.undefined)
    
    @scala.inline
    def setDatabaseVersion(value: String): Self = StObject.set(x, "databaseVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseVersionUndefined: Self = StObject.set(x, "databaseVersion", js.undefined)
    
    @scala.inline
    def setIpConfig(value: SqlIpConfig): Self = StObject.set(x, "ipConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpConfigUndefined: Self = StObject.set(x, "ipConfig", js.undefined)
    
    @scala.inline
    def setRootPassword(value: String): Self = StObject.set(x, "rootPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootPasswordSet(value: Boolean): Self = StObject.set(x, "rootPasswordSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootPasswordSetUndefined: Self = StObject.set(x, "rootPasswordSet", js.undefined)
    
    @scala.inline
    def setRootPasswordUndefined: Self = StObject.set(x, "rootPassword", js.undefined)
    
    @scala.inline
    def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIdUndefined: Self = StObject.set(x, "sourceId", js.undefined)
    
    @scala.inline
    def setStorageAutoResizeLimit(value: String): Self = StObject.set(x, "storageAutoResizeLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageAutoResizeLimitUndefined: Self = StObject.set(x, "storageAutoResizeLimit", js.undefined)
    
    @scala.inline
    def setTier(value: String): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
    
    @scala.inline
    def setUserLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDatamigration.maximMazurokGapiClientDatamigrationStrings.CloudSqlSettings with TopLevel[js.Any]
    ): Self = StObject.set(x, "userLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserLabelsUndefined: Self = StObject.set(x, "userLabels", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
