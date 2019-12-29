package typings.intercomDashClient

import typings.intercomDashClient.intercomDashClientStrings.tagDotlist
import typings.intercomDashClient.userMod.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Taglist extends js.Object {
  var tags: js.Array[Tag]
  var `type`: tagDotlist
}

object Anon_Taglist {
  @scala.inline
  def apply(tags: js.Array[Tag], `type`: tagDotlist): Anon_Taglist = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Taglist]
  }
}

