package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken
import typings.grammarkdown.distTokensMod.SyntaxKind.EmptyKeyword
import typings.grammarkdown.distTokensMod.SyntaxKind.OpenBracketToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "EmptyAssertion")
@js.native
class EmptyAssertion protected ()
  extends typings.grammarkdown.distNodesMod.EmptyAssertion {
  def this(
    openBracketToken: typings.grammarkdown.distNodesMod.Token[OpenBracketToken],
    emptyKeyword: typings.grammarkdown.distNodesMod.Token[EmptyKeyword]
  ) = this()
  def this(
    openBracketToken: typings.grammarkdown.distNodesMod.Token[OpenBracketToken],
    emptyKeyword: typings.grammarkdown.distNodesMod.Token[EmptyKeyword],
    closeBracketToken: typings.grammarkdown.distNodesMod.Token[CloseBracketToken]
  ) = this()
}

