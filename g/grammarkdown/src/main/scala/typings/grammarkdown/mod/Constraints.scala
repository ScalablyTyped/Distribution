package typings.grammarkdown.mod

import typings.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken
import typings.grammarkdown.distTokensMod.SyntaxKind.OpenBracketToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "Constraints")
@js.native
open class Constraints protected ()
  extends typings.grammarkdown.distNodesMod.Constraints {
  def this(openBracketToken: typings.grammarkdown.distNodesMod.Token[OpenBracketToken]) = this()
  def this(
    openBracketToken: typings.grammarkdown.distNodesMod.Token[OpenBracketToken],
    elements: js.Array[typings.grammarkdown.distNodesMod.Argument]
  ) = this()
  def this(
    openBracketToken: typings.grammarkdown.distNodesMod.Token[OpenBracketToken],
    elements: js.Array[typings.grammarkdown.distNodesMod.Argument],
    closeBracketToken: typings.grammarkdown.distNodesMod.Token[CloseBracketToken]
  ) = this()
  def this(
    openBracketToken: typings.grammarkdown.distNodesMod.Token[OpenBracketToken],
    elements: Unit,
    closeBracketToken: typings.grammarkdown.distNodesMod.Token[CloseBracketToken]
  ) = this()
}
