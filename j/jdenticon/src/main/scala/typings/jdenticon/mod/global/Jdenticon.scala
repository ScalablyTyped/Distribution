package typings.jdenticon.mod.global

import typings.node.Buffer
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Jdenticon extends js.Object {
  /**
    * Specifies the color options for the generated icons. This is the only supported method of setting identicon
    * styles when used in a Node environment.
    * 
    * In browsers {@link jdenticon_config} is the prefered way of setting an identicon style to avoid a race
    * condition where the style is set before the Jdetnicon lib has loaded, leading to an unhandled error.
    */
  var config: js.UndefOr[JdenticonConfig] = js.native
  /**
    * Specifies the version of the Jdenticon package in use.
    */
  val version: String = js.native
  /**
    * Updates all canvas elements with the `data-jdenticon-hash` or `data-jdenticon-value` attribute.
    * 
    * @remarks
    * This method is only available in the browser. Calling this method on Node.js will throw an error.
    */
  def apply(): Unit = js.native
  /**
    * Draws an identicon to a context.
    * @param ctx Canvas context on which the icon will be drawn at location (0, 0).
    * @param hashOrValue A hexadecimal hash string or any value that will be hashed by Jdenticon.
    * @param size Icon size in pixels.
    * @param config Optional configuration. If specified, this configuration object overrides any global
    * configuration in its entirety. For backward compability a padding value in the range [0.0, 0.5) can be
    * specified in place of a configuration object.
    */
  def drawIcon(ctx: JdenticonCompatibleCanvasRenderingContext2D, hashOrValue: js.Any, size: Double): Unit = js.native
  def drawIcon(
    ctx: JdenticonCompatibleCanvasRenderingContext2D,
    hashOrValue: js.Any,
    size: Double,
    config: Double
  ): Unit = js.native
  def drawIcon(
    ctx: JdenticonCompatibleCanvasRenderingContext2D,
    hashOrValue: js.Any,
    size: Double,
    config: JdenticonConfig
  ): Unit = js.native
  /**
    * Draws an identicon as PNG.
    * 
    * @remarks
    * This method is not available in the browser.
    * 
    * @param hashOrValue A hexadecimal hash string or any value that will be hashed by Jdenticon.
    * @param size Icon size in pixels.
    * @param config Optional configuration. If specified, this configuration object overrides any global
    * configuration in its entirety. For backward compability a padding value in the range [0.0, 0.5) can be
    * specified in place of a configuration object.
    * @returns PNG data
    */
  def toPng(hashOrValue: js.Any, size: Double): Buffer = js.native
  def toPng(hashOrValue: js.Any, size: Double, config: Double): Buffer = js.native
  def toPng(hashOrValue: js.Any, size: Double, config: JdenticonConfig): Buffer = js.native
  /**
    * Draws an identicon as an SVG string.
    * @param hashOrValue A hexadecimal hash string or any value that will be hashed by Jdenticon.
    * @param size Icon size in pixels.
    * @param config Optional configuration. If specified, this configuration object overrides any global
    * configuration in its entirety. For backward compability a padding value in the range [0.0, 0.5) can be
    * specified in place of a configuration object.
    * @returns SVG string
    */
  def toSvg(hashOrValue: js.Any, size: Double): String = js.native
  def toSvg(hashOrValue: js.Any, size: Double, config: Double): String = js.native
  def toSvg(hashOrValue: js.Any, size: Double, config: JdenticonConfig): String = js.native
  def update(elementOrSelector: String): Unit = js.native
  def update(elementOrSelector: String, hashOrValue: js.Any): Unit = js.native
  def update(elementOrSelector: String, hashOrValue: js.Any, config: Double): Unit = js.native
  def update(elementOrSelector: String, hashOrValue: js.Any, config: JdenticonConfig): Unit = js.native
  /**
    * Updates the identicon in the specified canvas or svg elements.
    * 
    * @remarks
    * This method is only available in the browser. Calling this method on Node.js will throw an error.
    * 
    * @param elementOrSelector Specifies the container in which the icon is rendered as a DOM element of the type
    * `<svg>` or `<canvas>`, or a CSS selector to such an element.
    * @param hash Optional hash or value to be rendered. If not specified, the `data-jdenticon-hash` or
    * `data-jdenticon-value` attribute will be evaluated.
    * @param config Optional configuration. If specified, this configuration object overrides any global
    * configuration in its entirety. For backward compability a padding value in the range [0.0, 0.5) can be
    * specified in place of a configuration object.
    */
  def update(elementOrSelector: HTMLElement): Unit = js.native
  def update(elementOrSelector: HTMLElement, hashOrValue: js.Any): Unit = js.native
  def update(elementOrSelector: HTMLElement, hashOrValue: js.Any, config: Double): Unit = js.native
  def update(elementOrSelector: HTMLElement, hashOrValue: js.Any, config: JdenticonConfig): Unit = js.native
}

