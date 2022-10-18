package typings.grammarkdown.distNodesMod

import typings.grammarkdown.distTokensMod.SyntaxKind.CloseBraceToken
import typings.grammarkdown.distTokensMod.SyntaxKind.OpenBraceToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "SymbolSet")
@js.native
open class SymbolSet protected ()
  extends Node[typings.grammarkdown.distTokensMod.SyntaxKind.SymbolSet] {
  def this(openBraceToken: Token[OpenBraceToken]) = this()
  def this(openBraceToken: Token[OpenBraceToken], elements: js.Array[SymbolSpan]) = this()
  def this(
    openBraceToken: Token[OpenBraceToken],
    elements: js.Array[SymbolSpan],
    closeBraceToken: Token[CloseBraceToken]
  ) = this()
  def this(openBraceToken: Token[OpenBraceToken], elements: Unit, closeBraceToken: Token[CloseBraceToken]) = this()
  
  val closeBraceToken: js.UndefOr[Token[CloseBraceToken]] = js.native
  
  val elements: js.UndefOr[js.Array[SymbolSpan]] = js.native
  
  val openBraceToken: Token[OpenBraceToken] = js.native
  
  def update(): SymbolSet = js.native
  def update(elements: js.Array[SymbolSpan]): SymbolSet = js.native
}
