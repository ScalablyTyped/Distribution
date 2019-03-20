package typings
package graphqlDashComposeLib.libTypeComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeObjectTypeConfig[TSource, TContext] extends js.Object {
  var description: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var fields: js.UndefOr[
    graphqlDashComposeLib.libUtilsDefinitionsMod.Thunk[ComposeFieldConfigMap[TSource, TContext, _]]
  ] = js.undefined
  var interfaces: js.UndefOr[
    graphqlDashComposeLib.libUtilsDefinitionsMod.Thunk[js.Array[graphqlLib.graphqlMod.GraphQLInterfaceType] | scala.Null]
  ] = js.undefined
  var isIntrospection: js.UndefOr[scala.Boolean] = js.undefined
  var isTypeOf: js.UndefOr[(graphqlLib.typeDefinitionMod.GraphQLIsTypeOfFn[TSource, TContext]) | scala.Null] = js.undefined
  var name: java.lang.String
}

object ComposeObjectTypeConfig {
  @scala.inline
  def apply[TSource, TContext](
    name: java.lang.String,
    description: java.lang.String = null,
    fields: graphqlDashComposeLib.libUtilsDefinitionsMod.Thunk[ComposeFieldConfigMap[TSource, TContext, _]] = null,
    interfaces: graphqlDashComposeLib.libUtilsDefinitionsMod.Thunk[js.Array[graphqlLib.graphqlMod.GraphQLInterfaceType] | scala.Null] = null,
    isIntrospection: js.UndefOr[scala.Boolean] = js.undefined,
    isTypeOf: graphqlLib.typeDefinitionMod.GraphQLIsTypeOfFn[TSource, TContext] = null
  ): ComposeObjectTypeConfig[TSource, TContext] = {
    val __obj = js.Dynamic.literal(name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (interfaces != null) __obj.updateDynamic("interfaces")(interfaces.asInstanceOf[js.Any])
    if (!js.isUndefined(isIntrospection)) __obj.updateDynamic("isIntrospection")(isIntrospection)
    if (isTypeOf != null) __obj.updateDynamic("isTypeOf")(isTypeOf)
    __obj.asInstanceOf[ComposeObjectTypeConfig[TSource, TContext]]
  }
}

