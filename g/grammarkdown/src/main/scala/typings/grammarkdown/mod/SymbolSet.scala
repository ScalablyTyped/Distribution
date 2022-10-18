package typings.grammarkdown.mod

import typings.grammarkdown.distTokensMod.SyntaxKind.CloseBraceToken
import typings.grammarkdown.distTokensMod.SyntaxKind.OpenBraceToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "SymbolSet")
@js.native
open class SymbolSet protected ()
  extends typings.grammarkdown.distNodesMod.SymbolSet {
  def this(openBraceToken: typings.grammarkdown.distNodesMod.Token[OpenBraceToken]) = this()
  def this(
    openBraceToken: typings.grammarkdown.distNodesMod.Token[OpenBraceToken],
    elements: js.Array[typings.grammarkdown.distNodesMod.SymbolSpan]
  ) = this()
  def this(
    openBraceToken: typings.grammarkdown.distNodesMod.Token[OpenBraceToken],
    elements: js.Array[typings.grammarkdown.distNodesMod.SymbolSpan],
    closeBraceToken: typings.grammarkdown.distNodesMod.Token[CloseBraceToken]
  ) = this()
  def this(
    openBraceToken: typings.grammarkdown.distNodesMod.Token[OpenBraceToken],
    elements: Unit,
    closeBraceToken: typings.grammarkdown.distNodesMod.Token[CloseBraceToken]
  ) = this()
}
