package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagnosticInfo extends StObject {
  
  var code: Double
  
  var diagnosticIndex: Double
  
  var formattedMessage: js.UndefOr[String] = js.undefined
  
  var message: String
  
  var messageArguments: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var node: js.UndefOr[Node2[SyntaxKind]] = js.undefined
  
  var pos: Double
  
  var range: js.UndefOr[Range2] = js.undefined
  
  var sourceFile: js.UndefOr[SourceFile] = js.undefined
  
  var warning: Boolean
}
object DiagnosticInfo {
  
  inline def apply(code: Double, diagnosticIndex: Double, message: String, pos: Double, warning: Boolean): DiagnosticInfo = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], diagnosticIndex = diagnosticIndex.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticInfo]
  }
  
  extension [Self <: DiagnosticInfo](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticIndex(value: Double): Self = StObject.set(x, "diagnosticIndex", value.asInstanceOf[js.Any])
    
    inline def setFormattedMessage(value: String): Self = StObject.set(x, "formattedMessage", value.asInstanceOf[js.Any])
    
    inline def setFormattedMessageUndefined: Self = StObject.set(x, "formattedMessage", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageArguments(value: js.Array[js.Any]): Self = StObject.set(x, "messageArguments", value.asInstanceOf[js.Any])
    
    inline def setMessageArgumentsUndefined: Self = StObject.set(x, "messageArguments", js.undefined)
    
    inline def setMessageArgumentsVarargs(value: js.Any*): Self = StObject.set(x, "messageArguments", js.Array(value :_*))
    
    inline def setNode(value: Node2[SyntaxKind]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range2): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setSourceFile(value: SourceFile): Self = StObject.set(x, "sourceFile", value.asInstanceOf[js.Any])
    
    inline def setSourceFileUndefined: Self = StObject.set(x, "sourceFile", js.undefined)
    
    inline def setWarning(value: Boolean): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
  }
}
