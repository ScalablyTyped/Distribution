package typings.matrixJsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLongdescription extends js.Object {
  // <optional> Name of the group
  var avatar_url: String
  // <optional> A short description of the room
  var long_description: String
  var name: String
  // <optional> MXC avatar URL
  var short_description: String
}

object AnonLongdescription {
  @scala.inline
  def apply(avatar_url: String, long_description: String, name: String, short_description: String): AnonLongdescription = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], long_description = long_description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short_description = short_description.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLongdescription]
  }
}

