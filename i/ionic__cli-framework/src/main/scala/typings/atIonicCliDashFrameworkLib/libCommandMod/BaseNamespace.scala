package typings
package atIonicCliDashFrameworkLib.libCommandMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/command", "BaseNamespace")
@js.native
abstract class BaseNamespace[C /* <: atIonicCliDashFrameworkLib.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: atIonicCliDashFrameworkLib.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadata[I, O] */, I /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput */, O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */] ()
  extends atIonicCliDashFrameworkLib.definitionsMod.INamespace[C, N, M, I, O] {
  def this(parent: N) = this()
  /* CompleteClass */
  override var parent: js.UndefOr[N] = js.native
  /* CompleteClass */
  override var root: N = js.native
  /* CompleteClass */
  override def getCommandMetadataList(): stdLib.Promise[
    js.Array[atIonicCliDashFrameworkLib.definitionsMod.HydratedCommandMetadata[C, N, M, I, O]]
  ] = js.native
  /* CompleteClass */
  override def getCommands(): stdLib.Promise[atIonicCliDashFrameworkLib.definitionsMod.ICommandMap[C, N, M, I, O]] = js.native
  /* CompleteClass */
  override def getMetadata(): stdLib.Promise[atIonicCliDashFrameworkLib.definitionsMod.NamespaceMetadata] = js.native
  /* CompleteClass */
  override def getNamespaces(): stdLib.Promise[atIonicCliDashFrameworkLib.definitionsMod.INamespaceMap[C, N, M, I, O]] = js.native
  /* CompleteClass */
  override def groupCommandsByNamespace(
    commands: js.Array[atIonicCliDashFrameworkLib.definitionsMod.HydratedCommandMetadata[C, N, M, I, O]]
  ): stdLib.Promise[
    js.Array[
      (atIonicCliDashFrameworkLib.definitionsMod.HydratedNamespaceMetadata[C, N, M, I, O]) with (atIonicCliDashFrameworkLib.Anon_Commands[I, C, M, N, O])
    ]
  ] = js.native
  /* CompleteClass */
  override def locate(argv: js.Array[java.lang.String]): stdLib.Promise[atIonicCliDashFrameworkLib.definitionsMod.NamespaceLocateResult[C, N, M, I, O]] = js.native
}

