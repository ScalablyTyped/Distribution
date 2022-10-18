package typings.grammarkdown.distNodesMod

import typings.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken
import typings.grammarkdown.distTokensMod.SyntaxKind.OpenBracketToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "ArgumentList")
@js.native
open class ArgumentList protected ()
  extends Node[typings.grammarkdown.distTokensMod.SyntaxKind.ArgumentList] {
  def this(openParenToken: Token[OpenBracketToken]) = this()
  def this(openParenToken: Token[OpenBracketToken], elements: js.Array[Argument]) = this()
  def this(
    openParenToken: Token[OpenBracketToken],
    elements: js.Array[Argument],
    closeParenToken: Token[CloseBracketToken]
  ) = this()
  def this(openParenToken: Token[OpenBracketToken], elements: Unit, closeParenToken: Token[CloseBracketToken]) = this()
  
  val closeBracketToken: js.UndefOr[Token[CloseBracketToken]] = js.native
  
  val elements: js.UndefOr[js.Array[Argument]] = js.native
  
  val openBracketToken: Token[OpenBracketToken] = js.native
  
  def update(): ArgumentList = js.native
  def update(elements: js.Array[Argument]): ArgumentList = js.native
}
