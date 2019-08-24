package typings.graphql.typeDefinitionMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.jsutilsPathMod.Path
import typings.graphql.languageAstMod.FieldNode
import typings.graphql.languageAstMod.FragmentDefinitionNode
import typings.graphql.languageAstMod.OperationDefinitionNode
import typings.graphql.typeSchemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLResolveInfo extends js.Object {
  val fieldName: String
  val fieldNodes: js.Array[FieldNode]
  val fragments: StringDictionary[FragmentDefinitionNode]
  val operation: OperationDefinitionNode
  val parentType: GraphQLObjectType[_, _, StringDictionary[_]]
  val path: Path
  val returnType: GraphQLOutputType
  val rootValue: js.Any
  val schema: GraphQLSchema
  val variableValues: StringDictionary[js.Any]
}

object GraphQLResolveInfo {
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
    variableValues: StringDictionary[js.Any]
  ): GraphQLResolveInfo = {
    val __obj = js.Dynamic.literal(fieldName = fieldName, fieldNodes = fieldNodes, fragments = fragments, operation = operation, parentType = parentType, path = path, returnType = returnType.asInstanceOf[js.Any], rootValue = rootValue, schema = schema, variableValues = variableValues)
  
    __obj.asInstanceOf[GraphQLResolveInfo]
  }
}

