package typings.ionic

import typings.ionic.commandMod.Command
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands/state", JSImport.Namespace)
@js.native
object stateMod extends js.Object {
  @js.native
  class StateCommand () extends Command {
    def run(): js.Promise[Unit] = js.native
  }
  
}

