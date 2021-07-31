package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for CreateDeidentifyTemplate.
  */
trait SchemaGooglePrivacyDlpV2CreateDeidentifyTemplateRequest extends StObject {
  
  /**
    * The DeidentifyTemplate to create.
    */
  var deidentifyTemplate: js.UndefOr[SchemaGooglePrivacyDlpV2DeidentifyTemplate] = js.undefined
  
  /**
    * The template id can contain uppercase and lowercase letters, numbers, and
    * hyphens; that is, it must match the regular expression: `[a-zA-Z\\d-_]+`.
    * The maximum length is 100 characters. Can be empty to allow the system to
    * generate one.
    */
  var templateId: js.UndefOr[String] = js.undefined
}
object SchemaGooglePrivacyDlpV2CreateDeidentifyTemplateRequest {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2CreateDeidentifyTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CreateDeidentifyTemplateRequest]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2CreateDeidentifyTemplateRequestMutableBuilder[Self <: SchemaGooglePrivacyDlpV2CreateDeidentifyTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeidentifyTemplate(value: SchemaGooglePrivacyDlpV2DeidentifyTemplate): Self = StObject.set(x, "deidentifyTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeidentifyTemplateUndefined: Self = StObject.set(x, "deidentifyTemplate", js.undefined)
    
    @scala.inline
    def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
  }
}
