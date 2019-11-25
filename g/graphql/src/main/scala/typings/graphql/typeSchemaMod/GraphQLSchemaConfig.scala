package typings.graphql.typeSchemaMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.languageAstMod.SchemaDefinitionNode
import typings.graphql.languageAstMod.SchemaExtensionNode
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.graphql.typeDefinitionMod.GraphQLNamedType
import typings.graphql.typeDefinitionMod.GraphQLObjectType
import typings.graphql.typeDirectivesMod.GraphQLDirective
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLSchemaConfig extends GraphQLSchemaValidationOptions {
  var astNode: js.UndefOr[Maybe[SchemaDefinitionNode]] = js.undefined
  var directives: js.UndefOr[Maybe[js.Array[GraphQLDirective]]] = js.undefined
  var extensionASTNodes: js.UndefOr[Maybe[js.Array[SchemaExtensionNode]]] = js.undefined
  var extensions: js.UndefOr[Maybe[Record[String, _]]] = js.undefined
  var mutation: js.UndefOr[Maybe[GraphQLObjectType[_, _, StringDictionary[_]]]] = js.undefined
  var query: Maybe[GraphQLObjectType[_, _, StringDictionary[_]]]
  var subscription: js.UndefOr[Maybe[GraphQLObjectType[_, _, StringDictionary[_]]]] = js.undefined
  var types: js.UndefOr[Maybe[js.Array[GraphQLNamedType]]] = js.undefined
}

object GraphQLSchemaConfig {
  @scala.inline
  def apply(
    allowedLegacyNames: Maybe[js.Array[String]] = null,
    assumeValid: js.UndefOr[Boolean] = js.undefined,
    astNode: Maybe[SchemaDefinitionNode] = null,
    directives: Maybe[js.Array[GraphQLDirective]] = null,
    extensionASTNodes: Maybe[js.Array[SchemaExtensionNode]] = null,
    extensions: Maybe[Record[String, _]] = null,
    mutation: Maybe[GraphQLObjectType[_, _, StringDictionary[_]]] = null,
    query: Maybe[GraphQLObjectType[_, _, StringDictionary[_]]] = null,
    subscription: Maybe[GraphQLObjectType[_, _, StringDictionary[_]]] = null,
    types: Maybe[js.Array[GraphQLNamedType]] = null
  ): GraphQLSchemaConfig = {
    val __obj = js.Dynamic.literal()
    if (allowedLegacyNames != null) __obj.updateDynamic("allowedLegacyNames")(allowedLegacyNames.asInstanceOf[js.Any])
    if (!js.isUndefined(assumeValid)) __obj.updateDynamic("assumeValid")(assumeValid.asInstanceOf[js.Any])
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (extensionASTNodes != null) __obj.updateDynamic("extensionASTNodes")(extensionASTNodes.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (mutation != null) __obj.updateDynamic("mutation")(mutation.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLSchemaConfig]
  }
}

