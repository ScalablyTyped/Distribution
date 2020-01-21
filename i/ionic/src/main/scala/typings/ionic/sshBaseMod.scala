package typings.ionic

import typings.ionic.commandMod.Command
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands/ssh/base", JSImport.Namespace)
@js.native
object sshBaseMod extends js.Object {
  @js.native
  abstract class SSHBaseCommand () extends Command {
    def checkForOpenSSH(): js.Promise[Unit] = js.native
  }
  
}

