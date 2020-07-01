package typings.googleapis.v1beta4Mod.sqladminV1beta4

import typings.googleapis.anon.Available
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Cloud SQL instance resource.
  */
@js.native
trait SchemaDatabaseInstance extends js.Object {
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
  def apply(
    backendType: String = null,
    connectionName: String = null,
    currentDiskSize: String = null,
    databaseVersion: String = null,
    diskEncryptionConfiguration: SchemaDiskEncryptionConfiguration = null,
    diskEncryptionStatus: SchemaDiskEncryptionStatus = null,
    etag: String = null,
    failoverReplica: Available = null,
    gceZone: String = null,
    instanceType: String = null,
    ipAddresses: js.Array[SchemaIpMapping] = null,
    ipv6Address: String = null,
    kind: String = null,
    masterInstanceName: String = null,
    maxDiskSize: String = null,
    name: String = null,
    onPremisesConfiguration: SchemaOnPremisesConfiguration = null,
    project: String = null,
    region: String = null,
    replicaConfiguration: SchemaReplicaConfiguration = null,
    replicaNames: js.Array[String] = null,
    selfLink: String = null,
    serverCaCert: SchemaSslCert = null,
    serviceAccountEmailAddress: String = null,
    settings: SchemaSettings = null,
    state: String = null,
    suspensionReason: js.Array[String] = null
  ): SchemaDatabaseInstance = {
    val __obj = js.Dynamic.literal()
    if (backendType != null) __obj.updateDynamic("backendType")(backendType.asInstanceOf[js.Any])
    if (connectionName != null) __obj.updateDynamic("connectionName")(connectionName.asInstanceOf[js.Any])
    if (currentDiskSize != null) __obj.updateDynamic("currentDiskSize")(currentDiskSize.asInstanceOf[js.Any])
    if (databaseVersion != null) __obj.updateDynamic("databaseVersion")(databaseVersion.asInstanceOf[js.Any])
    if (diskEncryptionConfiguration != null) __obj.updateDynamic("diskEncryptionConfiguration")(diskEncryptionConfiguration.asInstanceOf[js.Any])
    if (diskEncryptionStatus != null) __obj.updateDynamic("diskEncryptionStatus")(diskEncryptionStatus.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (failoverReplica != null) __obj.updateDynamic("failoverReplica")(failoverReplica.asInstanceOf[js.Any])
    if (gceZone != null) __obj.updateDynamic("gceZone")(gceZone.asInstanceOf[js.Any])
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType.asInstanceOf[js.Any])
    if (ipAddresses != null) __obj.updateDynamic("ipAddresses")(ipAddresses.asInstanceOf[js.Any])
    if (ipv6Address != null) __obj.updateDynamic("ipv6Address")(ipv6Address.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (masterInstanceName != null) __obj.updateDynamic("masterInstanceName")(masterInstanceName.asInstanceOf[js.Any])
    if (maxDiskSize != null) __obj.updateDynamic("maxDiskSize")(maxDiskSize.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onPremisesConfiguration != null) __obj.updateDynamic("onPremisesConfiguration")(onPremisesConfiguration.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (replicaConfiguration != null) __obj.updateDynamic("replicaConfiguration")(replicaConfiguration.asInstanceOf[js.Any])
    if (replicaNames != null) __obj.updateDynamic("replicaNames")(replicaNames.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (serverCaCert != null) __obj.updateDynamic("serverCaCert")(serverCaCert.asInstanceOf[js.Any])
    if (serviceAccountEmailAddress != null) __obj.updateDynamic("serviceAccountEmailAddress")(serviceAccountEmailAddress.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (suspensionReason != null) __obj.updateDynamic("suspensionReason")(suspensionReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDatabaseInstance]
  }
}

