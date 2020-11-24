package typings.hapiHawk.clientMod

import typings.hapiHawk.cryptoMod.Artifacts
import typings.node.httpMod.IncomingMessage
import typings.request.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@hapi/hawk/lib/client", "authenticate")
@js.native
object authenticate extends js.Object {
  
  def apply(res: IncomingMessage, credentials: Credentials, artifacts: Artifacts): Authentication = js.native
  def apply(res: IncomingMessage, credentials: Credentials, artifacts: Artifacts, options: AuthenticateOptions): Authentication = js.native
  def apply(res: Response, credentials: Credentials, artifacts: Artifacts): Authentication = js.native
  def apply(res: Response, credentials: Credentials, artifacts: Artifacts, options: AuthenticateOptions): Authentication = js.native
}
