package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagnosticInfo extends StObject {
  
  var code: Double = js.native
  
  var diagnosticIndex: Double = js.native
  
  var formattedMessage: js.UndefOr[String] = js.native
  
  var message: String = js.native
  
  var messageArguments: js.UndefOr[js.Array[_]] = js.native
  
  var node: js.UndefOr[Node2[SyntaxKind]] = js.native
  
  var pos: Double = js.native
  
  var range: js.UndefOr[Range2] = js.native
  
  var sourceFile: js.UndefOr[SourceFile] = js.native
  
  var warning: Boolean = js.native
}
object DiagnosticInfo {
  
  @scala.inline
  def apply(code: Double, diagnosticIndex: Double, message: String, pos: Double, warning: Boolean): DiagnosticInfo = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], diagnosticIndex = diagnosticIndex.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticInfo]
  }
  
  @scala.inline
  implicit class DiagnosticInfoMutableBuilder[Self <: DiagnosticInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnosticIndex(value: Double): Self = StObject.set(x, "diagnosticIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedMessage(value: String): Self = StObject.set(x, "formattedMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedMessageUndefined: Self = StObject.set(x, "formattedMessage", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageArguments(value: js.Array[_]): Self = StObject.set(x, "messageArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageArgumentsUndefined: Self = StObject.set(x, "messageArguments", js.undefined)
    
    @scala.inline
    def setMessageArgumentsVarargs(value: js.Any*): Self = StObject.set(x, "messageArguments", js.Array(value :_*))
    
    @scala.inline
    def setNode(value: Node2[SyntaxKind]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    @scala.inline
    def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range2): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setSourceFile(value: SourceFile): Self = StObject.set(x, "sourceFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFileUndefined: Self = StObject.set(x, "sourceFile", js.undefined)
    
    @scala.inline
    def setWarning(value: Boolean): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
  }
}
