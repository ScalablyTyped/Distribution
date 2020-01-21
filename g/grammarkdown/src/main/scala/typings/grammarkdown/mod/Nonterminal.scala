package typings.grammarkdown.mod

import typings.grammarkdown.tokensMod.SyntaxKind.QuestionToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Nonterminal")
@js.native
class Nonterminal protected ()
  extends typings.grammarkdown.nodesMod.Nonterminal {
  def this(name: typings.grammarkdown.nodesMod.Identifier) = this()
  def this(
    name: typings.grammarkdown.nodesMod.Identifier,
    argumentList: typings.grammarkdown.nodesMod.ArgumentList
  ) = this()
  def this(
    name: typings.grammarkdown.nodesMod.Identifier,
    argumentList: js.UndefOr[scala.Nothing],
    questionToken: typings.grammarkdown.nodesMod.Token[QuestionToken]
  ) = this()
  def this(
    name: typings.grammarkdown.nodesMod.Identifier,
    argumentList: typings.grammarkdown.nodesMod.ArgumentList,
    questionToken: typings.grammarkdown.nodesMod.Token[QuestionToken]
  ) = this()
}

