package typings
package grammarkdownLib.distDiagnosticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagnosticInfo extends js.Object {
  var code: scala.Double
  var diagnosticIndex: scala.Double
  var formattedMessage: js.UndefOr[java.lang.String] = js.undefined
  var message: java.lang.String
  var messageArguments: js.UndefOr[js.Array[_]]
  var node: js.UndefOr[grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind]]
  var pos: scala.Double
  var range: js.UndefOr[grammarkdownLib.distCoreMod.Range]
  var sourceFile: js.UndefOr[grammarkdownLib.distNodesMod.SourceFile]
  var warning: scala.Boolean
}

object DiagnosticInfo {
  @scala.inline
  def apply(
    code: scala.Double,
    diagnosticIndex: scala.Double,
    message: java.lang.String,
    pos: scala.Double,
    warning: scala.Boolean,
    formattedMessage: java.lang.String = null,
    messageArguments: js.Array[_] = null,
    node: grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind] = null,
    range: grammarkdownLib.distCoreMod.Range = null,
    sourceFile: grammarkdownLib.distNodesMod.SourceFile = null
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

