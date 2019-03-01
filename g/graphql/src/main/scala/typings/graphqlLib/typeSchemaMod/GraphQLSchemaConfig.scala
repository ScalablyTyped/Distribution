package typings
package graphqlLib.typeSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLSchemaConfig extends GraphQLSchemaValidationOptions {
  var astNode: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.SchemaDefinitionNode]] = js.undefined
  var directives: js.UndefOr[
    graphqlLib.tsutilsMaybeMod.Maybe[js.Array[graphqlLib.typeDirectivesMod.GraphQLDirective]]
  ] = js.undefined
  var extensionASTNodes: js.UndefOr[
    graphqlLib.tsutilsMaybeMod.Maybe[js.Array[graphqlLib.languageAstMod.SchemaExtensionNode]]
  ] = js.undefined
  var mutation: js.UndefOr[
    graphqlLib.tsutilsMaybeMod.Maybe[
      graphqlLib.typeDefinitionMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]
    ]
  ] = js.undefined
  var query: graphqlLib.tsutilsMaybeMod.Maybe[
    graphqlLib.typeDefinitionMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]
  ]
  var subscription: js.UndefOr[
    graphqlLib.tsutilsMaybeMod.Maybe[
      graphqlLib.typeDefinitionMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]
    ]
  ] = js.undefined
  var types: js.UndefOr[
    graphqlLib.tsutilsMaybeMod.Maybe[js.Array[graphqlLib.typeDefinitionMod.GraphQLNamedType]]
  ] = js.undefined
}

object GraphQLSchemaConfig {
  @scala.inline
  def apply(
    query: graphqlLib.tsutilsMaybeMod.Maybe[
      graphqlLib.typeDefinitionMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]
    ],
    allowedLegacyNames: graphqlLib.tsutilsMaybeMod.Maybe[js.Array[java.lang.String]] = null,
    assumeValid: js.UndefOr[scala.Boolean] = js.undefined,
    astNode: graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.SchemaDefinitionNode] = null,
    directives: graphqlLib.tsutilsMaybeMod.Maybe[js.Array[graphqlLib.typeDirectivesMod.GraphQLDirective]] = null,
    extensionASTNodes: graphqlLib.tsutilsMaybeMod.Maybe[js.Array[graphqlLib.languageAstMod.SchemaExtensionNode]] = null,
    mutation: graphqlLib.tsutilsMaybeMod.Maybe[
      graphqlLib.typeDefinitionMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]
    ] = null,
    subscription: graphqlLib.tsutilsMaybeMod.Maybe[
      graphqlLib.typeDefinitionMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]
    ] = null,
    types: graphqlLib.tsutilsMaybeMod.Maybe[js.Array[graphqlLib.typeDefinitionMod.GraphQLNamedType]] = null
  ): GraphQLSchemaConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (allowedLegacyNames != null) __obj.updateDynamic("allowedLegacyNames")(allowedLegacyNames.asInstanceOf[js.Any])
    if (!js.isUndefined(assumeValid)) __obj.updateDynamic("assumeValid")(assumeValid)
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (extensionASTNodes != null) __obj.updateDynamic("extensionASTNodes")(extensionASTNodes.asInstanceOf[js.Any])
    if (mutation != null) __obj.updateDynamic("mutation")(mutation.asInstanceOf[js.Any])
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLSchemaConfig]
  }
}

