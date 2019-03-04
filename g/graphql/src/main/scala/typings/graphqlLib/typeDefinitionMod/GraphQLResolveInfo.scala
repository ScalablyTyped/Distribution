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
    val __obj = js.Dynamic.literal(fieldName = fieldName, fieldNodes = fieldNodes, fragments = fragments, operation = operation, parentType = parentType, path = path, returnType = returnType.asInstanceOf[js.Any], rootValue = rootValue, schema = schema, variableValues = variableValues)
  
    __obj.asInstanceOf[GraphQLResolveInfo]
  }
}

