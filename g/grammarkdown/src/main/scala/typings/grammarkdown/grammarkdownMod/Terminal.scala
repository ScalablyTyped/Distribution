package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.distTokensMod.SyntaxKind.QuestionToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Terminal")
@js.native
class Terminal ()
  extends typings.grammarkdown.distNodesMod.Terminal {
  def this(text: String) = this()
  def this(
    text: js.UndefOr[scala.Nothing],
    questionToken: typings.grammarkdown.distNodesMod.Token[QuestionToken]
  ) = this()
  def this(text: String, questionToken: typings.grammarkdown.distNodesMod.Token[QuestionToken]) = this()
}

