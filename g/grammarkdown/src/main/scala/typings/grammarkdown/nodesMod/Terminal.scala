package typings.grammarkdown.nodesMod

import typings.grammarkdown.tokensMod.SyntaxKind.QuestionToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "Terminal")
@js.native
class Terminal ()
  extends OptionalSymbolBase[typings.grammarkdown.tokensMod.SyntaxKind.Terminal]
     with TextContent {
  def this(text: String) = this()
  def this(text: String, questionToken: Token[QuestionToken]) = this()
}

