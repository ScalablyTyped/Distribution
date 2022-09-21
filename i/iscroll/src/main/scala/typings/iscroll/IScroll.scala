package typings.iscroll

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScroll extends StObject {
  
  def destroy(): Unit = js.native
  
  def disable(): Unit = js.native
  
  def enable(): Unit = js.native
  
  def goToPage(pageX: Double, pageY: Double): Unit = js.native
  def goToPage(pageX: Double, pageY: Double, time: Double): Unit = js.native
  
  def isReady(): Boolean = js.native
  
  def off(`type`: String): Unit = js.native
  def off(`type`: String, fn: js.Function1[/* evt */ js.UndefOr[Any], Unit]): Unit = js.native
  
  // Events
  def on(`type`: String, fn: js.Function0[Unit]): Unit = js.native
  // Events
  def on(`type`: String, fn: js.Function1[/* evt */ js.UndefOr[Any], Unit]): Unit = js.native
  
  def refresh(): Unit = js.native
  
  var scale: Double = js.native
  
  def scrollTo(x: Double, y: Double): Unit = js.native
  def scrollTo(x: Double, y: Double, time: Double): Unit = js.native
  def scrollTo(x: Double, y: Double, time: Double, relative: Boolean): Unit = js.native
  def scrollTo(x: Double, y: Double, time: Unit, relative: Boolean): Unit = js.native
  
  def scrollToElement(element: String): Unit = js.native
  def scrollToElement(element: String, time: Double): Unit = js.native
  def scrollToElement(element: HTMLElement): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Double): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Double, offsetX: Boolean): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Double, offsetX: Boolean, offsetY: Boolean): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Double, offsetX: Boolean, offsetY: Boolean, easing: js.Function): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Double, offsetX: Boolean, offsetY: Double): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Double, offsetX: Boolean, offsetY: Double, easing: js.Function): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Double, offsetX: Boolean, offsetY: Unit, easing: js.Function): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Double, offsetX: Double): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Double, offsetX: Double, offsetY: Boolean): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Double, offsetX: Double, offsetY: Boolean, easing: js.Function): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Double, offsetX: Double, offsetY: Double): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Double, offsetX: Double, offsetY: Double, easing: js.Function): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Double, offsetX: Double, offsetY: Unit, easing: js.Function): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Double, offsetX: Unit, offsetY: Boolean): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Double, offsetX: Unit, offsetY: Boolean, easing: js.Function): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Double, offsetX: Unit, offsetY: Double): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Double, offsetX: Unit, offsetY: Double, easing: js.Function): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Double, offsetX: Unit, offsetY: Unit, easing: js.Function): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Unit, offsetX: Boolean): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Unit, offsetX: Boolean, offsetY: Boolean): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Unit, offsetX: Boolean, offsetY: Boolean, easing: js.Function): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Unit, offsetX: Boolean, offsetY: Double): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Unit, offsetX: Boolean, offsetY: Double, easing: js.Function): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Unit, offsetX: Boolean, offsetY: Unit, easing: js.Function): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Unit, offsetX: Double): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Unit, offsetX: Double, offsetY: Boolean): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Unit, offsetX: Double, offsetY: Boolean, easing: js.Function): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Unit, offsetX: Double, offsetY: Double): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Unit, offsetX: Double, offsetY: Double, easing: js.Function): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Unit, offsetX: Double, offsetY: Unit, easing: js.Function): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Unit, offsetX: Unit, offsetY: Boolean): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Unit, offsetX: Unit, offsetY: Boolean, easing: js.Function): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Unit, offsetX: Unit, offsetY: Double): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Unit, offsetX: Unit, offsetY: Double, easing: js.Function): Unit = js.native
  def scrollToElement(element: HTMLElement, time: Unit, offsetX: Unit, offsetY: Unit, easing: js.Function): Unit = js.native
  
  def stop(): Unit = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
  
  def zoom(scale: Double): Unit = js.native
  def zoom(scale: Double, x: Double): Unit = js.native
  def zoom(scale: Double, x: Double, y: Double): Unit = js.native
  def zoom(scale: Double, x: Double, y: Double, time: Double): Unit = js.native
  def zoom(scale: Double, x: Double, y: Unit, time: Double): Unit = js.native
  def zoom(scale: Double, x: Unit, y: Double): Unit = js.native
  def zoom(scale: Double, x: Unit, y: Double, time: Double): Unit = js.native
  def zoom(scale: Double, x: Unit, y: Unit, time: Double): Unit = js.native
}
