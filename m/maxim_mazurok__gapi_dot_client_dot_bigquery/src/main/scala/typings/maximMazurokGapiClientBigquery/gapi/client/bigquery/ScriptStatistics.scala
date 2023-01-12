package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptStatistics extends StObject {
  
  /** [Output-only] Whether this child job was a statement or expression. */
  var evaluationKind: js.UndefOr[String] = js.undefined
  
  /**
    * Stack trace showing the line/column/procedure name of each frame on the stack at the point where the current evaluation happened. The leaf frame is first, the primary script is
    * last. Never empty.
    */
  var stackFrames: js.UndefOr[js.Array[ScriptStackFrame]] = js.undefined
}
object ScriptStatistics {
  
  inline def apply(): ScriptStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptStatistics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScriptStatistics] (val x: Self) extends AnyVal {
    
    inline def setEvaluationKind(value: String): Self = StObject.set(x, "evaluationKind", value.asInstanceOf[js.Any])
    
    inline def setEvaluationKindUndefined: Self = StObject.set(x, "evaluationKind", js.undefined)
    
    inline def setStackFrames(value: js.Array[ScriptStackFrame]): Self = StObject.set(x, "stackFrames", value.asInstanceOf[js.Any])
    
    inline def setStackFramesUndefined: Self = StObject.set(x, "stackFrames", js.undefined)
    
    inline def setStackFramesVarargs(value: ScriptStackFrame*): Self = StObject.set(x, "stackFrames", js.Array(value*))
  }
}
