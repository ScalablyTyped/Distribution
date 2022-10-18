package typings.grammarkdown.mod

import typings.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken
import typings.grammarkdown.distTokensMod.SyntaxKind.OpenBracketToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "ParameterList")
@js.native
open class ParameterList protected ()
  extends typings.grammarkdown.distNodesMod.ParameterList {
  def this(openParenToken: typings.grammarkdown.distNodesMod.Token[OpenBracketToken]) = this()
  def this(
    openParenToken: typings.grammarkdown.distNodesMod.Token[OpenBracketToken],
    elements: js.Array[typings.grammarkdown.distNodesMod.Parameter]
  ) = this()
  def this(
    openParenToken: typings.grammarkdown.distNodesMod.Token[OpenBracketToken],
    elements: js.Array[typings.grammarkdown.distNodesMod.Parameter],
    closeParenToken: typings.grammarkdown.distNodesMod.Token[CloseBracketToken]
  ) = this()
  def this(
    openParenToken: typings.grammarkdown.distNodesMod.Token[OpenBracketToken],
    elements: Unit,
    closeParenToken: typings.grammarkdown.distNodesMod.Token[CloseBracketToken]
  ) = this()
}
