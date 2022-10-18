package typings.grammarkdown.distNodesMod

import typings.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken
import typings.grammarkdown.distTokensMod.SyntaxKind.HereKeyword
import typings.grammarkdown.distTokensMod.SyntaxKind.NoKeyword
import typings.grammarkdown.distTokensMod.SyntaxKind.OpenBracketToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "NoSymbolHereAssertion")
@js.native
open class NoSymbolHereAssertion protected ()
  extends AssertionBase[
      typings.grammarkdown.distTokensMod.SyntaxKind.NoSymbolHereAssertion, 
      OpenBracketToken
    ]
     with Assertion {
  def this(openBracketToken: Token[OpenBracketToken], noKeyword: Token[NoKeyword]) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    noKeyword: Token[NoKeyword],
    symbols: js.Array[PrimarySymbol]
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
    symbols: Unit,
    hereKeyword: Token[HereKeyword]
  ) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    noKeyword: Token[NoKeyword],
    symbols: js.Array[PrimarySymbol],
    hereKeyword: Unit,
    closeBracketToken: Token[CloseBracketToken]
  ) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    noKeyword: Token[NoKeyword],
    symbols: js.Array[PrimarySymbol],
    hereKeyword: Token[HereKeyword],
    closeBracketToken: Token[CloseBracketToken]
  ) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    noKeyword: Token[NoKeyword],
    symbols: Unit,
    hereKeyword: Unit,
    closeBracketToken: Token[CloseBracketToken]
  ) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    noKeyword: Token[NoKeyword],
    symbols: Unit,
    hereKeyword: Token[HereKeyword],
    closeBracketToken: Token[CloseBracketToken]
  ) = this()
  
  val hereKeyword: js.UndefOr[Token[HereKeyword]] = js.native
  
  val noKeyword: Token[NoKeyword] = js.native
  
  val symbols: js.UndefOr[js.Array[PrimarySymbol]] = js.native
  
  def update(): NoSymbolHereAssertion = js.native
  def update(symbols: js.Array[PrimarySymbol]): NoSymbolHereAssertion = js.native
}
