package typings.atIonicCliDashFramework.libHelpMod

import typings.atIonicCliDashFramework.definitionsMod.CommandMetadata
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataInput
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataOption
import typings.atIonicCliDashFramework.definitionsMod.ICommand
import typings.atIonicCliDashFramework.definitionsMod.INamespace
import typings.atIonicCliDashFramework.definitionsMod.NamespaceLocateResult
import typings.atIonicCliDashFramework.libColorsMod.Colors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamespaceHelpFormatterDeps[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends js.Object {
  val colors: js.UndefOr[Colors] = js.undefined
  val location: NamespaceLocateResult[C, N, M, I, O]
  val namespace: N
}

object NamespaceHelpFormatterDeps {
  @scala.inline
  def apply[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](location: NamespaceLocateResult[C, N, M, I, O], namespace: N, colors: Colors = null): NamespaceHelpFormatterDeps[C, N, M, I, O] = {
    val __obj = js.Dynamic.literal(location = location, namespace = namespace.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors)
    __obj.asInstanceOf[NamespaceHelpFormatterDeps[C, N, M, I, O]]
  }
}

