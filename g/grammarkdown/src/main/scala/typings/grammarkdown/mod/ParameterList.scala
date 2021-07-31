package typings.grammarkdown.mod

import typings.grammarkdown.tokensMod.SyntaxKind.CloseBracketToken
import typings.grammarkdown.tokensMod.SyntaxKind.CloseParenToken
import typings.grammarkdown.tokensMod.SyntaxKind.OpenBracketToken
import typings.grammarkdown.tokensMod.SyntaxKind.OpenParenToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "ParameterList")
@js.native
class ParameterList protected ()
  extends typings.grammarkdown.nodesMod.ParameterList {
  def this(openParenToken: typings.grammarkdown.nodesMod.Token[OpenParenToken | OpenBracketToken]) = this()
  def this(
    openParenToken: typings.grammarkdown.nodesMod.Token[OpenParenToken | OpenBracketToken],
    elements: js.Array[typings.grammarkdown.nodesMod.Parameter]
  ) = this()
  def this(
    openParenToken: typings.grammarkdown.nodesMod.Token[OpenParenToken | OpenBracketToken],
    elements: js.Array[typings.grammarkdown.nodesMod.Parameter],
    closeParenToken: typings.grammarkdown.nodesMod.Token[CloseParenToken | CloseBracketToken]
  ) = this()
  def this(
    openParenToken: typings.grammarkdown.nodesMod.Token[OpenParenToken | OpenBracketToken],
    elements: Unit,
    closeParenToken: typings.grammarkdown.nodesMod.Token[CloseParenToken | CloseBracketToken]
  ) = this()
}
