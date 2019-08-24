package typings.graphql.typeDefinitionMod

import typings.graphql.languageAstMod.EnumValueDefinitionNode
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLEnumValue extends js.Object {
  var astNode: js.UndefOr[Maybe[EnumValueDefinitionNode]] = js.undefined
  var deprecationReason: Maybe[String]
  var description: Maybe[String]
  var extensions: Maybe[Record[String, _]]
  var isDeprecated: js.UndefOr[Boolean] = js.undefined
  var name: String
  var value: js.Any
}

object GraphQLEnumValue {
  @scala.inline
  def apply(
    deprecationReason: Maybe[String],
    description: Maybe[String],
    extensions: Maybe[Record[String, _]],
    name: String,
    value: js.Any,
    astNode: Maybe[EnumValueDefinitionNode] = null,
    isDeprecated: js.UndefOr[Boolean] = js.undefined
  ): GraphQLEnumValue = {
    val __obj = js.Dynamic.literal(deprecationReason = deprecationReason.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], name = name, value = value)
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (!js.isUndefined(isDeprecated)) __obj.updateDynamic("isDeprecated")(isDeprecated)
    __obj.asInstanceOf[GraphQLEnumValue]
  }
}

