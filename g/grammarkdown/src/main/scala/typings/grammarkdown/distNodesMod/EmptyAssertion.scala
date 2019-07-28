package typings.grammarkdown.distNodesMod

import typings.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken
import typings.grammarkdown.distTokensMod.SyntaxKind.EmptyKeyword
import typings.grammarkdown.distTokensMod.SyntaxKind.OpenBracketToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "EmptyAssertion")
@js.native
class EmptyAssertion protected ()
  extends AssertionBase[typings.grammarkdown.distTokensMod.SyntaxKind.EmptyAssertion, OpenBracketToken] {
  def this(openBracketToken: Token[OpenBracketToken], emptyKeyword: Token[EmptyKeyword]) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    emptyKeyword: Token[EmptyKeyword],
    closeBracketToken: Token[CloseBracketToken]
  ) = this()
  val emptyKeyword: Token[EmptyKeyword] = js.native
}

