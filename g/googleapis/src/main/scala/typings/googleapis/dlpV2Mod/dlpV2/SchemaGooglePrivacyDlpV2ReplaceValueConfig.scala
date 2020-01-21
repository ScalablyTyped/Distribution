package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Replace each input value with a given `Value`.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ReplaceValueConfig extends js.Object {
  /**
    * Value to replace it with.
    */
  var newValue: js.UndefOr[SchemaGooglePrivacyDlpV2Value] = js.native
}

object SchemaGooglePrivacyDlpV2ReplaceValueConfig {
  @scala.inline
  def apply(newValue: SchemaGooglePrivacyDlpV2Value = null): SchemaGooglePrivacyDlpV2ReplaceValueConfig = {
    val __obj = js.Dynamic.literal()
    if (newValue != null) __obj.updateDynamic("newValue")(newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ReplaceValueConfig]
  }
}

