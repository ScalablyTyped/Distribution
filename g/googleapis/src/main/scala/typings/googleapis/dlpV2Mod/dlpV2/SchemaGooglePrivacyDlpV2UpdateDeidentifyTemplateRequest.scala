package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for UpdateDeidentifyTemplate.
  */
@js.native
trait SchemaGooglePrivacyDlpV2UpdateDeidentifyTemplateRequest extends js.Object {
  
  /**
    * New DeidentifyTemplate value.
    */
  var deidentifyTemplate: js.UndefOr[SchemaGooglePrivacyDlpV2DeidentifyTemplate] = js.native
  
  /**
    * Mask to control which fields get updated.
    */
  var updateMask: js.UndefOr[String] = js.native
}
object SchemaGooglePrivacyDlpV2UpdateDeidentifyTemplateRequest {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2UpdateDeidentifyTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2UpdateDeidentifyTemplateRequest]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2UpdateDeidentifyTemplateRequestOps[Self <: SchemaGooglePrivacyDlpV2UpdateDeidentifyTemplateRequest] (val x: Self) extends AnyVal {
    
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
    def setDeidentifyTemplate(value: SchemaGooglePrivacyDlpV2DeidentifyTemplate): Self = this.set("deidentifyTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeidentifyTemplate: Self = this.set("deidentifyTemplate", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = this.set("updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateMask: Self = this.set("updateMask", js.undefined)
  }
}
