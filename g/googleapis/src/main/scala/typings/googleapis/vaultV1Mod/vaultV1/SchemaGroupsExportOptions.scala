package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for groups export.
  */
@js.native
trait SchemaGroupsExportOptions extends js.Object {
  /**
    * The export format for groups export.
    */
  var exportFormat: js.UndefOr[String] = js.native
}

object SchemaGroupsExportOptions {
  @scala.inline
  def apply(exportFormat: String = null): SchemaGroupsExportOptions = {
    val __obj = js.Dynamic.literal()
    if (exportFormat != null) __obj.updateDynamic("exportFormat")(exportFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGroupsExportOptions]
  }
}

