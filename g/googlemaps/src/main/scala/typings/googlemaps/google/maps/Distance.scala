package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Distance extends js.Object {
  var text: String
  var value: Double
}

object Distance {
  @scala.inline
  def apply(text: String, value: Double): Distance = {
    val __obj = js.Dynamic.literal(text = text, value = value)
  
    __obj.asInstanceOf[Distance]
  }
}

