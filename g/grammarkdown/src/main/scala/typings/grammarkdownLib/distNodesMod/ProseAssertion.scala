package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "ProseAssertion")
@js.native
class ProseAssertion protected ()
  extends AssertionBase[grammarkdownLib.distTokensMod.SyntaxKind, grammarkdownLib.distTokensMod.SyntaxKind] {
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind], fragments: js.Array[ProseFragment]) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind], fragments: js.Array[ProseFragment], closeBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind], fragments: js.UndefOr[scala.Nothing], closeBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
  val fragments: js.UndefOr[js.Array[ProseFragment]] = js.native
  def update(): ProseAssertion = js.native
  def update(fragments: js.Array[ProseFragment]): ProseAssertion = js.native
}

