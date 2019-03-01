package typings
package jqueryDotWindowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Register with JQuery instance
trait JQuery extends js.Object {
  def window(options: jqueryDotWindowLib.JQueryWindowNs.WindowOptions): jqueryDotWindowLib.JQueryWindowNs.Window
}

object JQuery {
  @scala.inline
  def apply(
    window: js.Function1[
      jqueryDotWindowLib.JQueryWindowNs.WindowOptions, 
      jqueryDotWindowLib.JQueryWindowNs.Window
    ]
  ): JQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("window")(window)
    __obj.asInstanceOf[JQuery]
  }
}

