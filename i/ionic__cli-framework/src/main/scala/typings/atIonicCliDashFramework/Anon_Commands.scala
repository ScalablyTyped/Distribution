package typings.atIonicCliDashFramework

import typings.atIonicCliDashFramework.definitionsMod.CommandMetadata
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataInput
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataOption
import typings.atIonicCliDashFramework.definitionsMod.HydratedCommandMetadata
import typings.atIonicCliDashFramework.definitionsMod.ICommand
import typings.atIonicCliDashFramework.definitionsMod.INamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Commands[O /* <: CommandMetadataOption */, C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */] extends js.Object {
  var commands: js.Array[HydratedCommandMetadata[C, N, M, I, O]]
}

object Anon_Commands {
  @scala.inline
  def apply[O /* <: CommandMetadataOption */, C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */](commands: js.Array[HydratedCommandMetadata[C, N, M, I, O]]): Anon_Commands[O, C, N, M, I] = {
    val __obj = js.Dynamic.literal(commands = commands)
  
    __obj.asInstanceOf[Anon_Commands[O, C, N, M, I]]
  }
}

