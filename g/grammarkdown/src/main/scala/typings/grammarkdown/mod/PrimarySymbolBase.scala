package typings.grammarkdown.mod

import typings.grammarkdown.tokensMod.PrimarySymbolKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "PrimarySymbolBase")
@js.native
abstract class PrimarySymbolBase[TKind /* <: PrimarySymbolKind */] protected ()
  extends typings.grammarkdown.nodesMod.PrimarySymbolBase[TKind] {
  def this(kind: TKind) = this()
}
