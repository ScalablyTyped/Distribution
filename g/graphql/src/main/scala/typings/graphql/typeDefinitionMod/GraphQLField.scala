package typings.graphql.typeDefinitionMod

import typings.graphql.languageAstMod.FieldDefinitionNode
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLField[TSource, TContext, TArgs] extends js.Object {
  var args: js.Array[GraphQLArgument]
  var astNode: js.UndefOr[Maybe[FieldDefinitionNode]] = js.undefined
  var deprecationReason: js.UndefOr[Maybe[String]] = js.undefined
  var description: Maybe[String]
  var extensions: Maybe[Record[String, _]]
  var isDeprecated: js.UndefOr[Boolean] = js.undefined
  var name: String
  var resolve: js.UndefOr[GraphQLFieldResolver[TSource, TContext, TArgs]] = js.undefined
  var subscribe: js.UndefOr[GraphQLFieldResolver[TSource, TContext, TArgs]] = js.undefined
  var `type`: GraphQLOutputType
}

object GraphQLField {
  @scala.inline
  def apply[TSource, TContext, TArgs](
    args: js.Array[GraphQLArgument],
    description: Maybe[String],
    extensions: Maybe[Record[String, _]],
    name: String,
    `type`: GraphQLOutputType,
    astNode: Maybe[FieldDefinitionNode] = null,
    deprecationReason: Maybe[String] = null,
    isDeprecated: js.UndefOr[Boolean] = js.undefined,
    resolve: GraphQLFieldResolver[TSource, TContext, TArgs] = null,
    subscribe: GraphQLFieldResolver[TSource, TContext, TArgs] = null
  ): GraphQLField[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal(args = args, description = description.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], name = name)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (deprecationReason != null) __obj.updateDynamic("deprecationReason")(deprecationReason.asInstanceOf[js.Any])
    if (!js.isUndefined(isDeprecated)) __obj.updateDynamic("isDeprecated")(isDeprecated)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    if (subscribe != null) __obj.updateDynamic("subscribe")(subscribe)
    __obj.asInstanceOf[GraphQLField[TSource, TContext, TArgs]]
  }
}

