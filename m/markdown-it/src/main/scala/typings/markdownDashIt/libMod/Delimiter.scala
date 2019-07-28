package typings.markdownDashIt.libMod

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
    val __obj = js.Dynamic.literal(close = close, end = end, jump = jump, length = length, level = level, marker = marker, open = open, token = token)
  
    __obj.asInstanceOf[Delimiter]
  }
}

