package typings.hellosignSdk.anon

import org.scalablytyped.runtime.StringDictionary
import typings.hellosignSdk.mod.FormField
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<hellosign-sdk.hellosign-sdk.SignatureRequestRequestOptions<hellosign-sdk.hellosign-sdk.GenericObject<{}>>, 'signing_redirect_url'> */
trait OmitSignatureRequestReque extends StObject {
  
  var allow_decline: js.UndefOr[Double] = js.undefined
  
  var allow_reassign: js.UndefOr[Double] = js.undefined
  
  var attachments: js.UndefOr[js.Array[Instructions]] = js.undefined
  
  var cc_email_addresses: js.UndefOr[js.Array[String]] = js.undefined
  
  var ccs: js.UndefOr[Record[String, Emailaddress]] = js.undefined
  
  var clientId: js.UndefOr[String] = js.undefined
  
  var custom_fields: js.UndefOr[js.Array[Required]] = js.undefined
  
  var field_options: js.UndefOr[Dateformat] = js.undefined
  
  var file: js.UndefOr[js.Array[String]] = js.undefined
  
  var file_url: js.UndefOr[js.Array[String]] = js.undefined
  
  var form_fields_per_document: js.UndefOr[js.Array[js.Array[FormField]]] = js.undefined
  
  var hide_text_tags: js.UndefOr[Double] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var metadata: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var signers: js.Array[Order]
  
  var signing_options: js.UndefOr[Default] = js.undefined
  
  var subject: js.UndefOr[String] = js.undefined
  
  var template_id: js.UndefOr[String] = js.undefined
  
  var template_ids: js.UndefOr[js.Array[String]] = js.undefined
  
  var test_mode: js.UndefOr[Double] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var use_text_tags: js.UndefOr[Double] = js.undefined
}
object OmitSignatureRequestReque {
  
  inline def apply(signers: js.Array[Order]): OmitSignatureRequestReque = {
    val __obj = js.Dynamic.literal(signers = signers.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitSignatureRequestReque]
  }
  
  extension [Self <: OmitSignatureRequestReque](x: Self) {
    
    inline def setAllow_decline(value: Double): Self = StObject.set(x, "allow_decline", value.asInstanceOf[js.Any])
    
    inline def setAllow_declineUndefined: Self = StObject.set(x, "allow_decline", js.undefined)
    
    inline def setAllow_reassign(value: Double): Self = StObject.set(x, "allow_reassign", value.asInstanceOf[js.Any])
    
    inline def setAllow_reassignUndefined: Self = StObject.set(x, "allow_reassign", js.undefined)
    
    inline def setAttachments(value: js.Array[Instructions]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: Instructions*): Self = StObject.set(x, "attachments", js.Array(value*))
    
    inline def setCc_email_addresses(value: js.Array[String]): Self = StObject.set(x, "cc_email_addresses", value.asInstanceOf[js.Any])
    
    inline def setCc_email_addressesUndefined: Self = StObject.set(x, "cc_email_addresses", js.undefined)
    
    inline def setCc_email_addressesVarargs(value: String*): Self = StObject.set(x, "cc_email_addresses", js.Array(value*))
    
    inline def setCcs(value: Record[String, Emailaddress]): Self = StObject.set(x, "ccs", value.asInstanceOf[js.Any])
    
    inline def setCcsUndefined: Self = StObject.set(x, "ccs", js.undefined)
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
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
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setMetadata(value: StringDictionary[Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setSigners(value: js.Array[Order]): Self = StObject.set(x, "signers", value.asInstanceOf[js.Any])
    
    inline def setSignersVarargs(value: Order*): Self = StObject.set(x, "signers", js.Array(value*))
    
    inline def setSigning_options(value: Default): Self = StObject.set(x, "signing_options", value.asInstanceOf[js.Any])
    
    inline def setSigning_optionsUndefined: Self = StObject.set(x, "signing_options", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setTemplate_id(value: String): Self = StObject.set(x, "template_id", value.asInstanceOf[js.Any])
    
    inline def setTemplate_idUndefined: Self = StObject.set(x, "template_id", js.undefined)
    
    inline def setTemplate_ids(value: js.Array[String]): Self = StObject.set(x, "template_ids", value.asInstanceOf[js.Any])
    
    inline def setTemplate_idsUndefined: Self = StObject.set(x, "template_ids", js.undefined)
    
    inline def setTemplate_idsVarargs(value: String*): Self = StObject.set(x, "template_ids", js.Array(value*))
    
    inline def setTest_mode(value: Double): Self = StObject.set(x, "test_mode", value.asInstanceOf[js.Any])
    
    inline def setTest_modeUndefined: Self = StObject.set(x, "test_mode", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUse_text_tags(value: Double): Self = StObject.set(x, "use_text_tags", value.asInstanceOf[js.Any])
    
    inline def setUse_text_tagsUndefined: Self = StObject.set(x, "use_text_tags", js.undefined)
  }
}
