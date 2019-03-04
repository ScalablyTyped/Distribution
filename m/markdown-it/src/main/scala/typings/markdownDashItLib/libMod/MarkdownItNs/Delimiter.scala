package typings
package markdownDashItLib.libMod.MarkdownItNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delimiter extends js.Object {
  var close: scala.Boolean
  var end: scala.Double
  var jump: scala.Double
  var length: scala.Double
  var level: scala.Double
  var marker: scala.Double
  var open: scala.Boolean
  var token: scala.Double
}

object Delimiter {
  @scala.inline
  def apply(
    close: scala.Boolean,
    end: scala.Double,
    jump: scala.Double,
    length: scala.Double,
    level: scala.Double,
    marker: scala.Double,
    open: scala.Boolean,
    token: scala.Double
  ): Delimiter = {
    val __obj = js.Dynamic.literal(close = close, end = end, jump = jump, length = length, level = level, marker = marker, open = open, token = token)
  
    __obj.asInstanceOf[Delimiter]
  }
}

