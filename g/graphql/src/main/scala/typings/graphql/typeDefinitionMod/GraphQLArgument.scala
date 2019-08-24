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
    astNode: Maybe[InputValueDefinitionNode],
    defaultValue: js.Any,
    description: Maybe[String],
    extensions: Maybe[Record[String, _]],
    name: String,
    `type`: GraphQLInputType
  ): GraphQLArgument = {
    val __obj = js.Dynamic.literal(astNode = astNode.asInstanceOf[js.Any], defaultValue = defaultValue, description = description.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], name = name)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLArgument]
  }
}

