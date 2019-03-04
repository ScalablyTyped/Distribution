package typings
package graphqlLib.typeDirectivesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLDirectiveConfig extends js.Object {
  var args: js.UndefOr[
    graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.typeDefinitionMod.GraphQLFieldConfigArgumentMap]
  ] = js.undefined
  var astNode: js.UndefOr[
    graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.DirectiveDefinitionNode]
  ] = js.undefined
  var description: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]] = js.undefined
  var locations: js.Array[graphqlLib.languageDirectiveLocationMod.DirectiveLocationEnum]
  var name: java.lang.String
}

object GraphQLDirectiveConfig {
  @scala.inline
  def apply(
    locations: js.Array[graphqlLib.languageDirectiveLocationMod.DirectiveLocationEnum],
    name: java.lang.String,
    args: graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.typeDefinitionMod.GraphQLFieldConfigArgumentMap] = null,
    astNode: graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.DirectiveDefinitionNode] = null,
    description: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String] = null
  ): GraphQLDirectiveConfig = {
    val __obj = js.Dynamic.literal(locations = locations, name = name)
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLDirectiveConfig]
  }
}

