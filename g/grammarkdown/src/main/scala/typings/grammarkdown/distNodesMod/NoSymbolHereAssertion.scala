package typings.grammarkdown.distNodesMod

import typings.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken
import typings.grammarkdown.distTokensMod.SyntaxKind.HereKeyword
import typings.grammarkdown.distTokensMod.SyntaxKind.NoKeyword
import typings.grammarkdown.distTokensMod.SyntaxKind.OpenBracketToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "NoSymbolHereAssertion")
@js.native
class NoSymbolHereAssertion protected ()
  extends AssertionBase[
      typings.grammarkdown.distTokensMod.SyntaxKind.NoSymbolHereAssertion, 
      OpenBracketToken
    ] {
  def this(openBracketToken: Token[OpenBracketToken], noKeyword: Token[NoKeyword]) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    noKeyword: Token[NoKeyword],
    symbols: js.Array[PrimarySymbol]
  ) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    noKeyword: Token[NoKeyword],
    symbols: js.UndefOr[scala.Nothing],
    hereKeyword: Token[HereKeyword]
  ) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    noKeyword: Token[NoKeyword],
    symbols: js.Array[PrimarySymbol],
    hereKeyword: Token[HereKeyword]
  ) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    noKeyword: Token[NoKeyword],
    symbols: js.UndefOr[scala.Nothing],
    hereKeyword: js.UndefOr[scala.Nothing],
    closeBracketToken: Token[CloseBracketToken]
  ) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    noKeyword: Token[NoKeyword],
    symbols: js.UndefOr[scala.Nothing],
    hereKeyword: Token[HereKeyword],
    closeBracketToken: Token[CloseBracketToken]
  ) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    noKeyword: Token[NoKeyword],
    symbols: js.Array[PrimarySymbol],
    hereKeyword: js.UndefOr[scala.Nothing],
    closeBracketToken: Token[CloseBracketToken]
  ) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    noKeyword: Token[NoKeyword],
    symbols: js.Array[PrimarySymbol],
    hereKeyword: Token[HereKeyword],
    closeBracketToken: Token[CloseBracketToken]
  ) = this()
  val hereKeyword: js.UndefOr[Token[HereKeyword]] = js.native
  val noKeyword: Token[NoKeyword] = js.native
  val symbols: js.UndefOr[js.Array[PrimarySymbol]] = js.native
  def update(): NoSymbolHereAssertion = js.native
  def update(symbols: js.Array[PrimarySymbol]): NoSymbolHereAssertion = js.native
}

