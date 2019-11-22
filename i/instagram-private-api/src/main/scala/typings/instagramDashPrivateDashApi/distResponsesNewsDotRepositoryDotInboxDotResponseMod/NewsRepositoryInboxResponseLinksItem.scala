package typings.instagramDashPrivateDashApi.distResponsesNewsDotRepositoryDotInboxDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewsRepositoryInboxResponseLinksItem extends js.Object {
  var end: Double
  var id: String | Double
  var start: Double
  var `type`: String
}

object NewsRepositoryInboxResponseLinksItem {
  @scala.inline
  def apply(end: Double, id: String | Double, start: Double, `type`: String): NewsRepositoryInboxResponseLinksItem = {
    val __obj = js.Dynamic.literal(end = end, id = id.asInstanceOf[js.Any], start = start)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NewsRepositoryInboxResponseLinksItem]
  }
}

