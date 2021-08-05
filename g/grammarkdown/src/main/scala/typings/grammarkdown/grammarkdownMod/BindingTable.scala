package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "BindingTable")
@js.native
class BindingTable () extends StObject {
  
  /* private */ var addReferenceToSymbol: js.Any = js.native
  
  def getAncestor(node: Unit, kind: SyntaxKind): js.UndefOr[Node2[SyntaxKind]] = js.native
  def getAncestor(node: Node2[SyntaxKind], kind: SyntaxKind): js.UndefOr[Node2[SyntaxKind]] = js.native
  
  def getDeclarations(): js.Array[SourceFile | Production | Parameter] = js.native
  def getDeclarations(symbol: Symbol2): js.Array[SourceFile | Production | Parameter] = js.native
  
  def getParent(): js.UndefOr[Node2[SyntaxKind]] = js.native
  def getParent(node: Node2[SyntaxKind]): js.UndefOr[Node2[SyntaxKind]] = js.native
  
  def getReferences(): js.Array[Node2[SyntaxKind]] = js.native
  def getReferences(symbol: Symbol2): js.Array[Node2[SyntaxKind]] = js.native
  
  def getSourceFile(): js.UndefOr[SourceFile] = js.native
  def getSourceFile(node: Node2[SyntaxKind]): js.UndefOr[SourceFile] = js.native
  
  def getSymbol(): js.UndefOr[Symbol2] = js.native
  def getSymbol(node: Node2[SyntaxKind]): js.UndefOr[Symbol2] = js.native
  
  val globals: SymbolTable = js.native
  
  def hasParent(): Boolean = js.native
  def hasParent(node: Node2[SyntaxKind]): Boolean = js.native
  
  def hasSymbol(): Boolean = js.native
  def hasSymbol(node: Node2[SyntaxKind]): Boolean = js.native
  
  def isEmpty: Boolean = js.native
  
  /* private */ var nodeParents: js.Any = js.native
  
  /* private */ var nodeSymbols: js.Any = js.native
  
  def resolveSymbol(location: Unit, name: String, meaning: SymbolKind): js.UndefOr[Symbol2] = js.native
  def resolveSymbol(location: Unit, name: Unit, meaning: SymbolKind): js.UndefOr[Symbol2] = js.native
  def resolveSymbol(location: Node2[SyntaxKind], name: String, meaning: SymbolKind): js.UndefOr[Symbol2] = js.native
  def resolveSymbol(location: Node2[SyntaxKind], name: Unit, meaning: SymbolKind): js.UndefOr[Symbol2] = js.native
  
  /* private */ var setSymbolForNode: js.Any = js.native
  
  /* private */ var symbolDeclarations: js.Any = js.native
  
  /* private */ var symbolLocals: js.Any = js.native
  
  /* private */ var symbolReferences: js.Any = js.native
}
