package typings.graphql.typeDefinitionMod

import typings.graphql.languageAstMod.InputValueDefinitionNode
import typings.graphql.tsutilsMaybeMod.Maybe
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
    extensions: Maybe[Record[String, _]],
    name: String,
    `type`: GraphQLInputType,
    astNode: Maybe[InputValueDefinitionNode] = null,
    defaultValue: js.Any = null,
    description: Maybe[String] = null
  ): GraphQLInputField = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], name = name)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLInputField]
  }
}

