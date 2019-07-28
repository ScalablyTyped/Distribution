package typings.grammarkdown.distNodesMod

import typings.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken
import typings.grammarkdown.distTokensMod.SyntaxKind.OpenBracketToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "Constraints")
@js.native
class Constraints protected ()
  extends Node[typings.grammarkdown.distTokensMod.SyntaxKind.Constraints] {
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

