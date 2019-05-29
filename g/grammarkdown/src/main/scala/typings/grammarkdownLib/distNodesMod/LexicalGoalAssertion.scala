package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "LexicalGoalAssertion")
@js.native
class LexicalGoalAssertion protected ()
  extends AssertionBase[grammarkdownLib.distTokensMod.SyntaxKind, grammarkdownLib.distTokensMod.SyntaxKind] {
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind], lexicalKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind], lexicalKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind], goalKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind], lexicalKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind], goalKeyword: js.UndefOr[scala.Nothing], symbol: Identifier) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind], lexicalKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind], goalKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind], symbol: Identifier) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind], lexicalKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind], goalKeyword: js.UndefOr[scala.Nothing], symbol: js.UndefOr[scala.Nothing], closeBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind], lexicalKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind], goalKeyword: js.UndefOr[scala.Nothing], symbol: Identifier, closeBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind], lexicalKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind], goalKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind], symbol: js.UndefOr[scala.Nothing], closeBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind], lexicalKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind], goalKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind], symbol: Identifier, closeBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
  val goalKeyword: js.UndefOr[Token[grammarkdownLib.distTokensMod.SyntaxKind]] = js.native
  val lexicalKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind] = js.native
  val symbol: js.UndefOr[Identifier] = js.native
  def update(): LexicalGoalAssertion = js.native
  def update(symbol: Identifier): LexicalGoalAssertion = js.native
}

