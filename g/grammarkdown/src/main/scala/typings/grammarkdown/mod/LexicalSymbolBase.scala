package typings.grammarkdown.mod

import typings.grammarkdown.tokensMod.LexicalSymbolKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "LexicalSymbolBase")
@js.native
abstract class LexicalSymbolBase[TKind /* <: LexicalSymbolKind */] protected ()
  extends typings.grammarkdown.nodesMod.LexicalSymbolBase[TKind] {
  def this(kind: TKind) = this()
}
