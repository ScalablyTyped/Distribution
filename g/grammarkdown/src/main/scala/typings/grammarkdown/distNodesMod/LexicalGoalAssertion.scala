package typings.grammarkdown.distNodesMod

import typings.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken
import typings.grammarkdown.distTokensMod.SyntaxKind.GoalKeyword
import typings.grammarkdown.distTokensMod.SyntaxKind.LexicalKeyword
import typings.grammarkdown.distTokensMod.SyntaxKind.OpenBracketToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "LexicalGoalAssertion")
@js.native
class LexicalGoalAssertion protected ()
  extends AssertionBase[
      typings.grammarkdown.distTokensMod.SyntaxKind.LexicalGoalAssertion, 
      OpenBracketToken
    ] {
  def this(openBracketToken: Token[OpenBracketToken], lexicalKeyword: Token[LexicalKeyword]) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    lexicalKeyword: Token[LexicalKeyword],
    goalKeyword: Token[GoalKeyword]
  ) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    lexicalKeyword: Token[LexicalKeyword],
    goalKeyword: js.UndefOr[scala.Nothing],
    symbol: Identifier
  ) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    lexicalKeyword: Token[LexicalKeyword],
    goalKeyword: Token[GoalKeyword],
    symbol: Identifier
  ) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    lexicalKeyword: Token[LexicalKeyword],
    goalKeyword: js.UndefOr[scala.Nothing],
    symbol: js.UndefOr[scala.Nothing],
    closeBracketToken: Token[CloseBracketToken]
  ) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    lexicalKeyword: Token[LexicalKeyword],
    goalKeyword: js.UndefOr[scala.Nothing],
    symbol: Identifier,
    closeBracketToken: Token[CloseBracketToken]
  ) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    lexicalKeyword: Token[LexicalKeyword],
    goalKeyword: Token[GoalKeyword],
    symbol: js.UndefOr[scala.Nothing],
    closeBracketToken: Token[CloseBracketToken]
  ) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    lexicalKeyword: Token[LexicalKeyword],
    goalKeyword: Token[GoalKeyword],
    symbol: Identifier,
    closeBracketToken: Token[CloseBracketToken]
  ) = this()
  val goalKeyword: js.UndefOr[Token[GoalKeyword]] = js.native
  val lexicalKeyword: Token[LexicalKeyword] = js.native
  val symbol: js.UndefOr[Identifier] = js.native
  def update(): LexicalGoalAssertion = js.native
  def update(symbol: Identifier): LexicalGoalAssertion = js.native
}

