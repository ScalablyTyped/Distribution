package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for UpdateInspectTemplate.
  */
@js.native
trait SchemaGooglePrivacyDlpV2UpdateInspectTemplateRequest extends StObject {
  
  /**
    * New InspectTemplate value.
    */
  var inspectTemplate: js.UndefOr[SchemaGooglePrivacyDlpV2InspectTemplate] = js.native
  
  /**
    * Mask to control which fields get updated.
    */
  var updateMask: js.UndefOr[String] = js.native
}
object SchemaGooglePrivacyDlpV2UpdateInspectTemplateRequest {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2UpdateInspectTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2UpdateInspectTemplateRequest]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2UpdateInspectTemplateRequestMutableBuilder[Self <: SchemaGooglePrivacyDlpV2UpdateInspectTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInspectTemplate(value: SchemaGooglePrivacyDlpV2InspectTemplate): Self = StObject.set(x, "inspectTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInspectTemplateUndefined: Self = StObject.set(x, "inspectTemplate", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
