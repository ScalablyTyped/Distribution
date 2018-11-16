package typings
package iscrollLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("IScroll")
@js.native
class IScroll protected () extends js.Object {
  def this(element: java.lang.String) = this()
  def this(element: stdLib.HTMLElement) = this()
  def this(element: java.lang.String, options: IScrollOptions) = this()
  def this(element: stdLib.HTMLElement, options: IScrollOptions) = this()
  var scale: scala.Double = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  def destroy(): scala.Unit = js.native
  def disable(): scala.Unit = js.native
  def enable(): scala.Unit = js.native
  def goToPage(pageX: scala.Double, pageY: scala.Double): scala.Unit = js.native
  def goToPage(pageX: scala.Double, pageY: scala.Double, time: scala.Double): scala.Unit = js.native
  def isReady(): scala.Boolean = js.native
  def off(`type`: java.lang.String): scala.Unit = js.native
  def off(`type`: java.lang.String, fn: js.Function1[/* evt */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
  // Events
  def on(`type`: java.lang.String, fn: js.Function1[/* evt */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def scrollTo(x: scala.Double, y: scala.Double, time: scala.Double): scala.Unit = js.native
  def scrollTo(x: scala.Double, y: scala.Double, time: scala.Double, relative: scala.Boolean): scala.Unit = js.native
  def scrollToElement(element: java.lang.String): scala.Unit = js.native
  def scrollToElement(element: java.lang.String, time: scala.Double): scala.Unit = js.native
  def scrollToElement(element: stdLib.HTMLElement): scala.Unit = js.native
  def scrollToElement(element: stdLib.HTMLElement, time: scala.Double): scala.Unit = js.native
  def scrollToElement(element: stdLib.HTMLElement, time: scala.Double, offsetX: scala.Boolean): scala.Unit = js.native
  def scrollToElement(element: stdLib.HTMLElement, time: scala.Double, offsetX: scala.Boolean, offsetY: scala.Boolean): scala.Unit = js.native
  def scrollToElement(
    element: stdLib.HTMLElement,
    time: scala.Double,
    offsetX: scala.Boolean,
    offsetY: scala.Boolean,
    easing: js.Function
  ): scala.Unit = js.native
  def scrollToElement(element: stdLib.HTMLElement, time: scala.Double, offsetX: scala.Boolean, offsetY: scala.Double): scala.Unit = js.native
  def scrollToElement(
    element: stdLib.HTMLElement,
    time: scala.Double,
    offsetX: scala.Boolean,
    offsetY: scala.Double,
    easing: js.Function
  ): scala.Unit = js.native
  def scrollToElement(element: stdLib.HTMLElement, time: scala.Double, offsetX: scala.Double): scala.Unit = js.native
  def scrollToElement(element: stdLib.HTMLElement, time: scala.Double, offsetX: scala.Double, offsetY: scala.Boolean): scala.Unit = js.native
  def scrollToElement(
    element: stdLib.HTMLElement,
    time: scala.Double,
    offsetX: scala.Double,
    offsetY: scala.Boolean,
    easing: js.Function
  ): scala.Unit = js.native
  def scrollToElement(element: stdLib.HTMLElement, time: scala.Double, offsetX: scala.Double, offsetY: scala.Double): scala.Unit = js.native
  def scrollToElement(
    element: stdLib.HTMLElement,
    time: scala.Double,
    offsetX: scala.Double,
    offsetY: scala.Double,
    easing: js.Function
  ): scala.Unit = js.native
  def stop(): scala.Unit = js.native
  def zoom(scale: scala.Double): scala.Unit = js.native
  def zoom(scale: scala.Double, x: scala.Double): scala.Unit = js.native
  def zoom(scale: scala.Double, x: scala.Double, y: scala.Double): scala.Unit = js.native
  def zoom(scale: scala.Double, x: scala.Double, y: scala.Double, time: scala.Double): scala.Unit = js.native
}

