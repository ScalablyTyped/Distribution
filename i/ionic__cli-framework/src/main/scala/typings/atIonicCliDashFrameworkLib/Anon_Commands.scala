package typings
package atIonicCliDashFrameworkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Commands[O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */, C /* <: atIonicCliDashFrameworkLib.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: atIonicCliDashFrameworkLib.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadata[I, O] */, I /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput */] extends js.Object {
  var commands: js.Array[atIonicCliDashFrameworkLib.definitionsMod.HydratedCommandMetadata[C, N, M, I, O]]
}

object Anon_Commands {
  @scala.inline
  def apply[O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */, C /* <: atIonicCliDashFrameworkLib.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: atIonicCliDashFrameworkLib.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadata[I, O] */, I /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput */](
    commands: js.Array[atIonicCliDashFrameworkLib.definitionsMod.HydratedCommandMetadata[C, N, M, I, O]]
  ): Anon_Commands[O, C, N, M, I] = {
    val __obj = js.Dynamic.literal(commands = commands)
  
    __obj.asInstanceOf[Anon_Commands[O, C, N, M, I]]
  }
}

