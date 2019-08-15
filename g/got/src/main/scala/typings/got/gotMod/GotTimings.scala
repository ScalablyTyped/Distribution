package typings.got.gotMod

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
    val __obj = js.Dynamic.literal(connect = connect, end = end, error = error, lookup = lookup, phases = phases, response = response, socket = socket, start = start, upload = upload)
  
    __obj.asInstanceOf[GotTimings]
  }
}

