package typings
package atIonicCliDashFrameworkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Commands[I /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput */, N /* <: atIonicCliDashFrameworkLib.definitionsMod.INamespace[C, N, M, I, O] */, O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */, M /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadata[I, O] */, C /* <: atIonicCliDashFrameworkLib.definitionsMod.ICommand[C, N, M, I, O] */] extends js.Object {
  var commands: js.Array[atIonicCliDashFrameworkLib.definitionsMod.HydratedCommandMetadata[C, N, M, I, O]]
}

object Anon_Commands {
  @scala.inline
  def apply[I /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput */, N /* <: atIonicCliDashFrameworkLib.definitionsMod.INamespace[C, N, M, I, O] */, O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */, M /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadata[I, O] */, C /* <: atIonicCliDashFrameworkLib.definitionsMod.ICommand[C, N, M, I, O] */](
    commands: js.Array[atIonicCliDashFrameworkLib.definitionsMod.HydratedCommandMetadata[C, N, M, I, O]]
  ): Anon_Commands[I, N, O, M, C] = {
    val __obj = js.Dynamic.literal(commands = commands)
  
    __obj.asInstanceOf[Anon_Commands[I, N, O, M, C]]
  }
}

