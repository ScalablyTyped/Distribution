package typings.inboxsdk.inboxsdkMod.ListsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageDescriptor extends js.Object {
  var imageClass: js.UndefOr[String] = js.undefined
  var imageUrl: String
  var orderHint: js.UndefOr[Double] = js.undefined
  var tooltip: js.UndefOr[String] = js.undefined
}

object ImageDescriptor {
  @scala.inline
  def apply(
    imageUrl: String,
    imageClass: String = null,
    orderHint: Int | Double = null,
    tooltip: String = null
  ): ImageDescriptor = {
    val __obj = js.Dynamic.literal(imageUrl = imageUrl)
    if (imageClass != null) __obj.updateDynamic("imageClass")(imageClass)
    if (orderHint != null) __obj.updateDynamic("orderHint")(orderHint.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[ImageDescriptor]
  }
}

