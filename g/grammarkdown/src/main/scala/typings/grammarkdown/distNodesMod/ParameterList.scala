package typings.grammarkdown.distNodesMod

import typings.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken
import typings.grammarkdown.distTokensMod.SyntaxKind.OpenBracketToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "ParameterList")
@js.native
open class ParameterList protected ()
  extends Node[typings.grammarkdown.distTokensMod.SyntaxKind.ParameterList] {
  def this(openParenToken: Token[OpenBracketToken]) = this()
  def this(openParenToken: Token[OpenBracketToken], elements: js.Array[Parameter]) = this()
  def this(
    openParenToken: Token[OpenBracketToken],
    elements: js.Array[Parameter],
    closeParenToken: Token[CloseBracketToken]
  ) = this()
  def this(openParenToken: Token[OpenBracketToken], elements: Unit, closeParenToken: Token[CloseBracketToken]) = this()
  
  val closeBracketToken: js.UndefOr[Token[CloseBracketToken]] = js.native
  
  val elements: js.UndefOr[js.Array[Parameter]] = js.native
  
  val openBracketToken: Token[OpenBracketToken] = js.native
  
  def update(): ParameterList = js.native
  def update(elements: js.Array[Parameter]): ParameterList = js.native
}
