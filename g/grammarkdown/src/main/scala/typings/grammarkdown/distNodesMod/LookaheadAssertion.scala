package typings.grammarkdown.distNodesMod

import typings.grammarkdown.distTokensMod.LookaheadOperatorKind
import typings.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken
import typings.grammarkdown.distTokensMod.SyntaxKind.LookaheadKeyword
import typings.grammarkdown.distTokensMod.SyntaxKind.OpenBracketToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "LookaheadAssertion")
@js.native
class LookaheadAssertion protected ()
  extends AssertionBase[typings.grammarkdown.distTokensMod.SyntaxKind.LookaheadAssertion, OpenBracketToken] {
  def this(openBracketToken: Token[OpenBracketToken], lookaheadKeyword: Token[LookaheadKeyword]) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    lookaheadKeyword: Token[LookaheadKeyword],
    operatorToken: Token[LookaheadOperatorKind]
  ) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    lookaheadKeyword: Token[LookaheadKeyword],
    operatorToken: js.UndefOr[scala.Nothing],
    lookahead: SymbolSet
  ) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    lookaheadKeyword: Token[LookaheadKeyword],
    operatorToken: js.UndefOr[scala.Nothing],
    lookahead: SymbolSpan
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
    operatorToken: js.UndefOr[scala.Nothing],
    lookahead: js.UndefOr[scala.Nothing],
    closeBracketToken: Token[CloseBracketToken]
  ) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    lookaheadKeyword: Token[LookaheadKeyword],
    operatorToken: js.UndefOr[scala.Nothing],
    lookahead: SymbolSet,
    closeBracketToken: Token[CloseBracketToken]
  ) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    lookaheadKeyword: Token[LookaheadKeyword],
    operatorToken: js.UndefOr[scala.Nothing],
    lookahead: SymbolSpan,
    closeBracketToken: Token[CloseBracketToken]
  ) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    lookaheadKeyword: Token[LookaheadKeyword],
    operatorToken: Token[LookaheadOperatorKind],
    lookahead: js.UndefOr[scala.Nothing],
    closeBracketToken: Token[CloseBracketToken]
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

