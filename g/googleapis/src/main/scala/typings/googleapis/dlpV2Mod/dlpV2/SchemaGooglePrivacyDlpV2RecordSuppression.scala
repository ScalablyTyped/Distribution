package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration to suppress records whose suppression conditions evaluate to
  * true.
  */
@js.native
trait SchemaGooglePrivacyDlpV2RecordSuppression extends js.Object {
  
  /**
    * A condition that when it evaluates to true will result in the record
    * being evaluated to be suppressed from the transformed content.
    */
  var condition: js.UndefOr[SchemaGooglePrivacyDlpV2RecordCondition] = js.native
}
object SchemaGooglePrivacyDlpV2RecordSuppression {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2RecordSuppression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RecordSuppression]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2RecordSuppressionOps[Self <: SchemaGooglePrivacyDlpV2RecordSuppression] (val x: Self) extends AnyVal {
    
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
    def setCondition(value: SchemaGooglePrivacyDlpV2RecordCondition): Self = this.set("condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
  }
}
