package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.grammarkdownMod.SyntaxKind.CloseBraceToken
import typings.grammarkdown.grammarkdownMod.SyntaxKind.OpenBraceToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "SymbolSet")
@js.native
class SymbolSet protected ()
  extends StObject
     with Node2[typings.grammarkdown.grammarkdownMod.SyntaxKind.SymbolSet] {
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
  
  /* CompleteClass */
  var end: Double = js.native
  
  val openBraceToken: Token[OpenBraceToken] = js.native
  
  /* CompleteClass */
  var pos: Double = js.native
  
  def update(): SymbolSet = js.native
  def update(elements: js.Array[SymbolSpan]): SymbolSet = js.native
}
