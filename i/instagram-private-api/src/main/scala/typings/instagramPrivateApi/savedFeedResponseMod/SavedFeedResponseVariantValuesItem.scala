package typings.instagramPrivateApi.savedFeedResponseMod

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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], is_preselected = is_preselected.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visual_style = visual_style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedFeedResponseVariantValuesItem]
  }
}

