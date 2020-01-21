package typings.ionicCliFramework.helpMod

import typings.ionicCliFramework.definitionsMod.CommandMetadata
import typings.ionicCliFramework.definitionsMod.CommandMetadataInput
import typings.ionicCliFramework.definitionsMod.CommandMetadataOption
import typings.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/help", "createCommandMetadataFromSchema")
@js.native
object createCommandMetadataFromSchema extends js.Object {
  def apply(schema: CommandHelpSchema): Required[CommandMetadata[CommandMetadataInput, CommandMetadataOption]] = js.native
}

