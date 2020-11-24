package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for CreateInspectTemplate.
  */
@js.native
trait SchemaGooglePrivacyDlpV2CreateInspectTemplateRequest extends js.Object {
  
  /**
    * The InspectTemplate to create.
    */
  var inspectTemplate: js.UndefOr[SchemaGooglePrivacyDlpV2InspectTemplate] = js.native
  
  /**
    * The template id can contain uppercase and lowercase letters, numbers, and
    * hyphens; that is, it must match the regular expression: `[a-zA-Z\\d-_]+`.
    * The maximum length is 100 characters. Can be empty to allow the system to
    * generate one.
    */
  var templateId: js.UndefOr[String] = js.native
}
object SchemaGooglePrivacyDlpV2CreateInspectTemplateRequest {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2CreateInspectTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CreateInspectTemplateRequest]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2CreateInspectTemplateRequestOps[Self <: SchemaGooglePrivacyDlpV2CreateInspectTemplateRequest] (val x: Self) extends AnyVal {
    
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
    def setInspectTemplate(value: SchemaGooglePrivacyDlpV2InspectTemplate): Self = this.set("inspectTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInspectTemplate: Self = this.set("inspectTemplate", js.undefined)
    
    @scala.inline
    def setTemplateId(value: String): Self = this.set("templateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateId: Self = this.set("templateId", js.undefined)
  }
}
