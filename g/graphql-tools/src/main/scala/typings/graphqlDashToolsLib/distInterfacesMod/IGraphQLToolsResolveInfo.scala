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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fieldName")(fieldName)
    __obj.updateDynamic("fieldNodes")(fieldNodes)
    __obj.updateDynamic("fragments")(fragments)
    __obj.updateDynamic("operation")(operation)
    __obj.updateDynamic("parentType")(parentType)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    __obj.updateDynamic("rootValue")(rootValue)
    __obj.updateDynamic("schema")(schema)
    __obj.updateDynamic("variableValues")(variableValues)
    if (mergeInfo != null) __obj.updateDynamic("mergeInfo")(mergeInfo)
    __obj.asInstanceOf[IGraphQLToolsResolveInfo]
  }
}

