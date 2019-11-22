package typings.instagramDashPrivateDashApi.distResponsesLocationDotRepositoryDotStoryDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationRepositoryStoryResponseVideoVersionsItem extends js.Object {
  var height: Double
  var id: String
  var `type`: Double
  var url: String
  var width: Double
}

object LocationRepositoryStoryResponseVideoVersionsItem {
  @scala.inline
  def apply(height: Double, id: String, `type`: Double, url: String, width: Double): LocationRepositoryStoryResponseVideoVersionsItem = {
    val __obj = js.Dynamic.literal(height = height, id = id, url = url, width = width)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LocationRepositoryStoryResponseVideoVersionsItem]
  }
}

