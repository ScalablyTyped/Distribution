package typings.ionic.authMod

import typings.ionic.definitionsMod.ResourceClientLoad
import typings.ionic.httpMod.ResourceClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/auth", "AuthConnectionClient")
@js.native
class AuthConnectionClient protected ()
  extends ResourceClient
     with ResourceClientLoad[AuthConnection] {
  def this(e: AuthClientDeps) = this()
  val e: AuthClientDeps = js.native
  def load(email: String): js.Promise[AuthConnection] = js.native
}

