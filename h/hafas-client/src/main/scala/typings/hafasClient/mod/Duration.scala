package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duration extends js.Object {
  var duration: Double
  var stations: js.Array[Station | Stop]
}

object Duration {
  @scala.inline
  def apply(duration: Double, stations: js.Array[Station | Stop]): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], stations = stations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
}

