package typings.grammarkdown.distNodesMod

import typings.grammarkdown.distTokensMod.ProseFragmentLiteralKind
import typings.grammarkdown.distTokensMod.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "ProseFragmentLiteral")
@js.native
class ProseFragmentLiteral[TKind /* <: ProseFragmentLiteralKind */] protected ()
  extends Node[SyntaxKind]
     with TextContent {
  def this(kind: SyntaxKind) = this()
  def this(kind: SyntaxKind, text: String) = this()
}

