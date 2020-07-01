package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for mail export.
  */
@js.native
trait SchemaMailExportOptions extends js.Object {
  /**
    * The export file format.
    */
  var exportFormat: js.UndefOr[String] = js.native
  /**
    * Set to true to export confidential mode content.
    */
  var showConfidentialModeContent: js.UndefOr[Boolean] = js.native
}

object SchemaMailExportOptions {
  @scala.inline
  def apply(exportFormat: String = null, showConfidentialModeContent: js.UndefOr[Boolean] = js.undefined): SchemaMailExportOptions = {
    val __obj = js.Dynamic.literal()
    if (exportFormat != null) __obj.updateDynamic("exportFormat")(exportFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(showConfidentialModeContent)) __obj.updateDynamic("showConfidentialModeContent")(showConfidentialModeContent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMailExportOptions]
  }
}

