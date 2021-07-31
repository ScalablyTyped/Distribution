package typings.grammarkdown.mod

import typings.grammarkdown.tokensMod.SyntaxKind.CloseBraceToken
import typings.grammarkdown.tokensMod.SyntaxKind.OpenBraceToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "SymbolSet")
@js.native
class SymbolSet protected ()
  extends typings.grammarkdown.nodesMod.SymbolSet {
  def this(openBraceToken: typings.grammarkdown.nodesMod.Token[OpenBraceToken]) = this()
  def this(
    openBraceToken: typings.grammarkdown.nodesMod.Token[OpenBraceToken],
    elements: js.Array[typings.grammarkdown.nodesMod.SymbolSpan]
  ) = this()
  def this(
    openBraceToken: typings.grammarkdown.nodesMod.Token[OpenBraceToken],
    elements: js.Array[typings.grammarkdown.nodesMod.SymbolSpan],
    closeBraceToken: typings.grammarkdown.nodesMod.Token[CloseBraceToken]
  ) = this()
  def this(
    openBraceToken: typings.grammarkdown.nodesMod.Token[OpenBraceToken],
    elements: Unit,
    closeBraceToken: typings.grammarkdown.nodesMod.Token[CloseBraceToken]
  ) = this()
}
