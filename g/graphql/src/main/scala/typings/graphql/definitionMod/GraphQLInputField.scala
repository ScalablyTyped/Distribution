package typings.graphql.definitionMod

import typings.graphql.astMod.InputValueDefinitionNode
import typings.graphql.maybeMod.Maybe
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLInputField extends js.Object {
  var astNode: js.UndefOr[Maybe[InputValueDefinitionNode]] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var description: js.UndefOr[Maybe[String]] = js.undefined
  var extensions: Maybe[Record[String, _]]
  var name: String
  var `type`: GraphQLInputType
}

object GraphQLInputField {
  @scala.inline
  def apply(
    name: String,
    `type`: GraphQLInputType,
    astNode: Maybe[InputValueDefinitionNode] = null,
    defaultValue: js.Any = null,
    description: Maybe[String] = null,
    extensions: Maybe[Record[String, _]] = null
  ): GraphQLInputField = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLInputField]
  }
}

