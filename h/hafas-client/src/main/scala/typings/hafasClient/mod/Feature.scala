package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Feature extends js.Object {
  var geometry: Geometry
  var properties: js.UndefOr[Station | Stop] = js.undefined
  var `type`: typings.hafasClient.hafasClientStrings.Feature
}

object Feature {
  @scala.inline
  def apply(
    geometry: Geometry,
    `type`: typings.hafasClient.hafasClientStrings.Feature,
    properties: Station | Stop = null
  ): Feature = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Feature]
  }
}

