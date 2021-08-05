package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "Resolver")
@js.native
class Resolver protected () extends StObject {
  def this(bindings: BindingTable) = this()
  
  /* private */ var bindings: js.Any = js.native
  
  def createNavigator(node: Node2[SyntaxKind]): js.UndefOr[NodeNavigator] = js.native
  
  def getDeclarations(node: Identifier): js.Array[SourceFile | Production | Parameter] = js.native
  
  def getParent(node: Node2[SyntaxKind]): js.UndefOr[Node2[SyntaxKind]] = js.native
  
  def getProductionLinkId(node: Identifier): js.UndefOr[String] = js.native
  
  def getReferences(node: Identifier): js.Array[Node2[SyntaxKind]] = js.native
  
  def getRightHandSideLinkId(node: RightHandSide, includePrefix: Boolean): String = js.native
  
  def getSourceFileOfNode(node: Node2[SyntaxKind]): SourceFile = js.native
}
