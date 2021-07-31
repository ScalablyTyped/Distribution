package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.grammarkdownMod.SyntaxKind.CloseBracketToken
import typings.grammarkdown.grammarkdownMod.SyntaxKind.EmptyKeyword
import typings.grammarkdown.grammarkdownMod.SyntaxKind.OpenBracketToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "EmptyAssertion")
@js.native
class EmptyAssertion protected ()
  extends AssertionBase[typings.grammarkdown.grammarkdownMod.SyntaxKind.EmptyAssertion, OpenBracketToken] {
  def this(openBracketToken: Token[OpenBracketToken], emptyKeyword: Token[EmptyKeyword]) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    emptyKeyword: Token[EmptyKeyword],
    closeBracketToken: Token[CloseBracketToken]
  ) = this()
  
  val emptyKeyword: Token[EmptyKeyword] = js.native
}
