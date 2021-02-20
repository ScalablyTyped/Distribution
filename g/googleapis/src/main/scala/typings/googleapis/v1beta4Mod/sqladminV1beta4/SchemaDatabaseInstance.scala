package typings.googleapis.v1beta4Mod.sqladminV1beta4

import typings.googleapis.anon.Available
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Cloud SQL instance resource.
  */
@js.native
trait SchemaDatabaseInstance extends StObject {
  
  /**
    * FIRST_GEN: First Generation instance. MySQL only. SECOND_GEN: Second
    * Generation instance or PostgreSQL instance. EXTERNAL: A database server
    * that is not managed by Google. This property is read-only; use the tier
    * property in the settings object to determine the database type and Second
    * or First Generation.
    */
  var backendType: js.UndefOr[String] = js.native
  
  /**
    * Connection name of the Cloud SQL instance used in connection strings.
    */
  var connectionName: js.UndefOr[String] = js.native
  
  /**
    * The current disk usage of the instance in bytes. This property has been
    * deprecated. Users should use the
    * &quot;cloudsql.googleapis.com/database/disk/bytes_used&quot; metric in
    * Cloud Monitoring API instead. Please see this announcement for details.
    */
  var currentDiskSize: js.UndefOr[String] = js.native
  
  /**
    * The database engine type and version. The databaseVersion field can not
    * be changed after instance creation. MySQL Second Generation instances:
    * MYSQL_5_7 (default) or MYSQL_5_6. PostgreSQL instances: POSTGRES_9_6
    * (default) or POSTGRES_11 Beta. MySQL First Generation instances:
    * MYSQL_5_6 (default) or MYSQL_5_5
    */
  var databaseVersion: js.UndefOr[String] = js.native
  
  /**
    * Disk encryption configuration specific to an instance. Applies only to
    * Second Generation instances.
    */
  var diskEncryptionConfiguration: js.UndefOr[SchemaDiskEncryptionConfiguration] = js.native
  
  /**
    * Disk encryption status specific to an instance. Applies only to Second
    * Generation instances.
    */
  var diskEncryptionStatus: js.UndefOr[SchemaDiskEncryptionStatus] = js.native
  
  /**
    * This field is deprecated and will be removed from a future version of the
    * API. Use the settings.settingsVersion field instead.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The name and status of the failover replica. This property is applicable
    * only to Second Generation instances.
    */
  var failoverReplica: js.UndefOr[Available] = js.native
  
  /**
    * The Compute Engine zone that the instance is currently serving from. This
    * value could be different from the zone that was specified when the
    * instance was created if the instance has failed over to its secondary
    * zone.
    */
  var gceZone: js.UndefOr[String] = js.native
  
  /**
    * The instance type. This can be one of the following. CLOUD_SQL_INSTANCE:
    * A Cloud SQL instance that is not replicating from a master.
    * ON_PREMISES_INSTANCE: An instance running on the customer&#39;s premises.
    * READ_REPLICA_INSTANCE: A Cloud SQL instance configured as a read-replica.
    */
  var instanceType: js.UndefOr[String] = js.native
  
  /**
    * The assigned IP addresses for the instance.
    */
  var ipAddresses: js.UndefOr[js.Array[SchemaIpMapping]] = js.native
  
  /**
    * The IPv6 address assigned to the instance. This property is applicable
    * only to First Generation instances.
    */
  var ipv6Address: js.UndefOr[String] = js.native
  
  /**
    * This is always sql#instance.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The name of the instance which will act as master in the replication
    * setup.
    */
  var masterInstanceName: js.UndefOr[String] = js.native
  
  /**
    * The maximum disk size of the instance in bytes.
    */
  var maxDiskSize: js.UndefOr[String] = js.native
  
  /**
    * Name of the Cloud SQL instance. This does not include the project ID.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Configuration specific to on-premises instances.
    */
  var onPremisesConfiguration: js.UndefOr[SchemaOnPremisesConfiguration] = js.native
  
  /**
    * The project ID of the project containing the Cloud SQL instance. The
    * Google apps domain is prefixed if applicable.
    */
  var project: js.UndefOr[String] = js.native
  
  /**
    * The geographical region. Can be us-central (FIRST_GEN instances only),
    * us-central1 (SECOND_GEN instances only), asia-east1 or europe-west1.
    * Defaults to us-central or us-central1 depending on the instance type
    * (First Generation or Second Generation). The region can not be changed
    * after instance creation.
    */
  var region: js.UndefOr[String] = js.native
  
  /**
    * Configuration specific to failover replicas and read replicas.
    */
  var replicaConfiguration: js.UndefOr[SchemaReplicaConfiguration] = js.native
  
  /**
    * The replicas of the instance.
    */
  var replicaNames: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The URI of this resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * SSL configuration.
    */
  var serverCaCert: js.UndefOr[SchemaSslCert] = js.native
  
  /**
    * The service account email address assigned to the instance. This property
    * is applicable only to Second Generation instances.
    */
  var serviceAccountEmailAddress: js.UndefOr[String] = js.native
  
  /**
    * The user settings.
    */
  var settings: js.UndefOr[SchemaSettings] = js.native
  
