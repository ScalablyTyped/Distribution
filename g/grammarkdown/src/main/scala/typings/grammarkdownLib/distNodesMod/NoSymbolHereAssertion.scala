package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "NoSymbolHereAssertion")
@js.native
class NoSymbolHereAssertion protected ()
  extends AssertionBase[
      grammarkdownLib.distTokensMod.SyntaxKind.NoSymbolHereAssertion, 
      grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken
    ] {
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken], noKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.NoKeyword]) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken], noKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.NoKeyword], symbols: js.Array[PrimarySymbol]) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken], noKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.NoKeyword], symbols: js.UndefOr[scala.Nothing], hereKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.HereKeyword]) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken], noKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.NoKeyword], symbols: js.Array[PrimarySymbol], hereKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.HereKeyword]) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken], noKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.NoKeyword], symbols: js.UndefOr[scala.Nothing], hereKeyword: js.UndefOr[scala.Nothing], closeBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.CloseBracketToken]) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken], noKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.NoKeyword], symbols: js.UndefOr[scala.Nothing], hereKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.HereKeyword], closeBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.CloseBracketToken]) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken], noKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.NoKeyword], symbols: js.Array[PrimarySymbol], hereKeyword: js.UndefOr[scala.Nothing], closeBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.CloseBracketToken]) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken], noKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.NoKeyword], symbols: js.Array[PrimarySymbol], hereKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.HereKeyword], closeBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.CloseBracketToken]) = this()
  val hereKeyword: js.UndefOr[Token[grammarkdownLib.distTokensMod.SyntaxKind.HereKeyword]] = js.native
  val noKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.NoKeyword] = js.native
  val symbols: js.UndefOr[js.Array[PrimarySymbol]] = js.native
  def update(): NoSymbolHereAssertion = js.native
  def update(symbols: js.Array[PrimarySymbol]): NoSymbolHereAssertion = js.native
}

