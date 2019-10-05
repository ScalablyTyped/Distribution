package typings.karmaDashViewport.KarmaViewport

import typings.std.HTMLIFrameElement
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("KarmaViewport.Viewport")
@js.native
class Viewport protected () extends js.Object {
  /**
    * Create viewport resizer
    *
    * @param config - Configuration
    * @param context - Initialization context
    */
  def this(config: Config, context: Window) = this()
  /**
    * Retrieve configuration
    *
    * @return Configuration
    */
  val config: Config = js.native
   // get config()
  /**
    * Retrieve context element
    *
    * @return context element
    */
  val element: HTMLIFrameElement = js.native
  /**
    * Execute a callback for all breakpoints between the first and last given
    *
    * @example
    *   viewport.between("mobile", "tablet", name => {
    *     ...
    *   })
    *
    * @param first - First breakpoint name
    * @param last - Last breakpoint name
    * @param cb - Callback to execute after resizing
    */
  def between(first: String, last: String, cb: js.Function1[/* name */ String, Unit]): Unit = js.native
  /**
    * Execute a callback for all breakpoints
    *
    * @example
    *   viewport.each(name => {
    *     ...
    *   })
    *
    * @param cb - Callback to execute after resizing
    */
  def each(cb: js.Function1[/* name */ String, Unit]): Unit = js.native
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
    */
  def from(first: String, cb: js.Function1[/* name */ String, Unit]): Unit = js.native
  /**
    * Load and embed document into viewport
    *
    * @param url - URL of document to load
    * @param cb - Callback to execute after document was loaded
    */
  def load(url: String, cb: js.Function0[Unit]): Unit = js.native
  /**
    * Reset viewport
    */
  def reset(): Unit = js.native
  /**
    * Set viewport to breakpoint identifier
    */
  def set(name: String): Unit = js.native
  /**
    * Set viewport to number or array
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
    */
  def to(last: String, cb: js.Function1[/* name */ String, Unit]): Unit = js.native
}

