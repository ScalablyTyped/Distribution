package typings.grammarkdown.diagnosticsMod

import typings.grammarkdown.coreMod.Range
import typings.grammarkdown.nodesMod.Node
import typings.grammarkdown.nodesMod.SourceFile
import typings.grammarkdown.tokensMod.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagnosticInfo extends js.Object {
  var code: Double
  var diagnosticIndex: Double
  var formattedMessage: js.UndefOr[String] = js.undefined
  var message: String
  var messageArguments: js.UndefOr[js.Array[_]] = js.undefined
  var node: js.UndefOr[Node[SyntaxKind]] = js.undefined
  var pos: Double
  var range: js.UndefOr[Range] = js.undefined
  var sourceFile: js.UndefOr[SourceFile] = js.undefined
  var warning: Boolean
}

object DiagnosticInfo {
  @scala.inline
  def apply(
    code: Double,
    diagnosticIndex: Double,
    message: String,
    pos: Double,
    warning: Boolean,
    formattedMessage: String = null,
    messageArguments: js.Array[_] = null,
    node: Node[SyntaxKind] = null,
    range: Range = null,
    sourceFile: SourceFile = null
  ): DiagnosticInfo = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], diagnosticIndex = diagnosticIndex.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    if (formattedMessage != null) __obj.updateDynamic("formattedMessage")(formattedMessage.asInstanceOf[js.Any])
    if (messageArguments != null) __obj.updateDynamic("messageArguments")(messageArguments.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (sourceFile != null) __obj.updateDynamic("sourceFile")(sourceFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticInfo]
  }
}

