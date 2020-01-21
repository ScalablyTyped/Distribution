package typings.ionic.authMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthConnection extends js.Object {
  val uuid: String
}

object AuthConnection {
  @scala.inline
  def apply(uuid: String): AuthConnection = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AuthConnection]
  }
}

