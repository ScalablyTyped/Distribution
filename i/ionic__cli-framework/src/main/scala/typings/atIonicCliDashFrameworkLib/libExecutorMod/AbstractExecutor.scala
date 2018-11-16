package typings
package atIonicCliDashFrameworkLib.libExecutorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/executor", "AbstractExecutor")
@js.native
abstract class AbstractExecutor[C /* <: atIonicCliDashFrameworkLib.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: atIonicCliDashFrameworkLib.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadata[I, O] */, I /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput */, O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */] ()
  extends nodeLib.eventsMod.EventEmitter
     with atIonicCliDashFrameworkLib.definitionsMod.IExecutor[C, N, M, I, O]

