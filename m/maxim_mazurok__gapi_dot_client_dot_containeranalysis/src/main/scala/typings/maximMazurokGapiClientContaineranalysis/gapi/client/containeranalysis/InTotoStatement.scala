package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InTotoStatement extends StObject {
  
  /** Always `https://in-toto.io/Statement/v0.1`. */
  var _type: js.UndefOr[String] = js.undefined
  
  /** `https://slsa.dev/provenance/v0.1` for SlsaProvenance. */
  var predicateType: js.UndefOr[String] = js.undefined
  
  var provenance: js.UndefOr[InTotoProvenance] = js.undefined
  
  var slsaProvenance: js.UndefOr[SlsaProvenance] = js.undefined
  
  var slsaProvenanceZeroTwo: js.UndefOr[SlsaProvenanceZeroTwo] = js.undefined
  
  var subject: js.UndefOr[js.Array[Subject]] = js.undefined
}
object InTotoStatement {
  
  inline def apply(): InTotoStatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InTotoStatement]
  }
  
  extension [Self <: InTotoStatement](x: Self) {
    
    inline def setPredicateType(value: String): Self = StObject.set(x, "predicateType", value.asInstanceOf[js.Any])
    
    inline def setPredicateTypeUndefined: Self = StObject.set(x, "predicateType", js.undefined)
    
    inline def setProvenance(value: InTotoProvenance): Self = StObject.set(x, "provenance", value.asInstanceOf[js.Any])
    
    inline def setProvenanceUndefined: Self = StObject.set(x, "provenance", js.undefined)
    
    inline def setSlsaProvenance(value: SlsaProvenance): Self = StObject.set(x, "slsaProvenance", value.asInstanceOf[js.Any])
    
    inline def setSlsaProvenanceUndefined: Self = StObject.set(x, "slsaProvenance", js.undefined)
    
    inline def setSlsaProvenanceZeroTwo(value: SlsaProvenanceZeroTwo): Self = StObject.set(x, "slsaProvenanceZeroTwo", value.asInstanceOf[js.Any])
    
    inline def setSlsaProvenanceZeroTwoUndefined: Self = StObject.set(x, "slsaProvenanceZeroTwo", js.undefined)
    
    inline def setSubject(value: js.Array[Subject]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setSubjectVarargs(value: Subject*): Self = StObject.set(x, "subject", js.Array(value*))
    
    inline def set_type(value: String): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
