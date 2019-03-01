package typings
package atIonicCliDashFrameworkLib.libHelpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamespaceHelpFormatterDeps[C /* <: atIonicCliDashFrameworkLib.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: atIonicCliDashFrameworkLib.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadata[I, O] */, I /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput */, O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */] extends js.Object {
  val colors: js.UndefOr[atIonicCliDashFrameworkLib.libColorsMod.Colors] = js.undefined
  val location: atIonicCliDashFrameworkLib.definitionsMod.NamespaceLocateResult[C, N, M, I, O]
  val namespace: N
}

object NamespaceHelpFormatterDeps {
  @scala.inline
  def apply[C /* <: atIonicCliDashFrameworkLib.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: atIonicCliDashFrameworkLib.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadata[I, O] */, I /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput */, O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */](
    location: atIonicCliDashFrameworkLib.definitionsMod.NamespaceLocateResult[C, N, M, I, O],
    namespace: N,
    colors: atIonicCliDashFrameworkLib.libColorsMod.Colors = null
  ): NamespaceHelpFormatterDeps[C, N, M, I, O] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("location")(location)
    __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors)
    __obj.asInstanceOf[NamespaceHelpFormatterDeps[C, N, M, I, O]]
  }
}

