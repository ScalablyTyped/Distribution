package typings
package atIonicCliDashFrameworkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Aliases[I /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput */, N /* <: atIonicCliDashFrameworkLib.definitionsMod.INamespace[C, N, M, I, O] */, O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */, M /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadata[I, O] */, C /* <: atIonicCliDashFrameworkLib.definitionsMod.ICommand[C, N, M, I, O] */] extends js.Object {
  val aliases: js.Array[java.lang.String]
  val command: C
  val namespace: N
  val path: js.Array[atIonicCliDashFrameworkLib.definitionsMod.CommandPathItem[C, N, M, I, O]]
}

object Anon_Aliases {
  @scala.inline
  def apply[I /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput */, N /* <: atIonicCliDashFrameworkLib.definitionsMod.INamespace[C, N, M, I, O] */, O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */, M /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadata[I, O] */, C /* <: atIonicCliDashFrameworkLib.definitionsMod.ICommand[C, N, M, I, O] */](
    aliases: js.Array[java.lang.String],
    command: C,
    namespace: N,
    path: js.Array[atIonicCliDashFrameworkLib.definitionsMod.CommandPathItem[C, N, M, I, O]]
  ): Anon_Aliases[I, N, O, M, C] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aliases")(aliases)
    __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[Anon_Aliases[I, N, O, M, C]]
  }
}

