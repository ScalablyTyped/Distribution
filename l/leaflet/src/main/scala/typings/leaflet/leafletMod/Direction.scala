package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.leaflet.leafletStrings.right
  - typings.leaflet.leafletStrings.left
  - typings.leaflet.leafletStrings.top
  - typings.leaflet.leafletStrings.bottom
  - typings.leaflet.leafletStrings.center
  - typings.leaflet.leafletStrings.auto
*/
trait Direction extends js.Object

object Direction {
  @scala.inline
  def auto: typings.leaflet.leafletStrings.auto = this.cast("auto")
  @scala.inline
  def bottom: typings.leaflet.leafletStrings.bottom = this.cast("bottom")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typings.leaflet.leafletStrings.center = this.cast("center")
  @scala.inline
  def left: typings.leaflet.leafletStrings.left = this.cast("left")
  @scala.inline
  def right: typings.leaflet.leafletStrings.right = this.cast("right")
  @scala.inline
  def top: typings.leaflet.leafletStrings.top = this.cast("top")
}

