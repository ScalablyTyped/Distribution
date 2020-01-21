package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the status of upload.
  */
@js.native
trait SchemaUploadStatus extends js.Object {
  /**
    * Reasons why upload can&#39;t be completed.
    */
  var errors: js.UndefOr[js.Array[String]] = js.native
  /**
    * Per-row upload status.
    */
  var rowStatus: js.UndefOr[js.Array[SchemaRowStatus]] = js.native
}

object SchemaUploadStatus {
  @scala.inline
  def apply(errors: js.Array[String] = null, rowStatus: js.Array[SchemaRowStatus] = null): SchemaUploadStatus = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (rowStatus != null) __obj.updateDynamic("rowStatus")(rowStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUploadStatus]
  }
}

