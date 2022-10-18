package typings.grammarkdown.mod

import typings.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken
import typings.grammarkdown.distTokensMod.SyntaxKind.OpenBracketToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "ArgumentList")
@js.native
open class ArgumentList protected ()
  extends typings.grammarkdown.distNodesMod.ArgumentList {
  def this(openParenToken: typings.grammarkdown.distNodesMod.Token[OpenBracketToken]) = this()
  def this(
    openParenToken: typings.grammarkdown.distNodesMod.Token[OpenBracketToken],
    elements: js.Array[typings.grammarkdown.distNodesMod.Argument]
  ) = this()
  def this(
    openParenToken: typings.grammarkdown.distNodesMod.Token[OpenBracketToken],
    elements: js.Array[typings.grammarkdown.distNodesMod.Argument],
    closeParenToken: typings.grammarkdown.distNodesMod.Token[CloseBracketToken]
  ) = this()
  def this(
    openParenToken: typings.grammarkdown.distNodesMod.Token[OpenBracketToken],
    elements: Unit,
    closeParenToken: typings.grammarkdown.distNodesMod.Token[CloseBracketToken]
  ) = this()
}
