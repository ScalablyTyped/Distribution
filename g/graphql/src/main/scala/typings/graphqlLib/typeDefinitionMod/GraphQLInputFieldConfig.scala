package typings
package graphqlLib.typeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLInputFieldConfig extends js.Object {
  var astNode: js.UndefOr[
    graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.InputValueDefinitionNode]
  ] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var description: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]] = js.undefined
  var `type`: GraphQLInputType
}

object GraphQLInputFieldConfig {
  @scala.inline
  def apply(
    `type`: GraphQLInputType,
    astNode: graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.InputValueDefinitionNode] = null,
    defaultValue: js.Any = null,
    description: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String] = null
  ): GraphQLInputFieldConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLInputFieldConfig]
  }
}

