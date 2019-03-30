package typings
package graphqlDashComposeLib.libUtilsProjectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/utils/projection", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def extendByFieldProjection(returnType: graphqlLib.typeDefinitionMod.GraphQLOutputType, projection: ProjectionType): ProjectionType = js.native
  def getFlatProjectionFromAST(info: graphqlLib.typeDefinitionMod.GraphQLResolveInfo): org.scalablytyped.runtime.StringDictionary[scala.Boolean] = js.native
  def getFlatProjectionFromAST(
    info: graphqlLib.typeDefinitionMod.GraphQLResolveInfo,
    fieldNodes: graphqlLib.languageAstMod.FieldNode
  ): org.scalablytyped.runtime.StringDictionary[scala.Boolean] = js.native
  def getFlatProjectionFromAST(
    info: graphqlLib.typeDefinitionMod.GraphQLResolveInfo,
    fieldNodes: graphqlLib.languageAstMod.FragmentDefinitionNode
  ): org.scalablytyped.runtime.StringDictionary[scala.Boolean] = js.native
  def getFlatProjectionFromAST(
    info: graphqlLib.typeDefinitionMod.GraphQLResolveInfo,
    fieldNodes: graphqlLib.languageAstMod.InlineFragmentNode
  ): org.scalablytyped.runtime.StringDictionary[scala.Boolean] = js.native
  def getProjectionFromAST(info: graphqlLib.typeDefinitionMod.GraphQLResolveInfo): ProjectionType = js.native
  def getProjectionFromAST(
    info: graphqlLib.typeDefinitionMod.GraphQLResolveInfo,
    fieldNode: graphqlLib.languageAstMod.FieldNode
  ): ProjectionType = js.native
  def getProjectionFromAST(
    info: graphqlLib.typeDefinitionMod.GraphQLResolveInfo,
    fieldNode: graphqlLib.languageAstMod.FragmentDefinitionNode
  ): ProjectionType = js.native
  def getProjectionFromAST(
    info: graphqlLib.typeDefinitionMod.GraphQLResolveInfo,
    fieldNode: graphqlLib.languageAstMod.InlineFragmentNode
  ): ProjectionType = js.native
}

