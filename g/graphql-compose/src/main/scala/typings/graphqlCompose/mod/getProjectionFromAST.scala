package typings.graphqlCompose.mod

import typings.graphql.astMod.FieldNode
import typings.graphql.astMod.FragmentDefinitionNode
import typings.graphql.astMod.InlineFragmentNode
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphqlCompose.projectionMod.ProjectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "getProjectionFromAST")
@js.native
object getProjectionFromAST extends js.Object {
  def apply(info: GraphQLResolveInfo): ProjectionType = js.native
  def apply(info: GraphQLResolveInfo, fieldNode: FieldNode): ProjectionType = js.native
  def apply(info: GraphQLResolveInfo, fieldNode: FragmentDefinitionNode): ProjectionType = js.native
  def apply(info: GraphQLResolveInfo, fieldNode: InlineFragmentNode): ProjectionType = js.native
}

