package typings.graphql.executionExecuteMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.errorMod.GraphQLError
import typings.graphql.languageAstMod.FragmentDefinitionNode
import typings.graphql.languageAstMod.OperationDefinitionNode
import typings.graphql.typeDefinitionMod.GraphQLFieldResolver
import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
import typings.graphql.typeSchemaMod.GraphQLSchema
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

