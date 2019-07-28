package typings.grammarkdown.distDiagnosticsMod

import typings.grammarkdown.distCoreMod.Range
import typings.grammarkdown.distNodesMod.Node
import typings.grammarkdown.distNodesMod.SourceFile
import typings.grammarkdown.distTokensMod.SyntaxKind
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
    val __obj = js.Dynamic.literal(code = code, diagnosticIndex = diagnosticIndex, message = message, pos = pos, warning = warning)
    if (formattedMessage != null) __obj.updateDynamic("formattedMessage")(formattedMessage)
    if (messageArguments != null) __obj.updateDynamic("messageArguments")(messageArguments)
    if (node != null) __obj.updateDynamic("node")(node)
    if (range != null) __obj.updateDynamic("range")(range)
    if (sourceFile != null) __obj.updateDynamic("sourceFile")(sourceFile)
    __obj.asInstanceOf[DiagnosticInfo]
  }
}

