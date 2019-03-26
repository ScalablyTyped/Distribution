package typings
package atIonicCliDashFrameworkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Aliases[O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */, C /* <: atIonicCliDashFrameworkLib.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: atIonicCliDashFrameworkLib.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadata[I, O] */, I /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput */] extends js.Object {
  val aliases: js.Array[java.lang.String]
  val command: C
  val namespace: N
  val path: js.Array[atIonicCliDashFrameworkLib.definitionsMod.CommandPathItem[C, N, M, I, O]]
}

object Anon_Aliases {
  @scala.inline
  def apply[O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */, C /* <: atIonicCliDashFrameworkLib.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: atIonicCliDashFrameworkLib.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadata[I, O] */, I /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput */](
    aliases: js.Array[java.lang.String],
    command: C,
    namespace: N,
    path: js.Array[atIonicCliDashFrameworkLib.definitionsMod.CommandPathItem[C, N, M, I, O]]
  ): Anon_Aliases[O, C, N, M, I] = {
    val __obj = js.Dynamic.literal(aliases = aliases, command = command.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], path = path)
  
    __obj.asInstanceOf[Anon_Aliases[O, C, N, M, I]]
  }
}

