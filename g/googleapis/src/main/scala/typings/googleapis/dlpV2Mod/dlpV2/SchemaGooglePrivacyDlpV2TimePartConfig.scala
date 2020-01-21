package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * For use with `Date`, `Timestamp`, and `TimeOfDay`, extract or preserve a
  * portion of the value.
  */
@js.native
trait SchemaGooglePrivacyDlpV2TimePartConfig extends js.Object {
  var partToExtract: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2TimePartConfig {
  @scala.inline
  def apply(partToExtract: String = null): SchemaGooglePrivacyDlpV2TimePartConfig = {
    val __obj = js.Dynamic.literal()
    if (partToExtract != null) __obj.updateDynamic("partToExtract")(partToExtract.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2TimePartConfig]
  }
}

