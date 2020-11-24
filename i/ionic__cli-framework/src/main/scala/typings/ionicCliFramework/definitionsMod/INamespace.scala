package typings.ionicCliFramework.definitionsMod

import typings.ionicCliFramework.anon.Commands
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INamespace[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends js.Object {
  
  def getCommandMetadataList(): js.Promise[js.Array[HydratedCommandMetadata[C, N, M, I, O]]] = js.native
  
  def getCommands(): js.Promise[ICommandMap[C, N, M, I, O]] = js.native
  
  def getMetadata(): js.Promise[NamespaceMetadata] = js.native
  
  def getNamespaces(): js.Promise[INamespaceMap[C, N, M, I, O]] = js.native
  
  def groupCommandsByNamespace(commands: js.Array[HydratedCommandMetadata[C, N, M, I, O]]): js.Promise[
    js.Array[(HydratedNamespaceMetadata[C, N, M, I, O]) with (Commands[C, N, M, I, O])]
  ] = js.native
  
  def locate(argv: js.Array[String]): js.Promise[NamespaceLocateResult[C, N, M, I, O]] = js.native
  def locate(argv: js.Array[String], options: NamespaceLocateOptions): js.Promise[NamespaceLocateResult[C, N, M, I, O]] = js.native
  
  var parent: js.UndefOr[N] = js.native
  
  var root: N = js.native
}
