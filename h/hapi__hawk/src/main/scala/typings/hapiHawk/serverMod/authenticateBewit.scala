package typings.hapiHawk.serverMod

import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@hapi/hawk/lib/server", "authenticateBewit")
@js.native
object authenticateBewit extends js.Object {
  
  def apply(req: IncomingMessage, credentialsFunc: CredentialsFunc): AuthenticatedBewit = js.native
  def apply(req: IncomingMessage, credentialsFunc: CredentialsFunc, options: AuthenticateBewitOptions): AuthenticatedBewit = js.native
}
