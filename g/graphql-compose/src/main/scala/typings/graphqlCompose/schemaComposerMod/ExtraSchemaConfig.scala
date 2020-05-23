package typings.graphqlCompose.schemaComposerMod

import typings.graphql.astMod.SchemaDefinitionNode
import typings.graphql.definitionMod.GraphQLNamedType
import typings.graphql.mod.GraphQLDirective
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtraSchemaConfig extends js.Object {
  var astNode: js.UndefOr[SchemaDefinitionNode | Null] = js.undefined
  var directives: js.UndefOr[js.Array[GraphQLDirective] | Null] = js.undefined
  var types: js.UndefOr[js.Array[GraphQLNamedType] | Null] = js.undefined
}

object ExtraSchemaConfig {
  @scala.inline
  def apply(
    astNode: js.UndefOr[Null | SchemaDefinitionNode] = js.undefined,
    directives: js.UndefOr[Null | js.Array[GraphQLDirective]] = js.undefined,
    types: js.UndefOr[Null | js.Array[GraphQLNamedType]] = js.undefined
  ): ExtraSchemaConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(astNode)) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (!js.isUndefined(directives)) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (!js.isUndefined(types)) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraSchemaConfig]
  }
}

