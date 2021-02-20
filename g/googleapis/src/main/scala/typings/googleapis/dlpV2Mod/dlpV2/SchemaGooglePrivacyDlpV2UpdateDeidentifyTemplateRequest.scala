package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for UpdateDeidentifyTemplate.
  */
@js.native
trait SchemaGooglePrivacyDlpV2UpdateDeidentifyTemplateRequest extends StObject {
  
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
  implicit class SchemaGooglePrivacyDlpV2UpdateDeidentifyTemplateRequestMutableBuilder[Self <: SchemaGooglePrivacyDlpV2UpdateDeidentifyTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeidentifyTemplate(value: SchemaGooglePrivacyDlpV2DeidentifyTemplate): Self = StObject.set(x, "deidentifyTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeidentifyTemplateUndefined: Self = StObject.set(x, "deidentifyTemplate", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
