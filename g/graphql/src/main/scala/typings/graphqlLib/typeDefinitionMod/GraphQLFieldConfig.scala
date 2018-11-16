package typings
package graphqlLib.typeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GraphQLFieldConfig[TSource, TContext, TArgs] extends js.Object {
  var args: js.UndefOr[GraphQLFieldConfigArgumentMap] = js.undefined
  var astNode: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.FieldDefinitionNode]] = js.undefined
  var deprecationReason: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]] = js.undefined
  var description: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]] = js.undefined
  var resolve: js.UndefOr[GraphQLFieldResolver[TSource, TContext, TArgs]] = js.undefined
  var subscribe: js.UndefOr[GraphQLFieldResolver[TSource, TContext, TArgs]] = js.undefined
  var `type`: GraphQLOutputType
}

