package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScriptStackFrame extends js.Object {
  
  /** [Output-only] One-based end column. */
  var endColumn: js.UndefOr[Double] = js.native
  
  /** [Output-only] One-based end line. */
  var endLine: js.UndefOr[Double] = js.native
  
  /** [Output-only] Name of the active procedure, empty if in a top-level script. */
  var procedureId: js.UndefOr[String] = js.native
  
  /** [Output-only] One-based start column. */
  var startColumn: js.UndefOr[Double] = js.native
  
  /** [Output-only] One-based start line. */
  var startLine: js.UndefOr[Double] = js.native
  
  /** [Output-only] Text of the current statement/expression. */
  var text: js.UndefOr[String] = js.native
}
object ScriptStackFrame {
  
  @scala.inline
  def apply(): ScriptStackFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptStackFrame]
  }
  
  @scala.inline
  implicit class ScriptStackFrameOps[Self <: ScriptStackFrame] (val x: Self) extends AnyVal {
    
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
    def setEndColumn(value: Double): Self = this.set("endColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndColumn: Self = this.set("endColumn", js.undefined)
    
    @scala.inline
    def setEndLine(value: Double): Self = this.set("endLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndLine: Self = this.set("endLine", js.undefined)
    
    @scala.inline
    def setProcedureId(value: String): Self = this.set("procedureId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcedureId: Self = this.set("procedureId", js.undefined)
    
    @scala.inline
    def setStartColumn(value: Double): Self = this.set("startColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartColumn: Self = this.set("startColumn", js.undefined)
    
    @scala.inline
    def setStartLine(value: Double): Self = this.set("startLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartLine: Self = this.set("startLine", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
