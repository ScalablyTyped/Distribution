package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "ProseAssertion")
@js.native
class ProseAssertion protected ()
  extends AssertionBase[
      grammarkdownLib.distTokensMod.SyntaxKind.ProseAssertion, 
      grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketGreaterThanToken
    ] {
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketGreaterThanToken]) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketGreaterThanToken], fragments: js.Array[ProseFragment]) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketGreaterThanToken], fragments: js.UndefOr[scala.Nothing], closeBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.CloseBracketToken]) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketGreaterThanToken], fragments: js.Array[ProseFragment], closeBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.CloseBracketToken]) = this()
  val fragments: js.UndefOr[js.Array[ProseFragment]] = js.native
  def update(): ProseAssertion = js.native
  def update(fragments: js.Array[ProseFragment]): ProseAssertion = js.native
}

