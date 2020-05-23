package typings.graphql.directivesMod

import typings.graphql.astMod.DirectiveDefinitionNode
import typings.graphql.definitionMod.GraphQLFieldConfigArgumentMap
import typings.graphql.directiveLocationMod.DirectiveLocationEnum
import typings.graphql.maybeMod.Maybe
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLDirectiveConfig extends js.Object {
  var args: js.UndefOr[Maybe[GraphQLFieldConfigArgumentMap]] = js.undefined
  var astNode: js.UndefOr[Maybe[DirectiveDefinitionNode]] = js.undefined
  var description: js.UndefOr[Maybe[String]] = js.undefined
  var extensions: js.UndefOr[Maybe[Record[String, _]]] = js.undefined
  var isRepeatable: js.UndefOr[Maybe[Boolean]] = js.undefined
  var locations: js.Array[DirectiveLocationEnum]
  var name: String
}

object GraphQLDirectiveConfig {
  @scala.inline
  def apply(
    locations: js.Array[DirectiveLocationEnum],
    name: String,
    args: js.UndefOr[Null | Maybe[GraphQLFieldConfigArgumentMap]] = js.undefined,
    astNode: js.UndefOr[Null | Maybe[DirectiveDefinitionNode]] = js.undefined,
    description: js.UndefOr[Null | Maybe[String]] = js.undefined,
    extensions: js.UndefOr[Null | (Maybe[Record[String, _]])] = js.undefined,
    isRepeatable: js.UndefOr[Null | Maybe[Boolean]] = js.undefined
  ): GraphQLDirectiveConfig = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(args)) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(astNode)) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(extensions)) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (!js.isUndefined(isRepeatable)) __obj.updateDynamic("isRepeatable")(isRepeatable.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLDirectiveConfig]
  }
}

