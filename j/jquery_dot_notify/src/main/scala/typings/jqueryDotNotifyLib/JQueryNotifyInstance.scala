package typings
package jqueryDotNotifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryNotifyInstance extends js.Object {
  var element: JQuery
  var isOpen: scala.Boolean
  var options: JQueryNotifyOptions
  def close(): scala.Unit
  def open(): scala.Unit
}

object JQueryNotifyInstance {
  @scala.inline
  def apply(
    close: js.Function0[scala.Unit],
    element: JQuery,
    isOpen: scala.Boolean,
    open: js.Function0[scala.Unit],
    options: JQueryNotifyOptions
  ): JQueryNotifyInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("element")(element)
    __obj.updateDynamic("isOpen")(isOpen)
    __obj.updateDynamic("open")(open)
    __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[JQueryNotifyInstance]
  }
}

