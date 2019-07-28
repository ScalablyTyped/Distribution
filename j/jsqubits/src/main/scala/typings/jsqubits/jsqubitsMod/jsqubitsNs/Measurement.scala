package typings.jsqubits.jsqubitsMod.jsqubitsNs

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
  def apply(
    asBitString: () => String,
    newState: QState,
    numBits: Double,
    result: Double,
    toString: () => String
  ): Measurement = {
    val __obj = js.Dynamic.literal(asBitString = js.Any.fromFunction0(asBitString), newState = newState, numBits = numBits, result = result, toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[Measurement]
  }
}

