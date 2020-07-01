package typings.graphqlToolsUtils.interfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.FragmentDefinitionNode
import typings.graphql.astMod.OperationDefinitionNode
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.mod.GraphQLError
import typings.graphql.mod.GraphQLSchema
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLExecutionContext extends js.Object {
  var contextValue: js.Any = js.native
  var errors: js.Array[GraphQLError] = js.native
  @JSName("fieldResolver")
  var fieldResolver_Original: GraphQLFieldResolver[_, _, StringDictionary[_]] = js.native
  var fragments: Record[String, FragmentDefinitionNode] = js.native
  var operation: OperationDefinitionNode = js.native
  var rootValue: js.Any = js.native
  var schema: GraphQLSchema = js.native
  var variableValues: Record[String, _] = js.native
  def fieldResolver(source: js.Any, args: StringDictionary[js.Any], context: js.Any, info: GraphQLResolveInfo): js.Any = js.native
}

