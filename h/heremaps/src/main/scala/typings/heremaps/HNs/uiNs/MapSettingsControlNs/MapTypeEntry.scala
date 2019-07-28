package typings.heremaps.HNs.uiNs.MapSettingsControlNs

import typings.heremaps.HNs.serviceNs.MapType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The map type entry is an object containing a display name and a map type object to which it refers.
  * @property name {string} - label which describes the map type
  * @property mapType {H.service.MapType} - reference to map type
  */
trait MapTypeEntry extends js.Object {
  var mapType: MapType
  var name: String
}

object MapTypeEntry {
  @scala.inline
  def apply(mapType: MapType, name: String): MapTypeEntry = {
    val __obj = js.Dynamic.literal(mapType = mapType, name = name)
  
    __obj.asInstanceOf[MapTypeEntry]
  }
}

