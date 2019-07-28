package typings.graphql.typeDefinitionMod

import typings.graphql.languageAstMod.InterfaceTypeDefinitionNode
import typings.graphql.languageAstMod.InterfaceTypeExtensionNode
import typings.graphql.tsutilsMaybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLInterfaceTypeConfig[TSource, TContext, TArgs] extends js.Object {
  var astNode: js.UndefOr[Maybe[InterfaceTypeDefinitionNode]] = js.undefined
  var description: js.UndefOr[Maybe[String]] = js.undefined
  var extensionASTNodes: js.UndefOr[Maybe[js.Array[InterfaceTypeExtensionNode]]] = js.undefined
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
    resolveType: Maybe[GraphQLTypeResolver[TSource, TContext, TArgs]] = null
  ): GraphQLInterfaceTypeConfig[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name)
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensionASTNodes != null) __obj.updateDynamic("extensionASTNodes")(extensionASTNodes.asInstanceOf[js.Any])
    if (resolveType != null) __obj.updateDynamic("resolveType")(resolveType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLInterfaceTypeConfig[TSource, TContext, TArgs]]
  }
}

