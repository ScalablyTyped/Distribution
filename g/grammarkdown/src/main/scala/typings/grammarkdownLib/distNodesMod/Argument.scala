package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "Argument")
@js.native
class Argument ()
  extends Node[grammarkdownLib.distTokensMod.SyntaxKind] {
  def this(operatorToken: Token[grammarkdownLib.distTokensMod.ArgumentOperatorKind]) = this()
  def this(operatorToken: Token[grammarkdownLib.distTokensMod.ArgumentOperatorKind], name: Identifier) = this()
  def this(operatorToken: js.UndefOr[scala.Nothing], name: Identifier) = this()
  val name: js.UndefOr[Identifier] = js.native
  val operatorToken: js.UndefOr[Token[grammarkdownLib.distTokensMod.ArgumentOperatorKind]] = js.native
  def update(): Argument = js.native
  def update(name: Identifier): Argument = js.native
}

