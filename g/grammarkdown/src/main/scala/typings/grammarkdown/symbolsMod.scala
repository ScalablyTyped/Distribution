package typings.grammarkdown

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object symbolsMod {
  
  @JSImport("grammarkdown/dist/symbols", "Symbol")
  @js.native
  class Symbol protected () extends StObject {
    def this(kind: SymbolKind, name: String) = this()
    
    var id: Double = js.native
    
    var kind: SymbolKind = js.native
    
    var locals: js.UndefOr[SymbolTable] = js.native
    
    var name: String = js.native
    
    var parent: js.UndefOr[Symbol] = js.native
  }
  
  @js.native
  sealed trait SymbolKind extends StObject
  @JSImport("grammarkdown/dist/symbols", "SymbolKind")
  @js.native
  object SymbolKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SymbolKind with Double] = js.native
    
    @js.native
    sealed trait Parameter extends SymbolKind
    /* 2 */ val Parameter: typings.grammarkdown.symbolsMod.SymbolKind.Parameter with Double = js.native
    
    @js.native
    sealed trait Production extends SymbolKind
    /* 1 */ val Production: typings.grammarkdown.symbolsMod.SymbolKind.Production with Double = js.native
    
    @js.native
    sealed trait SourceFile extends SymbolKind
    /* 0 */ val SourceFile: typings.grammarkdown.symbolsMod.SymbolKind.SourceFile with Double = js.native
  }
  
  @JSImport("grammarkdown/dist/symbols", "SymbolTable")
  @js.native
  class SymbolTable () extends StObject {
    
    var getSymbols: js.Any = js.native
    
    def isEmpty: Boolean = js.native
    
    var nameMap: js.Any = js.native
    
    def resolveSymbol(name: String, kind: SymbolKind): js.UndefOr[Symbol] = js.native
  }
}
