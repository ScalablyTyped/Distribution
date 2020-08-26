package typings.grammarkdown.mod

import typings.grammarkdown.tokensMod.SyntaxKind.CloseBracketToken
import typings.grammarkdown.tokensMod.SyntaxKind.GoalKeyword
import typings.grammarkdown.tokensMod.SyntaxKind.LexicalKeyword
import typings.grammarkdown.tokensMod.SyntaxKind.OpenBracketToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "LexicalGoalAssertion")
@js.native
class LexicalGoalAssertion protected ()
  extends typings.grammarkdown.nodesMod.LexicalGoalAssertion {
  def this(
    openBracketToken: typings.grammarkdown.nodesMod.Token[OpenBracketToken],
    lexicalKeyword: typings.grammarkdown.nodesMod.Token[LexicalKeyword]
  ) = this()
  def this(
    openBracketToken: typings.grammarkdown.nodesMod.Token[OpenBracketToken],
    lexicalKeyword: typings.grammarkdown.nodesMod.Token[LexicalKeyword],
    goalKeyword: typings.grammarkdown.nodesMod.Token[GoalKeyword]
  ) = this()
  def this(
    openBracketToken: typings.grammarkdown.nodesMod.Token[OpenBracketToken],
    lexicalKeyword: typings.grammarkdown.nodesMod.Token[LexicalKeyword],
    goalKeyword: js.UndefOr[scala.Nothing],
    symbol: typings.grammarkdown.nodesMod.Identifier
  ) = this()
  def this(
    openBracketToken: typings.grammarkdown.nodesMod.Token[OpenBracketToken],
    lexicalKeyword: typings.grammarkdown.nodesMod.Token[LexicalKeyword],
    goalKeyword: typings.grammarkdown.nodesMod.Token[GoalKeyword],
    symbol: typings.grammarkdown.nodesMod.Identifier
  ) = this()
  def this(
    openBracketToken: typings.grammarkdown.nodesMod.Token[OpenBracketToken],
    lexicalKeyword: typings.grammarkdown.nodesMod.Token[LexicalKeyword],
    goalKeyword: js.UndefOr[scala.Nothing],
    symbol: js.UndefOr[scala.Nothing],
    closeBracketToken: typings.grammarkdown.nodesMod.Token[CloseBracketToken]
  ) = this()
  def this(
    openBracketToken: typings.grammarkdown.nodesMod.Token[OpenBracketToken],
    lexicalKeyword: typings.grammarkdown.nodesMod.Token[LexicalKeyword],
    goalKeyword: js.UndefOr[scala.Nothing],
    symbol: typings.grammarkdown.nodesMod.Identifier,
    closeBracketToken: typings.grammarkdown.nodesMod.Token[CloseBracketToken]
  ) = this()
  def this(
    openBracketToken: typings.grammarkdown.nodesMod.Token[OpenBracketToken],
    lexicalKeyword: typings.grammarkdown.nodesMod.Token[LexicalKeyword],
    goalKeyword: typings.grammarkdown.nodesMod.Token[GoalKeyword],
    symbol: js.UndefOr[scala.Nothing],
    closeBracketToken: typings.grammarkdown.nodesMod.Token[CloseBracketToken]
  ) = this()
  def this(
    openBracketToken: typings.grammarkdown.nodesMod.Token[OpenBracketToken],
    lexicalKeyword: typings.grammarkdown.nodesMod.Token[LexicalKeyword],
    goalKeyword: typings.grammarkdown.nodesMod.Token[GoalKeyword],
    symbol: typings.grammarkdown.nodesMod.Identifier,
    closeBracketToken: typings.grammarkdown.nodesMod.Token[CloseBracketToken]
  ) = this()
}

