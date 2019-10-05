package typings.atIonicCliDashFramework.libMod

import typings.atIonicCliDashFramework.definitionsMod.CommandMetadata
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataInput
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataOption
import typings.atIonicCliDashFramework.libHelpMod.CommandHelpSchema
import typings.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib", "createCommandMetadataFromSchema")
@js.native
object createCommandMetadataFromSchema extends js.Object {
  def apply(schema: CommandHelpSchema): Required[CommandMetadata[CommandMetadataInput, CommandMetadataOption]] = js.native
}

