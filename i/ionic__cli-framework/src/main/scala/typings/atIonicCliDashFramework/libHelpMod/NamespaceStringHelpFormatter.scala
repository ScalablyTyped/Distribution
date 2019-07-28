package typings.atIonicCliDashFramework.libHelpMod

import typings.atIonicCliDashFramework.definitionsMod.CommandMetadata
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataInput
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataOption
import typings.atIonicCliDashFramework.definitionsMod.HydratedCommandMetadata
import typings.atIonicCliDashFramework.definitionsMod.HydratedNamespaceMetadata
import typings.atIonicCliDashFramework.definitionsMod.ICommand
import typings.atIonicCliDashFramework.definitionsMod.INamespace
import typings.atIonicCliDashFramework.definitionsMod.NamespaceMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/help", "NamespaceStringHelpFormatter")
@js.native
class NamespaceStringHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] () extends NamespaceHelpFormatter[C, N, M, I, O] {
  /**
    * Insert text that appears after a commands's summary.
    *
    * @param meta: The metadata of the command.
    */
  def formatAfterCommandSummary(meta: HydratedCommandMetadata[C, N, M, I, O]): js.Promise[String] = js.native
  /**
    * Insert text that appears after a namespace's summary.
    *
    * @param meta The metadata of the namespace.
    * @param commands An array of the metadata of the namespace's commands.
    */
  def formatAfterNamespaceSummary(
    meta: HydratedNamespaceMetadata[C, N, M, I, O],
    commands: js.Array[HydratedCommandMetadata[C, N, M, I, O]]
  ): js.Promise[String] = js.native
  /**
    * Insert text after the namespace's summary.
    *
    * @param meta: The metadata of the namespace.
    */
  def formatAfterSummary(meta: NamespaceMetadata): js.Promise[String] = js.native
  /**
    * Insert text that appears before a commands's summary.
    *
    * @param meta: The metadata of the command.
    */
  def formatBeforeCommandSummary(meta: HydratedCommandMetadata[C, N, M, I, O]): js.Promise[String] = js.native
  /**
    * Insert text that appears before a namespace's summary.
    *
    * @param meta The metadata of the namespace.
    * @param commands An array of the metadata of the namespace's commands.
    */
  def formatBeforeNamespaceSummary(
    meta: HydratedNamespaceMetadata[C, N, M, I, O],
    commands: js.Array[HydratedCommandMetadata[C, N, M, I, O]]
  ): js.Promise[String] = js.native
  /**
    * Insert text before the namespace's summary.
    *
    * @param meta: The metadata of the namespace.
    */
  def formatBeforeSummary(meta: NamespaceMetadata): js.Promise[String] = js.native
  def formatCommandGroup(titleText: String, commands: js.Array[HydratedCommandMetadata[C, N, M, I, O]]): js.Promise[String] = js.native
  def formatCommands(): js.Promise[String] = js.native
  def formatDescription(): js.Promise[String] = js.native
  def formatHeader(): js.Promise[String] = js.native
  def formatSummary(): js.Promise[String] = js.native
  def formatUsage(): js.Promise[String] = js.native
  def getGlobalOptions(): js.Promise[js.Array[String]] = js.native
  def getListOfCommandDetails(commands: js.Array[HydratedCommandMetadata[C, N, M, I, O]]): js.Promise[js.Array[String]] = js.native
  def getListOfNamespaceDetails(commands: js.Array[HydratedCommandMetadata[C, N, M, I, O]]): js.Promise[js.Array[String]] = js.native
}

