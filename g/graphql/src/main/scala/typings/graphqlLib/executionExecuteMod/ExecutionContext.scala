package typings
package graphqlLib.executionExecuteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionContext extends js.Object {
  var contextValue: js.Any = js.native
  var errors: js.Array[graphqlLib.errorMod.GraphQLError] = js.native
  @JSName("fieldResolver")
  var fieldResolver_Original: graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, org.scalablytyped.runtime.StringDictionary[_]] = js.native
  var fragments: org.scalablytyped.runtime.StringDictionary[graphqlLib.languageAstMod.FragmentDefinitionNode] = js.native
  var operation: graphqlLib.languageAstMod.OperationDefinitionNode = js.native
  var rootValue: js.Any = js.native
  var schema: graphqlLib.typeSchemaMod.GraphQLSchema = js.native
  var variableValues: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def fieldResolver(
    source: js.Any,
    args: org.scalablytyped.runtime.StringDictionary[js.Any],
    context: js.Any,
    info: graphqlLib.typeDefinitionMod.GraphQLResolveInfo
  ): js.Any = js.native
}

