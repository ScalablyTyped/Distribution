package typings.graphql.typeDefinitionMod

import typings.graphql.jsutilsPromiseOrValueMod.PromiseOrValue
import typings.graphql.languageAstMod.InterfaceTypeDefinitionNode
import typings.graphql.languageAstMod.InterfaceTypeExtensionNode
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLInterfaceTypeConfig[TSource, TContext, TArgs] extends js.Object {
  var astNode: js.UndefOr[Maybe[InterfaceTypeDefinitionNode]] = js.undefined
  var description: js.UndefOr[Maybe[String]] = js.undefined
  var extensionASTNodes: js.UndefOr[Maybe[js.Array[InterfaceTypeExtensionNode]]] = js.undefined
  var extensions: js.UndefOr[Maybe[Record[String, _]]] = js.undefined
  var fields: Thunk[GraphQLFieldConfigMap[TSource, TContext, TArgs]]
  var name: String
  /**
    * Optionally provide a custom type resolver function. If one is not provided,
    * the default implementation will call `isTypeOf` on each implementing
    * Object type.
    */
  var resolveType: js.UndefOr[Maybe[GraphQLTypeResolver[TSource, TContext, TArgs]]] = js.undefined
}

object GraphQLInterfaceTypeConfig {
  @scala.inline
  def apply[TSource, TContext, TArgs](
    fields: Thunk[GraphQLFieldConfigMap[TSource, TContext, TArgs]],
    name: String,
    astNode: Maybe[InterfaceTypeDefinitionNode] = null,
    description: Maybe[String] = null,
    extensionASTNodes: Maybe[js.Array[InterfaceTypeExtensionNode]] = null,
    extensions: Maybe[Record[String, _]] = null,
    resolveType: (TSource, TContext, /* info */ GraphQLResolveInfo, /* abstractType */ GraphQLAbstractType) => PromiseOrValue[Maybe[(GraphQLObjectType[TSource, TContext, TArgs]) | String]] = null
  ): GraphQLInterfaceTypeConfig[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name)
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensionASTNodes != null) __obj.updateDynamic("extensionASTNodes")(extensionASTNodes.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (resolveType != null) __obj.updateDynamic("resolveType")(js.Any.fromFunction4(resolveType))
    __obj.asInstanceOf[GraphQLInterfaceTypeConfig[TSource, TContext, TArgs]]
  }
}

