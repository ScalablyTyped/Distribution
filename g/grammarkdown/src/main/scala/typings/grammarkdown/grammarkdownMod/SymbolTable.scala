package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "SymbolTable")
@js.native
class SymbolTable () extends StObject {
  
  /* private */ var getSymbols: js.Any = js.native
  
  def isEmpty: Boolean = js.native
  
  /* private */ var nameMap: js.Any = js.native
  
  def resolveSymbol(name: String, kind: SymbolKind): js.UndefOr[Symbol2] = js.native
}
