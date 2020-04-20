package typings.instagramPrivateApi.mediaUpdatedMediaResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaUpdatedMediaResponseTalliesItem extends js.Object {
  var count: Double
  var font_size: Double
  var text: String
}

object MediaUpdatedMediaResponseTalliesItem {
  @scala.inline
  def apply(count: Double, font_size: Double, text: String): MediaUpdatedMediaResponseTalliesItem = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], font_size = font_size.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaUpdatedMediaResponseTalliesItem]
  }
}

