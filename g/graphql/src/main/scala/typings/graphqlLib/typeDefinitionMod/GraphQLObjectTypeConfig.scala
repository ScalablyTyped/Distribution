package typings
package graphqlLib.typeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GraphQLObjectTypeConfig[TSource, TContext] extends js.Object {
  var astNode: js.UndefOr[
    graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.ObjectTypeDefinitionNode]
  ] = js.undefined
  var description: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]] = js.undefined
  var extensionASTNodes: js.UndefOr[
    graphqlLib.tsutilsMaybeMod.Maybe[js.Array[graphqlLib.languageAstMod.ObjectTypeExtensionNode]]
  ] = js.undefined
  var fields: Thunk[GraphQLFieldConfigMap[TSource, TContext]]
  var interfaces: js.UndefOr[Thunk[graphqlLib.tsutilsMaybeMod.Maybe[js.Array[GraphQLInterfaceType]]]] = js.undefined
  var isTypeOf: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[GraphQLIsTypeOfFn[TSource, TContext]]] = js.undefined
  var name: java.lang.String
}

