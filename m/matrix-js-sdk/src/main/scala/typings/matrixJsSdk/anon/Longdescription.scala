package typings.matrixJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Longdescription extends js.Object {
  // <optional> Name of the group
  var avatar_url: String
  // <optional> A short description of the room
  var long_description: String
  var name: String
  // <optional> MXC avatar URL
  var short_description: String
}

object Longdescription {
  @scala.inline
  def apply(avatar_url: String, long_description: String, name: String, short_description: String): Longdescription = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], long_description = long_description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short_description = short_description.asInstanceOf[js.Any])
    __obj.asInstanceOf[Longdescription]
  }
}

