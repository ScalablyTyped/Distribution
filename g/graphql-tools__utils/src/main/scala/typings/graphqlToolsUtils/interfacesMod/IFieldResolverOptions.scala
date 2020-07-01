package typings.graphqlToolsUtils.interfacesMod

import typings.graphql.astMod.FieldDefinitionNode
import typings.graphql.definitionMod.GraphQLArgument
import typings.graphql.definitionMod.GraphQLOutputType
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFieldResolverOptions[TSource, TContext, TArgs] extends js.Object {
  var args: js.UndefOr[js.Array[GraphQLArgument]] = js.undefined
  var astNode: js.UndefOr[FieldDefinitionNode] = js.undefined
  var deprecationReason: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var extensions: js.UndefOr[Record[String, _]] = js.undefined
  var isDeprecated: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var resolve: js.UndefOr[IFieldResolver[TSource, TContext, TArgs, _]] = js.undefined
  var subscribe: js.UndefOr[IFieldResolver[TSource, TContext, TArgs, _]] = js.undefined
  var `type`: js.UndefOr[GraphQLOutputType] = js.undefined
}

object IFieldResolverOptions {
  @scala.inline
  def apply[TSource, TContext, TArgs](
    args: js.Array[GraphQLArgument] = null,
    astNode: FieldDefinitionNode = null,
    deprecationReason: String = null,
    description: String = null,
    extensions: Record[String, _] = null,
    isDeprecated: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    resolve: (TSource, TArgs, TContext, /* info */ GraphQLResolveInfo) => _ = null,
    subscribe: (TSource, TArgs, TContext, /* info */ GraphQLResolveInfo) => _ = null,
    `type`: GraphQLOutputType = null
  ): IFieldResolverOptions[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (deprecationReason != null) __obj.updateDynamic("deprecationReason")(deprecationReason.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (!js.isUndefined(isDeprecated)) __obj.updateDynamic("isDeprecated")(isDeprecated.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(js.Any.fromFunction4(resolve))
    if (subscribe != null) __obj.updateDynamic("subscribe")(js.Any.fromFunction4(subscribe))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldResolverOptions[TSource, TContext, TArgs]]
  }
}

