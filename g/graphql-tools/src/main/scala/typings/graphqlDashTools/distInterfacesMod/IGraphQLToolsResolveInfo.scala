package typings.graphqlDashTools.distInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.jsutilsPathMod.Path
import typings.graphql.languageAstMod.FieldNode
import typings.graphql.languageAstMod.FragmentDefinitionNode
import typings.graphql.languageAstMod.OperationDefinitionNode
import typings.graphql.typeDefinitionMod.GraphQLObjectType
import typings.graphql.typeDefinitionMod.GraphQLOutputType
import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
import typings.graphql.typeSchemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGraphQLToolsResolveInfo extends GraphQLResolveInfo {
  var mergeInfo: js.UndefOr[MergeInfo] = js.undefined
}

object IGraphQLToolsResolveInfo {
  @scala.inline
  def apply(
    fieldName: String,
    fieldNodes: js.Array[FieldNode],
    fragments: StringDictionary[FragmentDefinitionNode],
    operation: OperationDefinitionNode,
    parentType: GraphQLObjectType[_, _, StringDictionary[_]],
    path: Path,
    returnType: GraphQLOutputType,
    rootValue: js.Any,
    schema: GraphQLSchema,
    variableValues: StringDictionary[js.Any],
    mergeInfo: MergeInfo = null
  ): IGraphQLToolsResolveInfo = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], fieldNodes = fieldNodes.asInstanceOf[js.Any], fragments = fragments.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], parentType = parentType.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], rootValue = rootValue.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], variableValues = variableValues.asInstanceOf[js.Any])
    if (mergeInfo != null) __obj.updateDynamic("mergeInfo")(mergeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGraphQLToolsResolveInfo]
  }
}

