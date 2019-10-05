package typings.jqueryDashEasyDashLoading.JQueryEasyLoading

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Static extends js.Object {
  /**
    * Extend the Loading plugin default settings with the user options
    * Use it as `$.Loading.setDefaults({ ... })`
    *
    * @param {Object} options Custom options to override the plugin defaults
    */
  def setDefaults(options: Options): Unit
}

object Static {
  @scala.inline
  def apply(setDefaults: Options => Unit): Static = {
    val __obj = js.Dynamic.literal(setDefaults = js.Any.fromFunction1(setDefaults))
  
    __obj.asInstanceOf[Static]
  }
}

