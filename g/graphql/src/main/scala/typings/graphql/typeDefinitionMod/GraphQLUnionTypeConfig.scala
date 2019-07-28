package typings.graphql.typeDefinitionMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.languageAstMod.UnionTypeDefinitionNode
import typings.graphql.languageAstMod.UnionTypeExtensionNode
import typings.graphql.tsutilsMaybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLUnionTypeConfig[TSource, TContext] extends js.Object {
  var astNode: js.UndefOr[Maybe[UnionTypeDefinitionNode]] = js.undefined
  var description: js.UndefOr[Maybe[String]] = js.undefined
  var extensionASTNodes: js.UndefOr[Maybe[js.Array[UnionTypeExtensionNode]]] = js.undefined
  var name: String
  /**
    * Optionally provide a custom type resolver function. If one is not provided,
    * the default implementation will call `isTypeOf` on each implementing
    * Object type.
    */
  var resolveType: js.UndefOr[Maybe[GraphQLTypeResolver[TSource, TContext, StringDictionary[_]]]] = js.undefined
  var types: Thunk[js.Array[GraphQLObjectType[_, _, StringDictionary[_]]]]
}

object GraphQLUnionTypeConfig {
  @scala.inline
  def apply[TSource, TContext](
    name: String,
    types: Thunk[js.Array[GraphQLObjectType[_, _, StringDictionary[_]]]],
    astNode: Maybe[UnionTypeDefinitionNode] = null,
    description: Maybe[String] = null,
    extensionASTNodes: Maybe[js.Array[UnionTypeExtensionNode]] = null,
    resolveType: Maybe[GraphQLTypeResolver[TSource, TContext, StringDictionary[_]]] = null
  ): GraphQLUnionTypeConfig[TSource, TContext] = {
    val __obj = js.Dynamic.literal(name = name, types = types.asInstanceOf[js.Any])
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensionASTNodes != null) __obj.updateDynamic("extensionASTNodes")(extensionASTNodes.asInstanceOf[js.Any])
    if (resolveType != null) __obj.updateDynamic("resolveType")(resolveType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLUnionTypeConfig[TSource, TContext]]
  }
}

