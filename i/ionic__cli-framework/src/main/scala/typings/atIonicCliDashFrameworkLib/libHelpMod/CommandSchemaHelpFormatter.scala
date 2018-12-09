package typings
package atIonicCliDashFrameworkLib.libHelpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/help", "CommandSchemaHelpFormatter")
@js.native
class CommandSchemaHelpFormatter[C /* <: atIonicCliDashFrameworkLib.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: atIonicCliDashFrameworkLib.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadata[I, O] */, I /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput */, O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */] () extends CommandHelpFormatter[C, N, M, I, O] {
  def formatCommand(cmd: M | (atIonicCliDashFrameworkLib.definitionsMod.HydratedCommandMetadata[C, N, M, I, O])): js.Promise[CommandHelpSchema] = js.native
  def formatInput(input: I): js.Promise[CommandHelpSchemaInput] = js.native
  def formatInputs(inputs: js.Array[I]): js.Promise[js.Array[CommandHelpSchemaInput]] = js.native
  def formatOption(option: O): js.Promise[CommandHelpSchemaOption] = js.native
  def formatOptions(options: js.Array[O]): js.Promise[js.Array[CommandHelpSchemaOption]] = js.native
  def serialize(): js.Promise[CommandHelpSchema] = js.native
}

