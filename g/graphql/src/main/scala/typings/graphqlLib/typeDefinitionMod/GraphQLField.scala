package typings
package graphqlLib.typeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLField[TSource, TContext, TArgs] extends js.Object {
  var args: js.Array[GraphQLArgument]
  var astNode: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.FieldDefinitionNode]] = js.undefined
  var deprecationReason: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]] = js.undefined
  var description: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]
  var isDeprecated: js.UndefOr[scala.Boolean] = js.undefined
  var name: java.lang.String
  var resolve: js.UndefOr[GraphQLFieldResolver[TSource, TContext, TArgs]] = js.undefined
  var subscribe: js.UndefOr[GraphQLFieldResolver[TSource, TContext, TArgs]] = js.undefined
  var `type`: GraphQLOutputType
}

object GraphQLField {
  @scala.inline
  def apply[TSource, TContext, TArgs](
    args: js.Array[GraphQLArgument],
    description: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String],
    name: java.lang.String,
    `type`: GraphQLOutputType,
    astNode: graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.FieldDefinitionNode] = null,
    deprecationReason: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String] = null,
    isDeprecated: js.UndefOr[scala.Boolean] = js.undefined,
    resolve: GraphQLFieldResolver[TSource, TContext, TArgs] = null,
    subscribe: GraphQLFieldResolver[TSource, TContext, TArgs] = null
  ): GraphQLField[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("args")(args)
    __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.updateDynamic("name")(name)
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (deprecationReason != null) __obj.updateDynamic("deprecationReason")(deprecationReason.asInstanceOf[js.Any])
    if (!js.isUndefined(isDeprecated)) __obj.updateDynamic("isDeprecated")(isDeprecated)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    if (subscribe != null) __obj.updateDynamic("subscribe")(subscribe)
    __obj.asInstanceOf[GraphQLField[TSource, TContext, TArgs]]
  }
}

