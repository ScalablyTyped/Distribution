package typings.ionic

import typings.ionic.libCommandMod.Command
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands/ssh/base", JSImport.Namespace)
@js.native
object commandsSshBaseMod extends js.Object {
  @js.native
  abstract class SSHBaseCommand () extends Command {
    def checkForOpenSSH(): js.Promise[Unit] = js.native
  }
  
}

