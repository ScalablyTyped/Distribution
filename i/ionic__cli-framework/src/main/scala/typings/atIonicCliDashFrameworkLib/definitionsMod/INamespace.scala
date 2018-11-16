package typings
package atIonicCliDashFrameworkLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INamespace[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends js.Object {
  var parent: js.UndefOr[N] = js.native
  var root: N = js.native
  def getCommandMetadataList(): stdLib.Promise[js.Array[HydratedCommandMetadata[C, N, M, I, O]]] = js.native
  def getCommands(): stdLib.Promise[ICommandMap[C, N, M, I, O]] = js.native
  def getMetadata(): stdLib.Promise[NamespaceMetadata] = js.native
  def getNamespaces(): stdLib.Promise[INamespaceMap[C, N, M, I, O]] = js.native
  def groupCommandsByNamespace(commands: js.Array[HydratedCommandMetadata[C, N, M, I, O]]): stdLib.Promise[
    js.Array[
      (HydratedNamespaceMetadata[C, N, M, I, O]) with (atIonicCliDashFrameworkLib.Anon_Commands[I, C, M, N, O])
    ]
  ] = js.native
  def locate(argv: js.Array[java.lang.String]): stdLib.Promise[NamespaceLocateResult[C, N, M, I, O]] = js.native
  def locate(argv: js.Array[java.lang.String], options: NamespaceLocateOptions): stdLib.Promise[NamespaceLocateResult[C, N, M, I, O]] = js.native
}

