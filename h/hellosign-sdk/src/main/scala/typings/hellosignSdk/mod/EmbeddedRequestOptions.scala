package typings.hellosignSdk.mod

import typings.hellosignSdk.anon.Alloweditdocuments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmbeddedRequestOptions extends StObject {
  
  var cc_roles: js.UndefOr[js.Array[Any]] = js.undefined
  
  var editor_options: js.UndefOr[Alloweditdocuments] = js.undefined
  
  var force_signer_roles: js.UndefOr[Any] = js.undefined
  
  var force_subject_message: js.UndefOr[Any] = js.undefined
  
  var merge_fields: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * @deprecated May 2020 use `force_signer_roles` instead
    */
  var skip_signer_roles: js.UndefOr[Any] = js.undefined
  
  /**
    * @deprecated May 2020 use `force_subject_message` instead
    */
  var skip_subject_message: js.UndefOr[Any] = js.undefined
  
  var template_id: String
  
  var test_mode: js.UndefOr[Double] = js.undefined
}
object EmbeddedRequestOptions {
  
  inline def apply(template_id: String): EmbeddedRequestOptions = {
    val __obj = js.Dynamic.literal(template_id = template_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbeddedRequestOptions]
  }
  
  extension [Self <: EmbeddedRequestOptions](x: Self) {
    
    inline def setCc_roles(value: js.Array[Any]): Self = StObject.set(x, "cc_roles", value.asInstanceOf[js.Any])
    
    inline def setCc_rolesUndefined: Self = StObject.set(x, "cc_roles", js.undefined)
    
    inline def setCc_rolesVarargs(value: Any*): Self = StObject.set(x, "cc_roles", js.Array(value*))
    
    inline def setEditor_options(value: Alloweditdocuments): Self = StObject.set(x, "editor_options", value.asInstanceOf[js.Any])
    
    inline def setEditor_optionsUndefined: Self = StObject.set(x, "editor_options", js.undefined)
    
    inline def setForce_signer_roles(value: Any): Self = StObject.set(x, "force_signer_roles", value.asInstanceOf[js.Any])
    
    inline def setForce_signer_rolesUndefined: Self = StObject.set(x, "force_signer_roles", js.undefined)
    
    inline def setForce_subject_message(value: Any): Self = StObject.set(x, "force_subject_message", value.asInstanceOf[js.Any])
    
    inline def setForce_subject_messageUndefined: Self = StObject.set(x, "force_subject_message", js.undefined)
    
    inline def setMerge_fields(value: js.Array[Any]): Self = StObject.set(x, "merge_fields", value.asInstanceOf[js.Any])
    
    inline def setMerge_fieldsUndefined: Self = StObject.set(x, "merge_fields", js.undefined)
    
    inline def setMerge_fieldsVarargs(value: Any*): Self = StObject.set(x, "merge_fields", js.Array(value*))
    
    inline def setSkip_signer_roles(value: Any): Self = StObject.set(x, "skip_signer_roles", value.asInstanceOf[js.Any])
    
    inline def setSkip_signer_rolesUndefined: Self = StObject.set(x, "skip_signer_roles", js.undefined)
    
    inline def setSkip_subject_message(value: Any): Self = StObject.set(x, "skip_subject_message", value.asInstanceOf[js.Any])
    
    inline def setSkip_subject_messageUndefined: Self = StObject.set(x, "skip_subject_message", js.undefined)
    
    inline def setTemplate_id(value: String): Self = StObject.set(x, "template_id", value.asInstanceOf[js.Any])
    
    inline def setTest_mode(value: Double): Self = StObject.set(x, "test_mode", value.asInstanceOf[js.Any])
    
    inline def setTest_modeUndefined: Self = StObject.set(x, "test_mode", js.undefined)
  }
}
