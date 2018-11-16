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

