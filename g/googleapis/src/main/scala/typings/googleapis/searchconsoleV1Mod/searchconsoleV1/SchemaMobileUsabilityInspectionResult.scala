package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMobileUsabilityInspectionResult extends StObject {
  
  /**
    * A list of zero or more mobile-usability issues detected for this URL.
    */
  var issues: js.UndefOr[js.Array[SchemaMobileUsabilityIssue]] = js.undefined
  
  /**
    * High-level mobile-usability inspection result for this URL.
    */
  var verdict: js.UndefOr[String | Null] = js.undefined
}
object SchemaMobileUsabilityInspectionResult {
  
  inline def apply(): SchemaMobileUsabilityInspectionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMobileUsabilityInspectionResult]
  }
  
  extension [Self <: SchemaMobileUsabilityInspectionResult](x: Self) {
    
    inline def setIssues(value: js.Array[SchemaMobileUsabilityIssue]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    inline def setIssuesUndefined: Self = StObject.set(x, "issues", js.undefined)
    
    inline def setIssuesVarargs(value: SchemaMobileUsabilityIssue*): Self = StObject.set(x, "issues", js.Array(value*))
    
    inline def setVerdict(value: String): Self = StObject.set(x, "verdict", value.asInstanceOf[js.Any])
    
    inline def setVerdictNull: Self = StObject.set(x, "verdict", null)
    
    inline def setVerdictUndefined: Self = StObject.set(x, "verdict", js.undefined)
  }
}
