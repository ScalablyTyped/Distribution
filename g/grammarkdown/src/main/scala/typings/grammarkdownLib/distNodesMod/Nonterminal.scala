package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "Nonterminal")
@js.native
class Nonterminal protected ()
  extends OptionalSymbolBase[grammarkdownLib.distTokensMod.SyntaxKind] {
  def this(name: Identifier) = this()
  def this(name: Identifier, argumentList: ArgumentList) = this()
  def this(name: Identifier, argumentList: ArgumentList, questionToken: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
  def this(name: Identifier, argumentList: js.UndefOr[scala.Nothing], questionToken: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
  val argumentList: js.UndefOr[ArgumentList] = js.native
  val name: Identifier = js.native
  def update(name: Identifier): Nonterminal = js.native
  def update(name: Identifier, argumentList: ArgumentList): Nonterminal = js.native
}

