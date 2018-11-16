package typings
package graphqlLib.typeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GraphQLInterfaceTypeConfig[TSource, TContext] extends js.Object {
  var astNode: js.UndefOr[
    graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.InterfaceTypeDefinitionNode]
  ] = js.undefined
  var description: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]] = js.undefined
  var extensionASTNodes: js.UndefOr[
    graphqlLib.tsutilsMaybeMod.Maybe[js.Array[graphqlLib.languageAstMod.InterfaceTypeExtensionNode]]
  ] = js.undefined
  var fields: Thunk[GraphQLFieldConfigMap[TSource, TContext]]
  var name: java.lang.String
  /**
       * Optionally provide a custom type resolver function. If one is not provided,
       * the default implementation will call `isTypeOf` on each implementing
       * Object type.
       */
  var resolveType: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[GraphQLTypeResolver[TSource, TContext]]] = js.undefined
}

