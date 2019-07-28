package typings.grammarkdown.distNodesMod

import typings.grammarkdown.distTokensMod.ArgumentOperatorKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "Argument")
@js.native
class Argument ()
  extends Node[typings.grammarkdown.distTokensMod.SyntaxKind.Argument] {
  def this(operatorToken: Token[ArgumentOperatorKind]) = this()
  def this(operatorToken: js.UndefOr[scala.Nothing], name: Identifier) = this()
  def this(operatorToken: Token[ArgumentOperatorKind], name: Identifier) = this()
  val name: js.UndefOr[Identifier] = js.native
  val operatorToken: js.UndefOr[Token[ArgumentOperatorKind]] = js.native
  def update(): Argument = js.native
  def update(name: Identifier): Argument = js.native
}

