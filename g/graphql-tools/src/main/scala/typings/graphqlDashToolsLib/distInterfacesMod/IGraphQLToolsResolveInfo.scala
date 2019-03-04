package typings
package graphqlDashToolsLib.distInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGraphQLToolsResolveInfo
  extends graphqlLib.typeDefinitionMod.GraphQLResolveInfo {
  var mergeInfo: js.UndefOr[MergeInfo] = js.undefined
}

object IGraphQLToolsResolveInfo {
  @scala.inline
  def apply(
    fieldName: java.lang.String,
    fieldNodes: js.Array[graphqlLib.languageAstMod.FieldNode],
    fragments: org.scalablytyped.runtime.StringDictionary[graphqlLib.languageAstMod.FragmentDefinitionNode],
    operation: graphqlLib.languageAstMod.OperationDefinitionNode,
    parentType: graphqlLib.typeDefinitionMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]],
    path: graphqlLib.typeDefinitionMod.ResponsePath,
    returnType: graphqlLib.typeDefinitionMod.GraphQLOutputType,
    rootValue: js.Any,
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    variableValues: org.scalablytyped.runtime.StringDictionary[js.Any],
    mergeInfo: MergeInfo = null
  ): IGraphQLToolsResolveInfo = {
    val __obj = js.Dynamic.literal(fieldName = fieldName, fieldNodes = fieldNodes, fragments = fragments, operation = operation, parentType = parentType, path = path, returnType = returnType.asInstanceOf[js.Any], rootValue = rootValue, schema = schema, variableValues = variableValues)
    if (mergeInfo != null) __obj.updateDynamic("mergeInfo")(mergeInfo)
    __obj.asInstanceOf[IGraphQLToolsResolveInfo]
  }
}

