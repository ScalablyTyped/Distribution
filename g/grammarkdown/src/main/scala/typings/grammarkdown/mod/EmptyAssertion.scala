package typings.grammarkdown.mod

import typings.grammarkdown.tokensMod.SyntaxKind.CloseBracketToken
import typings.grammarkdown.tokensMod.SyntaxKind.EmptyKeyword
import typings.grammarkdown.tokensMod.SyntaxKind.OpenBracketToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "EmptyAssertion")
@js.native
class EmptyAssertion protected ()
  extends typings.grammarkdown.nodesMod.EmptyAssertion {
  def this(
    openBracketToken: typings.grammarkdown.nodesMod.Token[OpenBracketToken],
    emptyKeyword: typings.grammarkdown.nodesMod.Token[EmptyKeyword]
  ) = this()
  def this(
    openBracketToken: typings.grammarkdown.nodesMod.Token[OpenBracketToken],
    emptyKeyword: typings.grammarkdown.nodesMod.Token[EmptyKeyword],
    closeBracketToken: typings.grammarkdown.nodesMod.Token[CloseBracketToken]
  ) = this()
}

