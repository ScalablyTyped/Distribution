package typings
package atIonicCliDashFrameworkLib.libHelpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/help", "NamespaceStringHelpFormatter")
@js.native
class NamespaceStringHelpFormatter[C /* <: atIonicCliDashFrameworkLib.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: atIonicCliDashFrameworkLib.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadata[I, O] */, I /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput */, O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */] () extends NamespaceHelpFormatter[C, N, M, I, O] {
  /**
       * Insert text after the namespace's summary.
       */
  var formatAfterSummary: js.UndefOr[js.Function0[stdLib.Promise[java.lang.String]]] = js.native
  /**
       * Insert text that appears before a commands's summary.
       *
       * @param meta: The metadata of the command.
       */
  var formatBeforeCommandSummary: js.UndefOr[
    js.Function1[
      /* meta */ atIonicCliDashFrameworkLib.definitionsMod.HydratedCommandMetadata[C, N, M, I, O], 
      stdLib.Promise[java.lang.String]
    ]
  ] = js.native
  /**
       * Insert text before summaries of listed subnamespaces.
       *
       * @param meta The metadata of the namespace.
       * @param commands An array of the metadata of the namespace's commands.
       */
  var formatBeforeNamespaceSummary: js.UndefOr[
    js.Function2[
      /* meta */ atIonicCliDashFrameworkLib.definitionsMod.HydratedNamespaceMetadata[C, N, M, I, O], 
      /* commands */ js.Array[atIonicCliDashFrameworkLib.definitionsMod.HydratedCommandMetadata[C, N, M, I, O]], 
      stdLib.Promise[java.lang.String]
    ]
  ] = js.native
  /**
       * Insert text before the namespace's summary.
       */
  var formatBeforeSummary: js.UndefOr[js.Function0[stdLib.Promise[java.lang.String]]] = js.native
  /**
       * Insert text that appears after a commands's summary.
       *
       * @param meta: The metadata of the command.
       */
  def formatAfterCommandSummary(meta: atIonicCliDashFrameworkLib.definitionsMod.HydratedCommandMetadata[C, N, M, I, O]): stdLib.Promise[java.lang.String] = js.native
  /**
       * Insert text that appears after a namespace's summary.
       *
       * @param meta The metadata of the namespace.
       * @param commands An array of the metadata of the namespace's commands.
       */
  def formatAfterNamespaceSummary(
    meta: atIonicCliDashFrameworkLib.definitionsMod.HydratedNamespaceMetadata[C, N, M, I, O],
    commands: js.Array[atIonicCliDashFrameworkLib.definitionsMod.HydratedCommandMetadata[C, N, M, I, O]]
  ): stdLib.Promise[java.lang.String] = js.native
  def formatCommandGroup(
    title: java.lang.String,
    commands: js.Array[atIonicCliDashFrameworkLib.definitionsMod.HydratedCommandMetadata[C, N, M, I, O]]
  ): stdLib.Promise[java.lang.String] = js.native
  def formatCommands(): stdLib.Promise[java.lang.String] = js.native
  def formatDescription(): stdLib.Promise[java.lang.String] = js.native
  def formatHeader(): stdLib.Promise[java.lang.String] = js.native
  def formatSummary(): stdLib.Promise[java.lang.String] = js.native
  def formatUsage(): stdLib.Promise[java.lang.String] = js.native
  def getExtraOptions(): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def getListOfCommandDetails(
    commands: js.Array[atIonicCliDashFrameworkLib.definitionsMod.HydratedCommandMetadata[C, N, M, I, O]]
  ): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def getListOfNamespaceDetails(
    commands: js.Array[atIonicCliDashFrameworkLib.definitionsMod.HydratedCommandMetadata[C, N, M, I, O]]
  ): stdLib.Promise[js.Array[java.lang.String]] = js.native
}

