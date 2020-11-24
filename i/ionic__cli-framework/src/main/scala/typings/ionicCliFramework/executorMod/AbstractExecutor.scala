package typings.ionicCliFramework.executorMod

import typings.ionicCliFramework.definitionsMod.CommandMetadata
import typings.ionicCliFramework.definitionsMod.CommandMetadataInput
import typings.ionicCliFramework.definitionsMod.CommandMetadataOption
import typings.ionicCliFramework.definitionsMod.ICommand
import typings.ionicCliFramework.definitionsMod.IExecutor
import typings.ionicCliFramework.definitionsMod.INamespace
import typings.ionicCliFramework.definitionsMod.NamespaceLocateResult
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/cli-framework/lib/executor", "AbstractExecutor")
@js.native
abstract class AbstractExecutor[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] ()
  extends EventEmitter
     with IExecutor[C, N, M, I, O] {
  
  def resolveExecuteInput(argvOrLocation: js.Array[String]): js.Promise[js.Tuple2[NamespaceLocateResult[C, N, M, I, O], js.Array[String]]] = js.native
  def resolveExecuteInput(argvOrLocation: NamespaceLocateResult[C, N, M, I, O]): js.Promise[js.Tuple2[NamespaceLocateResult[C, N, M, I, O], js.Array[String]]] = js.native
}
