package typings.grammarkdown.nodesMod

import typings.grammarkdown.tokensMod.PrimarySymbolKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "PrimarySymbolBase")
@js.native
abstract class PrimarySymbolBase[TKind /* <: PrimarySymbolKind */] protected () extends LexicalSymbolBase[TKind] {
  def this(kind: TKind) = this()
}
