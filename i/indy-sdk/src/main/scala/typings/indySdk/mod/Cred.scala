package typings.indySdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cred extends StObject {
  
  var cred_def_id: CredDefId
  
  var rev_reg_id: String
  
  var schema_id: SchemaId
  
  var signature: Any
  
  var signature_correctness_proof: Any
  
  var values: CredValues
}
object Cred {
  
  inline def apply(
    cred_def_id: CredDefId,
    rev_reg_id: String,
    schema_id: SchemaId,
    signature: Any,
    signature_correctness_proof: Any,
    values: CredValues
  ): Cred = {
    val __obj = js.Dynamic.literal(cred_def_id = cred_def_id.asInstanceOf[js.Any], rev_reg_id = rev_reg_id.asInstanceOf[js.Any], schema_id = schema_id.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], signature_correctness_proof = signature_correctness_proof.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cred]
  }
  
  extension [Self <: Cred](x: Self) {
    
    inline def setCred_def_id(value: CredDefId): Self = StObject.set(x, "cred_def_id", value.asInstanceOf[js.Any])
    
    inline def setRev_reg_id(value: String): Self = StObject.set(x, "rev_reg_id", value.asInstanceOf[js.Any])
    
    inline def setSchema_id(value: SchemaId): Self = StObject.set(x, "schema_id", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: Any): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignature_correctness_proof(value: Any): Self = StObject.set(x, "signature_correctness_proof", value.asInstanceOf[js.Any])
    
    inline def setValues(value: CredValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
