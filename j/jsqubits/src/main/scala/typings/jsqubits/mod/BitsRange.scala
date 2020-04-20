package typings.jsqubits.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BitsRange extends _SingleQubitOperatorTargetQubits {
  var from: Double
  var to: Double
}

object BitsRange {
  @scala.inline
  def apply(from: Double, to: Double): BitsRange = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitsRange]
  }
}

