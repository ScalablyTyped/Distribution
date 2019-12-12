package typings.graphqlDashCompose.libObjectTypeComposerMod

import typings.graphql.languageAstMod.InputValueDefinitionNode
import typings.graphql.typeDefinitionMod.GraphQLInputType
import typings.graphqlDashCompose.libUtilsDefinitionsMod.Extensions
import typings.graphqlDashCompose.libUtilsDefinitionsMod.Thunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComposeArgumentConfigAsObject extends js.Object {
  @JSName("$call")
  var $call: js.UndefOr[Unit] = js.native
  var astNode: js.UndefOr[InputValueDefinitionNode | Null] = js.native
  var defaultValue: js.UndefOr[js.Any] = js.native
  var description: js.UndefOr[String | Null] = js.native
  var extensions: js.UndefOr[Extensions] = js.native
  var `type`: Thunk[ComposeArgumentType] | GraphQLInputType = js.native
}

