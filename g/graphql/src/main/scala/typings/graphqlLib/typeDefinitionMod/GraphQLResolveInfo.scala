package typings
package graphqlLib.typeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLResolveInfo extends js.Object {
  val fieldName: java.lang.String
  val fieldNodes: js.Array[graphqlLib.languageAstMod.FieldNode]
  val fragments: org.scalablytyped.runtime.StringDictionary[graphqlLib.languageAstMod.FragmentDefinitionNode]
  val operation: graphqlLib.languageAstMod.OperationDefinitionNode
  val parentType: GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]
  val path: ResponsePath
  val returnType: GraphQLOutputType
  val rootValue: js.Any
  val schema: graphqlLib.typeSchemaMod.GraphQLSchema
  val variableValues: org.scalablytyped.runtime.StringDictionary[js.Any]
}

object GraphQLResolveInfo {
  @scala.inline
  def apply(
    fieldName: java.lang.String,
    fieldNodes: js.Array[graphqlLib.languageAstMod.FieldNode],
    fragments: org.scalablytyped.runtime.StringDictionary[graphqlLib.languageAstMod.FragmentDefinitionNode],
    operation: graphqlLib.languageAstMod.OperationDefinitionNode,
    parentType: GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]],
    path: ResponsePath,
    returnType: GraphQLOutputType,
    rootValue: js.Any,
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    variableValues: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): GraphQLResolveInfo = {
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
    __obj.asInstanceOf[GraphQLResolveInfo]
  }
}

