package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "ParameterList")
@js.native
class ParameterList protected ()
  extends Node[grammarkdownLib.distTokensMod.SyntaxKind] {
  def this(openParenToken: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
  def this(openParenToken: Token[grammarkdownLib.distTokensMod.SyntaxKind], elements: js.Array[Parameter]) = this()
  def this(openParenToken: Token[grammarkdownLib.distTokensMod.SyntaxKind], elements: js.UndefOr[scala.Nothing], closeParenToken: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
  def this(openParenToken: Token[grammarkdownLib.distTokensMod.SyntaxKind], elements: js.Array[Parameter], closeParenToken: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
  val closeParenToken: js.UndefOr[Token[grammarkdownLib.distTokensMod.SyntaxKind]] = js.native
  val elements: js.UndefOr[js.Array[Parameter]] = js.native
  val openParenToken: Token[grammarkdownLib.distTokensMod.SyntaxKind] = js.native
  def update(): ParameterList = js.native
  def update(elements: js.Array[Parameter]): ParameterList = js.native
}

