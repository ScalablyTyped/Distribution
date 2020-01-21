package typings.mapboxMapboxSdk.mapMatchingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapMatchingResponse extends js.Object {
  /**
    * A string depicting the state of the response; see below for options
    */
  var code: String
  /**
    * An array of Match objects.
    */
  var matchings: js.Array[Matching]
  /**
    * An array of Tracepoint objects representing the location an input point was matched with.
    * Array of Waypoint objects representing all input points of the trace in the order they were matched.
    * If a trace point is omitted by map matching because it is an outlier, the entry will be null.
    */
  var tracepoints: js.Array[Tracepoint]
}

object MapMatchingResponse {
  @scala.inline
  def apply(code: String, matchings: js.Array[Matching], tracepoints: js.Array[Tracepoint]): MapMatchingResponse = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], matchings = matchings.asInstanceOf[js.Any], tracepoints = tracepoints.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MapMatchingResponse]
  }
}

