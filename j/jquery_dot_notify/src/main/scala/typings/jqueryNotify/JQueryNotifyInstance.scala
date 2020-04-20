package typings.jqueryNotify

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
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), element = element.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], open = js.Any.fromFunction0(open), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryNotifyInstance]
  }
}

