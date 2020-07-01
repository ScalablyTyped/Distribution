package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGooglePrivacyDlpV2TimeZone extends js.Object {
  /**
    * Set only if the offset can be determined. Positive for time ahead of UTC.
    * E.g. For &quot;UTC-9&quot;, this value is -540.
    */
  var offsetMinutes: js.UndefOr[Double] = js.native
}

object SchemaGooglePrivacyDlpV2TimeZone {
  @scala.inline
  def apply(offsetMinutes: js.UndefOr[Double] = js.undefined): SchemaGooglePrivacyDlpV2TimeZone = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(offsetMinutes)) __obj.updateDynamic("offsetMinutes")(offsetMinutes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2TimeZone]
  }
}

