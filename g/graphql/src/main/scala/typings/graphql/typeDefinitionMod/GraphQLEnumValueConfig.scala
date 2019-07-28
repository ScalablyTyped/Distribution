package typings.graphql.typeDefinitionMod

import typings.graphql.languageAstMod.EnumValueDefinitionNode
import typings.graphql.tsutilsMaybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLEnumValueConfig extends js.Object {
  var astNode: js.UndefOr[Maybe[EnumValueDefinitionNode]] = js.undefined
  var deprecationReason: js.UndefOr[Maybe[String]] = js.undefined
  var description: js.UndefOr[Maybe[String]] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object GraphQLEnumValueConfig {
  @scala.inline
  def apply(
    astNode: Maybe[EnumValueDefinitionNode] = null,
    deprecationReason: Maybe[String] = null,
    description: Maybe[String] = null,
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

