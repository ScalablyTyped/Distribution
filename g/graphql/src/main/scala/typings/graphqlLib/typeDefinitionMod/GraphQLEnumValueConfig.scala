package typings
package graphqlLib.typeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLEnumValueConfig extends js.Object {
  var astNode: js.UndefOr[
    graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.EnumValueDefinitionNode]
  ] = js.undefined
  var deprecationReason: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]] = js.undefined
  var description: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object GraphQLEnumValueConfig {
  @scala.inline
  def apply(
    astNode: graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.EnumValueDefinitionNode] = null,
    deprecationReason: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String] = null,
    description: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String] = null,
    value: js.Any = null
  ): GraphQLEnumValueConfig = {
    val __obj = js.Dynamic.literal()
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (deprecationReason != null) __obj.updateDynamic("deprecationReason")(deprecationReason.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[GraphQLEnumValueConfig]
  }
}

