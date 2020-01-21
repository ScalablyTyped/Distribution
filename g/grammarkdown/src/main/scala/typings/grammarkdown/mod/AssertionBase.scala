package typings.grammarkdown.mod

import typings.grammarkdown.nodesMod.AssertionKind
import typings.grammarkdown.tokensMod.SyntaxKind.CloseBracketToken
import typings.grammarkdown.tokensMod.SyntaxKind.OpenBracketGreaterThanToken
import typings.grammarkdown.tokensMod.SyntaxKind.OpenBracketToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "AssertionBase")
@js.native
abstract class AssertionBase[TKind /* <: AssertionKind */, TBracket /* <: OpenBracketToken | OpenBracketGreaterThanToken */] protected ()
  extends typings.grammarkdown.nodesMod.AssertionBase[TKind, TBracket] {
  def this(kind: TKind, openBracketToken: typings.grammarkdown.nodesMod.Token[TBracket]) = this()
  def this(
    kind: TKind,
    openBracketToken: typings.grammarkdown.nodesMod.Token[TBracket],
    closeBracketToken: typings.grammarkdown.nodesMod.Token[CloseBracketToken]
  ) = this()
}

