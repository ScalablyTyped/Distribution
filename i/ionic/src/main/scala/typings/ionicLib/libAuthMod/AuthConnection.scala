package typings
package ionicLib.libAuthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthConnection extends js.Object {
  val uuid: java.lang.String
}

object AuthConnection {
  @scala.inline
  def apply(uuid: java.lang.String): AuthConnection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("uuid")(uuid)
    __obj.asInstanceOf[AuthConnection]
  }
}

