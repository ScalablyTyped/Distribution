package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLintPolicyResponse extends StObject {
  
  /**
    * List of lint results sorted by `severity` in descending order.
    */
  var lintResults: js.UndefOr[js.Array[SchemaLintResult]] = js.undefined
}
object SchemaLintPolicyResponse {
  
  inline def apply(): SchemaLintPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLintPolicyResponse]
  }
  
  extension [Self <: SchemaLintPolicyResponse](x: Self) {
    
    inline def setLintResults(value: js.Array[SchemaLintResult]): Self = StObject.set(x, "lintResults", value.asInstanceOf[js.Any])
    
    inline def setLintResultsUndefined: Self = StObject.set(x, "lintResults", js.undefined)
    
    inline def setLintResultsVarargs(value: SchemaLintResult*): Self = StObject.set(x, "lintResults", js.Array(value*))
  }
}
