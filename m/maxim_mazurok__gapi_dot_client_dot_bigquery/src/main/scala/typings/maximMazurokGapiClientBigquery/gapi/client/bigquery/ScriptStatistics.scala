package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScriptStatistics extends js.Object {
  
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
  implicit class ScriptStatisticsOps[Self <: ScriptStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEvaluationKind(value: String): Self = this.set("evaluationKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvaluationKind: Self = this.set("evaluationKind", js.undefined)
    
    @scala.inline
    def setStackFramesVarargs(value: ScriptStackFrame*): Self = this.set("stackFrames", js.Array(value :_*))
    
    @scala.inline
    def setStackFrames(value: js.Array[ScriptStackFrame]): Self = this.set("stackFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackFrames: Self = this.set("stackFrames", js.undefined)
  }
}
