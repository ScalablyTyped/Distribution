package typings
package graphqlLib.typeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLObjectTypeConfig[TSource, TContext, TArgs] extends js.Object {
  var astNode: js.UndefOr[
    graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.ObjectTypeDefinitionNode]
  ] = js.undefined
  var description: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]] = js.undefined
  var extensionASTNodes: js.UndefOr[
    graphqlLib.tsutilsMaybeMod.Maybe[js.Array[graphqlLib.languageAstMod.ObjectTypeExtensionNode]]
  ] = js.undefined
  var fields: Thunk[GraphQLFieldConfigMap[TSource, TContext, TArgs]]
  var interfaces: js.UndefOr[Thunk[graphqlLib.tsutilsMaybeMod.Maybe[js.Array[GraphQLInterfaceType]]]] = js.undefined
  var isTypeOf: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[GraphQLIsTypeOfFn[TSource, TContext]]] = js.undefined
  var name: java.lang.String
}

object GraphQLObjectTypeConfig {
  @scala.inline
  def apply[TSource, TContext, TArgs](
    fields: Thunk[GraphQLFieldConfigMap[TSource, TContext, TArgs]],
    name: java.lang.String,
    astNode: graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.ObjectTypeDefinitionNode] = null,
    description: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String] = null,
    extensionASTNodes: graphqlLib.tsutilsMaybeMod.Maybe[js.Array[graphqlLib.languageAstMod.ObjectTypeExtensionNode]] = null,
    interfaces: Thunk[graphqlLib.tsutilsMaybeMod.Maybe[js.Array[GraphQLInterfaceType]]] = null,
    isTypeOf: graphqlLib.tsutilsMaybeMod.Maybe[GraphQLIsTypeOfFn[TSource, TContext]] = null
  ): GraphQLObjectTypeConfig[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name)
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensionASTNodes != null) __obj.updateDynamic("extensionASTNodes")(extensionASTNodes.asInstanceOf[js.Any])
    if (interfaces != null) __obj.updateDynamic("interfaces")(interfaces.asInstanceOf[js.Any])
    if (isTypeOf != null) __obj.updateDynamic("isTypeOf")(isTypeOf.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLObjectTypeConfig[TSource, TContext, TArgs]]
  }
}

