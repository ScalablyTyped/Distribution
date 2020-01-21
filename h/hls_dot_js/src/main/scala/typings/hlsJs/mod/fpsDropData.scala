package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait fpsDropData extends js.Object {
  var currentDecoded: Double
  var currentDropped: Double
  var totalDroppedFragmes: Double
}

object fpsDropData {
  @scala.inline
  def apply(currentDecoded: Double, currentDropped: Double, totalDroppedFragmes: Double): fpsDropData = {
    val __obj = js.Dynamic.literal(currentDecoded = currentDecoded.asInstanceOf[js.Any], currentDropped = currentDropped.asInstanceOf[js.Any], totalDroppedFragmes = totalDroppedFragmes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[fpsDropData]
  }
}

