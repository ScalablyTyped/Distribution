package typings.inboxsdk.mod.Lists

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
    orderHint: js.UndefOr[Double] = js.undefined,
    tooltip: String = null
  ): ImageDescriptor = {
    val __obj = js.Dynamic.literal(imageUrl = imageUrl.asInstanceOf[js.Any])
    if (imageClass != null) __obj.updateDynamic("imageClass")(imageClass.asInstanceOf[js.Any])
    if (!js.isUndefined(orderHint)) __obj.updateDynamic("orderHint")(orderHint.get.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageDescriptor]
  }
}

