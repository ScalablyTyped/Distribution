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
  def apply(): SchemaGooglePrivacyDlpV2ReplaceValueConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ReplaceValueConfig]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ReplaceValueConfigOps[Self <: SchemaGooglePrivacyDlpV2ReplaceValueConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNewValue(value: SchemaGooglePrivacyDlpV2Value): Self = this.set("newValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewValue: Self = this.set("newValue", js.undefined)
  }
  
}

