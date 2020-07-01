package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database instance backup configuration.
  */
@js.native
trait SchemaBackupConfiguration extends js.Object {
  /**
    * Whether binary log is enabled. If backup configuration is disabled,
    * binary log must be disabled as well.
    */
  var binaryLogEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether this configuration is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * This is always sql#backupConfiguration.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Reserved for future use.
    */
  var replicationLogArchivingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Start time for the daily backup configuration in UTC timezone in the 24
    * hour format - HH:MM.
    */
  var startTime: js.UndefOr[String] = js.native
}

object SchemaBackupConfiguration {
  @scala.inline
  def apply(
    binaryLogEnabled: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    replicationLogArchivingEnabled: js.UndefOr[Boolean] = js.undefined,
    startTime: String = null
  ): SchemaBackupConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(binaryLogEnabled)) __obj.updateDynamic("binaryLogEnabled")(binaryLogEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(replicationLogArchivingEnabled)) __obj.updateDynamic("replicationLogArchivingEnabled")(replicationLogArchivingEnabled.get.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBackupConfiguration]
  }
}

