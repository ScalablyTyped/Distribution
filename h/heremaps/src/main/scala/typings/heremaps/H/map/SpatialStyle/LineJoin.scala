package typings.heremaps.H.map.SpatialStyle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The type of corner created, when two lines meet, one of 'round', 'bevel' or 'miter'.
  */
/* Rewritten from type alias, can be one of: 
  - typings.heremaps.heremapsStrings.round
  - typings.heremaps.heremapsStrings.bevel
  - typings.heremaps.heremapsStrings.miter
*/
trait LineJoin extends js.Object

object LineJoin {
  @scala.inline
  def bevel: typings.heremaps.heremapsStrings.bevel = this.cast("bevel")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def miter: typings.heremaps.heremapsStrings.miter = this.cast("miter")
  @scala.inline
  def round: typings.heremaps.heremapsStrings.round = this.cast("round")
}

