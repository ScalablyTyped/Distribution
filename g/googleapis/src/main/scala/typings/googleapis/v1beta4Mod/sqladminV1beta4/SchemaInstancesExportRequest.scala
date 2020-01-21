package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database instance export request.
  */
@js.native
trait SchemaInstancesExportRequest extends js.Object {
  /**
    * Contains details about the export operation.
    */
  var exportContext: js.UndefOr[SchemaExportContext] = js.native
}

object SchemaInstancesExportRequest {
  @scala.inline
  def apply(exportContext: SchemaExportContext = null): SchemaInstancesExportRequest = {
    val __obj = js.Dynamic.literal()
    if (exportContext != null) __obj.updateDynamic("exportContext")(exportContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstancesExportRequest]
  }
}

