package typings.grammarkdown.mod

import typings.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken
import typings.grammarkdown.distTokensMod.SyntaxKind.OpenBracketToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "InvalidAssertion")
@js.native
open class InvalidAssertion protected ()
  extends typings.grammarkdown.distNodesMod.InvalidAssertion {
  def this(openBracketToken: typings.grammarkdown.distNodesMod.Token[OpenBracketToken]) = this()
  def this(
    openBracketToken: typings.grammarkdown.distNodesMod.Token[OpenBracketToken],
    closeBracketToken: typings.grammarkdown.distNodesMod.Token[CloseBracketToken]
  ) = this()
}
