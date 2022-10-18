package typings.grammarkdown.distNodesMod

import typings.grammarkdown.distTokensMod.PrimarySymbolKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("grammarkdown/dist/nodes", "PrimarySymbolBase")
@js.native
open class PrimarySymbolBase[TKind /* <: PrimarySymbolKind */] protected () extends LexicalSymbolBase[TKind] {
  def this(kind: TKind) = this()
}
