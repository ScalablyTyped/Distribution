package typings.karmaDashViewport.distAdapterViewportMod

import typings.std.HTMLIFrameElement
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("karma-viewport/dist/adapter/viewport", "Viewport")
@js.native
class Viewport protected () extends js.Object {
  /**
    * Create viewport resizer
    *
    * @constructor
    *
    * @param config - Viewport configuration
    * @param parent - Initialization context
    */
  def this(config: ViewportConfiguration, parent: Window) = this()
  /**
    * Viewport configuration
    */
  var config: ViewportConfiguration = js.native
  /**
    * Viewport context
    */
  var context: HTMLIFrameElement = js.native
  /**
    * Execute a callback for all breakpoints between the first and last given
    *
    * If the callback return value is a Promise, callback invocations will be
    * chained to guarantee sequential execution.
    *
    * @example
    *   viewport.between("mobile", "tablet", name => {
    *     ...
    *   })
    *
    * @param first - First breakpoint name
    * @param last - Last breakpoint name
    * @param cb - Callback to execute after resizing
    *
    * @return Promise resolving with no result
    */
  def between[T /* <: js.Promise[_] */](first: String, last: String, cb: ViewportCallback[T]): js.Promise[Unit] = js.native
  @JSName("between")
  def between_T_Unit[T](first: String, last: String, cb: ViewportCallback[T]): Unit = js.native
  /**
    * Execute a callback for all breakpoints
    *
    * @example
    *   viewport.each(name => {
    *     ...
    *   })
    *
    * @param cb - Callback to execute after resizing
    *
    * @return Promise resolving with no result
    */
  def each[T /* <: js.Promise[_] */](cb: ViewportCallback[T]): js.Promise[Unit] = js.native
  @JSName("each")
  def each_T_Unit[T](cb: ViewportCallback[T]): Unit = js.native
  /**
    * Execute a callback starting at the given breakpoint
    *
    * @example
    *   viewport.from("tablet", name => {
    *     ...
    *   })
    *
    * @param first - First breakpoint name
    * @param cb - Callback to execute after resizing
    *
    * @return Promise resolving with no result
    */
  def from[T /* <: js.Promise[_] */](first: String, cb: ViewportCallback[T]): js.Promise[Unit] = js.native
  @JSName("from")
  def from_T_Unit[T](first: String, cb: ViewportCallback[T]): Unit = js.native
  /**
    * Load and embed document into viewport
    *
    * @param url - URL of document to load
    *
    * @return Promise resolving with no result
    */
  def load(url: String): js.Promise[Unit] = js.native
  def load(url: String, cb: js.Function0[Unit]): js.Promise[Unit] = js.native
  /**
    * Change viewport offset (scroll within iframe)
    *
    * @param x - Horizontal offset
    * @param y - Vertical offset
    */
  def offset(x: Double): Unit = js.native
  def offset(x: Double, y: Double): Unit = js.native
  /**
    * Reset viewport
    */
  def reset(): Unit = js.native
  def set(breakpoint: String): Unit = js.native
  /**
    * Set viewport to width (and height) or breakpoint name
    *
    * @param widthOrBreakpoint - Width in pixels or breakpoint name
    * @param height - Height in pixels
    */
  def set(width: Double): Unit = js.native
  def set(width: Double, height: Double): Unit = js.native
  /**
    * Execute a callback ending at the given breakpoint
    *
    * @example
    *   viewport.to("tablet", name => {
    *     ...
    *   })
    *
    * @param last - Last breakpoint name
    * @param cb - Callback to execute after resizing
    *
    * @return Promise resolving with no result
    */
  def to[T /* <: js.Promise[_] */](last: String, cb: ViewportCallback[T]): js.Promise[Unit] = js.native
  @JSName("to")
  def to_T_Unit[T](last: String, cb: ViewportCallback[T]): Unit = js.native
}

