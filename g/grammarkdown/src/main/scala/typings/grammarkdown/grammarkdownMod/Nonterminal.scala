package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.distTokensMod.SyntaxKind.QuestionToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Nonterminal")
@js.native
class Nonterminal protected ()
  extends typings.grammarkdown.distNodesMod.Nonterminal {
  def this(name: typings.grammarkdown.distNodesMod.Identifier) = this()
  def this(
    name: typings.grammarkdown.distNodesMod.Identifier,
    argumentList: typings.grammarkdown.distNodesMod.ArgumentList
  ) = this()
  def this(
    name: typings.grammarkdown.distNodesMod.Identifier,
    argumentList: js.UndefOr[scala.Nothing],
    questionToken: typings.grammarkdown.distNodesMod.Token[QuestionToken]
  ) = this()
  def this(
    name: typings.grammarkdown.distNodesMod.Identifier,
    argumentList: typings.grammarkdown.distNodesMod.ArgumentList,
    questionToken: typings.grammarkdown.distNodesMod.Token[QuestionToken]
  ) = this()
}

