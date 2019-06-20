package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "UnicodeCharacterRange")
@js.native
class UnicodeCharacterRange protected ()
  extends LexicalSymbolBase[grammarkdownLib.distTokensMod.SyntaxKind.UnicodeCharacterRange] {
  def this(left: UnicodeCharacterLiteral, throughKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.ThroughKeyword], right: UnicodeCharacterLiteral) = this()
  val left: UnicodeCharacterLiteral = js.native
  val right: UnicodeCharacterLiteral = js.native
  val throughKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.ThroughKeyword] = js.native
  def update(left: UnicodeCharacterLiteral, right: UnicodeCharacterLiteral): UnicodeCharacterRange = js.native
}

