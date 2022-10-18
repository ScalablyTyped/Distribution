package typings.grammarkdown

import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSymbolsMod {
  
  @JSImport("grammarkdown/dist/symbols", "Symbol")
  @js.native
  open class Symbol protected () extends StObject {
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
    def apply(value: Double): js.UndefOr[SymbolKind & Double] = js.native
    
    @js.native
    sealed trait Parameter
      extends StObject
         with SymbolKind
    /* 2 */ val Parameter: typings.grammarkdown.distSymbolsMod.SymbolKind.Parameter & Double = js.native
    
    @js.native
    sealed trait Production
      extends StObject
         with SymbolKind
    /* 1 */ val Production: typings.grammarkdown.distSymbolsMod.SymbolKind.Production & Double = js.native
    
    @js.native
    sealed trait SourceFile
      extends StObject
         with SymbolKind
    /* 0 */ val SourceFile: typings.grammarkdown.distSymbolsMod.SymbolKind.SourceFile & Double = js.native
  }
  
  @JSImport("grammarkdown/dist/symbols", "SymbolTable")
  @js.native
  open class SymbolTable () extends StObject {
    
    /* private */ var getSymbols: Any = js.native
    
    def isEmpty: Boolean = js.native
    
    /* private */ var nameMap: Any = js.native
    
    def resolveSymbol(name: String, kind: SymbolKind): js.UndefOr[Symbol] = js.native
    
    def symbolsOfKind(kind: SymbolKind): Generator[Symbol, Unit, Unit] = js.native
  }
}
