package typings.graphqlCompose.anon

import typings.graphql.astMod.InputValueDefinitionNode
import typings.graphql.definitionMod.GraphQLInputType
import typings.graphqlCompose.definitionsMod.Extensions
import typings.graphqlCompose.definitionsMod.Thunk
import typings.graphqlCompose.objectTypeComposerMod.ComposeArgumentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<graphql-compose.graphql-compose/lib/ObjectTypeComposer.ComposeArgumentConfigAsObject> */
trait PartialComposeArgumentCon extends js.Object {
  @JSName("$call")
  var $call: js.UndefOr[Unit] = js.undefined
  var astNode: js.UndefOr[InputValueDefinitionNode] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var extensions: js.UndefOr[Extensions] = js.undefined
  var `type`: js.UndefOr[Thunk[ComposeArgumentType] | GraphQLInputType] = js.undefined
}

object PartialComposeArgumentCon {
  @scala.inline
  def apply(
    $call: js.UndefOr[Unit] = js.undefined,
    astNode: InputValueDefinitionNode = null,
    defaultValue: js.Any = null,
    description: String = null,
    extensions: Extensions = null,
    `type`: Thunk[ComposeArgumentType] | GraphQLInputType = null
  ): PartialComposeArgumentCon = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($call)) __obj.updateDynamic("$call")($call.get.asInstanceOf[js.Any])
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialComposeArgumentCon]
  }
}

