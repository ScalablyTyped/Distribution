package typings.graphql.schemaMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.SchemaDefinitionNode
import typings.graphql.astMod.SchemaExtensionNode
import typings.graphql.definitionMod.GraphQLNamedType
import typings.graphql.definitionMod.GraphQLObjectType
import typings.graphql.directivesMod.GraphQLDirective
import typings.graphql.maybeMod.Maybe
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
    allowedLegacyNames: js.UndefOr[Null | Maybe[js.Array[String]]] = js.undefined,
    assumeValid: js.UndefOr[Boolean] = js.undefined,
    astNode: js.UndefOr[Null | Maybe[SchemaDefinitionNode]] = js.undefined,
    directives: js.UndefOr[Null | Maybe[js.Array[GraphQLDirective]]] = js.undefined,
    extensionASTNodes: js.UndefOr[Null | Maybe[js.Array[SchemaExtensionNode]]] = js.undefined,
    extensions: js.UndefOr[Null | (Maybe[Record[String, _]])] = js.undefined,
    mutation: js.UndefOr[Null | (Maybe[GraphQLObjectType[_, _, StringDictionary[_]]])] = js.undefined,
    query: js.UndefOr[Null | (Maybe[GraphQLObjectType[_, _, StringDictionary[_]]])] = js.undefined,
    subscription: js.UndefOr[Null | (Maybe[GraphQLObjectType[_, _, StringDictionary[_]]])] = js.undefined,
    types: js.UndefOr[Null | Maybe[js.Array[GraphQLNamedType]]] = js.undefined
  ): GraphQLSchemaConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowedLegacyNames)) __obj.updateDynamic("allowedLegacyNames")(allowedLegacyNames.asInstanceOf[js.Any])
    if (!js.isUndefined(assumeValid)) __obj.updateDynamic("assumeValid")(assumeValid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(astNode)) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (!js.isUndefined(directives)) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (!js.isUndefined(extensionASTNodes)) __obj.updateDynamic("extensionASTNodes")(extensionASTNodes.asInstanceOf[js.Any])
    if (!js.isUndefined(extensions)) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (!js.isUndefined(mutation)) __obj.updateDynamic("mutation")(mutation.asInstanceOf[js.Any])
    if (!js.isUndefined(query)) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (!js.isUndefined(subscription)) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    if (!js.isUndefined(types)) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLSchemaConfig]
  }
}

