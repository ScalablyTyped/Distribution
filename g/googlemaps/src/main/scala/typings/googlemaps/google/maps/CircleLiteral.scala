package typings.googlemaps.google.maps

import typings.googlemaps.google.maps.places._LocationBias
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CircleLiteral
  extends CircleOptions
     with _LocationBias

object CircleLiteral {
  @scala.inline
  def apply(): CircleLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CircleLiteral]
  }
}

