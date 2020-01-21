package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Location of a finding within a table.
  */
@js.native
trait SchemaGooglePrivacyDlpV2TableLocation extends js.Object {
  /**
    * The zero-based index of the row where the finding is located.
    */
  var rowIndex: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2TableLocation {
  @scala.inline
  def apply(rowIndex: String = null): SchemaGooglePrivacyDlpV2TableLocation = {
    val __obj = js.Dynamic.literal()
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2TableLocation]
  }
}

