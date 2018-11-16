package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Draggable")
@js.native
class Draggable protected () extends Evented {
  def this(element: stdLib.HTMLElement) = this()
  def this(element: stdLib.HTMLElement, dragStartTarget: stdLib.HTMLElement) = this()
  def this(element: stdLib.HTMLElement, dragStartTarget: stdLib.HTMLElement, preventOutline: scala.Boolean) = this()
  def disable(): scala.Unit = js.native
  def enable(): scala.Unit = js.native
  def finishDrag(): scala.Unit = js.native
}

