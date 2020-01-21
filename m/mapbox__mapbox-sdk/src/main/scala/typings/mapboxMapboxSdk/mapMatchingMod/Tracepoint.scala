package typings.mapboxMapboxSdk.mapMatchingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tracepoint extends js.Object {
  /**
    * Number of probable alternative matchings for this trace point. A value of zero indicates that this point was matched unambiguously.
    * Split the trace at these points for incremental map matching.
    */
  var alternatives_count: Double
  var location: js.Array[Double]
  /**
    * Index to the match object in matchings the sub-trace was matched to.
    */
  var matchings_index: Double
  var name: String
  /**
    * Index of the waypoint inside the matched route.
    */
  var waypoint_index: Double
}

object Tracepoint {
  @scala.inline
  def apply(
    alternatives_count: Double,
    location: js.Array[Double],
    matchings_index: Double,
    name: String,
    waypoint_index: Double
  ): Tracepoint = {
    val __obj = js.Dynamic.literal(alternatives_count = alternatives_count.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], matchings_index = matchings_index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], waypoint_index = waypoint_index.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Tracepoint]
  }
}

