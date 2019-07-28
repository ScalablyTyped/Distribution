package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken
import typings.grammarkdown.distTokensMod.SyntaxKind.OpenBracketToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Constraints")
@js.native
class Constraints protected ()
  extends typings.grammarkdown.distNodesMod.Constraints {
  def this(openBracketToken: typings.grammarkdown.distNodesMod.Token[OpenBracketToken]) = this()
  def this(
    openBracketToken: typings.grammarkdown.distNodesMod.Token[OpenBracketToken],
    elements: js.Array[typings.grammarkdown.distNodesMod.Argument]
  ) = this()
  def this(
    openBracketToken: typings.grammarkdown.distNodesMod.Token[OpenBracketToken],
    elements: js.UndefOr[scala.Nothing],
    closeBracketToken: typings.grammarkdown.distNodesMod.Token[CloseBracketToken]
  ) = this()
  def this(
    openBracketToken: typings.grammarkdown.distNodesMod.Token[OpenBracketToken],
    elements: js.Array[typings.grammarkdown.distNodesMod.Argument],
    closeBracketToken: typings.grammarkdown.distNodesMod.Token[CloseBracketToken]
  ) = this()
}

