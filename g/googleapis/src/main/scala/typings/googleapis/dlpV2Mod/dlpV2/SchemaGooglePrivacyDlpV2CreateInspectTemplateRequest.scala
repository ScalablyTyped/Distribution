package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for CreateInspectTemplate.
  */
trait SchemaGooglePrivacyDlpV2CreateInspectTemplateRequest extends StObject {
  
  /**
    * The InspectTemplate to create.
    */
  var inspectTemplate: js.UndefOr[SchemaGooglePrivacyDlpV2InspectTemplate] = js.undefined
  
  /**
    * The template id can contain uppercase and lowercase letters, numbers, and
    * hyphens; that is, it must match the regular expression: `[a-zA-Z\\d-_]+`.
    * The maximum length is 100 characters. Can be empty to allow the system to
    * generate one.
    */
  var templateId: js.UndefOr[String] = js.undefined
}
object SchemaGooglePrivacyDlpV2CreateInspectTemplateRequest {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2CreateInspectTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CreateInspectTemplateRequest]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2CreateInspectTemplateRequestMutableBuilder[Self <: SchemaGooglePrivacyDlpV2CreateInspectTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInspectTemplate(value: SchemaGooglePrivacyDlpV2InspectTemplate): Self = StObject.set(x, "inspectTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInspectTemplateUndefined: Self = StObject.set(x, "inspectTemplate", js.undefined)
    
    @scala.inline
    def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
  }
}
