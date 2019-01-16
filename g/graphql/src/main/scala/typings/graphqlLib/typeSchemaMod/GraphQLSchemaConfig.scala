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
    graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.typeDefinitionMod.GraphQLObjectType[_, _]]
  ] = js.undefined
  var query: graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.typeDefinitionMod.GraphQLObjectType[_, _]]
  var subscription: js.UndefOr[
    graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.typeDefinitionMod.GraphQLObjectType[_, _]]
  ] = js.undefined
  var types: js.UndefOr[
    graphqlLib.tsutilsMaybeMod.Maybe[js.Array[graphqlLib.typeDefinitionMod.GraphQLNamedType]]
  ] = js.undefined
}

