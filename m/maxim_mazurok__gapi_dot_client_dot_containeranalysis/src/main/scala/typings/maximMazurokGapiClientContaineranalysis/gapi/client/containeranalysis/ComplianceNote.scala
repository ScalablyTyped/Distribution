package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComplianceNote extends StObject {
  
  var cisBenchmark: js.UndefOr[CisBenchmark] = js.undefined
  
  /** A description about this compliance check. */
  var description: js.UndefOr[String] = js.undefined
  
  /** A rationale for the existence of this compliance check. */
  var rationale: js.UndefOr[String] = js.undefined
  
  /** A description of remediation steps if the compliance check fails. */
  var remediation: js.UndefOr[String] = js.undefined
  
  /** Serialized scan instructions with a predefined format. */
  var scanInstructions: js.UndefOr[String] = js.undefined
  
  /** The title that identifies this compliance check. */
  var title: js.UndefOr[String] = js.undefined
  
  /** The OS and config versions the benchmark applies to. */
  var version: js.UndefOr[js.Array[ComplianceVersion]] = js.undefined
}
object ComplianceNote {
  
  inline def apply(): ComplianceNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceNote]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComplianceNote] (val x: Self) extends AnyVal {
    
    inline def setCisBenchmark(value: CisBenchmark): Self = StObject.set(x, "cisBenchmark", value.asInstanceOf[js.Any])
    
    inline def setCisBenchmarkUndefined: Self = StObject.set(x, "cisBenchmark", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setRationale(value: String): Self = StObject.set(x, "rationale", value.asInstanceOf[js.Any])
    
    inline def setRationaleUndefined: Self = StObject.set(x, "rationale", js.undefined)
    
    inline def setRemediation(value: String): Self = StObject.set(x, "remediation", value.asInstanceOf[js.Any])
    
    inline def setRemediationUndefined: Self = StObject.set(x, "remediation", js.undefined)
    
    inline def setScanInstructions(value: String): Self = StObject.set(x, "scanInstructions", value.asInstanceOf[js.Any])
    
    inline def setScanInstructionsUndefined: Self = StObject.set(x, "scanInstructions", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVersion(value: js.Array[ComplianceVersion]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVersionVarargs(value: ComplianceVersion*): Self = StObject.set(x, "version", js.Array(value*))
  }
}
