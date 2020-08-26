package typings.graphqlCompose.objectTypeComposerMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.FieldDefinitionNode
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.definitionMod.GraphQLOutputType
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphqlCompose.definitionsMod.Extensions
import typings.graphqlCompose.definitionsMod.Thunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql-compose.graphql-compose/lib/ObjectTypeComposer.ComposeFieldConfigAsObject<TSource, TContext, TArgs> & {  resolve :graphql.graphql.GraphQLFieldResolver<TSource, TContext, TArgs>} */
@js.native
trait RelationOptsWithFieldConfig[TSource, TContext, TArgs]
  extends /* key */ StringDictionary[js.Any]
     with RelationOpts[js.Any, TSource, TContext, TArgs] {
  @JSName("$call")
  var $call: js.UndefOr[Unit] = js.native
  var args: js.UndefOr[ComposeFieldConfigArgumentMap[TArgs]] = js.native
  var astNode: js.UndefOr[FieldDefinitionNode | Null] = js.native
  var deprecationReason: js.UndefOr[String | Null] = js.native
  var description: js.UndefOr[String | Null] = js.native
  var extensions: js.UndefOr[Extensions] = js.native
  @JSName("resolve")
  var resolve_Original: (js.UndefOr[GraphQLFieldResolver[TSource, TContext, TArgs]]) with (GraphQLFieldResolver[TSource, TContext, TArgs]) = js.native
  var subscribe: js.UndefOr[GraphQLFieldResolver[TSource, TContext, StringDictionary[_]]] = js.native
  var `type`: (Thunk[ComposeOutputType[_, TContext]]) | GraphQLOutputType = js.native
  def resolve(source: TSource, args: TArgs, context: TContext, info: GraphQLResolveInfo): js.Any = js.native
}

