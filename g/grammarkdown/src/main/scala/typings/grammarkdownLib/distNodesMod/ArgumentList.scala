package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "ArgumentList")
@js.native
class ArgumentList protected ()
  extends Node[grammarkdownLib.distTokensMod.SyntaxKind] {
  def this(openParenToken: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
  def this(openParenToken: Token[grammarkdownLib.distTokensMod.SyntaxKind], elements: js.Array[Argument]) = this()
  def this(openParenToken: Token[grammarkdownLib.distTokensMod.SyntaxKind], elements: js.Array[Argument], closeParenToken: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
  def this(openParenToken: Token[grammarkdownLib.distTokensMod.SyntaxKind], elements: js.UndefOr[scala.Nothing], closeParenToken: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
  val closeParenToken: js.UndefOr[Token[grammarkdownLib.distTokensMod.SyntaxKind]] = js.native
  val elements: js.UndefOr[js.Array[Argument]] = js.native
  val openParenToken: Token[grammarkdownLib.distTokensMod.SyntaxKind] = js.native
  def update(): ArgumentList = js.native
  def update(elements: js.Array[Argument]): ArgumentList = js.native
}

