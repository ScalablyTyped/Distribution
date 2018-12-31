package typings
package jqueryDotAjaxfileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of the JQuery extension of the W3C event object
  */
@js.native
trait BaseJQueryEventObject
  extends stdLib.Event {
  var data: js.Any = js.native
  var delegateTarget: stdLib.Element = js.native
  var metaKey: scala.Boolean = js.native
  var namespace: java.lang.String = js.native
  var originalEvent: stdLib.Event = js.native
  var pageX: scala.Double = js.native
  var pageY: scala.Double = js.native
  var relatedTarget: stdLib.Element = js.native
  var result: js.Any = js.native
  @JSName("target")
  var target_BaseJQueryEventObject: stdLib.Element = js.native
  var which: scala.Double = js.native
  def isDefaultPrevented(): scala.Boolean = js.native
  def isImmediatePropagationStopped(): scala.Boolean = js.native
  def isPropagationStopped(): scala.Boolean = js.native
}

