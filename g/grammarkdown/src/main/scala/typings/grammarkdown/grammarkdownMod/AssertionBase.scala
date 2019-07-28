package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.distNodesMod.AssertionKind
import typings.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken
import typings.grammarkdown.distTokensMod.SyntaxKind.OpenBracketGreaterThanToken
import typings.grammarkdown.distTokensMod.SyntaxKind.OpenBracketToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "AssertionBase")
@js.native
abstract class AssertionBase[TKind /* <: AssertionKind */, TBracket /* <: OpenBracketToken | OpenBracketGreaterThanToken */] protected ()
  extends typings.grammarkdown.distNodesMod.AssertionBase[TKind, TBracket] {
  def this(kind: TKind, openBracketToken: typings.grammarkdown.distNodesMod.Token[TBracket]) = this()
  def this(
    kind: TKind,
    openBracketToken: typings.grammarkdown.distNodesMod.Token[TBracket],
    closeBracketToken: typings.grammarkdown.distNodesMod.Token[CloseBracketToken]
  ) = this()
}

