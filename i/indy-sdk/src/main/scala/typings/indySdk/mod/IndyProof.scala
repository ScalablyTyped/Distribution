package typings.indySdk.mod

import typings.indySdk.anon.Creddefid
import typings.indySdk.anon.Requestedpredicates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndyProof extends StObject {
  
  var identifiers: js.Array[Creddefid]
  
  var proof: Any
  
  var requested_proof: Requestedpredicates
}
object IndyProof {
  
  inline def apply(identifiers: js.Array[Creddefid], proof: Any, requested_proof: Requestedpredicates): IndyProof = {
    val __obj = js.Dynamic.literal(identifiers = identifiers.asInstanceOf[js.Any], proof = proof.asInstanceOf[js.Any], requested_proof = requested_proof.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndyProof]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndyProof] (val x: Self) extends AnyVal {
    
    inline def setIdentifiers(value: js.Array[Creddefid]): Self = StObject.set(x, "identifiers", value.asInstanceOf[js.Any])
    
    inline def setIdentifiersVarargs(value: Creddefid*): Self = StObject.set(x, "identifiers", js.Array(value*))
    
    inline def setProof(value: Any): Self = StObject.set(x, "proof", value.asInstanceOf[js.Any])
    
    inline def setRequested_proof(value: Requestedpredicates): Self = StObject.set(x, "requested_proof", value.asInstanceOf[js.Any])
  }
}
