package typings.grammarkdown.mod

import typings.grammarkdown.nodesMod.ProseFragment
import typings.grammarkdown.tokensMod.SyntaxKind.CloseBracketToken
import typings.grammarkdown.tokensMod.SyntaxKind.OpenBracketGreaterThanToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "ProseAssertion")
@js.native
class ProseAssertion protected ()
  extends typings.grammarkdown.nodesMod.ProseAssertion {
  def this(openBracketToken: typings.grammarkdown.nodesMod.Token[OpenBracketGreaterThanToken]) = this()
  def this(
    openBracketToken: typings.grammarkdown.nodesMod.Token[OpenBracketGreaterThanToken],
    fragments: js.Array[ProseFragment]
  ) = this()
  def this(
    openBracketToken: typings.grammarkdown.nodesMod.Token[OpenBracketGreaterThanToken],
    fragments: js.UndefOr[scala.Nothing],
    closeBracketToken: typings.grammarkdown.nodesMod.Token[CloseBracketToken]
  ) = this()
  def this(
    openBracketToken: typings.grammarkdown.nodesMod.Token[OpenBracketGreaterThanToken],
    fragments: js.Array[ProseFragment],
    closeBracketToken: typings.grammarkdown.nodesMod.Token[CloseBracketToken]
  ) = this()
}
