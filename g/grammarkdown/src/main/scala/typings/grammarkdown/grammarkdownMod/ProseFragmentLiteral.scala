package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.distTokensMod.ProseFragmentLiteralKind
import typings.grammarkdown.distTokensMod.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "ProseFragmentLiteral")
@js.native
class ProseFragmentLiteral[TKind /* <: ProseFragmentLiteralKind */] protected ()
  extends typings.grammarkdown.distNodesMod.ProseFragmentLiteral[TKind] {
  def this(kind: SyntaxKind) = this()
  def this(kind: SyntaxKind, text: String) = this()
}

