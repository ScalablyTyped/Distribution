package typings.intercomClient.tagMod

import typings.intercomClient.AnonNext
import typings.intercomClient.intercomClientStrings.tagDotlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait List extends js.Object {
  var pages: AnonNext
  var tags: js.Array[Tag]
  var total_count: Double
  var `type`: tagDotlist
}

object List {
  @scala.inline
  def apply(pages: AnonNext, tags: js.Array[Tag], total_count: Double, `type`: tagDotlist): List = {
    val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[List]
  }
}

