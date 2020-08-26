package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database instance restore backup request.
  */
@js.native
trait SchemaInstancesRestoreBackupRequest extends js.Object {
  /**
    * Parameters required to perform the restore backup operation.
    */
  var restoreBackupContext: js.UndefOr[SchemaRestoreBackupContext] = js.native
}

object SchemaInstancesRestoreBackupRequest {
  @scala.inline
  def apply(): SchemaInstancesRestoreBackupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesRestoreBackupRequest]
  }
  @scala.inline
  implicit class SchemaInstancesRestoreBackupRequestOps[Self <: SchemaInstancesRestoreBackupRequest] (val x: Self) extends AnyVal {
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
    def setRestoreBackupContext(value: SchemaRestoreBackupContext): Self = this.set("restoreBackupContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestoreBackupContext: Self = this.set("restoreBackupContext", js.undefined)
  }
  
}

