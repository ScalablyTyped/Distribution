package typings
package markDotJsLib.markDotJsMod.MarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  var length: scala.Double
  var start: scala.Double
}

object Range {
  @scala.inline
  def apply(length: scala.Double, start: scala.Double): Range = {
    val __obj = js.Dynamic.literal(length = length, start = start)
  
    __obj.asInstanceOf[Range]
  }
}

