package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Padding extends js.Object {
  var bottom: Double
  var left: Double
  var right: Double
  var top: Double
}

object Padding {
  @scala.inline
  def apply(bottom: Double, left: Double, right: Double, top: Double): Padding = {
    val __obj = js.Dynamic.literal(bottom = bottom, left = left, right = right, top = top)
  
    __obj.asInstanceOf[Padding]
  }
}

