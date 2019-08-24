package typings.graphql.typeDefinitionMod

import typings.graphql.languageAstMod.EnumValueDefinitionNode
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLEnumValueConfig extends js.Object {
  var astNode: js.UndefOr[Maybe[EnumValueDefinitionNode]] = js.undefined
  var deprecationReason: js.UndefOr[Maybe[String]] = js.undefined
  var description: js.UndefOr[Maybe[String]] = js.undefined
  var extensions: js.UndefOr[Maybe[Record[String, _]]] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object GraphQLEnumValueConfig {
  @scala.inline
  def apply(
    astNode: Maybe[EnumValueDefinitionNode] = null,
    deprecationReason: Maybe[String] = null,
    description: Maybe[String] = null,
    extensions: Maybe[Record[String, _]] = null,
    value: js.Any = null
  ): GraphQLEnumValueConfig = {
    val __obj = js.Dynamic.literal()
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (deprecationReason != null) __obj.updateDynamic("deprecationReason")(deprecationReason.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[GraphQLEnumValueConfig]
  }
}

