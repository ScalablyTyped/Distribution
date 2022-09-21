package typings.googleapis.containeranalysisV1Mod.containeranalysisV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaComplianceNote extends StObject {
  
  var cisBenchmark: js.UndefOr[SchemaCisBenchmark] = js.undefined
  
  /**
    * A description about this compliance check.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A rationale for the existence of this compliance check.
    */
  var rationale: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A description of remediation steps if the compliance check fails.
    */
  var remediation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Serialized scan instructions with a predefined format.
    */
  var scanInstructions: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The title that identifies this compliance check.
    */
  var title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The OS and config versions the benchmark applies to.
    */
  var version: js.UndefOr[js.Array[SchemaComplianceVersion]] = js.undefined
}
object SchemaComplianceNote {
  
  inline def apply(): SchemaComplianceNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComplianceNote]
  }
  
  extension [Self <: SchemaComplianceNote](x: Self) {
    
    inline def setCisBenchmark(value: SchemaCisBenchmark): Self = StObject.set(x, "cisBenchmark", value.asInstanceOf[js.Any])
    
    inline def setCisBenchmarkUndefined: Self = StObject.set(x, "cisBenchmark", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setRationale(value: String): Self = StObject.set(x, "rationale", value.asInstanceOf[js.Any])
    
    inline def setRationaleNull: Self = StObject.set(x, "rationale", null)
    
    inline def setRationaleUndefined: Self = StObject.set(x, "rationale", js.undefined)
    
    inline def setRemediation(value: String): Self = StObject.set(x, "remediation", value.asInstanceOf[js.Any])
    
    inline def setRemediationNull: Self = StObject.set(x, "remediation", null)
    
    inline def setRemediationUndefined: Self = StObject.set(x, "remediation", js.undefined)
    
    inline def setScanInstructions(value: String): Self = StObject.set(x, "scanInstructions", value.asInstanceOf[js.Any])
    
    inline def setScanInstructionsNull: Self = StObject.set(x, "scanInstructions", null)
    
    inline def setScanInstructionsUndefined: Self = StObject.set(x, "scanInstructions", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVersion(value: js.Array[SchemaComplianceVersion]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVersionVarargs(value: SchemaComplianceVersion*): Self = StObject.set(x, "version", js.Array(value*))
  }
}
