package typings
package atIonicCliDashFrameworkLib.libHelpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandHelpFormatterDeps[C /* <: atIonicCliDashFrameworkLib.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: atIonicCliDashFrameworkLib.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadata[I, O] */, I /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput */, O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */] extends js.Object {
  val colors: js.UndefOr[atIonicCliDashFrameworkLib.libColorsMod.Colors] = js.undefined
  val command: C
  val location: atIonicCliDashFrameworkLib.definitionsMod.NamespaceLocateResult[C, N, M, I, O]
  /**
    * Provide extra context with hydrated command metadata. If not provided,
    * `command.getMetadata()` is called.
    */
  val metadata: js.UndefOr[atIonicCliDashFrameworkLib.definitionsMod.HydratedCommandMetadata[C, N, M, I, O]] = js.undefined
}

object CommandHelpFormatterDeps {
  @scala.inline
  def apply[C /* <: atIonicCliDashFrameworkLib.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: atIonicCliDashFrameworkLib.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadata[I, O] */, I /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput */, O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */](
    command: C,
    location: atIonicCliDashFrameworkLib.definitionsMod.NamespaceLocateResult[C, N, M, I, O],
    colors: atIonicCliDashFrameworkLib.libColorsMod.Colors = null,
    metadata: atIonicCliDashFrameworkLib.definitionsMod.HydratedCommandMetadata[C, N, M, I, O] = null
  ): CommandHelpFormatterDeps[C, N, M, I, O] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    __obj.updateDynamic("location")(location)
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandHelpFormatterDeps[C, N, M, I, O]]
  }
}

