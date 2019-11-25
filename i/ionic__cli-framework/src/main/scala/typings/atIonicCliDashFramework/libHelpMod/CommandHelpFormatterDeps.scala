package typings.atIonicCliDashFramework.libHelpMod

import typings.atIonicCliDashFramework.definitionsMod.CommandMetadata
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataInput
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataOption
import typings.atIonicCliDashFramework.definitionsMod.HydratedCommandMetadata
import typings.atIonicCliDashFramework.definitionsMod.ICommand
import typings.atIonicCliDashFramework.definitionsMod.INamespace
import typings.atIonicCliDashFramework.definitionsMod.NamespaceLocateResult
import typings.atIonicCliDashFramework.libColorsMod.Colors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandHelpFormatterDeps[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends js.Object {
  val colors: js.UndefOr[Colors] = js.undefined
  val command: C
  val location: NamespaceLocateResult[C, N, M, I, O]
  /**
    * Provide extra context with hydrated command metadata. If not provided,
    * `command.getMetadata()` is called.
    */
  val metadata: js.UndefOr[HydratedCommandMetadata[C, N, M, I, O]] = js.undefined
}

object CommandHelpFormatterDeps {
  @scala.inline
  def apply[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](
    command: C,
    location: NamespaceLocateResult[C, N, M, I, O],
    colors: Colors = null,
    metadata: HydratedCommandMetadata[C, N, M, I, O] = null
  ): CommandHelpFormatterDeps[C, N, M, I, O] = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandHelpFormatterDeps[C, N, M, I, O]]
  }
}

