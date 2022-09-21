package typings.hellosignSdk.mod

import typings.hellosignSdk.anon.Dateformat
import typings.hellosignSdk.anon.Default
import typings.hellosignSdk.anon.EmailaddressName
import typings.hellosignSdk.anon.Instructions
import typings.hellosignSdk.anon.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnclaimedDraftRequestOptions[Metadata] extends StObject {
  
  var allow_decline: js.UndefOr[Double] = js.undefined
  
  var attachments: js.UndefOr[js.Array[Instructions]] = js.undefined
  
  var cc_email_addresses: js.UndefOr[js.Array[String]] = js.undefined
  
  var custom_fields: js.UndefOr[js.Array[Required]] = js.undefined
  
  var field_options: js.UndefOr[Dateformat] = js.undefined
  
  var file: js.UndefOr[js.Array[String]] = js.undefined
  
  var file_url: js.UndefOr[js.Array[String]] = js.undefined
  
  var form_fields_per_document: js.UndefOr[js.Array[js.Array[FormField]]] = js.undefined
  
  var hide_text_tags: js.UndefOr[Double] = js.undefined
  
  var is_for_embedded_signing: js.UndefOr[Double] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var metadata: js.UndefOr[GenericObject[Metadata]] = js.undefined
  
  var requesting_redirect_url: js.UndefOr[String] = js.undefined
  
  var signers: js.UndefOr[js.Array[EmailaddressName]] = js.undefined
  
  var signing_options: js.UndefOr[Default] = js.undefined
  
  var signing_redirect_url: js.UndefOr[String] = js.undefined
  
  var subject: js.UndefOr[String] = js.undefined
  
  var test_mode: js.UndefOr[Double] = js.undefined
  
  var `type`: String
  
  var use_preexisting_fields: js.UndefOr[Boolean] = js.undefined
  
  var use_text_tags: js.UndefOr[Double] = js.undefined
}
object UnclaimedDraftRequestOptions {
  
  inline def apply[Metadata](`type`: String): UnclaimedDraftRequestOptions[Metadata] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnclaimedDraftRequestOptions[Metadata]]
  }
  
  extension [Self <: UnclaimedDraftRequestOptions[?], Metadata](x: Self & UnclaimedDraftRequestOptions[Metadata]) {
    
    inline def setAllow_decline(value: Double): Self = StObject.set(x, "allow_decline", value.asInstanceOf[js.Any])
    
    inline def setAllow_declineUndefined: Self = StObject.set(x, "allow_decline", js.undefined)
    
    inline def setAttachments(value: js.Array[Instructions]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: Instructions*): Self = StObject.set(x, "attachments", js.Array(value*))
    
    inline def setCc_email_addresses(value: js.Array[String]): Self = StObject.set(x, "cc_email_addresses", value.asInstanceOf[js.Any])
    
    inline def setCc_email_addressesUndefined: Self = StObject.set(x, "cc_email_addresses", js.undefined)
    
    inline def setCc_email_addressesVarargs(value: String*): Self = StObject.set(x, "cc_email_addresses", js.Array(value*))
    
    inline def setCustom_fields(value: js.Array[Required]): Self = StObject.set(x, "custom_fields", value.asInstanceOf[js.Any])
    
    inline def setCustom_fieldsUndefined: Self = StObject.set(x, "custom_fields", js.undefined)
    
    inline def setCustom_fieldsVarargs(value: Required*): Self = StObject.set(x, "custom_fields", js.Array(value*))
    
    inline def setField_options(value: Dateformat): Self = StObject.set(x, "field_options", value.asInstanceOf[js.Any])
    
    inline def setField_optionsUndefined: Self = StObject.set(x, "field_options", js.undefined)
    
    inline def setFile(value: js.Array[String]): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setFileVarargs(value: String*): Self = StObject.set(x, "file", js.Array(value*))
    
    inline def setFile_url(value: js.Array[String]): Self = StObject.set(x, "file_url", value.asInstanceOf[js.Any])
    
    inline def setFile_urlUndefined: Self = StObject.set(x, "file_url", js.undefined)
    
    inline def setFile_urlVarargs(value: String*): Self = StObject.set(x, "file_url", js.Array(value*))
    
    inline def setForm_fields_per_document(value: js.Array[js.Array[FormField]]): Self = StObject.set(x, "form_fields_per_document", value.asInstanceOf[js.Any])
    
    inline def setForm_fields_per_documentUndefined: Self = StObject.set(x, "form_fields_per_document", js.undefined)
    
    inline def setForm_fields_per_documentVarargs(value: js.Array[FormField]*): Self = StObject.set(x, "form_fields_per_document", js.Array(value*))
    
    inline def setHide_text_tags(value: Double): Self = StObject.set(x, "hide_text_tags", value.asInstanceOf[js.Any])
    
    inline def setHide_text_tagsUndefined: Self = StObject.set(x, "hide_text_tags", js.undefined)
    
    inline def setIs_for_embedded_signing(value: Double): Self = StObject.set(x, "is_for_embedded_signing", value.asInstanceOf[js.Any])
    
    inline def setIs_for_embedded_signingUndefined: Self = StObject.set(x, "is_for_embedded_signing", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setMetadata(value: GenericObject[Metadata]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setRequesting_redirect_url(value: String): Self = StObject.set(x, "requesting_redirect_url", value.asInstanceOf[js.Any])
    
    inline def setRequesting_redirect_urlUndefined: Self = StObject.set(x, "requesting_redirect_url", js.undefined)
    
    inline def setSigners(value: js.Array[EmailaddressName]): Self = StObject.set(x, "signers", value.asInstanceOf[js.Any])
    
    inline def setSignersUndefined: Self = StObject.set(x, "signers", js.undefined)
    
    inline def setSignersVarargs(value: EmailaddressName*): Self = StObject.set(x, "signers", js.Array(value*))
    
    inline def setSigning_options(value: Default): Self = StObject.set(x, "signing_options", value.asInstanceOf[js.Any])
    
    inline def setSigning_optionsUndefined: Self = StObject.set(x, "signing_options", js.undefined)
    
    inline def setSigning_redirect_url(value: String): Self = StObject.set(x, "signing_redirect_url", value.asInstanceOf[js.Any])
    
    inline def setSigning_redirect_urlUndefined: Self = StObject.set(x, "signing_redirect_url", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setTest_mode(value: Double): Self = StObject.set(x, "test_mode", value.asInstanceOf[js.Any])
    
    inline def setTest_modeUndefined: Self = StObject.set(x, "test_mode", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUse_preexisting_fields(value: Boolean): Self = StObject.set(x, "use_preexisting_fields", value.asInstanceOf[js.Any])
    
    inline def setUse_preexisting_fieldsUndefined: Self = StObject.set(x, "use_preexisting_fields", js.undefined)
    
    inline def setUse_text_tags(value: Double): Self = StObject.set(x, "use_text_tags", value.asInstanceOf[js.Any])
    
    inline def setUse_text_tagsUndefined: Self = StObject.set(x, "use_text_tags", js.undefined)
  }
}
