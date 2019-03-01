package typings
package hellojsLib.hellojsMod.helloNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelloJSPopupOptions extends js.Object {
  var height: scala.Double
  var resizable: scala.Double
  var scrollbars: scala.Double
  var width: scala.Double
}

object HelloJSPopupOptions {
  @scala.inline
  def apply(height: scala.Double, resizable: scala.Double, scrollbars: scala.Double, width: scala.Double): HelloJSPopupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("resizable")(resizable)
    __obj.updateDynamic("scrollbars")(scrollbars)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[HelloJSPopupOptions]
  }
}

