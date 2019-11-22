package typings.instagramDashPrivateDashApi.distResponsesSavedDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedFeedResponseVariantValuesItem extends js.Object {
  var id: String
  var is_preselected: Boolean
  var name: String
  var value: String
  var visual_style: String
}

object SavedFeedResponseVariantValuesItem {
  @scala.inline
  def apply(id: String, is_preselected: Boolean, name: String, value: String, visual_style: String): SavedFeedResponseVariantValuesItem = {
    val __obj = js.Dynamic.literal(id = id, is_preselected = is_preselected, name = name, value = value, visual_style = visual_style)
  
    __obj.asInstanceOf[SavedFeedResponseVariantValuesItem]
  }
}

