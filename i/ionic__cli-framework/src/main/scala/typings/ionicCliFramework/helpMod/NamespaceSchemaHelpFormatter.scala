package typings.ionicCliFramework.helpMod

import typings.ionicCliFramework.definitionsMod.CommandMetadata
import typings.ionicCliFramework.definitionsMod.CommandMetadataInput
import typings.ionicCliFramework.definitionsMod.CommandMetadataOption
import typings.ionicCliFramework.definitionsMod.HydratedCommandMetadata
import typings.ionicCliFramework.definitionsMod.ICommand
import typings.ionicCliFramework.definitionsMod.INamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/help", "NamespaceSchemaHelpFormatter")
@js.native
class NamespaceSchemaHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] () extends NamespaceHelpFormatter[C, N, M, I, O] {
  def formatCommand(cmd: HydratedCommandMetadata[C, N, M, I, O]): js.Promise[CommandHelpSchema] = js.native
  def formatCommandGroup(commands: js.Array[HydratedCommandMetadata[C, N, M, I, O]]): js.Promise[js.Array[CommandHelpSchema]] = js.native
  def serialize(): js.Promise[NamespaceHelpSchema] = js.native
}

