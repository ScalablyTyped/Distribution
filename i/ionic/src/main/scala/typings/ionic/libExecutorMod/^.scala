package typings.ionic.libExecutorMod

import typings.ionic.definitionsMod.CommandInstanceInfo
import typings.ionic.definitionsMod.CommandMetadata
import typings.ionic.definitionsMod.CommandMetadataOption
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/executor", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def metadataToCmdOptsEnv(metadata: CommandMetadata, cmdNameParts: js.Array[String]): Map[CommandMetadataOption, String] = js.native
  def runCommand(runinfo: CommandInstanceInfo, argv: js.Array[String]): js.Promise[Unit] = js.native
}

