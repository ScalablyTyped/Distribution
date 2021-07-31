package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.grammarkdownMod.SyntaxKind.CloseBracketToken
import typings.grammarkdown.grammarkdownMod.SyntaxKind.CloseParenToken
import typings.grammarkdown.grammarkdownMod.SyntaxKind.OpenBracketToken
import typings.grammarkdown.grammarkdownMod.SyntaxKind.OpenParenToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "ArgumentList")
@js.native
class ArgumentList protected ()
  extends StObject
     with Node2[typings.grammarkdown.grammarkdownMod.SyntaxKind.ArgumentList] {
  def this(openParenToken: Token[OpenParenToken | OpenBracketToken]) = this()
  def this(openParenToken: Token[OpenParenToken | OpenBracketToken], elements: js.Array[Argument]) = this()
  def this(
    openParenToken: Token[OpenParenToken | OpenBracketToken],
    elements: js.Array[Argument],
    closeParenToken: Token[CloseParenToken | CloseBracketToken]
  ) = this()
  def this(
    openParenToken: Token[OpenParenToken | OpenBracketToken],
    elements: Unit,
    closeParenToken: Token[CloseParenToken | CloseBracketToken]
  ) = this()
  
  val closeParenToken: js.UndefOr[Token[CloseParenToken | CloseBracketToken]] = js.native
  
  val elements: js.UndefOr[js.Array[Argument]] = js.native
  
  /* CompleteClass */
  var end: Double = js.native
  
  val openParenToken: Token[OpenParenToken | OpenBracketToken] = js.native
  
  /* CompleteClass */
  var pos: Double = js.native
  
  def update(): ArgumentList = js.native
  def update(elements: js.Array[Argument]): ArgumentList = js.native
}
