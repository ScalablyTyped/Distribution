package typings
package graphqlLib.typeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLUnionTypeConfig[TSource, TContext] extends js.Object {
  var astNode: js.UndefOr[
    graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.UnionTypeDefinitionNode]
  ] = js.undefined
  var description: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]] = js.undefined
  var extensionASTNodes: js.UndefOr[
    graphqlLib.tsutilsMaybeMod.Maybe[js.Array[graphqlLib.languageAstMod.UnionTypeExtensionNode]]
  ] = js.undefined
  var name: java.lang.String
  /**
    * Optionally provide a custom type resolver function. If one is not provided,
    * the default implementation will call `isTypeOf` on each implementing
    * Object type.
    */
  var resolveType: js.UndefOr[
    graphqlLib.tsutilsMaybeMod.Maybe[
      GraphQLTypeResolver[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]]
    ]
  ] = js.undefined
  var types: Thunk[js.Array[GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]]]
}

object GraphQLUnionTypeConfig {
  @scala.inline
  def apply[TSource, TContext](
    name: java.lang.String,
    types: Thunk[js.Array[GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]]],
    astNode: graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.UnionTypeDefinitionNode] = null,
    description: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String] = null,
    extensionASTNodes: graphqlLib.tsutilsMaybeMod.Maybe[js.Array[graphqlLib.languageAstMod.UnionTypeExtensionNode]] = null,
    resolveType: graphqlLib.tsutilsMaybeMod.Maybe[
      GraphQLTypeResolver[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]]
    ] = null
  ): GraphQLUnionTypeConfig[TSource, TContext] = {
    val __obj = js.Dynamic.literal(name = name, types = types.asInstanceOf[js.Any])
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensionASTNodes != null) __obj.updateDynamic("extensionASTNodes")(extensionASTNodes.asInstanceOf[js.Any])
    if (resolveType != null) __obj.updateDynamic("resolveType")(resolveType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLUnionTypeConfig[TSource, TContext]]
  }
}

