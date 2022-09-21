package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2UpdateInspectTemplateRequest extends StObject {
  
  /**
    * New InspectTemplate value.
    */
  var inspectTemplate: js.UndefOr[SchemaGooglePrivacyDlpV2InspectTemplate] = js.undefined
  
  /**
    * Mask to control which fields get updated.
    */
  var updateMask: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2UpdateInspectTemplateRequest {
  
  inline def apply(): SchemaGooglePrivacyDlpV2UpdateInspectTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2UpdateInspectTemplateRequest]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2UpdateInspectTemplateRequest](x: Self) {
    
    inline def setInspectTemplate(value: SchemaGooglePrivacyDlpV2InspectTemplate): Self = StObject.set(x, "inspectTemplate", value.asInstanceOf[js.Any])
    
    inline def setInspectTemplateUndefined: Self = StObject.set(x, "inspectTemplate", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
