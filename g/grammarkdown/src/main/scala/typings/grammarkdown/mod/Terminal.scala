package typings.grammarkdown.mod

import typings.grammarkdown.tokensMod.SyntaxKind.QuestionToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Terminal")
@js.native
class Terminal ()
  extends typings.grammarkdown.nodesMod.Terminal {
  def this(text: String) = this()
  def this(text: String, questionToken: typings.grammarkdown.nodesMod.Token[QuestionToken]) = this()
}

