package typings.grammarkdown.distCheckerMod

import typings.grammarkdown.distBinderMod.BindingTable
import typings.grammarkdown.distNavigatorMod.NodeNavigator
import typings.grammarkdown.distNodesMod.Identifier
import typings.grammarkdown.distNodesMod.Node
import typings.grammarkdown.distNodesMod.Parameter
import typings.grammarkdown.distNodesMod.Production
import typings.grammarkdown.distNodesMod.RightHandSide
import typings.grammarkdown.distNodesMod.SourceFile
import typings.grammarkdown.distTokensMod.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/checker", "Resolver")
@js.native
class Resolver protected () extends js.Object {
  def this(bindings: BindingTable) = this()
  var bindings: js.Any = js.native
  def createNavigator(node: Node[SyntaxKind]): js.UndefOr[NodeNavigator] = js.native
  def getDeclarations(node: Identifier): js.Array[SourceFile | Production | Parameter] = js.native
  def getParent(node: Node[SyntaxKind]): js.UndefOr[Node[SyntaxKind]] = js.native
  def getProductionLinkId(node: Identifier): js.UndefOr[String] = js.native
  def getReferences(node: Identifier): js.Array[Node[SyntaxKind]] = js.native
  def getRightHandSideLinkId(node: RightHandSide, includePrefix: Boolean): String = js.native
  def getSourceFileOfNode(node: Node[SyntaxKind]): SourceFile = js.native
}

