package typings.grammarkdown.distNodesMod

import typings.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken
import typings.grammarkdown.distTokensMod.SyntaxKind.OpenBracketToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "InvalidAssertion")
@js.native
class InvalidAssertion protected ()
  extends AssertionBase[typings.grammarkdown.distTokensMod.SyntaxKind.InvalidAssertion, OpenBracketToken] {
  def this(openBracketToken: Token[OpenBracketToken]) = this()
  def this(openBracketToken: Token[OpenBracketToken], closeBracketToken: Token[CloseBracketToken]) = this()
}

