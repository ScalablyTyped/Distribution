package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of conditions.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Conditions extends js.Object {
  
  var conditions: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Condition]] = js.native
}
object SchemaGooglePrivacyDlpV2Conditions {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2Conditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Conditions]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ConditionsOps[Self <: SchemaGooglePrivacyDlpV2Conditions] (val x: Self) extends AnyVal {
    
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
    def setConditionsVarargs(value: SchemaGooglePrivacyDlpV2Condition*): Self = this.set("conditions", js.Array(value :_*))
    
    @scala.inline
    def setConditions(value: js.Array[SchemaGooglePrivacyDlpV2Condition]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
  }
}
