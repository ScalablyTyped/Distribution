package typings.indySdk.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CredReq extends StObject {
  
  var blinded_ms: Record[String, Any]
  
  var blinded_ms_correctness_proof: Record[String, Any]
  
  var cred_def_id: CredDefId
  
  var nonce: String
  
  var prover_did: Did
}
object CredReq {
  
  inline def apply(
    blinded_ms: Record[String, Any],
    blinded_ms_correctness_proof: Record[String, Any],
    cred_def_id: CredDefId,
    nonce: String,
    prover_did: Did
  ): CredReq = {
    val __obj = js.Dynamic.literal(blinded_ms = blinded_ms.asInstanceOf[js.Any], blinded_ms_correctness_proof = blinded_ms_correctness_proof.asInstanceOf[js.Any], cred_def_id = cred_def_id.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], prover_did = prover_did.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredReq]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CredReq] (val x: Self) extends AnyVal {
    
    inline def setBlinded_ms(value: Record[String, Any]): Self = StObject.set(x, "blinded_ms", value.asInstanceOf[js.Any])
    
    inline def setBlinded_ms_correctness_proof(value: Record[String, Any]): Self = StObject.set(x, "blinded_ms_correctness_proof", value.asInstanceOf[js.Any])
    
    inline def setCred_def_id(value: CredDefId): Self = StObject.set(x, "cred_def_id", value.asInstanceOf[js.Any])
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setProver_did(value: Did): Self = StObject.set(x, "prover_did", value.asInstanceOf[js.Any])
  }
}
