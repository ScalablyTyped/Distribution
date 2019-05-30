package typings
package atIonicCliDashFrameworkLib.libCompletionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/completion", "CompletionFormatter")
@js.native
abstract class CompletionFormatter[C /* <: atIonicCliDashFrameworkLib.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: atIonicCliDashFrameworkLib.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadata[I, O] */, I /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput */, O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */] protected () extends js.Object {
  def this(hasNamespace: CompletionFormatterDeps[C, N, M, I, O]) = this()
  val namespace: N = js.native
  def format(): js.Promise[java.lang.String] = js.native
}

