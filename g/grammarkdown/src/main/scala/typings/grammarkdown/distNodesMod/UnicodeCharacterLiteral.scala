package typings.grammarkdown.distNodesMod

import typings.grammarkdown.distTokensMod.SyntaxKind.QuestionToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "UnicodeCharacterLiteral")
@js.native
class UnicodeCharacterLiteral ()
  extends OptionalSymbolBase[typings.grammarkdown.distTokensMod.SyntaxKind.UnicodeCharacterLiteral]
     with TextContent {
  def this(text: String) = this()
  def this(text: js.UndefOr[scala.Nothing], questionToken: Token[QuestionToken]) = this()
  def this(text: String, questionToken: Token[QuestionToken]) = this()
}

