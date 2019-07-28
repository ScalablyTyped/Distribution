package typings.jqueryDotFullscreen

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the jquery plugin
  */
@js.native
trait JQueryFullscreen extends js.Object {
  /**
  	 * [close Deactivate fullscreen mode]
  	 * TODO: have to check for params
  	 */
  def close(): Unit = js.native
  /**
  	 * [exit Deactivate and destroy all fullscreen instances]
  	 */
  def exit(): Unit = js.native
  /**
  	 * [isFullScreen Get fullscreen status]
  	 * @return {boolean} [description]
  	 */
  def isFullScreen(): Boolean = js.native
  /**
  	 * [isNativelySupported Check if fullscreen is supported by the browser]
  	 * @return {boolean} [description]
  	 */
  def isNativelySupported(): Boolean = js.native
  /**
  	 * [open Activate fullscreen mode in a specific element through static method]
  	 * @param {Element} element [description]
  	 * @param {Object}  options [description]
  	 */
  def open(element: Element): Unit = js.native
  def open(element: Element, options: js.Object): Unit = js.native
}

