package typings.ionicCliFramework.definitionsMod

import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IExecutor[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends StObject {
  
  def execute(argv: js.Array[String], env: ProcessEnv): js.Promise[Unit] = js.native
  def execute(location: NamespaceLocateResult[C, N, M, I, O]): js.Promise[Unit] = js.native
  
  def locate(argv: js.Array[String]): js.Promise[NamespaceLocateResult[C, N, M, I, O]] = js.native
  
  val namespace: N = js.native
  
  def run(command: C, cmdargs: js.Array[String]): js.Promise[Unit] = js.native
  def run(command: C, cmdargs: js.Array[String], runinfo: Partial[CommandInstanceInfo[C, N, M, I, O]]): js.Promise[Unit] = js.native
}
