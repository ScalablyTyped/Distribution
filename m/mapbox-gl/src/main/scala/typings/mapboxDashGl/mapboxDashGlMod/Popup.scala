package typings.mapboxDashGl.mapboxDashGlMod

import typings.std.HTMLElement
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "Popup")
@js.native
class Popup () extends Evented {
  def this(options: PopupOptions) = this()
  def addTo(map: Map): this.type = js.native
  /** Returns the `Popup`'s HTML element. */
  def getElement(): HTMLElement = js.native
  def getLngLat(): LngLat = js.native
  def getMaxWidth(): String = js.native
  def isOpen(): Boolean = js.native
  def remove(): this.type = js.native
  def setDOMContent(htmlNode: Node): this.type = js.native
  def setHTML(html: String): this.type = js.native
  /**
    * Sets the geographical location of the popup's anchor, and moves the popup to it. Replaces trackPointer() behavior.
    *
    * @param lnglat The geographical location to set as the popup's anchor.
    */
  def setLngLat(lnglat: LngLatLike): this.type = js.native
  def setMaxWidth(maxWidth: String): this.type = js.native
  def setText(text: String): this.type = js.native
  /**
    * Tracks the popup anchor to the cursor position, on screens with a pointer device (will be hidden on touchscreens). Replaces the setLngLat behavior.
    * For most use cases, `closeOnClick` and `closeButton` should also be set to `false` here.
    */
  def trackPointer(): this.type = js.native
}

