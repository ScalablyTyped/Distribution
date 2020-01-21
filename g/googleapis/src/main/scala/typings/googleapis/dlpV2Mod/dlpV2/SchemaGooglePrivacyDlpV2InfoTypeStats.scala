package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Statistics regarding a specific InfoType.
  */
@js.native
trait SchemaGooglePrivacyDlpV2InfoTypeStats extends js.Object {
  /**
    * Number of findings for this infoType.
    */
  var count: js.UndefOr[String] = js.native
  /**
    * The type of finding this stat is for.
    */
  var infoType: js.UndefOr[SchemaGooglePrivacyDlpV2InfoType] = js.native
}

object SchemaGooglePrivacyDlpV2InfoTypeStats {
  @scala.inline
  def apply(count: String = null, infoType: SchemaGooglePrivacyDlpV2InfoType = null): SchemaGooglePrivacyDlpV2InfoTypeStats = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (infoType != null) __obj.updateDynamic("infoType")(infoType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InfoTypeStats]
  }
}

