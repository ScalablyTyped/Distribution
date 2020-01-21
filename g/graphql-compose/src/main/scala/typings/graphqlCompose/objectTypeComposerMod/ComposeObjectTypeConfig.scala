package typings.graphqlCompose.objectTypeComposerMod

import typings.graphql.definitionMod.GraphQLIsTypeOfFn
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.promiseOrValueMod.PromiseOrValue
import typings.graphqlCompose.definitionsMod.Extensions
import typings.graphqlCompose.definitionsMod.Thunk
import typings.graphqlCompose.interfaceTypeComposerMod.ComposeInterfaceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeObjectTypeConfig[TSource, TContext] extends js.Object {
  var description: js.UndefOr[String | Null] = js.undefined
  var extensions: js.UndefOr[Extensions] = js.undefined
  var fields: js.UndefOr[Thunk[ComposeFieldConfigMap[TSource, TContext]]] = js.undefined
  var interfaces: js.UndefOr[Thunk[js.Array[ComposeInterfaceType] | Null]] = js.undefined
  var isIntrospection: js.UndefOr[Boolean] = js.undefined
  var isTypeOf: js.UndefOr[(GraphQLIsTypeOfFn[TSource, TContext]) | Null] = js.undefined
  var name: String
}

object ComposeObjectTypeConfig {
  @scala.inline
  def apply[TSource, TContext](
    name: String,
    description: String = null,
    extensions: Extensions = null,
    fields: Thunk[ComposeFieldConfigMap[TSource, TContext]] = null,
    interfaces: Thunk[js.Array[ComposeInterfaceType] | Null] = null,
    isIntrospection: js.UndefOr[Boolean] = js.undefined,
    isTypeOf: (TSource, TContext, /* info */ GraphQLResolveInfo) => PromiseOrValue[Boolean] = null
  ): ComposeObjectTypeConfig[TSource, TContext] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (interfaces != null) __obj.updateDynamic("interfaces")(interfaces.asInstanceOf[js.Any])
    if (!js.isUndefined(isIntrospection)) __obj.updateDynamic("isIntrospection")(isIntrospection.asInstanceOf[js.Any])
    if (isTypeOf != null) __obj.updateDynamic("isTypeOf")(js.Any.fromFunction3(isTypeOf))
    __obj.asInstanceOf[ComposeObjectTypeConfig[TSource, TContext]]
  }
}

