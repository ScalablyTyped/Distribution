package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.distNodesMod.ProseFragment
import typings.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken
import typings.grammarkdown.distTokensMod.SyntaxKind.OpenBracketGreaterThanToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "ProseAssertion")
@js.native
class ProseAssertion protected ()
  extends typings.grammarkdown.distNodesMod.ProseAssertion {
  def this(openBracketToken: typings.grammarkdown.distNodesMod.Token[OpenBracketGreaterThanToken]) = this()
  def this(
    openBracketToken: typings.grammarkdown.distNodesMod.Token[OpenBracketGreaterThanToken],
    fragments: js.Array[ProseFragment]
  ) = this()
  def this(
    openBracketToken: typings.grammarkdown.distNodesMod.Token[OpenBracketGreaterThanToken],
    fragments: js.UndefOr[scala.Nothing],
    closeBracketToken: typings.grammarkdown.distNodesMod.Token[CloseBracketToken]
  ) = this()
  def this(
    openBracketToken: typings.grammarkdown.distNodesMod.Token[OpenBracketGreaterThanToken],
    fragments: js.Array[ProseFragment],
    closeBracketToken: typings.grammarkdown.distNodesMod.Token[CloseBracketToken]
  ) = this()
}

