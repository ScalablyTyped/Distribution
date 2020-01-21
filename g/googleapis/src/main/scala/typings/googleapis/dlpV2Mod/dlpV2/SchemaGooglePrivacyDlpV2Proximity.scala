package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message for specifying a window around a finding to apply a detection rule.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Proximity extends js.Object {
  /**
    * Number of characters after the finding to consider.
    */
  var windowAfter: js.UndefOr[Double] = js.native
  /**
    * Number of characters before the finding to consider.
    */
  var windowBefore: js.UndefOr[Double] = js.native
}

object SchemaGooglePrivacyDlpV2Proximity {
  @scala.inline
  def apply(windowAfter: Int | Double = null, windowBefore: Int | Double = null): SchemaGooglePrivacyDlpV2Proximity = {
    val __obj = js.Dynamic.literal()
    if (windowAfter != null) __obj.updateDynamic("windowAfter")(windowAfter.asInstanceOf[js.Any])
    if (windowBefore != null) __obj.updateDynamic("windowBefore")(windowBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Proximity]
  }
}

