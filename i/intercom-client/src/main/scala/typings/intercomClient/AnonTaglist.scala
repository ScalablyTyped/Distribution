package typings.intercomClient

import typings.intercomClient.intercomClientStrings.tagDotlist
import typings.intercomClient.userMod.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTaglist extends js.Object {
  var tags: js.Array[Tag]
  var `type`: tagDotlist
}

object AnonTaglist {
  @scala.inline
  def apply(tags: js.Array[Tag], `type`: tagDotlist): AnonTaglist = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTaglist]
  }
}

