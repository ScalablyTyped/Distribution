package typings
package karmaDashViewportLib.KarmaViewportNs

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
  def this(config: Config, context: stdLib.Window) = this()
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
  val element: stdLib.HTMLIFrameElement = js.native
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
  def between(
    first: java.lang.String,
    last: java.lang.String,
    cb: js.Function1[/* name */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
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
  def each(cb: js.Function1[/* name */ java.lang.String, scala.Unit]): scala.Unit = js.native
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
  def from(first: java.lang.String, cb: js.Function1[/* name */ java.lang.String, scala.Unit]): scala.Unit = js.native
  /**
           * Load and embed document into viewport
           *
           * @param url - URL of document to load
           * @param cb - Callback to execute after document was loaded
           */
  def load(url: java.lang.String, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
           * Reset viewport
           */
  def reset(): scala.Unit = js.native
  /**
           * Set viewport to breakpoint identifier
           */
  def set(name: java.lang.String): scala.Unit = js.native
  /**
           * Set viewport to number or array
           */
  def set(width: scala.Double): scala.Unit = js.native
  /**
           * Set viewport to number or array
           */
  def set(width: scala.Double, height: scala.Double): scala.Unit = js.native
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
  def to(last: java.lang.String, cb: js.Function1[/* name */ java.lang.String, scala.Unit]): scala.Unit = js.native
}

