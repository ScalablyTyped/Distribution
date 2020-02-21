package typings.hapiHawk.serverMod

import typings.hapiHawk.clientMod.Message_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/hawk/lib/server", "authenticateMessage")
@js.native
object authenticateMessage extends js.Object {
  def apply(
    host: String,
    port: Double,
    message: String,
    authorization: Message_,
    credentialsFunc: CredentialsFunc,
    options: AuthenticateMessageOptions
  ): js.Promise[AuthenticatedMessage] = js.native
}

