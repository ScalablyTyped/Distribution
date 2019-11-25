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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], organizationId = organizationId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserInfo]
  }
}

