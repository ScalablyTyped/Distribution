package typings.intercomDashClient

import typings.intercomDashClient.intercomDashClientStrings.tagDOTlist
import typings.intercomDashClient.userMod.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Taglist extends js.Object {
  var tags: js.Array[Tag]
  var `type`: tagDOTlist
}

object Anon_Taglist {
  @scala.inline
  def apply(tags: js.Array[Tag], `type`: tagDOTlist): Anon_Taglist = {
    val __obj = js.Dynamic.literal(tags = tags)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Taglist]
  }
}

