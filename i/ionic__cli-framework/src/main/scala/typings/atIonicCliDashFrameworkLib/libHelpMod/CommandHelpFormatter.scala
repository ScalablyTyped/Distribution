package typings
package atIonicCliDashFrameworkLib.libHelpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/help", "CommandHelpFormatter")
@js.native
abstract class CommandHelpFormatter[C /* <: atIonicCliDashFrameworkLib.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: atIonicCliDashFrameworkLib.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadata[I, O] */, I /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput */, O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */] protected () extends HelpFormatter {
  def this(hasLocationCommandMetadataColors: CommandHelpFormatterDeps[C, N, M, I, O]) = this()
  var _fullName: js.UndefOr[java.lang.String] = js.native
  var _hydratedMetadata: js.UndefOr[atIonicCliDashFrameworkLib.definitionsMod.HydratedCommandMetadata[C, N, M, I, O]] = js.native
  var _metadata: js.UndefOr[M] = js.native
  val command: C = js.native
  val dotswidth: scala.Double = js.native
  /**
       * Given an option definition from command metadata, decide whether to keep
       * or discard it.
       *
       * @return `true` to keep, `false` to discard
       */
  var filterOptionCallback: js.UndefOr[js.Function1[/* option */ O, stdLib.Promise[scala.Boolean]]] = js.native
  val location: atIonicCliDashFrameworkLib.definitionsMod.NamespaceLocateResult[C, N, M, I, O] = js.native
  def getCommandFullName(): stdLib.Promise[java.lang.String] = js.native
  def getCommandMetadata(): stdLib.Promise[
    M | (atIonicCliDashFrameworkLib.definitionsMod.HydratedCommandMetadata[C, N, M, I, O])
  ] = js.native
}

