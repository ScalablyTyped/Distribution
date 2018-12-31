package typings
package atIonicCliDashFrameworkLib.libHelpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/help", "NamespaceHelpFormatter")
@js.native
abstract class NamespaceHelpFormatter[C /* <: atIonicCliDashFrameworkLib.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: atIonicCliDashFrameworkLib.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadata[I, O] */, I /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput */, O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */] protected () extends HelpFormatter {
  def this(hasLocationNamespaceColors: NamespaceHelpFormatterDeps[C, N, M, I, O]) = this()
  var _fullName: js.UndefOr[java.lang.String] = js.native
  var _metadata: js.UndefOr[atIonicCliDashFrameworkLib.definitionsMod.NamespaceMetadata] = js.native
  val dotswidth: scala.Double = js.native
  val location: atIonicCliDashFrameworkLib.definitionsMod.NamespaceLocateResult[C, N, M, I, O] = js.native
  val namespace: N = js.native
  /**
    * Given command metadata, decide whether to keep or discard the command that
    * the metadata represents.
    *
    * @param meta: The metadata of the command.
    * @return `true` to keep, `false` to discard
    */
  def filterCommandCallback(meta: atIonicCliDashFrameworkLib.definitionsMod.HydratedCommandMetadata[C, N, M, I, O]): js.Promise[scala.Boolean] = js.native
  def getNamespaceFullName(): js.Promise[java.lang.String] = js.native
  def getNamespaceMetadata(): js.Promise[atIonicCliDashFrameworkLib.definitionsMod.NamespaceMetadata] = js.native
}

