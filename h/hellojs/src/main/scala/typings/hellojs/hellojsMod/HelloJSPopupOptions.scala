package typings.hellojs.hellojsMod

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
    val __obj = js.Dynamic.literal(height = height, resizable = resizable, scrollbars = scrollbars, width = width)
  
    __obj.asInstanceOf[HelloJSPopupOptions]
  }
}

