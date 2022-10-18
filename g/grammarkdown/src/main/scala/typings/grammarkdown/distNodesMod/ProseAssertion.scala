package typings.grammarkdown.distNodesMod

import typings.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken
import typings.grammarkdown.distTokensMod.SyntaxKind.OpenBracketGreaterThanToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "ProseAssertion")
@js.native
open class ProseAssertion protected ()
  extends AssertionBase[
      typings.grammarkdown.distTokensMod.SyntaxKind.ProseAssertion, 
      OpenBracketGreaterThanToken
    ]
     with Assertion {
  def this(openBracketToken: Token[OpenBracketGreaterThanToken]) = this()
  def this(openBracketToken: Token[OpenBracketGreaterThanToken], fragments: js.Array[ProseFragment]) = this()
  def this(
    openBracketToken: Token[OpenBracketGreaterThanToken],
    fragments: js.Array[ProseFragment],
    closeBracketToken: Token[CloseBracketToken]
  ) = this()
  def this(
    openBracketToken: Token[OpenBracketGreaterThanToken],
    fragments: Unit,
    closeBracketToken: Token[CloseBracketToken]
  ) = this()
  
  val fragments: js.UndefOr[js.Array[ProseFragment]] = js.native
  
  def update(): ProseAssertion = js.native
  def update(fragments: js.Array[ProseFragment]): ProseAssertion = js.native
}
