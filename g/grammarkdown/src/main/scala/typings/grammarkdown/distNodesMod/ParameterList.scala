package typings.grammarkdown.distNodesMod

import typings.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken
import typings.grammarkdown.distTokensMod.SyntaxKind.CloseParenToken
import typings.grammarkdown.distTokensMod.SyntaxKind.OpenBracketToken
import typings.grammarkdown.distTokensMod.SyntaxKind.OpenParenToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "ParameterList")
@js.native
class ParameterList protected ()
  extends Node[typings.grammarkdown.distTokensMod.SyntaxKind.ParameterList] {
  def this(openParenToken: Token[OpenParenToken | OpenBracketToken]) = this()
  def this(openParenToken: Token[OpenParenToken | OpenBracketToken], elements: js.Array[Parameter]) = this()
  def this(
    openParenToken: Token[OpenParenToken | OpenBracketToken],
    elements: js.UndefOr[scala.Nothing],
    closeParenToken: Token[CloseParenToken | CloseBracketToken]
  ) = this()
  def this(
    openParenToken: Token[OpenParenToken | OpenBracketToken],
    elements: js.Array[Parameter],
    closeParenToken: Token[CloseParenToken | CloseBracketToken]
  ) = this()
  val closeParenToken: js.UndefOr[Token[CloseParenToken | CloseBracketToken]] = js.native
  val elements: js.UndefOr[js.Array[Parameter]] = js.native
  val openParenToken: Token[OpenParenToken | OpenBracketToken] = js.native
  def update(): ParameterList = js.native
  def update(elements: js.Array[Parameter]): ParameterList = js.native
}

