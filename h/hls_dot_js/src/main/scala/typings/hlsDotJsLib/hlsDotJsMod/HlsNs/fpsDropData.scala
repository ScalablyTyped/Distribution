package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait fpsDropData extends js.Object {
  var currentDecoded: scala.Double
  var currentDropped: scala.Double
  var totalDroppedFragmes: scala.Double
}

object fpsDropData {
  @scala.inline
  def apply(currentDecoded: scala.Double, currentDropped: scala.Double, totalDroppedFragmes: scala.Double): fpsDropData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("currentDecoded")(currentDecoded)
    __obj.updateDynamic("currentDropped")(currentDropped)
    __obj.updateDynamic("totalDroppedFragmes")(totalDroppedFragmes)
    __obj.asInstanceOf[fpsDropData]
  }
}

