package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "ArgumentList")
@js.native
class ArgumentList protected ()
  extends Node[grammarkdownLib.distTokensMod.SyntaxKind.ArgumentList] {
  def this(openParenToken: Token[
      grammarkdownLib.distTokensMod.SyntaxKind.OpenParenToken | grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken
    ]) = this()
  def this(openParenToken: Token[
      grammarkdownLib.distTokensMod.SyntaxKind.OpenParenToken | grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken
    ], elements: js.Array[Argument]) = this()
  def this(openParenToken: Token[
      grammarkdownLib.distTokensMod.SyntaxKind.OpenParenToken | grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken
    ], elements: js.UndefOr[scala.Nothing], closeParenToken: Token[
      grammarkdownLib.distTokensMod.SyntaxKind.CloseParenToken | grammarkdownLib.distTokensMod.SyntaxKind.CloseBracketToken
    ]) = this()
  def this(openParenToken: Token[
      grammarkdownLib.distTokensMod.SyntaxKind.OpenParenToken | grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken
    ], elements: js.Array[Argument], closeParenToken: Token[
      grammarkdownLib.distTokensMod.SyntaxKind.CloseParenToken | grammarkdownLib.distTokensMod.SyntaxKind.CloseBracketToken
    ]) = this()
  val closeParenToken: js.UndefOr[
    Token[
      grammarkdownLib.distTokensMod.SyntaxKind.CloseParenToken | grammarkdownLib.distTokensMod.SyntaxKind.CloseBracketToken
    ]
  ] = js.native
  val elements: js.UndefOr[js.Array[Argument]] = js.native
  val openParenToken: Token[
    grammarkdownLib.distTokensMod.SyntaxKind.OpenParenToken | grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken
  ] = js.native
  def update(): ArgumentList = js.native
  def update(elements: js.Array[Argument]): ArgumentList = js.native
}

