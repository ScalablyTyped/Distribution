package typings.ibmDashMobilefirst.WL.TabBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemOptions extends js.Object {
  var badge: js.UndefOr[String] = js.undefined
  var image: String
   // for iOS
  var imageSelected: js.UndefOr[String] = js.undefined
}

object ItemOptions {
  @scala.inline
  def apply(image: String, badge: String = null, imageSelected: String = null): ItemOptions = {
    val __obj = js.Dynamic.literal(image = image)
    if (badge != null) __obj.updateDynamic("badge")(badge)
    if (imageSelected != null) __obj.updateDynamic("imageSelected")(imageSelected)
    __obj.asInstanceOf[ItemOptions]
  }
}

