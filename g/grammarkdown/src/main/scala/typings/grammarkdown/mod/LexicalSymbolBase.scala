package typings.grammarkdown.mod

import typings.grammarkdown.distTokensMod.LexicalSymbolKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("grammarkdown", "LexicalSymbolBase")
@js.native
open class LexicalSymbolBase[TKind /* <: LexicalSymbolKind */] protected ()
  extends typings.grammarkdown.distNodesMod.LexicalSymbolBase[TKind] {
  def this(kind: TKind) = this()
}
