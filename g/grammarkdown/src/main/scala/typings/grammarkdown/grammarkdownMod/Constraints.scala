package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.grammarkdownMod.SyntaxKind.CloseBracketToken
import typings.grammarkdown.grammarkdownMod.SyntaxKind.OpenBracketToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "Constraints")
@js.native
class Constraints protected ()
  extends Node2[typings.grammarkdown.grammarkdownMod.SyntaxKind.Constraints] {
  def this(openBracketToken: Token[OpenBracketToken]) = this()
  def this(openBracketToken: Token[OpenBracketToken], elements: js.Array[Argument]) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    elements: js.UndefOr[scala.Nothing],
    closeBracketToken: Token[CloseBracketToken]
  ) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    elements: js.Array[Argument],
    closeBracketToken: Token[CloseBracketToken]
  ) = this()
  
  val closeBracketToken: js.UndefOr[Token[CloseBracketToken]] = js.native
  
  val elements: js.UndefOr[js.Array[Argument]] = js.native
  
  val openBracketToken: Token[OpenBracketToken] = js.native
  
  def update(): Constraints = js.native
  def update(elements: js.Array[Argument]): Constraints = js.native
}
