package typings.grammarkdown.distNodesMod

import typings.grammarkdown.distTokensMod.SyntaxKind.ThroughKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "UnicodeCharacterRange")
@js.native
class UnicodeCharacterRange protected ()
  extends LexicalSymbolBase[typings.grammarkdown.distTokensMod.SyntaxKind.UnicodeCharacterRange] {
  def this(
    left: UnicodeCharacterLiteral,
    throughKeyword: Token[ThroughKeyword],
    right: UnicodeCharacterLiteral
  ) = this()
  val left: UnicodeCharacterLiteral = js.native
  val right: UnicodeCharacterLiteral = js.native
  val throughKeyword: Token[ThroughKeyword] = js.native
  def update(left: UnicodeCharacterLiteral, right: UnicodeCharacterLiteral): UnicodeCharacterRange = js.native
}

