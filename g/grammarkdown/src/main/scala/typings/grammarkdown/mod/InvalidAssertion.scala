package typings.grammarkdown.mod

import typings.grammarkdown.tokensMod.SyntaxKind.CloseBracketToken
import typings.grammarkdown.tokensMod.SyntaxKind.OpenBracketToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "InvalidAssertion")
@js.native
class InvalidAssertion protected ()
  extends typings.grammarkdown.nodesMod.InvalidAssertion {
  def this(openBracketToken: typings.grammarkdown.nodesMod.Token[OpenBracketToken]) = this()
  def this(
    openBracketToken: typings.grammarkdown.nodesMod.Token[OpenBracketToken],
    closeBracketToken: typings.grammarkdown.nodesMod.Token[CloseBracketToken]
  ) = this()
}

