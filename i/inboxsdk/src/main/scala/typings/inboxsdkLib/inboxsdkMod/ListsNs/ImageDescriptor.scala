package typings
package inboxsdkLib.inboxsdkMod.ListsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageDescriptor extends js.Object {
  var imageClass: js.UndefOr[java.lang.String] = js.undefined
  var imageUrl: java.lang.String
  var orderHint: js.UndefOr[scala.Double] = js.undefined
  var tooltip: js.UndefOr[java.lang.String] = js.undefined
}

object ImageDescriptor {
  @scala.inline
  def apply(
    imageUrl: java.lang.String,
    imageClass: java.lang.String = null,
    orderHint: scala.Int | scala.Double = null,
    tooltip: java.lang.String = null
  ): ImageDescriptor = {
    val __obj = js.Dynamic.literal(imageUrl = imageUrl)
    if (imageClass != null) __obj.updateDynamic("imageClass")(imageClass)
    if (orderHint != null) __obj.updateDynamic("orderHint")(orderHint.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[ImageDescriptor]
  }
}

