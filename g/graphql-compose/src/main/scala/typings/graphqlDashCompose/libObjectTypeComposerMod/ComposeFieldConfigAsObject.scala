package typings.graphqlDashCompose.libObjectTypeComposerMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.languageAstMod.FieldDefinitionNode
import typings.graphql.typeDefinitionMod.GraphQLFieldResolver
import typings.graphql.typeDefinitionMod.GraphQLOutputType
import typings.graphqlDashCompose.libUtilsDefinitionsMod.Extensions
import typings.graphqlDashCompose.libUtilsDefinitionsMod.Thunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComposeFieldConfigAsObject[TSource, TContext, TArgs]
  extends /* key */ StringDictionary[js.Any] {
  @JSName("$call")
  var $call: js.UndefOr[Unit] = js.native
  var args: js.UndefOr[ComposeFieldConfigArgumentMap[TArgs]] = js.native
  var astNode: js.UndefOr[FieldDefinitionNode | Null] = js.native
  var deprecationReason: js.UndefOr[String | Null] = js.native
  var description: js.UndefOr[String | Null] = js.native
  var extensions: js.UndefOr[Extensions] = js.native
  var resolve: js.UndefOr[GraphQLFieldResolver[TSource, TContext, TArgs]] = js.native
  var subscribe: js.UndefOr[GraphQLFieldResolver[TSource, TContext, StringDictionary[_]]] = js.native
  var `type`: (Thunk[ComposeOutputType[_, TContext]]) | GraphQLOutputType = js.native
}

