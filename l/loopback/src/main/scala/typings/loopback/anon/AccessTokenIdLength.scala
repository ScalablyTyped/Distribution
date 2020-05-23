package typings.loopback.anon

import typings.loopback.mod.ACL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessTokenIdLength extends js.Object {
  var accessTokenIdLength: Double
  var acls: js.Array[ACL]
  var http: Path
}

object AccessTokenIdLength {
  @scala.inline
  def apply(accessTokenIdLength: Double, acls: js.Array[ACL], http: Path): AccessTokenIdLength = {
    val __obj = js.Dynamic.literal(accessTokenIdLength = accessTokenIdLength.asInstanceOf[js.Any], acls = acls.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessTokenIdLength]
  }
}

