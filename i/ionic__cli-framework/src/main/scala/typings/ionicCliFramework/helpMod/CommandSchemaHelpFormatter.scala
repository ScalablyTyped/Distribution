package typings.ionicCliFramework.helpMod

import typings.ionicCliFramework.definitionsMod.CommandMetadata
import typings.ionicCliFramework.definitionsMod.CommandMetadataInput
import typings.ionicCliFramework.definitionsMod.CommandMetadataOption
import typings.ionicCliFramework.definitionsMod.Footnote
import typings.ionicCliFramework.definitionsMod.HydratedCommandMetadata
import typings.ionicCliFramework.definitionsMod.ICommand
import typings.ionicCliFramework.definitionsMod.INamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/cli-framework/lib/help", "CommandSchemaHelpFormatter")
@js.native
class CommandSchemaHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] () extends CommandHelpFormatter[C, N, M, I, O] {
  
  def formatCommand(cmd: (HydratedCommandMetadata[C, N, M, I, O]) | M): js.Promise[CommandHelpSchema] = js.native
  
  def formatFootnote(footnote: Footnote): CommandHelpSchemaFootnote = js.native
  
  def formatInput(input: I): js.Promise[CommandHelpSchemaInput] = js.native
  
  def formatInputs(inputs: js.Array[I]): js.Promise[js.Array[CommandHelpSchemaInput]] = js.native
  
  def formatOption(option: O): js.Promise[CommandHelpSchemaOption] = js.native
  
  def formatOptions(options: js.Array[O]): js.Promise[js.Array[CommandHelpSchemaOption]] = js.native
  
  def serialize(): js.Promise[CommandHelpSchema] = js.native
}
