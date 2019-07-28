package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken
import typings.grammarkdown.distTokensMod.SyntaxKind.CloseParenToken
import typings.grammarkdown.distTokensMod.SyntaxKind.OpenBracketToken
import typings.grammarkdown.distTokensMod.SyntaxKind.OpenParenToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "ArgumentList")
@js.native
class ArgumentList protected ()
  extends typings.grammarkdown.distNodesMod.ArgumentList {
  def this(openParenToken: typings.grammarkdown.distNodesMod.Token[OpenParenToken | OpenBracketToken]) = this()
  def this(
    openParenToken: typings.grammarkdown.distNodesMod.Token[OpenParenToken | OpenBracketToken],
    elements: js.Array[typings.grammarkdown.distNodesMod.Argument]
  ) = this()
  def this(
    openParenToken: typings.grammarkdown.distNodesMod.Token[OpenParenToken | OpenBracketToken],
    elements: js.UndefOr[scala.Nothing],
    closeParenToken: typings.grammarkdown.distNodesMod.Token[CloseParenToken | CloseBracketToken]
  ) = this()
  def this(
    openParenToken: typings.grammarkdown.distNodesMod.Token[OpenParenToken | OpenBracketToken],
    elements: js.Array[typings.grammarkdown.distNodesMod.Argument],
    closeParenToken: typings.grammarkdown.distNodesMod.Token[CloseParenToken | CloseBracketToken]
  ) = this()
}

