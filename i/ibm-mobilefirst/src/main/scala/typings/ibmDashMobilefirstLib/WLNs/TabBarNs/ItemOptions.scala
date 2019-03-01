package typings
package ibmDashMobilefirstLib.WLNs.TabBarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemOptions extends js.Object {
  var badge: js.UndefOr[java.lang.String] = js.undefined
  var image: java.lang.String
   // for iOS
  var imageSelected: js.UndefOr[java.lang.String] = js.undefined
}

object ItemOptions {
  @scala.inline
  def apply(image: java.lang.String, badge: java.lang.String = null, imageSelected: java.lang.String = null): ItemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("image")(image)
    if (badge != null) __obj.updateDynamic("badge")(badge)
    if (imageSelected != null) __obj.updateDynamic("imageSelected")(imageSelected)
    __obj.asInstanceOf[ItemOptions]
  }
}

