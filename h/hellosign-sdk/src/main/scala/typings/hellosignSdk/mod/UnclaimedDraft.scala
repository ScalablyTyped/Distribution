package typings.hellosignSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnclaimedDraft extends StObject {
  
  var claim_url: String
  
  var expires_at: Double
  
  var requesting_redirect_url: js.UndefOr[String] = js.undefined
  
  var signature_request_id: String
  
  var signing_redirect_url: String
  
  var test_mode: js.UndefOr[Double] = js.undefined
}
object UnclaimedDraft {
  
  inline def apply(claim_url: String, expires_at: Double, signature_request_id: String, signing_redirect_url: String): UnclaimedDraft = {
    val __obj = js.Dynamic.literal(claim_url = claim_url.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], signature_request_id = signature_request_id.asInstanceOf[js.Any], signing_redirect_url = signing_redirect_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnclaimedDraft]
  }
  
  extension [Self <: UnclaimedDraft](x: Self) {
    
    inline def setClaim_url(value: String): Self = StObject.set(x, "claim_url", value.asInstanceOf[js.Any])
    
    inline def setExpires_at(value: Double): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
    
    inline def setRequesting_redirect_url(value: String): Self = StObject.set(x, "requesting_redirect_url", value.asInstanceOf[js.Any])
    
    inline def setRequesting_redirect_urlUndefined: Self = StObject.set(x, "requesting_redirect_url", js.undefined)
    
    inline def setSignature_request_id(value: String): Self = StObject.set(x, "signature_request_id", value.asInstanceOf[js.Any])
    
    inline def setSigning_redirect_url(value: String): Self = StObject.set(x, "signing_redirect_url", value.asInstanceOf[js.Any])
    
    inline def setTest_mode(value: Double): Self = StObject.set(x, "test_mode", value.asInstanceOf[js.Any])
    
    inline def setTest_modeUndefined: Self = StObject.set(x, "test_mode", js.undefined)
  }
}
