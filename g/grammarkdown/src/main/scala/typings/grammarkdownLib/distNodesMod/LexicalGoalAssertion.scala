package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "LexicalGoalAssertion")
@js.native
class LexicalGoalAssertion protected ()
  extends AssertionBase[
      grammarkdownLib.distTokensMod.SyntaxKind.LexicalGoalAssertion, 
      grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken
    ] {
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken], lexicalKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.LexicalKeyword]) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken], lexicalKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.LexicalKeyword], goalKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.GoalKeyword]) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken], lexicalKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.LexicalKeyword], goalKeyword: js.UndefOr[scala.Nothing], symbol: Identifier) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken], lexicalKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.LexicalKeyword], goalKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.GoalKeyword], symbol: Identifier) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken], lexicalKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.LexicalKeyword], goalKeyword: js.UndefOr[scala.Nothing], symbol: js.UndefOr[scala.Nothing], closeBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.CloseBracketToken]) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken], lexicalKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.LexicalKeyword], goalKeyword: js.UndefOr[scala.Nothing], symbol: Identifier, closeBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.CloseBracketToken]) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken], lexicalKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.LexicalKeyword], goalKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.GoalKeyword], symbol: js.UndefOr[scala.Nothing], closeBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.CloseBracketToken]) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken], lexicalKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.LexicalKeyword], goalKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.GoalKeyword], symbol: Identifier, closeBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.CloseBracketToken]) = this()
  val goalKeyword: js.UndefOr[Token[grammarkdownLib.distTokensMod.SyntaxKind.GoalKeyword]] = js.native
  val lexicalKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.LexicalKeyword] = js.native
  val symbol: js.UndefOr[Identifier] = js.native
  def update(): LexicalGoalAssertion = js.native
  def update(symbol: Identifier): LexicalGoalAssertion = js.native
}

