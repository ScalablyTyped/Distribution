package typings
package intercomDashClientLib.tagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait List extends js.Object {
  var pages: intercomDashClientLib.Anon_Next
  var tags: js.Array[Tag]
  var total_count: scala.Double
  var `type`: intercomDashClientLib.intercomDashClientLibStrings.tagDOTlist
}

object List {
  @scala.inline
  def apply(
    pages: intercomDashClientLib.Anon_Next,
    tags: js.Array[Tag],
    total_count: scala.Double,
    `type`: intercomDashClientLib.intercomDashClientLibStrings.tagDOTlist
  ): List = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("pages")(pages)
    __obj.updateDynamic("tags")(tags)
    __obj.updateDynamic("total_count")(total_count)
    __obj.asInstanceOf[List]
  }
}

