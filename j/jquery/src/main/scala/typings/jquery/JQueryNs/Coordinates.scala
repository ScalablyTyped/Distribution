package typings.jquery.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// region Coordinates
// #region Coordinates
trait Coordinates extends js.Object {
  var left: Double
  var top: Double
}

object Coordinates {
  @scala.inline
  def apply(left: Double, top: Double): Coordinates = {
    val __obj = js.Dynamic.literal(left = left, top = top)
  
    __obj.asInstanceOf[Coordinates]
  }
}

