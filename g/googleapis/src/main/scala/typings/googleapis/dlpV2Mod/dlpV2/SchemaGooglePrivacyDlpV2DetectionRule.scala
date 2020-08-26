package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Rule for modifying a CustomInfoType to alter behavior under certain
  * circumstances, depending on the specific details of the rule. Not supported
  * for the `surrogate_type` custom info type.
  */
@js.native
trait SchemaGooglePrivacyDlpV2DetectionRule extends js.Object {
  /**
    * Hotword-based detection rule.
    */
  var hotwordRule: js.UndefOr[SchemaGooglePrivacyDlpV2HotwordRule] = js.native
}

object SchemaGooglePrivacyDlpV2DetectionRule {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2DetectionRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DetectionRule]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2DetectionRuleOps[Self <: SchemaGooglePrivacyDlpV2DetectionRule] (val x: Self) extends AnyVal {
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
    def setHotwordRule(value: SchemaGooglePrivacyDlpV2HotwordRule): Self = this.set("hotwordRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHotwordRule: Self = this.set("hotwordRule", js.undefined)
  }
  
}

