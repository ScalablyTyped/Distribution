package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for hangouts chat export.
  */
@js.native
trait SchemaHangoutsChatExportOptions extends js.Object {
  /**
    * The export format for hangouts chat export.
    */
  var exportFormat: js.UndefOr[String] = js.native
}

object SchemaHangoutsChatExportOptions {
  @scala.inline
  def apply(exportFormat: String = null): SchemaHangoutsChatExportOptions = {
    val __obj = js.Dynamic.literal()
    if (exportFormat != null) __obj.updateDynamic("exportFormat")(exportFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHangoutsChatExportOptions]
  }
}

