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
  def apply(): SchemaBackupConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackupConfiguration]
  }
  @scala.inline
  implicit class SchemaBackupConfigurationOps[Self <: SchemaBackupConfiguration] (val x: Self) extends AnyVal {
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
    def setBinaryLogEnabled(value: Boolean): Self = this.set("binaryLogEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinaryLogEnabled: Self = this.set("binaryLogEnabled", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setReplicationLogArchivingEnabled(value: Boolean): Self = this.set("replicationLogArchivingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationLogArchivingEnabled: Self = this.set("replicationLogArchivingEnabled", js.undefined)
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
  
}

