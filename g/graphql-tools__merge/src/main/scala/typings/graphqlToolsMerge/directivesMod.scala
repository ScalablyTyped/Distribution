package typings.graphqlToolsMerge

import typings.graphql.astMod.DirectiveDefinitionNode
import typings.graphql.astMod.DirectiveNode
import typings.graphqlToolsMerge.mergeTypedefsMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/merge/typedefs-mergers/directives", JSImport.Namespace)
@js.native
object directivesMod extends js.Object {
  def mergeDirective(node: DirectiveDefinitionNode): DirectiveDefinitionNode = js.native
  def mergeDirective(node: DirectiveDefinitionNode, existingNode: DirectiveDefinitionNode): DirectiveDefinitionNode = js.native
  def mergeDirectives(): js.Array[DirectiveNode] = js.native
  def mergeDirectives(d1: js.UndefOr[scala.Nothing], d2: js.UndefOr[scala.Nothing], config: Config): js.Array[DirectiveNode] = js.native
  def mergeDirectives(d1: js.UndefOr[scala.Nothing], d2: js.Array[DirectiveNode]): js.Array[DirectiveNode] = js.native
  def mergeDirectives(d1: js.UndefOr[scala.Nothing], d2: js.Array[DirectiveNode], config: Config): js.Array[DirectiveNode] = js.native
  def mergeDirectives(d1: js.Array[DirectiveNode]): js.Array[DirectiveNode] = js.native
  def mergeDirectives(d1: js.Array[DirectiveNode], d2: js.UndefOr[scala.Nothing], config: Config): js.Array[DirectiveNode] = js.native
  def mergeDirectives(d1: js.Array[DirectiveNode], d2: js.Array[DirectiveNode]): js.Array[DirectiveNode] = js.native
  def mergeDirectives(d1: js.Array[DirectiveNode], d2: js.Array[DirectiveNode], config: Config): js.Array[DirectiveNode] = js.native
}

