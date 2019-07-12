package typings
package jsqubitsLib.jsqubitsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BitsRange extends _SingleQubitOperatorTargetQubits {
  var from: scala.Double
  var to: scala.Double
}

object BitsRange {
  @scala.inline
  def apply(from: scala.Double, to: scala.Double): BitsRange = {
    val __obj = js.Dynamic.literal(from = from, to = to)
  
    __obj.asInstanceOf[BitsRange]
  }
}

