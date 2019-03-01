package typings
package jsforceLib.connectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserInfo extends js.Object {
  var id: java.lang.String
  var organizationId: java.lang.String
  var url: java.lang.String
}

object UserInfo {
  @scala.inline
  def apply(id: java.lang.String, organizationId: java.lang.String, url: java.lang.String): UserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("organizationId")(organizationId)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[UserInfo]
  }
}

