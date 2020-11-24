package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.grammarkdownMod.SyntaxKind.CloseBracketToken
import typings.grammarkdown.grammarkdownMod.SyntaxKind.GoalKeyword
import typings.grammarkdown.grammarkdownMod.SyntaxKind.LexicalKeyword
import typings.grammarkdown.grammarkdownMod.SyntaxKind.OpenBracketToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "LexicalGoalAssertion")
@js.native
class LexicalGoalAssertion protected ()
  extends AssertionBase[
      typings.grammarkdown.grammarkdownMod.SyntaxKind.LexicalGoalAssertion, 
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
