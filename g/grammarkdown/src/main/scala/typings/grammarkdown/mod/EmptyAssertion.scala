package typings.grammarkdown.mod

import typings.grammarkdown.tokensMod.SyntaxKind.CloseBracketToken
import typings.grammarkdown.tokensMod.SyntaxKind.EmptyKeyword
import typings.grammarkdown.tokensMod.SyntaxKind.OpenBracketToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
