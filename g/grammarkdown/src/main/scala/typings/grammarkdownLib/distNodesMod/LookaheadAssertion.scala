package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "LookaheadAssertion")
@js.native
class LookaheadAssertion protected ()
  extends AssertionBase[
      grammarkdownLib.distTokensMod.SyntaxKind.LookaheadAssertion, 
      grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken
    ] {
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken], lookaheadKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.LookaheadKeyword]) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken], lookaheadKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.LookaheadKeyword], operatorToken: Token[grammarkdownLib.distTokensMod.LookaheadOperatorKind]) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken], lookaheadKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.LookaheadKeyword], operatorToken: js.UndefOr[scala.Nothing], lookahead: SymbolSet) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken], lookaheadKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.LookaheadKeyword], operatorToken: js.UndefOr[scala.Nothing], lookahead: SymbolSpan) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken], lookaheadKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.LookaheadKeyword], operatorToken: Token[grammarkdownLib.distTokensMod.LookaheadOperatorKind], lookahead: SymbolSet) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken], lookaheadKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.LookaheadKeyword], operatorToken: Token[grammarkdownLib.distTokensMod.LookaheadOperatorKind], lookahead: SymbolSpan) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken], lookaheadKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.LookaheadKeyword], operatorToken: js.UndefOr[scala.Nothing], lookahead: js.UndefOr[scala.Nothing], closeBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.CloseBracketToken]) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken], lookaheadKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.LookaheadKeyword], operatorToken: js.UndefOr[scala.Nothing], lookahead: SymbolSet, closeBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.CloseBracketToken]) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken], lookaheadKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.LookaheadKeyword], operatorToken: js.UndefOr[scala.Nothing], lookahead: SymbolSpan, closeBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.CloseBracketToken]) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken], lookaheadKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.LookaheadKeyword], operatorToken: Token[grammarkdownLib.distTokensMod.LookaheadOperatorKind], lookahead: js.UndefOr[scala.Nothing], closeBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.CloseBracketToken]) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken], lookaheadKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.LookaheadKeyword], operatorToken: Token[grammarkdownLib.distTokensMod.LookaheadOperatorKind], lookahead: SymbolSet, closeBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.CloseBracketToken]) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken], lookaheadKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.LookaheadKeyword], operatorToken: Token[grammarkdownLib.distTokensMod.LookaheadOperatorKind], lookahead: SymbolSpan, closeBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.CloseBracketToken]) = this()
  val lookahead: js.UndefOr[SymbolSpan | SymbolSet] = js.native
  val lookaheadKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.LookaheadKeyword] = js.native
  val operatorToken: js.UndefOr[Token[grammarkdownLib.distTokensMod.LookaheadOperatorKind]] = js.native
  def update(): LookaheadAssertion = js.native
  def update(lookahead: SymbolSet): LookaheadAssertion = js.native
  def update(lookahead: SymbolSpan): LookaheadAssertion = js.native
}

