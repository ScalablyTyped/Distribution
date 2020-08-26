package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database instance restore from backup context.
  */
@js.native
trait SchemaRestoreBackupContext extends js.Object {
  /**
    * The ID of the backup run to restore from.
    */
  var backupRunId: js.UndefOr[String] = js.native
  /**
    * The ID of the instance that the backup was taken from.
    */
  var instanceId: js.UndefOr[String] = js.native
  /**
    * This is always sql#restoreBackupContext.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaRestoreBackupContext {
  @scala.inline
  def apply(): SchemaRestoreBackupContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRestoreBackupContext]
  }
  @scala.inline
  implicit class SchemaRestoreBackupContextOps[Self <: SchemaRestoreBackupContext] (val x: Self) extends AnyVal {
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
    def setBackupRunId(value: String): Self = this.set("backupRunId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupRunId: Self = this.set("backupRunId", js.undefined)
    @scala.inline
    def setInstanceId(value: String): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("instanceId", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

