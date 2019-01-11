package typings
package ionicLib.libExecutorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/executor", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def metadataToCmdOptsEnv(metadata: ionicLib.definitionsMod.CommandMetadata, cmdNameParts: js.Array[java.lang.String]): lodashLib.lodashMod.Global.Map[ionicLib.definitionsMod.CommandMetadataOption, java.lang.String] = js.native
  def runCommand(runinfo: ionicLib.definitionsMod.CommandInstanceInfo, argv: js.Array[java.lang.String]): js.Promise[scala.Unit] = js.native
}

