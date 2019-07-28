package typings.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Feature extends js.Object {
  var feature: js.Array[_]
  var trafficMode: String
  var transportModes: js.Array[String]
  var `type`: String
}

object Anon_Feature {
  @scala.inline
  def apply(feature: js.Array[_], trafficMode: String, transportModes: js.Array[String], `type`: String): Anon_Feature = {
    val __obj = js.Dynamic.literal(feature = feature, trafficMode = trafficMode, transportModes = transportModes)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Feature]
  }
}

