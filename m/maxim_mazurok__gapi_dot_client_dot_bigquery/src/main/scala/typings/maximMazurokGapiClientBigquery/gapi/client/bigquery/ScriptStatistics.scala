package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScriptStatistics extends StObject {
  
  /** [Output-only] Whether this child job was a statement or expression. */
  var evaluationKind: js.UndefOr[String] = js.native
  
  /**
    * Stack trace showing the line/column/procedure name of each frame on the stack at the point where the current evaluation happened. The leaf frame is first, the primary script is
    * last. Never empty.
    */
  var stackFrames: js.UndefOr[js.Array[ScriptStackFrame]] = js.native
}
object ScriptStatistics {
  
  @scala.inline
  def apply(): ScriptStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptStatistics]
  }
  
  @scala.inline
  implicit class ScriptStatisticsMutableBuilder[Self <: ScriptStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvaluationKind(value: String): Self = StObject.set(x, "evaluationKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationKindUndefined: Self = StObject.set(x, "evaluationKind", js.undefined)
    
    @scala.inline
    def setStackFrames(value: js.Array[ScriptStackFrame]): Self = StObject.set(x, "stackFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackFramesUndefined: Self = StObject.set(x, "stackFrames", js.undefined)
    
    @scala.inline
    def setStackFramesVarargs(value: ScriptStackFrame*): Self = StObject.set(x, "stackFrames", js.Array(value :_*))
  }
}
