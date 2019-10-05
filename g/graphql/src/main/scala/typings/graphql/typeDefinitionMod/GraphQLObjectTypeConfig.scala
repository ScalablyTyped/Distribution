package typings.graphql.typeDefinitionMod

import typings.graphql.jsutilsPromiseOrValueMod.PromiseOrValue
import typings.graphql.languageAstMod.ObjectTypeDefinitionNode
import typings.graphql.languageAstMod.ObjectTypeExtensionNode
import typings.graphql.tsutilsMaybeMod.Maybe
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
    astNode: Maybe[ObjectTypeDefinitionNode] = null,
    description: Maybe[String] = null,
    extensionASTNodes: Maybe[js.Array[ObjectTypeExtensionNode]] = null,
    extensions: Maybe[Record[String, _]] = null,
    interfaces: Thunk[Maybe[js.Array[GraphQLInterfaceType]]] = null,
    isTypeOf: (TSource, TContext, /* info */ GraphQLResolveInfo) => PromiseOrValue[Boolean] = null
  ): GraphQLObjectTypeConfig[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name)
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensionASTNodes != null) __obj.updateDynamic("extensionASTNodes")(extensionASTNodes.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (interfaces != null) __obj.updateDynamic("interfaces")(interfaces.asInstanceOf[js.Any])
    if (isTypeOf != null) __obj.updateDynamic("isTypeOf")(js.Any.fromFunction3(isTypeOf))
    __obj.asInstanceOf[GraphQLObjectTypeConfig[TSource, TContext, TArgs]]
  }
}

