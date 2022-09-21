package typings.indySdk.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CredOffer extends StObject {
  
  var cred_def_id: CredDefId
  
  var key_correctness_proof: Record[String, Any]
  
  var nonce: String
  
  var schema_id: SchemaId
}
object CredOffer {
  
  inline def apply(
    cred_def_id: CredDefId,
    key_correctness_proof: Record[String, Any],
    nonce: String,
    schema_id: SchemaId
  ): CredOffer = {
    val __obj = js.Dynamic.literal(cred_def_id = cred_def_id.asInstanceOf[js.Any], key_correctness_proof = key_correctness_proof.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], schema_id = schema_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredOffer]
  }
  
  extension [Self <: CredOffer](x: Self) {
    
    inline def setCred_def_id(value: CredDefId): Self = StObject.set(x, "cred_def_id", value.asInstanceOf[js.Any])
    
    inline def setKey_correctness_proof(value: Record[String, Any]): Self = StObject.set(x, "key_correctness_proof", value.asInstanceOf[js.Any])
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setSchema_id(value: SchemaId): Self = StObject.set(x, "schema_id", value.asInstanceOf[js.Any])
  }
}
