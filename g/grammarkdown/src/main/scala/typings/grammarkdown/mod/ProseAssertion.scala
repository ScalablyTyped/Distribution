package typings.grammarkdown.mod

import typings.grammarkdown.distNodesMod.ProseFragment
import typings.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken
import typings.grammarkdown.distTokensMod.SyntaxKind.OpenBracketGreaterThanToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "ProseAssertion")
@js.native
open class ProseAssertion protected ()
  extends typings.grammarkdown.distNodesMod.ProseAssertion {
  def this(openBracketToken: typings.grammarkdown.distNodesMod.Token[OpenBracketGreaterThanToken]) = this()
  def this(
    openBracketToken: typings.grammarkdown.distNodesMod.Token[OpenBracketGreaterThanToken],
    fragments: js.Array[ProseFragment]
  ) = this()
  def this(
    openBracketToken: typings.grammarkdown.distNodesMod.Token[OpenBracketGreaterThanToken],
    fragments: js.Array[ProseFragment],
    closeBracketToken: typings.grammarkdown.distNodesMod.Token[CloseBracketToken]
  ) = this()
  def this(
    openBracketToken: typings.grammarkdown.distNodesMod.Token[OpenBracketGreaterThanToken],
    fragments: Unit,
    closeBracketToken: typings.grammarkdown.distNodesMod.Token[CloseBracketToken]
  ) = this()
}
