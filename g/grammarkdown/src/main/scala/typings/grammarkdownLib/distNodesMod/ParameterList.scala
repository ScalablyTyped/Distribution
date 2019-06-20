package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "ParameterList")
@js.native
class ParameterList protected ()
  extends Node[grammarkdownLib.distTokensMod.SyntaxKind.ParameterList] {
  def this(openParenToken: Token[
      grammarkdownLib.distTokensMod.SyntaxKind.OpenParenToken | grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken
    ]) = this()
  def this(openParenToken: Token[
      grammarkdownLib.distTokensMod.SyntaxKind.OpenParenToken | grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken
    ], elements: js.Array[Parameter]) = this()
  def this(openParenToken: Token[
      grammarkdownLib.distTokensMod.SyntaxKind.OpenParenToken | grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken
    ], elements: js.UndefOr[scala.Nothing], closeParenToken: Token[
      grammarkdownLib.distTokensMod.SyntaxKind.CloseParenToken | grammarkdownLib.distTokensMod.SyntaxKind.CloseBracketToken
    ]) = this()
  def this(openParenToken: Token[
      grammarkdownLib.distTokensMod.SyntaxKind.OpenParenToken | grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken
    ], elements: js.Array[Parameter], closeParenToken: Token[
      grammarkdownLib.distTokensMod.SyntaxKind.CloseParenToken | grammarkdownLib.distTokensMod.SyntaxKind.CloseBracketToken
    ]) = this()
  val closeParenToken: js.UndefOr[
    Token[
      grammarkdownLib.distTokensMod.SyntaxKind.CloseParenToken | grammarkdownLib.distTokensMod.SyntaxKind.CloseBracketToken
    ]
  ] = js.native
  val elements: js.UndefOr[js.Array[Parameter]] = js.native
  val openParenToken: Token[
    grammarkdownLib.distTokensMod.SyntaxKind.OpenParenToken | grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken
  ] = js.native
  def update(): ParameterList = js.native
  def update(elements: js.Array[Parameter]): ParameterList = js.native
}

