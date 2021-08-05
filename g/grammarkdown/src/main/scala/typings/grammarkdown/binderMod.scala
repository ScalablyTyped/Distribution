package typings.grammarkdown

import typings.esfxCancelable.distMod.Cancelable
import typings.grammarkdown.nodesMod.Node
import typings.grammarkdown.nodesMod.Parameter
import typings.grammarkdown.nodesMod.Production
import typings.grammarkdown.nodesMod.SourceFile
import typings.grammarkdown.symbolsMod.Symbol
import typings.grammarkdown.symbolsMod.SymbolKind
import typings.grammarkdown.symbolsMod.SymbolTable
import typings.grammarkdown.tokensMod.SyntaxKind
import typings.prex.mod.CancellationToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object binderMod {
  
  @JSImport("grammarkdown/dist/binder", "Binder")
  @js.native
  class Binder () extends StObject {
    
    /* private */ var bind: js.Any = js.native
    
    /* private */ var bindChildren: js.Any = js.native
    
    /* private */ var bindParameter: js.Any = js.native
    
    /* private */ var bindProduction: js.Any = js.native
    
    def bindSourceFile(file: SourceFile, bindings: BindingTable): Unit = js.native
    def bindSourceFile(file: SourceFile, bindings: BindingTable, cancelable: Cancelable): Unit = js.native
    def bindSourceFile(file: SourceFile, bindings: BindingTable, cancelable: CancellationToken): Unit = js.native
    
    /* private */ var declareSymbol: js.Any = js.native
    
    /* private */ var parentNode: js.Any = js.native
    
    /* private */ var parentSymbol: js.Any = js.native
  }
  
  @JSImport("grammarkdown/dist/binder", "BindingTable")
  @js.native
  class BindingTable () extends StObject {
    
    /* private */ var addReferenceToSymbol: js.Any = js.native
    
    def getAncestor(node: Unit, kind: SyntaxKind): js.UndefOr[Node[SyntaxKind]] = js.native
    def getAncestor(node: Node[SyntaxKind], kind: SyntaxKind): js.UndefOr[Node[SyntaxKind]] = js.native
    
    def getDeclarations(): js.Array[SourceFile | Production | Parameter] = js.native
    def getDeclarations(symbol: Symbol): js.Array[SourceFile | Production | Parameter] = js.native
    
    def getParent(): js.UndefOr[Node[SyntaxKind]] = js.native
    def getParent(node: Node[SyntaxKind]): js.UndefOr[Node[SyntaxKind]] = js.native
    
    def getReferences(): js.Array[Node[SyntaxKind]] = js.native
    def getReferences(symbol: Symbol): js.Array[Node[SyntaxKind]] = js.native
    
    def getSourceFile(): js.UndefOr[SourceFile] = js.native
    def getSourceFile(node: Node[SyntaxKind]): js.UndefOr[SourceFile] = js.native
    
    def getSymbol(): js.UndefOr[Symbol] = js.native
    def getSymbol(node: Node[SyntaxKind]): js.UndefOr[Symbol] = js.native
    
    val globals: SymbolTable = js.native
    
    def hasParent(): Boolean = js.native
    def hasParent(node: Node[SyntaxKind]): Boolean = js.native
    
    def hasSymbol(): Boolean = js.native
    def hasSymbol(node: Node[SyntaxKind]): Boolean = js.native
    
    def isEmpty: Boolean = js.native
    
    /* private */ var nodeParents: js.Any = js.native
    
    /* private */ var nodeSymbols: js.Any = js.native
    
    def resolveSymbol(location: Unit, name: String, meaning: SymbolKind): js.UndefOr[Symbol] = js.native
    def resolveSymbol(location: Unit, name: Unit, meaning: SymbolKind): js.UndefOr[Symbol] = js.native
    def resolveSymbol(location: Node[SyntaxKind], name: String, meaning: SymbolKind): js.UndefOr[Symbol] = js.native
    def resolveSymbol(location: Node[SyntaxKind], name: Unit, meaning: SymbolKind): js.UndefOr[Symbol] = js.native
    
    /* private */ var setSymbolForNode: js.Any = js.native
    
    /* private */ var symbolDeclarations: js.Any = js.native
    
    /* private */ var symbolLocals: js.Any = js.native
    
    /* private */ var symbolReferences: js.Any = js.native
  }
}
