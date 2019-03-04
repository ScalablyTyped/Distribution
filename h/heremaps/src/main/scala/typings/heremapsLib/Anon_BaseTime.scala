package typings
package heremapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseTime extends js.Object {
  var baseTime: scala.Double
  var distance: scala.Double
  var flags: js.Array[java.lang.String]
  var text: java.lang.String
  var trafficTime: scala.Double
  var travelTime: scala.Double
}

object Anon_BaseTime {
  @scala.inline
  def apply(
    baseTime: scala.Double,
    distance: scala.Double,
    flags: js.Array[java.lang.String],
    text: java.lang.String,
    trafficTime: scala.Double,
    travelTime: scala.Double
  ): Anon_BaseTime = {
    val __obj = js.Dynamic.literal(baseTime = baseTime, distance = distance, flags = flags, text = text, trafficTime = trafficTime, travelTime = travelTime)
  
    __obj.asInstanceOf[Anon_BaseTime]
  }
}

