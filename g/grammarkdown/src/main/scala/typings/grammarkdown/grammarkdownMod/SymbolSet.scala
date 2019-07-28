package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.distTokensMod.SyntaxKind.CloseBraceToken
import typings.grammarkdown.distTokensMod.SyntaxKind.OpenBraceToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "SymbolSet")
@js.native
class SymbolSet protected ()
  extends typings.grammarkdown.distNodesMod.SymbolSet {
  def this(openBraceToken: typings.grammarkdown.distNodesMod.Token[OpenBraceToken]) = this()
  def this(
    openBraceToken: typings.grammarkdown.distNodesMod.Token[OpenBraceToken],
    elements: js.Array[typings.grammarkdown.distNodesMod.SymbolSpan]
  ) = this()
  def this(
    openBraceToken: typings.grammarkdown.distNodesMod.Token[OpenBraceToken],
    elements: js.UndefOr[scala.Nothing],
    closeBraceToken: typings.grammarkdown.distNodesMod.Token[CloseBraceToken]
  ) = this()
  def this(
    openBraceToken: typings.grammarkdown.distNodesMod.Token[OpenBraceToken],
    elements: js.Array[typings.grammarkdown.distNodesMod.SymbolSpan],
    closeBraceToken: typings.grammarkdown.distNodesMod.Token[CloseBraceToken]
  ) = this()
}

