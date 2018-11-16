package typings
package grammarkdownLib.distCheckerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/checker", "Resolver")
@js.native
class Resolver protected () extends js.Object {
  def this(bindings: grammarkdownLib.distBinderMod.BindingTable) = this()
  var bindings: js.Any = js.native
  def createNavigator(node: grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind]): js.UndefOr[grammarkdownLib.distNavigatorMod.NodeNavigator] = js.native
  def getDeclarations(node: grammarkdownLib.distNodesMod.Identifier): js.Array[
    grammarkdownLib.distNodesMod.SourceFile | grammarkdownLib.distNodesMod.Production | grammarkdownLib.distNodesMod.Parameter
  ] = js.native
  def getParent(node: grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind]): js.UndefOr[grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind]] = js.native
  def getProductionLinkId(node: grammarkdownLib.distNodesMod.Identifier): js.UndefOr[java.lang.String] = js.native
  def getReferences(node: grammarkdownLib.distNodesMod.Identifier): js.Array[grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind]] = js.native
  def getRightHandSideLinkId(node: grammarkdownLib.distNodesMod.RightHandSide, includePrefix: scala.Boolean): java.lang.String = js.native
  def getSourceFileOfNode(node: grammarkdownLib.distNodesMod.Node[grammarkdownLib.distTokensMod.SyntaxKind]): grammarkdownLib.distNodesMod.SourceFile = js.native
}

