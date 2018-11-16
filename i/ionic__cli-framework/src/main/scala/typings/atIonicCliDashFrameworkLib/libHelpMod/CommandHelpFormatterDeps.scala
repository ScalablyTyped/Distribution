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

