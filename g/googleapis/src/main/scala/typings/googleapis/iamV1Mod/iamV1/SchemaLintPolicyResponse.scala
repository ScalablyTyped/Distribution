package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response of a lint operation. An empty response indicates the operation
  * was able to fully execute and no lint issue was found.
  */
trait SchemaLintPolicyResponse extends StObject {
  
  /**
    * List of lint results sorted by a composite &lt;severity,
    * binding_ordinal&gt; key, descending order of severity and ascending order
    * of binding_ordinal. There is no certain order among the same keys.  For
    * cross-binding results (only if the input object to lint is instance of
    * google.iam.v1.Policy), there will be a google.iam.admin.v1.LintResult for
    * each of the involved bindings, and the associated debug_message may
    * enumerate the other involved binding ordinal number(s).
    */
  var lintResults: js.UndefOr[js.Array[SchemaLintResult]] = js.undefined
}
object SchemaLintPolicyResponse {
  
  @scala.inline
  def apply(): SchemaLintPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLintPolicyResponse]
  }
  
  @scala.inline
  implicit class SchemaLintPolicyResponseMutableBuilder[Self <: SchemaLintPolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLintResults(value: js.Array[SchemaLintResult]): Self = StObject.set(x, "lintResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLintResultsUndefined: Self = StObject.set(x, "lintResults", js.undefined)
    
    @scala.inline
    def setLintResultsVarargs(value: SchemaLintResult*): Self = StObject.set(x, "lintResults", js.Array(value :_*))
  }
}
