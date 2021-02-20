package typings.grammarkdown.mod

import typings.grammarkdown.tokensMod.SyntaxKind.CloseBracketToken
import typings.grammarkdown.tokensMod.SyntaxKind.CloseParenToken
import typings.grammarkdown.tokensMod.SyntaxKind.OpenBracketToken
import typings.grammarkdown.tokensMod.SyntaxKind.OpenParenToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "ArgumentList")
@js.native
class ArgumentList protected ()
  extends typings.grammarkdown.nodesMod.ArgumentList {
  def this(openParenToken: typings.grammarkdown.nodesMod.Token[OpenParenToken | OpenBracketToken]) = this()
  def this(
    openParenToken: typings.grammarkdown.nodesMod.Token[OpenParenToken | OpenBracketToken],
    elements: js.Array[typings.grammarkdown.nodesMod.Argument]
  ) = this()
  def this(
    openParenToken: typings.grammarkdown.nodesMod.Token[OpenParenToken | OpenBracketToken],
    elements: js.UndefOr[scala.Nothing],
    closeParenToken: typings.grammarkdown.nodesMod.Token[CloseParenToken | CloseBracketToken]
  ) = this()
  def this(
    openParenToken: typings.grammarkdown.nodesMod.Token[OpenParenToken | OpenBracketToken],
    elements: js.Array[typings.grammarkdown.nodesMod.Argument],
    closeParenToken: typings.grammarkdown.nodesMod.Token[CloseParenToken | CloseBracketToken]
  ) = this()
}
