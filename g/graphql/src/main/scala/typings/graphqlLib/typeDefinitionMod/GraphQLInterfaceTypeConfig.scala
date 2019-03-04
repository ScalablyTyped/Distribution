package typings
package graphqlLib.typeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLInterfaceTypeConfig[TSource, TContext, TArgs] extends js.Object {
  var astNode: js.UndefOr[
    graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.InterfaceTypeDefinitionNode]
  ] = js.undefined
  var description: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]] = js.undefined
  var extensionASTNodes: js.UndefOr[
    graphqlLib.tsutilsMaybeMod.Maybe[js.Array[graphqlLib.languageAstMod.InterfaceTypeExtensionNode]]
  ] = js.undefined
  var fields: Thunk[GraphQLFieldConfigMap[TSource, TContext, TArgs]]
  var name: java.lang.String
  /**
    * Optionally provide a custom type resolver function. If one is not provided,
    * the default implementation will call `isTypeOf` on each implementing
    * Object type.
    */
  var resolveType: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[GraphQLTypeResolver[TSource, TContext, TArgs]]] = js.undefined
}

object GraphQLInterfaceTypeConfig {
  @scala.inline
  def apply[TSource, TContext, TArgs](
    fields: Thunk[GraphQLFieldConfigMap[TSource, TContext, TArgs]],
    name: java.lang.String,
    astNode: graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.InterfaceTypeDefinitionNode] = null,
    description: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String] = null,
    extensionASTNodes: graphqlLib.tsutilsMaybeMod.Maybe[js.Array[graphqlLib.languageAstMod.InterfaceTypeExtensionNode]] = null,
    resolveType: graphqlLib.tsutilsMaybeMod.Maybe[GraphQLTypeResolver[TSource, TContext, TArgs]] = null
  ): GraphQLInterfaceTypeConfig[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name)
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensionASTNodes != null) __obj.updateDynamic("extensionASTNodes")(extensionASTNodes.asInstanceOf[js.Any])
    if (resolveType != null) __obj.updateDynamic("resolveType")(resolveType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLInterfaceTypeConfig[TSource, TContext, TArgs]]
  }
}

