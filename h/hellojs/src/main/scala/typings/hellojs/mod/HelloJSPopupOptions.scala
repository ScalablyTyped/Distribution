package typings.hellojs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelloJSPopupOptions extends js.Object {
  var height: Double
  var resizable: Double
  var scrollbars: Double
  var width: Double
}

object HelloJSPopupOptions {
  @scala.inline
  def apply(height: Double, resizable: Double, scrollbars: Double, width: Double): HelloJSPopupOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], resizable = resizable.asInstanceOf[js.Any], scrollbars = scrollbars.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HelloJSPopupOptions]
  }
}

