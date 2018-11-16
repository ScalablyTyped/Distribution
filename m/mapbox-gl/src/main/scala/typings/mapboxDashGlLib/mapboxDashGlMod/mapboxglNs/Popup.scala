package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Popup extends Evented {
  def addTo(map: Map): this.type = js.native
  def getLngLat(): LngLat = js.native
  def isOpen(): scala.Boolean = js.native
  def remove(): this.type = js.native
  def setDOMContent(htmlNode: stdLib.Node): this.type = js.native
  def setHTML(html: java.lang.String): this.type = js.native
  def setLngLat(lnglat: LngLatLike): this.type = js.native
  def setText(text: java.lang.String): this.type = js.native
}

