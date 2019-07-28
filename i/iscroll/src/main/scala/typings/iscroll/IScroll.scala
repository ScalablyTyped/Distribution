package typings.iscroll

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("IScroll")
@js.native
class IScroll protected () extends js.Object {
  def this(element: String) = this()
  def this(element: HTMLElement) = this()
  def this(element: String, options: IScrollOptions) = this()
  def this(element: HTMLElement, options: IScrollOptions) = this()
  var scale: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def destroy(): Unit = js.native
  def disable(): Unit = js.native
  def enable(): Unit = js.native
  def goToPage(pageX: Double, pageY: Double): Unit = js.native
  def goToPage(pageX: Double, pageY: Double, time: Double): Unit = js.native
  def isReady(): Boolean = js.native
  def off(`type`: String): Unit = js.native
  def off(`type`: String, fn: js.Function1[/* evt */ js.UndefOr[js.Any], Unit]): Unit = js.native
  // Events
  def on(`type`: String, fn: js.Function1[/* evt */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def refresh(): Unit = js.native
  def scrollTo(x: Double, y: Double): Unit = js.native
  def scrollTo(x: Double, y: Double, time: Double): Unit = js.native
  def scrollTo(x: Double, y: Double, time: Double, relative: Boolean): Unit = js.native
  def scrollToElement(element: String): Unit = js.native
  def scrollToElement(element: String, time: Double): Unit = js.native
  def scrollToElement(element: HTMLElement): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Double): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Double, offsetX: Boolean): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Double, offsetX: Boolean, offsetY: Boolean): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Double, offsetX: Boolean, offsetY: Boolean, easing: js.Function): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Double, offsetX: Boolean, offsetY: Double): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Double, offsetX: Boolean, offsetY: Double, easing: js.Function): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Double, offsetX: Double): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Double, offsetX: Double, offsetY: Boolean): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Double, offsetX: Double, offsetY: Boolean, easing: js.Function): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Double, offsetX: Double, offsetY: Double): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Double, offsetX: Double, offsetY: Double, easing: js.Function): Unit = js.native
  def stop(): Unit = js.native
  def zoom(scale: Double): Unit = js.native
  def zoom(scale: Double, x: Double): Unit = js.native
  def zoom(scale: Double, x: Double, y: Double): Unit = js.native
  def zoom(scale: Double, x: Double, y: Double, time: Double): Unit = js.native
}