  /**
    * The current serving state of the Cloud SQL instance. This can be one of
    * the following. RUNNABLE: The instance is running, or is ready to run when
    * accessed. SUSPENDED: The instance is not available, for example due to
    * problems with billing. PENDING_CREATE: The instance is being created.
    * MAINTENANCE: The instance is down for maintenance. FAILED: The instance
    * creation failed. UNKNOWN_STATE: The state of the instance is unknown.
    */
  var state: js.UndefOr[String] = js.native
  
  /**
    * If the instance state is SUSPENDED, the reason for the suspension.
    */
  var suspensionReason: js.UndefOr[js.Array[String]] = js.native
}
object SchemaDatabaseInstance {
  
  @scala.inline
  def apply(): SchemaDatabaseInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatabaseInstance]
  }
  
  @scala.inline
  implicit class SchemaDatabaseInstanceMutableBuilder[Self <: SchemaDatabaseInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackendType(value: String): Self = StObject.set(x, "backendType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendTypeUndefined: Self = StObject.set(x, "backendType", js.undefined)
    
    @scala.inline
    def setConnectionName(value: String): Self = StObject.set(x, "connectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionNameUndefined: Self = StObject.set(x, "connectionName", js.undefined)
    
    @scala.inline
    def setCurrentDiskSize(value: String): Self = StObject.set(x, "currentDiskSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentDiskSizeUndefined: Self = StObject.set(x, "currentDiskSize", js.undefined)
    
    @scala.inline
    def setDatabaseVersion(value: String): Self = StObject.set(x, "databaseVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseVersionUndefined: Self = StObject.set(x, "databaseVersion", js.undefined)
    
    @scala.inline
    def setDiskEncryptionConfiguration(value: SchemaDiskEncryptionConfiguration): Self = StObject.set(x, "diskEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskEncryptionConfigurationUndefined: Self = StObject.set(x, "diskEncryptionConfiguration", js.undefined)
    
    @scala.inline
    def setDiskEncryptionStatus(value: SchemaDiskEncryptionStatus): Self = StObject.set(x, "diskEncryptionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskEncryptionStatusUndefined: Self = StObject.set(x, "diskEncryptionStatus", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setFailoverReplica(value: Available): Self = StObject.set(x, "failoverReplica", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailoverReplicaUndefined: Self = StObject.set(x, "failoverReplica", js.undefined)
    
    @scala.inline
    def setGceZone(value: String): Self = StObject.set(x, "gceZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGceZoneUndefined: Self = StObject.set(x, "gceZone", js.undefined)
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
    
    @scala.inline
    def setIpAddresses(value: js.Array[SchemaIpMapping]): Self = StObject.set(x, "ipAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressesUndefined: Self = StObject.set(x, "ipAddresses", js.undefined)
    
    @scala.inline
    def setIpAddressesVarargs(value: SchemaIpMapping*): Self = StObject.set(x, "ipAddresses", js.Array(value :_*))
    
    @scala.inline
    def setIpv6Address(value: String): Self = StObject.set(x, "ipv6Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6AddressUndefined: Self = StObject.set(x, "ipv6Address", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMasterInstanceName(value: String): Self = StObject.set(x, "masterInstanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterInstanceNameUndefined: Self = StObject.set(x, "masterInstanceName", js.undefined)
    
    @scala.inline
    def setMaxDiskSize(value: String): Self = StObject.set(x, "maxDiskSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDiskSizeUndefined: Self = StObject.set(x, "maxDiskSize", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOnPremisesConfiguration(value: SchemaOnPremisesConfiguration): Self = StObject.set(x, "onPremisesConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPremisesConfigurationUndefined: Self = StObject.set(x, "onPremisesConfiguration", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setReplicaConfiguration(value: SchemaReplicaConfiguration): Self = StObject.set(x, "replicaConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaConfigurationUndefined: Self = StObject.set(x, "replicaConfiguration", js.undefined)
    
    @scala.inline
    def setReplicaNames(value: js.Array[String]): Self = StObject.set(x, "replicaNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaNamesUndefined: Self = StObject.set(x, "replicaNames", js.undefined)
    
    @scala.inline
    def setReplicaNamesVarargs(value: String*): Self = StObject.set(x, "replicaNames", js.Array(value :_*))
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setServerCaCert(value: SchemaSslCert): Self = StObject.set(x, "serverCaCert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerCaCertUndefined: Self = StObject.set(x, "serverCaCert", js.undefined)
    
    @scala.inline
    def setServiceAccountEmailAddress(value: String): Self = StObject.set(x, "serviceAccountEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountEmailAddressUndefined: Self = StObject.set(x, "serviceAccountEmailAddress", js.undefined)
    
    @scala.inline
    def setSettings(value: SchemaSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setSuspensionReason(value: js.Array[String]): Self = StObject.set(x, "suspensionReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspensionReasonUndefined: Self = StObject.set(x, "suspensionReason", js.undefined)
    
    @scala.inline
    def setSuspensionReasonVarargs(value: String*): Self = StObject.set(x, "suspensionReason", js.Array(value :_*))
  }
}
