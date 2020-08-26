package typings.grammarkdown.diagnosticsMod

import typings.grammarkdown.coreMod.Range
import typings.grammarkdown.nodesMod.Node
import typings.grammarkdown.nodesMod.SourceFile
import typings.grammarkdown.tokensMod.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagnosticInfo extends js.Object {
  var code: Double = js.native
  var diagnosticIndex: Double = js.native
  var formattedMessage: js.UndefOr[String] = js.native
  var message: String = js.native
  var messageArguments: js.UndefOr[js.Array[_]] = js.native
  var node: js.UndefOr[Node[SyntaxKind]] = js.native
  var pos: Double = js.native
  var range: js.UndefOr[Range] = js.native
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
  implicit class DiagnosticInfoOps[Self <: DiagnosticInfo] (val x: Self) extends AnyVal {
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
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiagnosticIndex(value: Double): Self = this.set("diagnosticIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setPos(value: Double): Self = this.set("pos", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarning(value: Boolean): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormattedMessage(value: String): Self = this.set("formattedMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormattedMessage: Self = this.set("formattedMessage", js.undefined)
    @scala.inline
    def setMessageArgumentsVarargs(value: js.Any*): Self = this.set("messageArguments", js.Array(value :_*))
    @scala.inline
    def setMessageArguments(value: js.Array[_]): Self = this.set("messageArguments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageArguments: Self = this.set("messageArguments", js.undefined)
    @scala.inline
    def setNode(value: Node[SyntaxKind]): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNode: Self = this.set("node", js.undefined)
    @scala.inline
    def setRange(value: Range): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setSourceFile(value: SourceFile): Self = this.set("sourceFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceFile: Self = this.set("sourceFile", js.undefined)
  }
  
}

