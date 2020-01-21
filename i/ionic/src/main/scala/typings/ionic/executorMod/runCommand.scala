package typings.ionic.executorMod

import typings.ionic.definitionsMod.CommandInstanceInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/executor", "runCommand")
@js.native
object runCommand extends js.Object {
  def apply(runinfo: CommandInstanceInfo, argv: js.Array[String]): js.Promise[Unit] = js.native
}

