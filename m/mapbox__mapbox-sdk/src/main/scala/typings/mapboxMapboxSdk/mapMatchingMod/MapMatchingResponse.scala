package typings.mapboxMapboxSdk.mapMatchingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapMatchingResponse extends js.Object {
  /**
    * A string depicting the state of the response; see below for options
    */
  var code: String = js.native
  /**
    * An array of Match objects.
    */
  var matchings: js.Array[Matching] = js.native
  /**
    * An array of Tracepoint objects representing the location an input point was matched with.
    * Array of Waypoint objects representing all input points of the trace in the order they were matched.
    * If a trace point is omitted by map matching because it is an outlier, the entry will be null.
    */
  var tracepoints: js.Array[Tracepoint] = js.native
}

object MapMatchingResponse {
  @scala.inline
  def apply(code: String, matchings: js.Array[Matching], tracepoints: js.Array[Tracepoint]): MapMatchingResponse = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], matchings = matchings.asInstanceOf[js.Any], tracepoints = tracepoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapMatchingResponse]
  }
  @scala.inline
  implicit class MapMatchingResponseOps[Self <: MapMatchingResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatchingsVarargs(value: Matching*): Self = this.set("matchings", js.Array(value :_*))
    @scala.inline
    def setMatchings(value: js.Array[Matching]): Self = this.set("matchings", value.asInstanceOf[js.Any])
    @scala.inline
    def setTracepointsVarargs(value: Tracepoint*): Self = this.set("tracepoints", js.Array(value :_*))
    @scala.inline
    def setTracepoints(value: js.Array[Tracepoint]): Self = this.set("tracepoints", value.asInstanceOf[js.Any])
  }
  
}

