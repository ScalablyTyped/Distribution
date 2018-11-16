package typings
package jqueryDotFancytreeLib.FancytreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FancytreeStatic extends js.Object {
  var buildType: java.lang.String = js.native
  var debugLevel: scala.Double = js.native
  var version: java.lang.String = js.native
  /** Throw an error if condition fails (debug method).  */
  def assert(cond: scala.Boolean, msg: java.lang.String): scala.Unit = js.native
  /** Return a function that executes *fn* at most every *timeout* ms. */
  def debounce[T /* <: js.Function1[/* repeated */js.Any, scala.Unit] */](timeout: scala.Double, fn: T): T = js.native
  /** Return a function that executes *fn* at most every *timeout* ms. */
  def debounce[T /* <: js.Function1[/* repeated */js.Any, scala.Unit] */](timeout: scala.Double, fn: T, invokeAsap: scala.Boolean): T = js.native
  /** Return a function that executes *fn* at most every *timeout* ms. */
  def debounce[T /* <: js.Function1[/* repeated */js.Any, scala.Unit] */](timeout: scala.Double, fn: T, invokeAsap: scala.Boolean, ctx: js.Any): T = js.native
  def debug(msg: java.lang.String): scala.Unit = js.native
  def error(msg: java.lang.String): scala.Unit = js.native
  def escapeHtml(s: java.lang.String): java.lang.String = js.native
  def getEventTarget(event: stdLib.Event): js.Object = js.native
  def getEventTargetType(event: stdLib.Event): java.lang.String = js.native
  def getNode(el: jqueryDotFancytreeLib.JQuery): FancytreeNode = js.native
  def getNode(el: stdLib.Element): FancytreeNode = js.native
  def getNode(el: stdLib.Event): FancytreeNode = js.native
  def info(msg: java.lang.String): scala.Unit = js.native
  /** Convert a keydown event to a string like 'ctrl+a', 'ctrl+shift+f2'.  */
  def keyEventToString(event: stdLib.Event): java.lang.String = js.native
  /** Parse tree data from HTML markup */
  def parseHtml($ul: jqueryDotFancytreeLib.JQuery): js.Array[NodeData] = js.native
  /** Add Fancytree extension definition to the list of globally available extensions. */
  def registerExtension(definition: js.Object): scala.Unit = js.native
  def unescapeHtml(s: java.lang.String): java.lang.String = js.native
  def warn(msg: java.lang.String): scala.Unit = js.native
}

