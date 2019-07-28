package typings.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseTime extends js.Object {
  var baseTime: Double
  var distance: Double
  var flags: js.Array[String]
  var text: String
  var trafficTime: Double
  var travelTime: Double
}

object Anon_BaseTime {
  @scala.inline
  def apply(
    baseTime: Double,
    distance: Double,
    flags: js.Array[String],
    text: String,
    trafficTime: Double,
    travelTime: Double
  ): Anon_BaseTime = {
    val __obj = js.Dynamic.literal(baseTime = baseTime, distance = distance, flags = flags, text = text, trafficTime = trafficTime, travelTime = travelTime)
  
    __obj.asInstanceOf[Anon_BaseTime]
  }
}

