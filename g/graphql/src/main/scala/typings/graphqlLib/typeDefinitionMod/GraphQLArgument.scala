package typings
package graphqlLib.typeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLArgument extends js.Object {
  var astNode: js.UndefOr[
    graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.InputValueDefinitionNode]
  ] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var description: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]] = js.undefined
  var name: java.lang.String
  var `type`: GraphQLInputType
}

object GraphQLArgument {
  @scala.inline
  def apply(
    name: java.lang.String,
    `type`: GraphQLInputType,
    astNode: graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.InputValueDefinitionNode] = null,
    defaultValue: js.Any = null,
    description: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String] = null
  ): GraphQLArgument = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLArgument]
  }
}

