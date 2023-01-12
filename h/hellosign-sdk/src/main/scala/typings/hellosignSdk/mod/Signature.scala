package typings.hellosignSdk.mod

import typings.hellosignSdk.hellosignSdkStrings.awaiting_signature
import typings.hellosignSdk.hellosignSdkStrings.declined
import typings.hellosignSdk.hellosignSdkStrings.signed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Signature extends StObject {
  
  var decline_reason: String
  
  var error: String | Null
  
  var has_pin: Boolean
  
  var last_reminded_at: Double | Null
  
  var last_viewed_at: Double | Null
  
  var order: Double
  
  var reassigned_by: String
  
  var reassignment_reason: String
  
  var signature_id: String
  
  var signed_at: Double | Null
  
  var signer_email_address: String
  
  var signer_name: String
  
  var signer_role: String
  
  var status_code: String | awaiting_signature | signed | declined
}
object Signature {
  
  inline def apply(
    decline_reason: String,
    has_pin: Boolean,
    order: Double,
    reassigned_by: String,
    reassignment_reason: String,
    signature_id: String,
    signer_email_address: String,
    signer_name: String,
    signer_role: String,
    status_code: String | awaiting_signature | signed | declined
  ): Signature = {
    val __obj = js.Dynamic.literal(decline_reason = decline_reason.asInstanceOf[js.Any], has_pin = has_pin.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], reassigned_by = reassigned_by.asInstanceOf[js.Any], reassignment_reason = reassignment_reason.asInstanceOf[js.Any], signature_id = signature_id.asInstanceOf[js.Any], signer_email_address = signer_email_address.asInstanceOf[js.Any], signer_name = signer_name.asInstanceOf[js.Any], signer_role = signer_role.asInstanceOf[js.Any], status_code = status_code.asInstanceOf[js.Any], error = null, last_reminded_at = null, last_viewed_at = null, signed_at = null)
    __obj.asInstanceOf[Signature]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Signature] (val x: Self) extends AnyVal {
    
    inline def setDecline_reason(value: String): Self = StObject.set(x, "decline_reason", value.asInstanceOf[js.Any])
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setHas_pin(value: Boolean): Self = StObject.set(x, "has_pin", value.asInstanceOf[js.Any])
    
    inline def setLast_reminded_at(value: Double): Self = StObject.set(x, "last_reminded_at", value.asInstanceOf[js.Any])
    
    inline def setLast_reminded_atNull: Self = StObject.set(x, "last_reminded_at", null)
    
    inline def setLast_viewed_at(value: Double): Self = StObject.set(x, "last_viewed_at", value.asInstanceOf[js.Any])
    
    inline def setLast_viewed_atNull: Self = StObject.set(x, "last_viewed_at", null)
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setReassigned_by(value: String): Self = StObject.set(x, "reassigned_by", value.asInstanceOf[js.Any])
    
    inline def setReassignment_reason(value: String): Self = StObject.set(x, "reassignment_reason", value.asInstanceOf[js.Any])
    
    inline def setSignature_id(value: String): Self = StObject.set(x, "signature_id", value.asInstanceOf[js.Any])
    
    inline def setSigned_at(value: Double): Self = StObject.set(x, "signed_at", value.asInstanceOf[js.Any])
    
    inline def setSigned_atNull: Self = StObject.set(x, "signed_at", null)
    
    inline def setSigner_email_address(value: String): Self = StObject.set(x, "signer_email_address", value.asInstanceOf[js.Any])
    
    inline def setSigner_name(value: String): Self = StObject.set(x, "signer_name", value.asInstanceOf[js.Any])
    
    inline def setSigner_role(value: String): Self = StObject.set(x, "signer_role", value.asInstanceOf[js.Any])
    
    inline def setStatus_code(value: String | awaiting_signature | signed | declined): Self = StObject.set(x, "status_code", value.asInstanceOf[js.Any])
  }
}
