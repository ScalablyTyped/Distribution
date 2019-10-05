package typings.jqueryDotWindow

import typings.jqueryDotWindow.JQueryWindow.Window
import typings.jqueryDotWindow.JQueryWindow.WindowOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Register with JQuery instance
trait JQuery extends js.Object {
  def window(options: WindowOptions): Window
}

object JQuery {
  @scala.inline
  def apply(window: WindowOptions => Window): JQuery = {
    val __obj = js.Dynamic.literal(window = js.Any.fromFunction1(window))
  
    __obj.asInstanceOf[JQuery]
  }
}

