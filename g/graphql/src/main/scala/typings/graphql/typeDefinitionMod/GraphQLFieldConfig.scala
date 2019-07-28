package typings.graphql.typeDefinitionMod

import typings.graphql.languageAstMod.FieldDefinitionNode
import typings.graphql.tsutilsMaybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLFieldConfig[TSource, TContext, TArgs] extends js.Object {
  var args: js.UndefOr[GraphQLFieldConfigArgumentMap] = js.undefined
  var astNode: js.UndefOr[Maybe[FieldDefinitionNode]] = js.undefined
  var deprecationReason: js.UndefOr[Maybe[String]] = js.undefined
  var description: js.UndefOr[Maybe[String]] = js.undefined
  var resolve: js.UndefOr[GraphQLFieldResolver[TSource, TContext, TArgs]] = js.undefined
  var subscribe: js.UndefOr[GraphQLFieldResolver[TSource, TContext, TArgs]] = js.undefined
  var `type`: GraphQLOutputType
}

object GraphQLFieldConfig {
  @scala.inline
  def apply[TSource, TContext, TArgs](
    `type`: GraphQLOutputType,
    args: GraphQLFieldConfigArgumentMap = null,
    astNode: Maybe[FieldDefinitionNode] = null,
    deprecationReason: Maybe[String] = null,
    description: Maybe[String] = null,
    resolve: GraphQLFieldResolver[TSource, TContext, TArgs] = null,
    subscribe: GraphQLFieldResolver[TSource, TContext, TArgs] = null
  ): GraphQLFieldConfig[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args)
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (deprecationReason != null) __obj.updateDynamic("deprecationReason")(deprecationReason.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    if (subscribe != null) __obj.updateDynamic("subscribe")(subscribe)
    __obj.asInstanceOf[GraphQLFieldConfig[TSource, TContext, TArgs]]
  }
}

