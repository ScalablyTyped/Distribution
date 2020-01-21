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
  def apply(restoreBackupContext: SchemaRestoreBackupContext = null): SchemaInstancesRestoreBackupRequest = {
    val __obj = js.Dynamic.literal()
    if (restoreBackupContext != null) __obj.updateDynamic("restoreBackupContext")(restoreBackupContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstancesRestoreBackupRequest]
  }
}

