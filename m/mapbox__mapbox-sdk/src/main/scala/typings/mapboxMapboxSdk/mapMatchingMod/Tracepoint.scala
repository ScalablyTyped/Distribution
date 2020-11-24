package typings.mapboxMapboxSdk.mapMatchingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tracepoint extends js.Object {
  
  /**
    * Number of probable alternative matchings for this trace point. A value of zero indicates that this point was matched unambiguously.
    * Split the trace at these points for incremental map matching.
    */
  var alternatives_count: Double = js.native
  
  var location: js.Array[Double] = js.native
  
  /**
    * Index to the match object in matchings the sub-trace was matched to.
    */
  var matchings_index: Double = js.native
  
  var name: String = js.native
  
  /**
    * Index of the waypoint inside the matched route.
    */
  var waypoint_index: Double = js.native
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
  
  @scala.inline
  implicit class TracepointOps[Self <: Tracepoint] (val x: Self) extends AnyVal {
    
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
    def setAlternatives_count(value: Double): Self = this.set("alternatives_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationVarargs(value: Double*): Self = this.set("location", js.Array(value :_*))
    
    @scala.inline
    def setLocation(value: js.Array[Double]): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchings_index(value: Double): Self = this.set("matchings_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaypoint_index(value: Double): Self = this.set("waypoint_index", value.asInstanceOf[js.Any])
  }
}
