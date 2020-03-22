package typings.graphqlCompose

import typings.graphql.astMod.InputValueDefinitionNode
import typings.graphql.definitionMod.GraphQLInputType
import typings.graphqlCompose.definitionsMod.Extensions
import typings.graphqlCompose.definitionsMod.Thunk
import typings.graphqlCompose.objectTypeComposerMod.ComposeArgumentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<graphql-compose.graphql-compose/lib/ObjectTypeComposer.ComposeArgumentConfigAsObject> */
@js.native
trait PartialComposeArgumentCon extends js.Object {
  @JSName("$call")
  var $call: js.UndefOr[Unit] = js.native
  var astNode: js.UndefOr[InputValueDefinitionNode] = js.native
  var defaultValue: js.UndefOr[js.Any] = js.native
  var description: js.UndefOr[String] = js.native
  var extensions: js.UndefOr[Extensions] = js.native
  var `type`: js.UndefOr[Thunk[ComposeArgumentType] | GraphQLInputType] = js.native
}

