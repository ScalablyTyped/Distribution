package typings.graphqlDashCompose.esmMod

import typings.graphql.languageAstMod.FieldNode
import typings.graphql.languageAstMod.FragmentDefinitionNode
import typings.graphql.languageAstMod.InlineFragmentNode
import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
import typings.graphqlDashCompose.esmUtilsProjectionMod.ProjectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/esm", "getProjectionFromAST")
@js.native
object getProjectionFromAST extends js.Object {
  def apply(info: GraphQLResolveInfo): ProjectionType = js.native
  def apply(info: GraphQLResolveInfo, fieldNode: FieldNode): ProjectionType = js.native
  def apply(info: GraphQLResolveInfo, fieldNode: FragmentDefinitionNode): ProjectionType = js.native
  def apply(info: GraphQLResolveInfo, fieldNode: InlineFragmentNode): ProjectionType = js.native
}

