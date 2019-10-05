package typings.grammarkdown

import typings.grammarkdown.distSymbolsMod.Symbol
import typings.grammarkdown.distSymbolsMod.SymbolKind
import typings.grammarkdown.distSymbolsMod.SymbolTable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/symbols", JSImport.Namespace)
@js.native
object distSymbolsMod extends js.Object {
  @js.native
  class Symbol protected () extends js.Object {
    def this(kind: SymbolKind, name: String) = this()
    var id: Double = js.native
    var kind: SymbolKind = js.native
    var locals: js.UndefOr[SymbolTable] = js.native
    var name: String = js.native
    var parent: js.UndefOr[Symbol] = js.native
  }
  
  @js.native
  sealed trait SymbolKind extends js.Object
  
  @js.native
  class SymbolTable () extends js.Object {
    var getSymbols: js.Any = js.native
    val isEmpty: Boolean = js.native
    var nameMap: js.Any = js.native
    def resolveSymbol(name: String, kind: SymbolKind): js.UndefOr[Symbol] = js.native
  }
  
  @js.native
  object SymbolKind extends js.Object {
    @js.native
    sealed trait Parameter extends SymbolKind
    
    @js.native
    sealed trait Production extends SymbolKind
    
    @js.native
    sealed trait SourceFile extends SymbolKind
    
    /* 2 */ val Parameter: typings.grammarkdown.distSymbolsMod.SymbolKind.Parameter with Double = js.native
    /* 1 */ val Production: typings.grammarkdown.distSymbolsMod.SymbolKind.Production with Double = js.native
    /* 0 */ val SourceFile: typings.grammarkdown.distSymbolsMod.SymbolKind.SourceFile with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SymbolKind with Double] = js.native
  }
  
}

