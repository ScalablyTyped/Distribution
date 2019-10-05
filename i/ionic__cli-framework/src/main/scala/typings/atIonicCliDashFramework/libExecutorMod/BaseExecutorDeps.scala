package typings.atIonicCliDashFramework.libExecutorMod

import typings.atIonicCliDashFramework.definitionsMod.CommandMetadata
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataInput
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataOption
import typings.atIonicCliDashFramework.definitionsMod.ICommand
import typings.atIonicCliDashFramework.definitionsMod.INamespace
import typings.atIonicCliDashFramework.libColorsMod.Colors
import typings.node.processMod.Global.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseExecutorDeps[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends js.Object {
  val colors: js.UndefOr[Colors] = js.undefined
  val namespace: N
  val stderr: js.UndefOr[WriteStream] = js.undefined
  val stdout: js.UndefOr[WriteStream] = js.undefined
}

object BaseExecutorDeps {
  @scala.inline
  def apply[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](namespace: N, colors: Colors = null, stderr: WriteStream = null, stdout: WriteStream = null): BaseExecutorDeps[C, N, M, I, O] = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (stderr != null) __obj.updateDynamic("stderr")(stderr)
    if (stdout != null) __obj.updateDynamic("stdout")(stdout)
    __obj.asInstanceOf[BaseExecutorDeps[C, N, M, I, O]]
  }
}

