package typings
package ionicLib.libAuthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/auth", "AuthConnectionClient")
@js.native
class AuthConnectionClient protected ()
  extends ionicLib.libHttpMod.ResourceClient
     with ionicLib.definitionsMod.ResourceClientLoad[AuthConnection] {
  def this(e: AuthClientDeps) = this()
  val e: AuthClientDeps = js.native
  def load(email: java.lang.String): js.Promise[AuthConnection] = js.native
}

