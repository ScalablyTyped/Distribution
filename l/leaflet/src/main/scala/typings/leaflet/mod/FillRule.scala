package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.leaflet.leafletStrings.nonzero
  - typings.leaflet.leafletStrings.evenodd
  - typings.leaflet.leafletStrings.inherit
*/
trait FillRule extends js.Object

object FillRule {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def evenodd: typings.leaflet.leafletStrings.evenodd = this.cast("evenodd")
  @scala.inline
  def inherit: typings.leaflet.leafletStrings.inherit = this.cast("inherit")
  @scala.inline
  def nonzero: typings.leaflet.leafletStrings.nonzero = this.cast("nonzero")
}

