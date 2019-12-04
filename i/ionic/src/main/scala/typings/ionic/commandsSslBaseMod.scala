package typings.ionic

import typings.ionic.libCommandMod.Command
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands/ssl/base", JSImport.Namespace)
@js.native
object commandsSslBaseMod extends js.Object {
  @js.native
  abstract class SSLBaseCommand () extends Command {
    def checkForOpenSSL(): js.Promise[Unit] = js.native
  }
  
}

