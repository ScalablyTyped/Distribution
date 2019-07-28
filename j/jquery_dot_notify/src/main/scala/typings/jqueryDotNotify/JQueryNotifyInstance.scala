package typings.jqueryDotNotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryNotifyInstance extends js.Object {
  var element: JQuery
  var isOpen: Boolean
  var options: JQueryNotifyOptions
  def close(): Unit
  def open(): Unit
}

object JQueryNotifyInstance {
  @scala.inline
  def apply(
    close: () => Unit,
    element: JQuery,
    isOpen: Boolean,
    open: () => Unit,
    options: JQueryNotifyOptions
  ): JQueryNotifyInstance = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), element = element, isOpen = isOpen, open = js.Any.fromFunction0(open), options = options)
  
    __obj.asInstanceOf[JQueryNotifyInstance]
  }
}

