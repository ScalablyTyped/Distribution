package typings.grammarkdown

import typings.esfxCancelable.mod.Cancelable
import typings.grammarkdown.distNodesMod.Node
import typings.grammarkdown.distNodesMod.Parameter
import typings.grammarkdown.distNodesMod.Production
import typings.grammarkdown.distNodesMod.SourceFile
import typings.grammarkdown.distSymbolsMod.Symbol
import typings.grammarkdown.distSymbolsMod.SymbolKind
import typings.grammarkdown.distSymbolsMod.SymbolTable
import typings.grammarkdown.distTokensMod.SyntaxKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBinderMod {
  
  @JSImport("grammarkdown/dist/binder", "Binder")
  @js.native
  open class Binder () extends StObject {
    
    /* private */ var _bind: Any = js.native
    
    /* private */ var _bindChildren: Any = js.native
    
    /* private */ var _bindParameter: Any = js.native
    
    /* private */ var _bindProduction: Any = js.native
    
    /* private */ var _declareSymbol: Any = js.native
    
    /* private */ var _parentNode: Any = js.native
    
    /* private */ var _parentSymbol: Any = js.native
    
    /**
      * Binds a `SourceFile` in the provided `BindingTable`.
      */
    def bindSourceFile(file: SourceFile, bindings: BindingTable): Unit = js.native
    def bindSourceFile(file: SourceFile, bindings: BindingTable, cancelable: Cancelable): Unit = js.native
  }
  
  @JSImport("grammarkdown/dist/binder", "BindingTable")
  @js.native
  open class BindingTable () extends StObject {
    
    /* private */ var _addReferenceToSymbol: Any = js.native
    
    /* private */ var _nodeParents: Any = js.native
    
    /* private */ var _nodeSymbols: Any = js.native
    
    /* private */ var _setSymbolForNode: Any = js.native
    
    /* private */ var _symbolDeclarations: Any = js.native
    
    /* private */ var _symbolLocals: Any = js.native
    
    /* private */ var _symbolReferences: Any = js.native
    
    def getAncestor(node: Unit, kind: SyntaxKind): js.UndefOr[Node[SyntaxKind]] = js.native
    /**
      * Gets the nearest ancestor of `node` with the provided `kind`.
      */
    def getAncestor(node: Node[SyntaxKind], kind: SyntaxKind): js.UndefOr[Node[SyntaxKind]] = js.native
    
    /**
      * Gets the declarations for the provided `symbol`.
      */
    def getDeclarations(): js.Array[SourceFile | Production | Parameter] = js.native
    def getDeclarations(symbol: Symbol): js.Array[SourceFile | Production | Parameter] = js.native
    
    /**
      * Gets the parent of the provided `Node`.
      */
    def getParent(): js.UndefOr[Node[SyntaxKind]] = js.native
    def getParent(node: Node[SyntaxKind]): js.UndefOr[Node[SyntaxKind]] = js.native
    
    /**
      * Gets the references to the provided `symbol`.
      */
    def getReferences(): js.Array[Node[SyntaxKind]] = js.native
    def getReferences(symbol: Symbol): js.Array[Node[SyntaxKind]] = js.native
    
    /**
      * Gets the `SourceFile` containing `node`.
      */
    def getSourceFile(): js.UndefOr[SourceFile] = js.native
    def getSourceFile(node: Node[SyntaxKind]): js.UndefOr[SourceFile] = js.native
    
    /**
      * Gets the `Symbol` bound to `node`.
      */
    def getSymbol(): js.UndefOr[Symbol] = js.native
    def getSymbol(node: Node[SyntaxKind]): js.UndefOr[Symbol] = js.native
    
    val globals: SymbolTable = js.native
    
    /**
      * Returns whether the provided `Node` has a parent.
      */
    def hasParent(): Boolean = js.native
    def hasParent(node: Node[SyntaxKind]): Boolean = js.native
    
    /**
      * Returns whether `node` has been bound to a `Symbol`.
      */
    def hasSymbol(): Boolean = js.native
    def hasSymbol(node: Node[SyntaxKind]): Boolean = js.native
    
    /**
      * Gets a value indicating whether this `BindingTable` is empty.
      */
    def isEmpty: Boolean = js.native
    
    def resolveSymbol(location: Unit, name: String, meaning: SymbolKind): js.UndefOr[Symbol] = js.native
    def resolveSymbol(location: Unit, name: Unit, meaning: SymbolKind): js.UndefOr[Symbol] = js.native
    /**
      * Resolves a `Symbol` for the provided `name` at the given `location` that has the provided `meaning`.
      */
    def resolveSymbol(location: Node[SyntaxKind], name: String, meaning: SymbolKind): js.UndefOr[Symbol] = js.native
    def resolveSymbol(location: Node[SyntaxKind], name: Unit, meaning: SymbolKind): js.UndefOr[Symbol] = js.native
  }
}
