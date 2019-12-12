package typings.grammarkdown

import org.scalablytyped.runtime.TopLevel
import typings.grammarkdown.distSymbolsMod.Symbol
import typings.grammarkdown.distSymbolsMod.SymbolKind
import typings.grammarkdown.distSymbolsMod.SymbolKind.Parameter
import typings.grammarkdown.distSymbolsMod.SymbolKind.Production
import typings.grammarkdown.distSymbolsMod.SymbolKind.SourceFile
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SymbolKind with Double] = js.native
    /* 2 */ @js.native
    object Parameter extends TopLevel[Parameter with Double]
    
    /* 1 */ @js.native
    object Production extends TopLevel[Production with Double]
    
    /* 0 */ @js.native
    object SourceFile extends TopLevel[SourceFile with Double]
    
  }
  
}

