package typings.googleapis.containeranalysisV1Mod.containeranalysisV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInTotoStatement extends StObject {
  
  /**
    * Always `https://in-toto.io/Statement/v0.1`.
    */
  var _type: js.UndefOr[String | Null] = js.undefined
  
  /**
    * `https://slsa.dev/provenance/v0.1` for SlsaProvenance.
    */
  var predicateType: js.UndefOr[String | Null] = js.undefined
  
  var provenance: js.UndefOr[SchemaInTotoProvenance] = js.undefined
  
  var slsaProvenance: js.UndefOr[SchemaSlsaProvenance] = js.undefined
  
  var slsaProvenanceZeroTwo: js.UndefOr[SchemaSlsaProvenanceZeroTwo] = js.undefined
  
  var subject: js.UndefOr[js.Array[SchemaSubject]] = js.undefined
}
object SchemaInTotoStatement {
  
  inline def apply(): SchemaInTotoStatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInTotoStatement]
  }
  
  extension [Self <: SchemaInTotoStatement](x: Self) {
    
    inline def setPredicateType(value: String): Self = StObject.set(x, "predicateType", value.asInstanceOf[js.Any])
    
    inline def setPredicateTypeNull: Self = StObject.set(x, "predicateType", null)
    
    inline def setPredicateTypeUndefined: Self = StObject.set(x, "predicateType", js.undefined)
    
    inline def setProvenance(value: SchemaInTotoProvenance): Self = StObject.set(x, "provenance", value.asInstanceOf[js.Any])
    
    inline def setProvenanceUndefined: Self = StObject.set(x, "provenance", js.undefined)
    
    inline def setSlsaProvenance(value: SchemaSlsaProvenance): Self = StObject.set(x, "slsaProvenance", value.asInstanceOf[js.Any])
    
    inline def setSlsaProvenanceUndefined: Self = StObject.set(x, "slsaProvenance", js.undefined)
    
    inline def setSlsaProvenanceZeroTwo(value: SchemaSlsaProvenanceZeroTwo): Self = StObject.set(x, "slsaProvenanceZeroTwo", value.asInstanceOf[js.Any])
    
    inline def setSlsaProvenanceZeroTwoUndefined: Self = StObject.set(x, "slsaProvenanceZeroTwo", js.undefined)
    
    inline def setSubject(value: js.Array[SchemaSubject]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setSubjectVarargs(value: SchemaSubject*): Self = StObject.set(x, "subject", js.Array(value*))
    
    inline def set_type(value: String): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeNull: Self = StObject.set(x, "_type", null)
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
