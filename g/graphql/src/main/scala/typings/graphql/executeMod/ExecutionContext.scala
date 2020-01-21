package typings.graphql.executeMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.FragmentDefinitionNode
import typings.graphql.astMod.OperationDefinitionNode
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.graphQLErrorMod.GraphQLError
import typings.graphql.schemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionContext extends js.Object {
  var contextValue: js.Any = js.native
  var errors: js.Array[GraphQLError] = js.native
  @JSName("fieldResolver")
  var fieldResolver_Original: GraphQLFieldResolver[_, _, StringDictionary[_]] = js.native
  var fragments: StringDictionary[FragmentDefinitionNode] = js.native
  var operation: OperationDefinitionNode = js.native
  var rootValue: js.Any = js.native
  var schema: GraphQLSchema = js.native
  var variableValues: StringDictionary[js.Any] = js.native
  def fieldResolver(source: js.Any, args: StringDictionary[js.Any], context: js.Any, info: GraphQLResolveInfo): js.Any = js.native
}

