package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "PlaceholderSymbol")
@js.native
class PlaceholderSymbol protected ()
  extends LexicalSymbolBase[grammarkdownLib.distTokensMod.SyntaxKind] {
  def this(placeholderToken: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
  val placeholderToken: Token[grammarkdownLib.distTokensMod.SyntaxKind] = js.native
}

