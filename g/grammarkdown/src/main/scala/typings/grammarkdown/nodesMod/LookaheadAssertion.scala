package typings.grammarkdown.nodesMod

import typings.grammarkdown.tokensMod.LookaheadOperatorKind
import typings.grammarkdown.tokensMod.SyntaxKind.CloseBracketToken
import typings.grammarkdown.tokensMod.SyntaxKind.LookaheadKeyword
import typings.grammarkdown.tokensMod.SyntaxKind.OpenBracketToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "LookaheadAssertion")
@js.native
class LookaheadAssertion protected ()
  extends AssertionBase[typings.grammarkdown.tokensMod.SyntaxKind.LookaheadAssertion, OpenBracketToken] {
  def this(openBracketToken: Token[OpenBracketToken], lookaheadKeyword: Token[LookaheadKeyword]) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    lookaheadKeyword: Token[LookaheadKeyword],
    operatorToken: Token[LookaheadOperatorKind]
  ) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    lookaheadKeyword: Token[LookaheadKeyword],
    operatorToken: Token[LookaheadOperatorKind],
    lookahead: SymbolSet
  ) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    lookaheadKeyword: Token[LookaheadKeyword],
    operatorToken: Token[LookaheadOperatorKind],
    lookahead: SymbolSpan
  ) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    lookaheadKeyword: Token[LookaheadKeyword],
    operatorToken: Token[LookaheadOperatorKind],
    lookahead: SymbolSet,
    closeBracketToken: Token[CloseBracketToken]
  ) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    lookaheadKeyword: Token[LookaheadKeyword],
    operatorToken: Token[LookaheadOperatorKind],
    lookahead: SymbolSpan,
    closeBracketToken: Token[CloseBracketToken]
  ) = this()
  val lookahead: js.UndefOr[SymbolSpan | SymbolSet] = js.native
  val lookaheadKeyword: Token[LookaheadKeyword] = js.native
  val operatorToken: js.UndefOr[Token[LookaheadOperatorKind]] = js.native
  def update(): LookaheadAssertion = js.native
  def update(lookahead: SymbolSet): LookaheadAssertion = js.native
  def update(lookahead: SymbolSpan): LookaheadAssertion = js.native
}

