package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "ProseFragmentLiteral")
@js.native
class ProseFragmentLiteral[TKind /* <: grammarkdownLib.distTokensMod.ProseFragmentLiteralKind */] protected ()
  extends Node[grammarkdownLib.distTokensMod.SyntaxKind]
     with TextContent {
  def this(kind: grammarkdownLib.distTokensMod.SyntaxKind) = this()
  def this(kind: grammarkdownLib.distTokensMod.SyntaxKind, text: java.lang.String) = this()
  /* CompleteClass */
  override var text: js.UndefOr[java.lang.String] = js.native
}

