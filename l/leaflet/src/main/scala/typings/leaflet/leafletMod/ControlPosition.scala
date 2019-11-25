package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.leaflet.leafletStrings.topleft
  - typings.leaflet.leafletStrings.topright
  - typings.leaflet.leafletStrings.bottomleft
  - typings.leaflet.leafletStrings.bottomright
*/
trait ControlPosition extends js.Object

object ControlPosition {
  @scala.inline
  def bottomleft: typings.leaflet.leafletStrings.bottomleft = this.cast("bottomleft")
  @scala.inline
  def bottomright: typings.leaflet.leafletStrings.bottomright = this.cast("bottomright")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def topleft: typings.leaflet.leafletStrings.topleft = this.cast("topleft")
  @scala.inline
  def topright: typings.leaflet.leafletStrings.topright = this.cast("topright")
}

