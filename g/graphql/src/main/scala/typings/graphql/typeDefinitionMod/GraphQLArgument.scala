package typings.graphql.typeDefinitionMod

import typings.graphql.languageAstMod.InputValueDefinitionNode
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLArgument extends js.Object {
  var astNode: Maybe[InputValueDefinitionNode]
  var defaultValue: js.Any
  var description: Maybe[String]
  var extensions: Maybe[Record[String, _]]
  var name: String
  var `type`: GraphQLInputType
}

object GraphQLArgument {
  @scala.inline
  def apply(
    defaultValue: js.Any,
    name: String,
    `type`: GraphQLInputType,
    astNode: Maybe[InputValueDefinitionNode] = null,
    description: Maybe[String] = null,
    extensions: Maybe[Record[String, _]] = null
  ): GraphQLArgument = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue, name = name)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLArgument]
  }
}

