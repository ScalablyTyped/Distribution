package typings
package heremapsLib.HNs.uiNs.MapSettingsControlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The map type entry is an object containing a display name and a map type object to which it refers.
  * @property name {string} - label which describes the map type
  * @property mapType {H.service.MapType} - reference to map type
  */
trait MapTypeEntry extends js.Object {
  var mapType: heremapsLib.HNs.serviceNs.MapType
  var name: java.lang.String
}

