package typings
package ionicLib.libAuthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthClientDeps extends js.Object {
  val client: ionicLib.definitionsMod.IClient
}

object AuthClientDeps {
  @scala.inline
  def apply(client: ionicLib.definitionsMod.IClient): AuthClientDeps = {
    val __obj = js.Dynamic.literal(client = client)
  
    __obj.asInstanceOf[AuthClientDeps]
  }
}

