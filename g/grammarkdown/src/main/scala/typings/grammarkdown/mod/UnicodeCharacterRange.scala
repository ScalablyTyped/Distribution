package typings.grammarkdown.mod

import typings.grammarkdown.tokensMod.SyntaxKind.ThroughKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "UnicodeCharacterRange")
@js.native
class UnicodeCharacterRange protected ()
  extends typings.grammarkdown.nodesMod.UnicodeCharacterRange {
  def this(
    left: typings.grammarkdown.nodesMod.UnicodeCharacterLiteral,
    throughKeyword: typings.grammarkdown.nodesMod.Token[ThroughKeyword],
    right: typings.grammarkdown.nodesMod.UnicodeCharacterLiteral
  ) = this()
}

