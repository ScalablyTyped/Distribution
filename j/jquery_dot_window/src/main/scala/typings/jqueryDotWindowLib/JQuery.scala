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
    window: jqueryDotWindowLib.JQueryWindowNs.WindowOptions => jqueryDotWindowLib.JQueryWindowNs.Window
  ): JQuery = {
    val __obj = js.Dynamic.literal(window = js.Any.fromFunction1(window))
  
    __obj.asInstanceOf[JQuery]
  }
}

