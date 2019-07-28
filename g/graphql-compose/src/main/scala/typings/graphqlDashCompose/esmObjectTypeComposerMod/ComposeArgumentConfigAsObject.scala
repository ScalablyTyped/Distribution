package typings.graphqlDashCompose.esmObjectTypeComposerMod

import typings.graphql.languageAstMod.InputValueDefinitionNode
import typings.graphql.typeDefinitionMod.GraphQLInputType
import typings.graphqlDashCompose.esmUtilsDefinitionsMod.Extensions
import typings.graphqlDashCompose.esmUtilsDefinitionsMod.Thunk
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
    if (!js.isUndefined($call)) __obj.updateDynamic("$call")($call)
    if (astNode != null) __obj.updateDynamic("astNode")(astNode)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (description != null) __obj.updateDynamic("description")(description)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    __obj.asInstanceOf[ComposeArgumentConfigAsObject]
  }
}

