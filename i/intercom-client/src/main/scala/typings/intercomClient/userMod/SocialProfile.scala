package typings.intercomClient.userMod

import typings.intercomClient.intercomClientStrings.Twitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocialProfile extends js.Object {
  val id: String | Null
  var name: Twitter
  var url: String | Null
  var username: String | Null
}

object SocialProfile {
  @scala.inline
  def apply(name: Twitter, id: String = null, url: String = null, username: String = null): SocialProfile = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocialProfile]
  }
}

