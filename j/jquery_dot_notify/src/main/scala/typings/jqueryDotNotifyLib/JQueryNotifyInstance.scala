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
    close: () => scala.Unit,
    element: JQuery,
    isOpen: scala.Boolean,
    open: () => scala.Unit,
    options: JQueryNotifyOptions
  ): JQueryNotifyInstance = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), element = element, isOpen = isOpen, open = js.Any.fromFunction0(open), options = options)
  
    __obj.asInstanceOf[JQueryNotifyInstance]
  }
}

