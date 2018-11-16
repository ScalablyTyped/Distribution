package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "Prose")
@js.native
class Prose protected ()
  extends LexicalSymbolBase[grammarkdownLib.distTokensMod.SyntaxKind] {
  def this(greaterThanToken: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
  def this(greaterThanToken: Token[grammarkdownLib.distTokensMod.SyntaxKind], fragments: js.Array[ProseFragment]) = this()
  val fragments: js.UndefOr[js.Array[ProseFragment]] = js.native
  val greaterThanToken: Token[grammarkdownLib.distTokensMod.SyntaxKind] = js.native
  def update(): Prose = js.native
  def update(fragments: js.Array[ProseFragment]): Prose = js.native
}

