package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Read-replica configuration for connecting to the master.
  */
@js.native
trait SchemaReplicaConfiguration extends js.Object {
  /**
    * Specifies if the replica is the failover target. If the field is set to
    * true the replica will be designated as a failover replica. In case the
    * master instance fails, the replica instance will be promoted as the new
    * master instance. Only one replica can be specified as failover target,
    * and the replica has to be in different zone with the master instance.
    */
  var failoverTarget: js.UndefOr[Boolean] = js.native
  /**
    * This is always sql#replicaConfiguration.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * MySQL specific configuration when replicating from a MySQL on-premises
    * master. Replication configuration information such as the username,
    * password, certificates, and keys are not stored in the instance metadata.
    * The configuration information is used only to set up the replication
    * connection and is stored by MySQL in a file named master.info in the data
    * directory.
    */
  var mysqlReplicaConfiguration: js.UndefOr[SchemaMySqlReplicaConfiguration] = js.native
}

object SchemaReplicaConfiguration {
  @scala.inline
  def apply(
    failoverTarget: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    mysqlReplicaConfiguration: SchemaMySqlReplicaConfiguration = null
  ): SchemaReplicaConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(failoverTarget)) __obj.updateDynamic("failoverTarget")(failoverTarget.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (mysqlReplicaConfiguration != null) __obj.updateDynamic("mysqlReplicaConfiguration")(mysqlReplicaConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReplicaConfiguration]
  }
}

