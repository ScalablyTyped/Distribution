package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptStackFrame extends StObject {
  
  /** [Output-only] One-based end column. */
  var endColumn: js.UndefOr[Double] = js.undefined
  
  /** [Output-only] One-based end line. */
  var endLine: js.UndefOr[Double] = js.undefined
  
  /** [Output-only] Name of the active procedure, empty if in a top-level script. */
  var procedureId: js.UndefOr[String] = js.undefined
  
  /** [Output-only] One-based start column. */
  var startColumn: js.UndefOr[Double] = js.undefined
  
  /** [Output-only] One-based start line. */
  var startLine: js.UndefOr[Double] = js.undefined
  
  /** [Output-only] Text of the current statement/expression. */
  var text: js.UndefOr[String] = js.undefined
}
object ScriptStackFrame {
  
  inline def apply(): ScriptStackFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptStackFrame]
  }
  
  extension [Self <: ScriptStackFrame](x: Self) {
    
    inline def setEndColumn(value: Double): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
    
    inline def setEndColumnUndefined: Self = StObject.set(x, "endColumn", js.undefined)
    
    inline def setEndLine(value: Double): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
    
    inline def setEndLineUndefined: Self = StObject.set(x, "endLine", js.undefined)
    
    inline def setProcedureId(value: String): Self = StObject.set(x, "procedureId", value.asInstanceOf[js.Any])
    
    inline def setProcedureIdUndefined: Self = StObject.set(x, "procedureId", js.undefined)
    
    inline def setStartColumn(value: Double): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
    
    inline def setStartColumnUndefined: Self = StObject.set(x, "startColumn", js.undefined)
    
    inline def setStartLine(value: Double): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
    
    inline def setStartLineUndefined: Self = StObject.set(x, "startLine", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
