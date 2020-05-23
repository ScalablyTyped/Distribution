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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/binder", JSImport.Namespace)
@js.native
object binderMod extends js.Object {
  @js.native
  class Binder () extends js.Object {
    var bind: js.Any = js.native
    var bindChildren: js.Any = js.native
    var bindParameter: js.Any = js.native
    var bindProduction: js.Any = js.native
    var declareSymbol: js.Any = js.native
    var parentNode: js.Any = js.native
    var parentSymbol: js.Any = js.native
    def bindSourceFile(file: SourceFile, bindings: BindingTable): Unit = js.native
    def bindSourceFile(file: SourceFile, bindings: BindingTable, cancelable: Cancelable): Unit = js.native
    def bindSourceFile(file: SourceFile, bindings: BindingTable, cancelable: CancellationToken): Unit = js.native
  }
  
  @js.native
  class BindingTable () extends js.Object {
    var addReferenceToSymbol: js.Any = js.native
    val globals: SymbolTable = js.native
    var nodeParents: js.Any = js.native
    var nodeSymbols: js.Any = js.native
    var setSymbolForNode: js.Any = js.native
    var symbolDeclarations: js.Any = js.native
    var symbolLocals: js.Any = js.native
    var symbolReferences: js.Any = js.native
    def getAncestor(node: js.UndefOr[Node[SyntaxKind]], kind: SyntaxKind): js.UndefOr[Node[SyntaxKind]] = js.native
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
    def hasParent(): Boolean = js.native
    def hasParent(node: Node[SyntaxKind]): Boolean = js.native
    def hasSymbol(): Boolean = js.native
    def hasSymbol(node: Node[SyntaxKind]): Boolean = js.native
    def isEmpty: Boolean = js.native
    def resolveSymbol(location: js.UndefOr[Node[SyntaxKind]], name: js.UndefOr[String], meaning: SymbolKind): js.UndefOr[Symbol] = js.native
  }
  
}

