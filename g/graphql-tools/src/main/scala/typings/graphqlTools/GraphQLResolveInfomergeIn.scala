package typings.graphqlTools

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.FieldNode
import typings.graphql.astMod.FragmentDefinitionNode
import typings.graphql.astMod.OperationDefinitionNode
import typings.graphql.definitionMod.GraphQLObjectType
import typings.graphql.definitionMod.GraphQLOutputType
import typings.graphql.pathMod.Path
import typings.graphql.schemaMod.GraphQLSchema
import typings.graphqlTools.interfacesMod.MergeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql.GraphQLResolveInfo & {  mergeInfo  :graphql-tools.graphql-tools/dist/Interfaces.MergeInfo} */
trait GraphQLResolveInfomergeIn extends js.Object {
  val fieldName: String
  val fieldNodes: js.Array[FieldNode]
  val fragments: StringDictionary[FragmentDefinitionNode]
  var mergeInfo: MergeInfo
  val operation: OperationDefinitionNode
  val parentType: GraphQLObjectType[_, _, StringDictionary[_]]
  val path: Path
  val returnType: GraphQLOutputType
  val rootValue: js.Any
  val schema: GraphQLSchema
  val variableValues: StringDictionary[js.Any]
}

object GraphQLResolveInfomergeIn {
  @scala.inline
  def apply(
    fieldName: String,
    fieldNodes: js.Array[FieldNode],
    fragments: StringDictionary[FragmentDefinitionNode],
    mergeInfo: MergeInfo,
    operation: OperationDefinitionNode,
    parentType: GraphQLObjectType[_, _, StringDictionary[_]],
    path: Path,
    returnType: GraphQLOutputType,
    rootValue: js.Any,
    schema: GraphQLSchema,
    variableValues: StringDictionary[js.Any]
  ): GraphQLResolveInfomergeIn = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], fieldNodes = fieldNodes.asInstanceOf[js.Any], fragments = fragments.asInstanceOf[js.Any], mergeInfo = mergeInfo.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], parentType = parentType.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], rootValue = rootValue.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], variableValues = variableValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLResolveInfomergeIn]
  }
}

