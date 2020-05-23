package typings.graphql.definitionMod

import typings.graphql.astMod.InputValueDefinitionNode
import typings.graphql.maybeMod.Maybe
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
    astNode: js.UndefOr[Null | Maybe[InputValueDefinitionNode]] = js.undefined,
    description: js.UndefOr[Null | Maybe[String]] = js.undefined,
    extensions: js.UndefOr[Null | (Maybe[Record[String, _]])] = js.undefined
  ): GraphQLArgument = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(astNode)) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(extensions)) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLArgument]
  }
}

