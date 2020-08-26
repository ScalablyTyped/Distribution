package typings.graphqlToolsMerge

import typings.graphql.astMod.UnionTypeDefinitionNode
import typings.graphql.astMod.UnionTypeExtensionNode
import typings.graphqlToolsMerge.mergeTypedefsMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/merge/typedefs-mergers/union", JSImport.Namespace)
@js.native
object unionMod extends js.Object {
  def mergeUnion(first: UnionTypeDefinitionNode, second: UnionTypeDefinitionNode): UnionTypeDefinitionNode | UnionTypeExtensionNode = js.native
  def mergeUnion(first: UnionTypeDefinitionNode, second: UnionTypeDefinitionNode, config: Config): UnionTypeDefinitionNode | UnionTypeExtensionNode = js.native
  def mergeUnion(first: UnionTypeDefinitionNode, second: UnionTypeExtensionNode): UnionTypeDefinitionNode | UnionTypeExtensionNode = js.native
  def mergeUnion(first: UnionTypeDefinitionNode, second: UnionTypeExtensionNode, config: Config): UnionTypeDefinitionNode | UnionTypeExtensionNode = js.native
  def mergeUnion(first: UnionTypeExtensionNode, second: UnionTypeDefinitionNode): UnionTypeDefinitionNode | UnionTypeExtensionNode = js.native
  def mergeUnion(first: UnionTypeExtensionNode, second: UnionTypeDefinitionNode, config: Config): UnionTypeDefinitionNode | UnionTypeExtensionNode = js.native
  def mergeUnion(first: UnionTypeExtensionNode, second: UnionTypeExtensionNode): UnionTypeDefinitionNode | UnionTypeExtensionNode = js.native
  def mergeUnion(first: UnionTypeExtensionNode, second: UnionTypeExtensionNode, config: Config): UnionTypeDefinitionNode | UnionTypeExtensionNode = js.native
}

