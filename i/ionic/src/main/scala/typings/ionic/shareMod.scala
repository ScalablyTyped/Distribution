package typings.ionic

import typings.ionic.commandMod.Command
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands/share", JSImport.Namespace)
@js.native
object shareMod extends js.Object {
  @js.native
  class ShareCommand () extends Command {
    def run(): js.Promise[Unit] = js.native
  }
  
}

