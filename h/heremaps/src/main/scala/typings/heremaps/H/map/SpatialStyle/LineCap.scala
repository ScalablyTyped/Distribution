package typings.heremaps.H.map.SpatialStyle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The style of the end caps for a line, one of 'butt', 'round' or 'square'.
  */
/* Rewritten from type alias, can be one of: 
  - typings.heremaps.heremapsStrings.butt
  - typings.heremaps.heremapsStrings.round
  - typings.heremaps.heremapsStrings.square
*/
trait LineCap extends js.Object

object LineCap {
  @scala.inline
  def butt: typings.heremaps.heremapsStrings.butt = this.cast("butt")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def round: typings.heremaps.heremapsStrings.round = this.cast("round")
  @scala.inline
  def square: typings.heremaps.heremapsStrings.square = this.cast("square")
}

