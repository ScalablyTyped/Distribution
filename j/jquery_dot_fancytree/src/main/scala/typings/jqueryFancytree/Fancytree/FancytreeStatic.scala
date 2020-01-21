package typings.jqueryFancytree.Fancytree

import typings.jqueryFancytree.JQuery
import typings.std.Element
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FancytreeStatic extends js.Object {
  var buildType: String = js.native
  var debugLevel: Double = js.native
  var version: String = js.native
  /** Throw an error if condition fails (debug method).  */
  def assert(cond: Boolean, msg: String): Unit = js.native
  /** Return a function that executes *fn* at most every *timeout* ms. */
  def debounce[T /* <: js.Function1[/* repeated */ js.Any, Unit] */](timeout: Double, fn: T): T = js.native
  def debounce[T /* <: js.Function1[/* repeated */ js.Any, Unit] */](timeout: Double, fn: T, invokeAsap: Boolean): T = js.native
  def debounce[T /* <: js.Function1[/* repeated */ js.Any, Unit] */](timeout: Double, fn: T, invokeAsap: Boolean, ctx: js.Any): T = js.native
  def debug(msg: String): Unit = js.native
  def error(msg: String): Unit = js.native
  def escapeHtml(s: String): String = js.native
  def getEventTarget(event: Event_): js.Object = js.native
  def getEventTargetType(event: Event_): String = js.native
  def getNode(el: JQuery): FancytreeNode = js.native
  def getNode(el: Element): FancytreeNode = js.native
  def getNode(el: Event_): FancytreeNode = js.native
  def info(msg: String): Unit = js.native
  /** Convert a keydown event to a string like 'ctrl+a', 'ctrl+shift+f2'.  */
  def keyEventToString(event: Event_): String = js.native
  /** Parse tree data from HTML markup */
  def parseHtml($ul: JQuery): js.Array[NodeData] = js.native
  /** Add Fancytree extension definition to the list of globally available extensions. */
  def registerExtension(definition: js.Object): Unit = js.native
  def unescapeHtml(s: String): String = js.native
  def warn(msg: String): Unit = js.native
}

