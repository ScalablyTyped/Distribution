package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duration extends js.Object {
  var text: String
  var value: Double
}

object Duration {
  @scala.inline
  def apply(text: String, value: Double): Duration = {
    val __obj = js.Dynamic.literal(text = text, value = value)
  
    __obj.asInstanceOf[Duration]
  }
}

