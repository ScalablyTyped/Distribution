package typings.graphqlCompose.objectTypeComposerMod

import typings.graphql.astMod.InputValueDefinitionNode
import typings.graphql.definitionMod.GraphQLInputType
import typings.graphqlCompose.definitionsMod.Extensions
import typings.graphqlCompose.definitionsMod.Thunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeArgumentConfigAsObject extends js.Object {
  @JSName("$call")
  var $call: js.UndefOr[Unit] = js.undefined
  var astNode: js.UndefOr[InputValueDefinitionNode | Null] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var description: js.UndefOr[String | Null] = js.undefined
  var extensions: js.UndefOr[Extensions] = js.undefined
  var `type`: Thunk[ComposeArgumentType] | GraphQLInputType
}

object ComposeArgumentConfigAsObject {
  @scala.inline
  def apply(
    `type`: Thunk[ComposeArgumentType] | GraphQLInputType,
    $call: js.UndefOr[Unit] = js.undefined,
    astNode: InputValueDefinitionNode = null,
    defaultValue: js.Any = null,
    description: String = null,
    extensions: Extensions = null
  ): ComposeArgumentConfigAsObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined($call)) __obj.updateDynamic("$call")($call.asInstanceOf[js.Any])
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposeArgumentConfigAsObject]
  }
}

