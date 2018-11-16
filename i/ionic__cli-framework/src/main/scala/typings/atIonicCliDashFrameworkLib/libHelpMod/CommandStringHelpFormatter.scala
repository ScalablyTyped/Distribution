package typings
package atIonicCliDashFrameworkLib.libHelpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/help", "CommandStringHelpFormatter")
@js.native
class CommandStringHelpFormatter[C /* <: atIonicCliDashFrameworkLib.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: atIonicCliDashFrameworkLib.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadata[I, O] */, I /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput */, O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */] () extends CommandHelpFormatter[C, N, M, I, O] {
  /**
       * Insert text after the command's summary.
       */
  var formatAfterSummary: js.UndefOr[js.Function0[stdLib.Promise[java.lang.String]]] = js.native
  /**
       * Insert text that appears before an option's summary.
       *
       * @param opt The metadata of the option.
       */
  var formatBeforeOptionSummary: js.UndefOr[js.Function1[/* opt */ O, stdLib.Promise[java.lang.String]]] = js.native
  /**
       * Insert text before the command's summary.
       */
  var formatBeforeSummary: js.UndefOr[js.Function0[stdLib.Promise[java.lang.String]]] = js.native
  def formatAfterOptionSummary(opt: O): stdLib.Promise[java.lang.String] = js.native
  def formatDescription(): stdLib.Promise[java.lang.String] = js.native
  def formatExamples(): stdLib.Promise[java.lang.String] = js.native
  def formatHeader(): stdLib.Promise[java.lang.String] = js.native
  def formatInlineInput(input: I): stdLib.Promise[java.lang.String] = js.native
  def formatInputs(): stdLib.Promise[java.lang.String] = js.native
  def formatOptionDefault(opt: O): stdLib.Promise[java.lang.String] = js.native
  def formatOptionLine(opt: O): stdLib.Promise[java.lang.String] = js.native
  def formatOptions(): stdLib.Promise[java.lang.String] = js.native
  def formatOptionsGroup(title: java.lang.String, options: js.Array[O]): stdLib.Promise[java.lang.String] = js.native
  def formatSummary(): stdLib.Promise[java.lang.String] = js.native
  def formatUsage(): stdLib.Promise[java.lang.String] = js.native
}

