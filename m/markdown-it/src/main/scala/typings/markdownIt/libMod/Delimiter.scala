package typings.markdownIt.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delimiter extends js.Object {
  var close: Boolean
  var end: Double
  var jump: Double
  var length: Double
  var level: Double
  var marker: Double
  var open: Boolean
  var token: Double
}

object Delimiter {
  @scala.inline
  def apply(
    close: Boolean,
    end: Double,
    jump: Double,
    length: Double,
    level: Double,
    marker: Double,
    open: Boolean,
    token: Double
  ): Delimiter = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], jump = jump.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Delimiter]
  }
}

