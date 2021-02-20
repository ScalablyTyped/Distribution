package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScriptStackFrame extends StObject {
  
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
  implicit class ScriptStackFrameMutableBuilder[Self <: ScriptStackFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndColumn(value: Double): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndColumnUndefined: Self = StObject.set(x, "endColumn", js.undefined)
    
    @scala.inline
    def setEndLine(value: Double): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndLineUndefined: Self = StObject.set(x, "endLine", js.undefined)
    
    @scala.inline
    def setProcedureId(value: String): Self = StObject.set(x, "procedureId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcedureIdUndefined: Self = StObject.set(x, "procedureId", js.undefined)
    
    @scala.inline
    def setStartColumn(value: Double): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartColumnUndefined: Self = StObject.set(x, "startColumn", js.undefined)
    
    @scala.inline
    def setStartLine(value: Double): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartLineUndefined: Self = StObject.set(x, "startLine", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
