package typings.grammarkdown.nodesMod

import typings.grammarkdown.tokensMod.SyntaxKind.CloseBraceToken
import typings.grammarkdown.tokensMod.SyntaxKind.OpenBraceToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "SymbolSet")
@js.native
class SymbolSet protected ()
  extends Node[typings.grammarkdown.tokensMod.SyntaxKind.SymbolSet] {
  def this(openBraceToken: Token[OpenBraceToken]) = this()
  def this(openBraceToken: Token[OpenBraceToken], elements: js.Array[SymbolSpan]) = this()
  def this(
    openBraceToken: Token[OpenBraceToken],
    elements: js.UndefOr[scala.Nothing],
    closeBraceToken: Token[CloseBraceToken]
  ) = this()
  def this(
    openBraceToken: Token[OpenBraceToken],
    elements: js.Array[SymbolSpan],
    closeBraceToken: Token[CloseBraceToken]
  ) = this()
  
  val closeBraceToken: js.UndefOr[Token[CloseBraceToken]] = js.native
  
  val elements: js.UndefOr[js.Array[SymbolSpan]] = js.native
  
  val openBraceToken: Token[OpenBraceToken] = js.native
  
  def update(): SymbolSet = js.native
  def update(elements: js.Array[SymbolSpan]): SymbolSet = js.native
}
