package typings.graphql.typeDirectivesMod

import typings.graphql.languageAstMod.DirectiveDefinitionNode
import typings.graphql.languageDirectiveLocationMod.DirectiveLocationEnum
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.graphql.typeDefinitionMod.GraphQLFieldConfigArgumentMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLDirectiveConfig extends js.Object {
  var args: js.UndefOr[Maybe[GraphQLFieldConfigArgumentMap]] = js.undefined
  var astNode: js.UndefOr[Maybe[DirectiveDefinitionNode]] = js.undefined
  var description: js.UndefOr[Maybe[String]] = js.undefined
  var isRepeatable: js.UndefOr[Maybe[Boolean]] = js.undefined
  var locations: js.Array[DirectiveLocationEnum]
  var name: String
}

object GraphQLDirectiveConfig {
  @scala.inline
  def apply(
    locations: js.Array[DirectiveLocationEnum],
    name: String,
    args: Maybe[GraphQLFieldConfigArgumentMap] = null,
    astNode: Maybe[DirectiveDefinitionNode] = null,
    description: Maybe[String] = null,
    isRepeatable: Maybe[Boolean] = null
  ): GraphQLDirectiveConfig = {
    val __obj = js.Dynamic.literal(locations = locations, name = name)
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (isRepeatable != null) __obj.updateDynamic("isRepeatable")(isRepeatable.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLDirectiveConfig]
  }
}

