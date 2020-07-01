package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database instance demote master context.
  */
@js.native
trait SchemaDemoteMasterContext extends js.Object {
  /**
    * This is always sql#demoteMasterContext.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name of the instance which will act as on-premises master in the
    * replication setup.
    */
  var masterInstanceName: js.UndefOr[String] = js.native
  /**
    * Configuration specific to read-replicas replicating from the on-premises
    * master.
    */
  var replicaConfiguration: js.UndefOr[SchemaDemoteMasterConfiguration] = js.native
  /**
    * Verify GTID consistency for demote operation. Default value: True. Second
    * Generation instances only. Setting this flag to false enables you to
    * bypass GTID consistency check between on-premises master and Cloud SQL
    * instance during the demotion operation but also exposes you to the risk
    * of future replication failures. Change the value only if you know the
    * reason for the GTID divergence and are confident that doing so will not
    * cause any replication issues.
    */
  var verifyGtidConsistency: js.UndefOr[Boolean] = js.native
}

object SchemaDemoteMasterContext {
  @scala.inline
  def apply(
    kind: String = null,
    masterInstanceName: String = null,
    replicaConfiguration: SchemaDemoteMasterConfiguration = null,
    verifyGtidConsistency: js.UndefOr[Boolean] = js.undefined
  ): SchemaDemoteMasterContext = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (masterInstanceName != null) __obj.updateDynamic("masterInstanceName")(masterInstanceName.asInstanceOf[js.Any])
    if (replicaConfiguration != null) __obj.updateDynamic("replicaConfiguration")(replicaConfiguration.asInstanceOf[js.Any])
    if (!js.isUndefined(verifyGtidConsistency)) __obj.updateDynamic("verifyGtidConsistency")(verifyGtidConsistency.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDemoteMasterContext]
  }
}

