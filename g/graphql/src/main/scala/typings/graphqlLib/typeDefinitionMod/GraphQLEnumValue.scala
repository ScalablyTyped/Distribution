package typings
package graphqlLib.typeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLEnumValue extends js.Object {
  var astNode: js.UndefOr[
    graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.EnumValueDefinitionNode]
  ] = js.undefined
  var deprecationReason: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]
  var description: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]
  var isDeprecated: js.UndefOr[scala.Boolean] = js.undefined
  var name: java.lang.String
  var value: js.Any
}

object GraphQLEnumValue {
  @scala.inline
  def apply(
    deprecationReason: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String],
    description: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String],
    name: java.lang.String,
    value: js.Any,
    astNode: graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.EnumValueDefinitionNode] = null,
    isDeprecated: js.UndefOr[scala.Boolean] = js.undefined
  ): GraphQLEnumValue = {
    val __obj = js.Dynamic.literal(deprecationReason = deprecationReason.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name, value = value)
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (!js.isUndefined(isDeprecated)) __obj.updateDynamic("isDeprecated")(isDeprecated)
    __obj.asInstanceOf[GraphQLEnumValue]
  }
}

