package typings.graphql.typeDefinitionMod

import typings.graphql.languageAstMod.InputValueDefinitionNode
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLInputFieldConfig extends js.Object {
  var astNode: js.UndefOr[Maybe[InputValueDefinitionNode]] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var description: js.UndefOr[Maybe[String]] = js.undefined
  var extensions: js.UndefOr[Maybe[Record[String, _]]] = js.undefined
  var `type`: GraphQLInputType
}

object GraphQLInputFieldConfig {
  @scala.inline
  def apply(
    `type`: GraphQLInputType,
    astNode: Maybe[InputValueDefinitionNode] = null,
    defaultValue: js.Any = null,
    description: Maybe[String] = null,
    extensions: Maybe[Record[String, _]] = null
  ): GraphQLInputFieldConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLInputFieldConfig]
  }
}

