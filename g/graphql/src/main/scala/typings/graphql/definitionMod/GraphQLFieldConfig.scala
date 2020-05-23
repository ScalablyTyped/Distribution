package typings.graphql.definitionMod

import typings.graphql.astMod.FieldDefinitionNode
import typings.graphql.maybeMod.Maybe
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLFieldConfig[TSource, TContext, TArgs] extends js.Object {
  var args: js.UndefOr[GraphQLFieldConfigArgumentMap] = js.undefined
  var astNode: js.UndefOr[Maybe[FieldDefinitionNode]] = js.undefined
  var deprecationReason: js.UndefOr[Maybe[String]] = js.undefined
  var description: js.UndefOr[Maybe[String]] = js.undefined
  var extensions: js.UndefOr[Maybe[Record[String, _]]] = js.undefined
  var resolve: js.UndefOr[GraphQLFieldResolver[TSource, TContext, TArgs]] = js.undefined
  var subscribe: js.UndefOr[GraphQLFieldResolver[TSource, TContext, TArgs]] = js.undefined
  var `type`: GraphQLOutputType
}

object GraphQLFieldConfig {
  @scala.inline
  def apply[TSource, TContext, TArgs](
    `type`: GraphQLOutputType,
    args: GraphQLFieldConfigArgumentMap = null,
    astNode: js.UndefOr[Null | Maybe[FieldDefinitionNode]] = js.undefined,
    deprecationReason: js.UndefOr[Null | Maybe[String]] = js.undefined,
    description: js.UndefOr[Null | Maybe[String]] = js.undefined,
    extensions: js.UndefOr[Null | (Maybe[Record[String, _]])] = js.undefined,
    resolve: (TSource, TArgs, TContext, /* info */ GraphQLResolveInfo) => js.Any = null,
    subscribe: (TSource, TArgs, TContext, /* info */ GraphQLResolveInfo) => js.Any = null
  ): GraphQLFieldConfig[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(astNode)) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecationReason)) __obj.updateDynamic("deprecationReason")(deprecationReason.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(extensions)) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(js.Any.fromFunction4(resolve))
    if (subscribe != null) __obj.updateDynamic("subscribe")(js.Any.fromFunction4(subscribe))
    __obj.asInstanceOf[GraphQLFieldConfig[TSource, TContext, TArgs]]
  }
}

