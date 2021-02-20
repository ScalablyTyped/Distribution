package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "BindingTable")
@js.native
class BindingTable () extends StObject {
  
  var addReferenceToSymbol: js.Any = js.native
  
  def getAncestor(node: js.UndefOr[scala.Nothing], kind: SyntaxKind): js.UndefOr[Node2[SyntaxKind]] = js.native
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
  
  var nodeParents: js.Any = js.native
  
  var nodeSymbols: js.Any = js.native
  
  def resolveSymbol(location: js.UndefOr[scala.Nothing], name: js.UndefOr[scala.Nothing], meaning: SymbolKind): js.UndefOr[Symbol2] = js.native
  def resolveSymbol(location: js.UndefOr[scala.Nothing], name: String, meaning: SymbolKind): js.UndefOr[Symbol2] = js.native
  def resolveSymbol(location: Node2[SyntaxKind], name: js.UndefOr[scala.Nothing], meaning: SymbolKind): js.UndefOr[Symbol2] = js.native
  def resolveSymbol(location: Node2[SyntaxKind], name: String, meaning: SymbolKind): js.UndefOr[Symbol2] = js.native
  
  var setSymbolForNode: js.Any = js.native
  
  var symbolDeclarations: js.Any = js.native
  
  var symbolLocals: js.Any = js.native
  
  var symbolReferences: js.Any = js.native
}
