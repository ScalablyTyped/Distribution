package typings.hellosignSdk.mod

import typings.hellosignSdk.anon.Apiid
import typings.hellosignSdk.anon.Editor
import typings.hellosignSdk.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignatureRequest[Metadata] extends StObject {
  
  var cc_email_addresses: String | js.Array[String]
  
  var created_at: Double
  
  var custom_fields: js.UndefOr[js.Array[Apiid | Editor]] = js.undefined
  
  var details_url: String
  
  var files_url: String
  
  /**
    * @deprecated
    */
  var final_copy_uri: String
  
  var has_error: Boolean
  
  var is_complete: Boolean
  
  var is_declined: Boolean
  
  var message: String
  
  var metadata: GenericObject[Metadata]
  
  var original_title: String
  
  var requester_email_address: String
  
  var response_data: js.Array[Name]
  
  var signature_request_id: String
  
  var signatures: js.Array[Signature]
  
  var signing_redirect_url: String
  
  var signing_url: String
  
  var subject: String
  
  var template_ids: Null | js.Array[String]
  
  var test_mode: Double
  
  var title: String
}
object SignatureRequest {
  
  inline def apply[Metadata](
    cc_email_addresses: String | js.Array[String],
    created_at: Double,
    details_url: String,
    files_url: String,
    final_copy_uri: String,
    has_error: Boolean,
    is_complete: Boolean,
    is_declined: Boolean,
    message: String,
    metadata: GenericObject[Metadata],
    original_title: String,
    requester_email_address: String,
    response_data: js.Array[Name],
    signature_request_id: String,
    signatures: js.Array[Signature],
    signing_redirect_url: String,
    signing_url: String,
    subject: String,
    test_mode: Double,
    title: String
  ): SignatureRequest[Metadata] = {
    val __obj = js.Dynamic.literal(cc_email_addresses = cc_email_addresses.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], details_url = details_url.asInstanceOf[js.Any], files_url = files_url.asInstanceOf[js.Any], final_copy_uri = final_copy_uri.asInstanceOf[js.Any], has_error = has_error.asInstanceOf[js.Any], is_complete = is_complete.asInstanceOf[js.Any], is_declined = is_declined.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], original_title = original_title.asInstanceOf[js.Any], requester_email_address = requester_email_address.asInstanceOf[js.Any], response_data = response_data.asInstanceOf[js.Any], signature_request_id = signature_request_id.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any], signing_redirect_url = signing_redirect_url.asInstanceOf[js.Any], signing_url = signing_url.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], test_mode = test_mode.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], template_ids = null)
    __obj.asInstanceOf[SignatureRequest[Metadata]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignatureRequest[?], Metadata] (val x: Self & SignatureRequest[Metadata]) extends AnyVal {
    
    inline def setCc_email_addresses(value: String | js.Array[String]): Self = StObject.set(x, "cc_email_addresses", value.asInstanceOf[js.Any])
    
    inline def setCc_email_addressesVarargs(value: String*): Self = StObject.set(x, "cc_email_addresses", js.Array(value*))
    
    inline def setCreated_at(value: Double): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCustom_fields(value: js.Array[Apiid | Editor]): Self = StObject.set(x, "custom_fields", value.asInstanceOf[js.Any])
    
    inline def setCustom_fieldsUndefined: Self = StObject.set(x, "custom_fields", js.undefined)
    
    inline def setCustom_fieldsVarargs(value: (Apiid | Editor)*): Self = StObject.set(x, "custom_fields", js.Array(value*))
    
    inline def setDetails_url(value: String): Self = StObject.set(x, "details_url", value.asInstanceOf[js.Any])
    
    inline def setFiles_url(value: String): Self = StObject.set(x, "files_url", value.asInstanceOf[js.Any])
    
    inline def setFinal_copy_uri(value: String): Self = StObject.set(x, "final_copy_uri", value.asInstanceOf[js.Any])
    
    inline def setHas_error(value: Boolean): Self = StObject.set(x, "has_error", value.asInstanceOf[js.Any])
    
    inline def setIs_complete(value: Boolean): Self = StObject.set(x, "is_complete", value.asInstanceOf[js.Any])
    
    inline def setIs_declined(value: Boolean): Self = StObject.set(x, "is_declined", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: GenericObject[Metadata]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setOriginal_title(value: String): Self = StObject.set(x, "original_title", value.asInstanceOf[js.Any])
    
    inline def setRequester_email_address(value: String): Self = StObject.set(x, "requester_email_address", value.asInstanceOf[js.Any])
    
    inline def setResponse_data(value: js.Array[Name]): Self = StObject.set(x, "response_data", value.asInstanceOf[js.Any])
    
    inline def setResponse_dataVarargs(value: Name*): Self = StObject.set(x, "response_data", js.Array(value*))
    
    inline def setSignature_request_id(value: String): Self = StObject.set(x, "signature_request_id", value.asInstanceOf[js.Any])
    
    inline def setSignatures(value: js.Array[Signature]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    inline def setSignaturesVarargs(value: Signature*): Self = StObject.set(x, "signatures", js.Array(value*))
    
    inline def setSigning_redirect_url(value: String): Self = StObject.set(x, "signing_redirect_url", value.asInstanceOf[js.Any])
    
    inline def setSigning_url(value: String): Self = StObject.set(x, "signing_url", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setTemplate_ids(value: js.Array[String]): Self = StObject.set(x, "template_ids", value.asInstanceOf[js.Any])
    
    inline def setTemplate_idsNull: Self = StObject.set(x, "template_ids", null)
    
    inline def setTemplate_idsVarargs(value: String*): Self = StObject.set(x, "template_ids", js.Array(value*))
    
    inline def setTest_mode(value: Double): Self = StObject.set(x, "test_mode", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
