package typings.jsqubits.mod.jsqubits

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Measurement extends js.Object {
  var newState: QState
  var numBits: Double
  var result: Double
  def asBitString(): String
}

object Measurement {
  @scala.inline
  def apply(asBitString: () => String, newState: QState, numBits: Double, result: Double): Measurement = {
    val __obj = js.Dynamic.literal(asBitString = js.Any.fromFunction0(asBitString), newState = newState.asInstanceOf[js.Any], numBits = numBits.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Measurement]
  }
}

