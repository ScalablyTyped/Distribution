package typings.intercomDashClient.tagMod

import typings.intercomDashClient.Anon_Next
import typings.intercomDashClient.intercomDashClientStrings.tagDOTlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait List extends js.Object {
  var pages: Anon_Next
  var tags: js.Array[Tag]
  var total_count: Double
  var `type`: tagDOTlist
}

object List {
  @scala.inline
  def apply(pages: Anon_Next, tags: js.Array[Tag], total_count: Double, `type`: tagDOTlist): List = {
    val __obj = js.Dynamic.literal(pages = pages, tags = tags, total_count = total_count)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[List]
  }
}

