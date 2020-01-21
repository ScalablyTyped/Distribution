package typings.loopback

import typings.loopback.mod.ACL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccessTokenIdLength extends js.Object {
  var accessTokenIdLength: Double
  var acls: js.Array[ACL]
  var http: AnonPath
}

object AnonAccessTokenIdLength {
  @scala.inline
  def apply(accessTokenIdLength: Double, acls: js.Array[ACL], http: AnonPath): AnonAccessTokenIdLength = {
    val __obj = js.Dynamic.literal(accessTokenIdLength = accessTokenIdLength.asInstanceOf[js.Any], acls = acls.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAccessTokenIdLength]
  }
}

