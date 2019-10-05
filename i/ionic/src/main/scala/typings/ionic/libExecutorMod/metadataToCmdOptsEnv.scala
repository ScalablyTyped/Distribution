package typings.ionic.libExecutorMod

import typings.ionic.definitionsMod.CommandMetadata
import typings.ionic.definitionsMod.CommandMetadataOption
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/executor", "metadataToCmdOptsEnv")
@js.native
object metadataToCmdOptsEnv extends js.Object {
  def apply(metadata: CommandMetadata, cmdNameParts: js.Array[String]): Map[CommandMetadataOption, String] = js.native
}

