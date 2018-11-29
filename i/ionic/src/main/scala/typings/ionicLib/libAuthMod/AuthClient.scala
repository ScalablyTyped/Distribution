package typings
package ionicLib.libAuthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/auth", "AuthClient")
@js.native
class AuthClient protected ()
  extends ionicLib.libHttpMod.ResourceClient {
  def this(e: AuthClientDeps) = this()
  val connections: AuthConnectionClient = js.native
  val e: AuthClientDeps = js.native
}

