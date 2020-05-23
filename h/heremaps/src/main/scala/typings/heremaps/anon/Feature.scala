package typings.heremaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Feature extends js.Object {
  var feature: js.Array[_]
  var trafficMode: String
  var transportModes: js.Array[String]
  var `type`: String
}

object Feature {
  @scala.inline
  def apply(feature: js.Array[_], trafficMode: String, transportModes: js.Array[String], `type`: String): Feature = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], trafficMode = trafficMode.asInstanceOf[js.Any], transportModes = transportModes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Feature]
  }
}

