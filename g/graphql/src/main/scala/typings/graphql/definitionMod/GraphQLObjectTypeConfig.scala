package typings.graphql.definitionMod

import typings.graphql.astMod.ObjectTypeDefinitionNode
import typings.graphql.astMod.ObjectTypeExtensionNode
import typings.graphql.maybeMod.Maybe
import typings.graphql.promiseOrValueMod.PromiseOrValue
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLObjectTypeConfig[TSource, TContext, TArgs] extends js.Object {
  var astNode: js.UndefOr[Maybe[ObjectTypeDefinitionNode]] = js.undefined
  var description: js.UndefOr[Maybe[String]] = js.undefined
  var extensionASTNodes: js.UndefOr[Maybe[js.Array[ObjectTypeExtensionNode]]] = js.undefined
  var extensions: js.UndefOr[Maybe[Record[String, _]]] = js.undefined
  var fields: Thunk[GraphQLFieldConfigMap[TSource, TContext, TArgs]]
  var interfaces: js.UndefOr[Thunk[Maybe[js.Array[GraphQLInterfaceType]]]] = js.undefined
  var isTypeOf: js.UndefOr[Maybe[GraphQLIsTypeOfFn[TSource, TContext]]] = js.undefined
  var name: String
}

object GraphQLObjectTypeConfig {
  @scala.inline
  def apply[TSource, TContext, TArgs](
    fields: Thunk[GraphQLFieldConfigMap[TSource, TContext, TArgs]],
    name: String,
    astNode: js.UndefOr[Null | Maybe[ObjectTypeDefinitionNode]] = js.undefined,
    description: js.UndefOr[Null | Maybe[String]] = js.undefined,
    extensionASTNodes: js.UndefOr[Null | Maybe[js.Array[ObjectTypeExtensionNode]]] = js.undefined,
    extensions: js.UndefOr[Null | (Maybe[Record[String, _]])] = js.undefined,
    interfaces: js.UndefOr[Null | Thunk[Maybe[js.Array[GraphQLInterfaceType]]]] = js.undefined,
    isTypeOf: js.UndefOr[
      Null | ((TSource, TContext, /* info */ GraphQLResolveInfo) => PromiseOrValue[Boolean])
    ] = js.undefined
  ): GraphQLObjectTypeConfig[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(astNode)) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(extensionASTNodes)) __obj.updateDynamic("extensionASTNodes")(extensionASTNodes.asInstanceOf[js.Any])
    if (!js.isUndefined(extensions)) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (!js.isUndefined(interfaces)) __obj.updateDynamic("interfaces")(interfaces.asInstanceOf[js.Any])
    if (!js.isUndefined(isTypeOf)) __obj.updateDynamic("isTypeOf")(if (isTypeOf != null) js.Any.fromFunction3(isTypeOf.asInstanceOf[(TSource, TContext, /* info */ GraphQLResolveInfo) => PromiseOrValue[Boolean]]) else null)
    __obj.asInstanceOf[GraphQLObjectTypeConfig[TSource, TContext, TArgs]]
  }
}

