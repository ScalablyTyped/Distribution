package typings
package atIonicCliDashFrameworkLib.libExecutorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseExecutorDeps[C /* <: atIonicCliDashFrameworkLib.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: atIonicCliDashFrameworkLib.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadata[I, O] */, I /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput */, O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */] extends js.Object {
  val colors: js.UndefOr[atIonicCliDashFrameworkLib.libColorsMod.Colors] = js.undefined
  val namespace: N
  val stderr: js.UndefOr[nodeLib.NodeJSNs.WriteStream] = js.undefined
  val stdout: js.UndefOr[nodeLib.NodeJSNs.WriteStream] = js.undefined
}

object BaseExecutorDeps {
  @scala.inline
  def apply[C /* <: atIonicCliDashFrameworkLib.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: atIonicCliDashFrameworkLib.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadata[I, O] */, I /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput */, O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */](
    namespace: N,
    colors: atIonicCliDashFrameworkLib.libColorsMod.Colors = null,
    stderr: nodeLib.NodeJSNs.WriteStream = null,
    stdout: nodeLib.NodeJSNs.WriteStream = null
  ): BaseExecutorDeps[C, N, M, I, O] = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (stderr != null) __obj.updateDynamic("stderr")(stderr)
    if (stdout != null) __obj.updateDynamic("stdout")(stdout)
    __obj.asInstanceOf[BaseExecutorDeps[C, N, M, I, O]]
  }
}

