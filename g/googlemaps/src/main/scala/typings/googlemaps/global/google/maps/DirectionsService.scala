package typings.googlemaps.global.google.maps

import typings.googlemaps.google.maps.DirectionsRequest
import typings.googlemaps.google.maps.DirectionsResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.DirectionsService")
@js.native
class DirectionsService ()
  extends typings.googlemaps.google.maps.DirectionsService {
  /* CompleteClass */
  override def route(
    request: DirectionsRequest,
    callback: js.Function2[
      /* result */ DirectionsResult, 
      /* status */ typings.googlemaps.google.maps.DirectionsStatus, 
      Unit
    ]
  ): Unit = js.native
}

