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
    val __obj = js.Dynamic.literal(fieldName = fieldName, fieldNodes = fieldNodes, fragments = fragments, operation = operation, parentType = parentType, path = path, returnType = returnType.asInstanceOf[js.Any], rootValue = rootValue, schema = schema, variableValues = variableValues)
    if (mergeInfo != null) __obj.updateDynamic("mergeInfo")(mergeInfo)
    __obj.asInstanceOf[IGraphQLToolsResolveInfo]
  }
}

