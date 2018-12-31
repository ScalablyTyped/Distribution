package typings
package atIonicCliDashFrameworkLib.libHelpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/help", "NamespaceStringHelpFormatter")
@js.native
class NamespaceStringHelpFormatter[C /* <: atIonicCliDashFrameworkLib.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: atIonicCliDashFrameworkLib.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadata[I, O] */, I /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput */, O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */] () extends NamespaceHelpFormatter[C, N, M, I, O] {
  /**
    * Insert text that appears after a commands's summary.
    *
    * @param meta: The metadata of the command.
    */
  def formatAfterCommandSummary(meta: atIonicCliDashFrameworkLib.definitionsMod.HydratedCommandMetadata[C, N, M, I, O]): js.Promise[java.lang.String] = js.native
  /**
    * Insert text that appears after a namespace's summary.
    *
    * @param meta The metadata of the namespace.
    * @param commands An array of the metadata of the namespace's commands.
    */
  def formatAfterNamespaceSummary(
    meta: atIonicCliDashFrameworkLib.definitionsMod.HydratedNamespaceMetadata[C, N, M, I, O],
    commands: js.Array[atIonicCliDashFrameworkLib.definitionsMod.HydratedCommandMetadata[C, N, M, I, O]]
  ): js.Promise[java.lang.String] = js.native
  /**
    * Insert text after the namespace's summary.
    *
    * @param meta: The metadata of the namespace.
    */
  def formatAfterSummary(meta: atIonicCliDashFrameworkLib.definitionsMod.NamespaceMetadata): js.Promise[java.lang.String] = js.native
  /**
    * Insert text that appears before a commands's summary.
    *
    * @param meta: The metadata of the command.
    */
  def formatBeforeCommandSummary(meta: atIonicCliDashFrameworkLib.definitionsMod.HydratedCommandMetadata[C, N, M, I, O]): js.Promise[java.lang.String] = js.native
  /**
    * Insert text that appears before a namespace's summary.
    *
    * @param meta The metadata of the namespace.
    * @param commands An array of the metadata of the namespace's commands.
    */
  def formatBeforeNamespaceSummary(
    meta: atIonicCliDashFrameworkLib.definitionsMod.HydratedNamespaceMetadata[C, N, M, I, O],
    commands: js.Array[atIonicCliDashFrameworkLib.definitionsMod.HydratedCommandMetadata[C, N, M, I, O]]
  ): js.Promise[java.lang.String] = js.native
  /**
    * Insert text before the namespace's summary.
    *
    * @param meta: The metadata of the namespace.
    */
  def formatBeforeSummary(meta: atIonicCliDashFrameworkLib.definitionsMod.NamespaceMetadata): js.Promise[java.lang.String] = js.native
  def formatCommandGroup(
    title: java.lang.String,
    commands: js.Array[atIonicCliDashFrameworkLib.definitionsMod.HydratedCommandMetadata[C, N, M, I, O]]
  ): js.Promise[java.lang.String] = js.native
  def formatCommands(): js.Promise[java.lang.String] = js.native
  def formatDescription(): js.Promise[java.lang.String] = js.native
  def formatHeader(): js.Promise[java.lang.String] = js.native
  def formatSummary(): js.Promise[java.lang.String] = js.native
  def formatUsage(): js.Promise[java.lang.String] = js.native
  def getGlobalOptions(): js.Promise[js.Array[java.lang.String]] = js.native
  def getListOfCommandDetails(
    commands: js.Array[atIonicCliDashFrameworkLib.definitionsMod.HydratedCommandMetadata[C, N, M, I, O]]
  ): js.Promise[js.Array[java.lang.String]] = js.native
  def getListOfNamespaceDetails(
    commands: js.Array[atIonicCliDashFrameworkLib.definitionsMod.HydratedCommandMetadata[C, N, M, I, O]]
  ): js.Promise[js.Array[java.lang.String]] = js.native
}

