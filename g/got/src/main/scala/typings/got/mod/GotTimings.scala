package typings.got.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GotTimings extends js.Object {
  var connect: Double
  var end: Double
  var error: Double
  var lookup: Double
  var phases: GotTimingsPhases
  var response: Double
  var socket: Double
  var start: Double
  var upload: Double
}

object GotTimings {
  @scala.inline
  def apply(
    connect: Double,
    end: Double,
    error: Double,
    lookup: Double,
    phases: GotTimingsPhases,
    response: Double,
    socket: Double,
    start: Double,
    upload: Double
  ): GotTimings = {
    val __obj = js.Dynamic.literal(connect = connect.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any], phases = phases.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], upload = upload.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GotTimings]
  }
}

