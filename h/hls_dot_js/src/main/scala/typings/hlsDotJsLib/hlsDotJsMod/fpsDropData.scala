package typings
package hlsDotJsLib.hlsDotJsMod

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
    val __obj = js.Dynamic.literal(currentDecoded = currentDecoded, currentDropped = currentDropped, totalDroppedFragmes = totalDroppedFragmes)
  
    __obj.asInstanceOf[fpsDropData]
  }
}

