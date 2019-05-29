package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "Constraints")
@js.native
class Constraints protected ()
  extends Node[grammarkdownLib.distTokensMod.SyntaxKind] {
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind], elements: js.Array[Argument]) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind], elements: js.UndefOr[scala.Nothing], closeBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind], elements: js.Array[Argument], closeBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
  val closeBracketToken: js.UndefOr[Token[grammarkdownLib.distTokensMod.SyntaxKind]] = js.native
  val elements: js.UndefOr[js.Array[Argument]] = js.native
  val openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind] = js.native
  def update(): Constraints = js.native
  def update(elements: js.Array[Argument]): Constraints = js.native
}

