package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  var height: Double
  var width: Double
  def equals(other: Size): Boolean
}

object Size {
  @scala.inline
  def apply(equals: Size => Boolean, height: Double, width: Double): Size = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
}

