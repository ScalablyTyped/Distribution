package typings.graphqlDashCompose

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.languageAstMod.FieldNode
import typings.graphql.languageAstMod.FragmentDefinitionNode
import typings.graphql.languageAstMod.InlineFragmentNode
import typings.graphql.typeDefinitionMod.GraphQLOutputType
import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
import typings.graphqlDashCompose.esmUtilsProjectionMod.ProjectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/esm/utils/projection", JSImport.Namespace)
@js.native
object esmUtilsProjectionMod extends js.Object {
  def extendByFieldProjection(returnType: GraphQLOutputType, projection: ProjectionType): ProjectionType = js.native
  def getFlatProjectionFromAST(info: GraphQLResolveInfo): StringDictionary[Boolean] = js.native
  def getFlatProjectionFromAST(info: GraphQLResolveInfo, fieldNodes: FieldNode): StringDictionary[Boolean] = js.native
  def getFlatProjectionFromAST(info: GraphQLResolveInfo, fieldNodes: FragmentDefinitionNode): StringDictionary[Boolean] = js.native
  def getFlatProjectionFromAST(info: GraphQLResolveInfo, fieldNodes: InlineFragmentNode): StringDictionary[Boolean] = js.native
  def getProjectionFromAST(info: GraphQLResolveInfo): ProjectionType = js.native
  def getProjectionFromAST(info: GraphQLResolveInfo, fieldNode: FieldNode): ProjectionType = js.native
  def getProjectionFromAST(info: GraphQLResolveInfo, fieldNode: FragmentDefinitionNode): ProjectionType = js.native
  def getProjectionFromAST(info: GraphQLResolveInfo, fieldNode: InlineFragmentNode): ProjectionType = js.native
  type ProjectionNode = StringDictionary[js.Any]
  type ProjectionType = StringDictionary[js.Any]
}

