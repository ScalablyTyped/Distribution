package typings.markDotJs.markDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  var length: Double
  var start: Double
}

object Range {
  @scala.inline
  def apply(length: Double, start: Double): Range = {
    val __obj = js.Dynamic.literal(length = length, start = start)
  
    __obj.asInstanceOf[Range]
  }
}

