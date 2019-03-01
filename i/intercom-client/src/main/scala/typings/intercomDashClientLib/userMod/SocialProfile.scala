package typings
package intercomDashClientLib.userMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocialProfile extends js.Object {
  val id: java.lang.String | scala.Null
  var name: intercomDashClientLib.intercomDashClientLibStrings.Twitter
  var url: java.lang.String | scala.Null
  var username: java.lang.String | scala.Null
}

object SocialProfile {
  @scala.inline
  def apply(
    name: intercomDashClientLib.intercomDashClientLibStrings.Twitter,
    id: java.lang.String = null,
    url: java.lang.String = null,
    username: java.lang.String = null
  ): SocialProfile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (id != null) __obj.updateDynamic("id")(id)
    if (url != null) __obj.updateDynamic("url")(url)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[SocialProfile]
  }
}

