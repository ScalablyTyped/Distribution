package typings.grammarkdown.distNodesMod

import typings.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken
import typings.grammarkdown.distTokensMod.SyntaxKind.CloseParenToken
import typings.grammarkdown.distTokensMod.SyntaxKind.OpenBracketToken
import typings.grammarkdown.distTokensMod.SyntaxKind.OpenParenToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "ArgumentList")
@js.native
class ArgumentList protected ()
  extends Node[typings.grammarkdown.distTokensMod.SyntaxKind.ArgumentList] {
  def this(openParenToken: Token[OpenParenToken | OpenBracketToken]) = this()
  def this(openParenToken: Token[OpenParenToken | OpenBracketToken], elements: js.Array[Argument]) = this()
  def this(
    openParenToken: Token[OpenParenToken | OpenBracketToken],
    elements: js.UndefOr[scala.Nothing],
    closeParenToken: Token[CloseParenToken | CloseBracketToken]
  ) = this()
  def this(
    openParenToken: Token[OpenParenToken | OpenBracketToken],
    elements: js.Array[Argument],
    closeParenToken: Token[CloseParenToken | CloseBracketToken]
  ) = this()
  val closeParenToken: js.UndefOr[Token[CloseParenToken | CloseBracketToken]] = js.native
  val elements: js.UndefOr[js.Array[Argument]] = js.native
  val openParenToken: Token[OpenParenToken | OpenBracketToken] = js.native
  def update(): ArgumentList = js.native
  def update(elements: js.Array[Argument]): ArgumentList = js.native
}

