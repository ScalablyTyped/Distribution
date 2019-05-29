package typings
package grammarkdownLib.distBinderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/binder", "BindingTable")
@js.native
class BindingTable () extends js.Object {
  var addReferenceToSymbol: js.Any = js.native
  val globals: grammarkdownLib.distSymbolsMod.SymbolTable = js.native
  val isEmpty: scala.Boolean = js.native
  var nodeParents: js.Any = js.native
  var nodeSymbols: js.Any = js.native
  var setSymbolForNode: js.Any = js.native
  var symbolDeclarations: js.Any = js.native
  var symbolLocals: js.Any = js.native
  var symbolReferences: js.Any = js.native
  def getAncestor(node: js.UndefOr[scala.Nothing], kind: grammarkdownLib.distTokensMod.SyntaxKind): js.UndefOr[grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind]] = js.native
  def getAncestor(
    node: grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind],
    kind: grammarkdownLib.distTokensMod.SyntaxKind
  ): js.UndefOr[grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind]] = js.native
  def getDeclarations(): js.Array[
    grammarkdownLib.distNodesMod.SourceFile | grammarkdownLib.distNodesMod.Production | grammarkdownLib.distNodesMod.Parameter
  ] = js.native
  def getDeclarations(symbol: grammarkdownLib.distSymbolsMod.Symbol): js.Array[
    grammarkdownLib.distNodesMod.SourceFile | grammarkdownLib.distNodesMod.Production | grammarkdownLib.distNodesMod.Parameter
  ] = js.native
  def getParent(): js.UndefOr[grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind]] = js.native
  def getParent(node: grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind]): js.UndefOr[grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind]] = js.native
  def getReferences(): js.Array[grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind]] = js.native
  def getReferences(symbol: grammarkdownLib.distSymbolsMod.Symbol): js.Array[grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind]] = js.native
  def getSymbol(): js.UndefOr[grammarkdownLib.distSymbolsMod.Symbol] = js.native
  def getSymbol(node: grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind]): js.UndefOr[grammarkdownLib.distSymbolsMod.Symbol] = js.native
  def hasParent(): scala.Boolean = js.native
  def hasParent(node: grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind]): scala.Boolean = js.native
  def hasSymbol(): scala.Boolean = js.native
  def hasSymbol(node: grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind]): scala.Boolean = js.native
  def resolveSymbol(
    location: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    meaning: grammarkdownLib.distSymbolsMod.SymbolKind
  ): js.UndefOr[grammarkdownLib.distSymbolsMod.Symbol] = js.native
  def resolveSymbol(
    location: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    meaning: grammarkdownLib.distSymbolsMod.SymbolKind
  ): js.UndefOr[grammarkdownLib.distSymbolsMod.Symbol] = js.native
  def resolveSymbol(
    location: grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind],
    name: js.UndefOr[scala.Nothing],
    meaning: grammarkdownLib.distSymbolsMod.SymbolKind
  ): js.UndefOr[grammarkdownLib.distSymbolsMod.Symbol] = js.native
  def resolveSymbol(
    location: grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind],
    name: java.lang.String,
    meaning: grammarkdownLib.distSymbolsMod.SymbolKind
  ): js.UndefOr[grammarkdownLib.distSymbolsMod.Symbol] = js.native
}

