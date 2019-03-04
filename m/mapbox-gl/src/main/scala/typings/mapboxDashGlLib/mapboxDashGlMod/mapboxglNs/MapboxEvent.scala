package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapboxEvent[TOrig] extends js.Object {
  var originalEvent: TOrig
  var target: Map
  var `type`: java.lang.String
}

object MapboxEvent {
  @scala.inline
  def apply[TOrig](originalEvent: TOrig, target: Map, `type`: java.lang.String): MapboxEvent[TOrig] = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MapboxEvent[TOrig]]
  }
}

