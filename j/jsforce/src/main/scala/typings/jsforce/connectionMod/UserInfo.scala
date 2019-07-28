package typings.jsforce.connectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserInfo extends js.Object {
  var id: String
  var organizationId: String
  var url: String
}

object UserInfo {
  @scala.inline
  def apply(id: String, organizationId: String, url: String): UserInfo = {
    val __obj = js.Dynamic.literal(id = id, organizationId = organizationId, url = url)
  
    __obj.asInstanceOf[UserInfo]
  }
}

