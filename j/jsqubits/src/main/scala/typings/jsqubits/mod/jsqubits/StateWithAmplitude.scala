package typings.jsqubits.mod.jsqubits

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateWithAmplitude extends js.Object {
  var amplitude: Complex
  var index: Double
  var numBits: Double
  def asBitString(): String
  def asNumber(): Double
}

object StateWithAmplitude {
  @scala.inline
  def apply(
    amplitude: Complex,
    asBitString: () => String,
    asNumber: () => Double,
    index: Double,
    numBits: Double
  ): StateWithAmplitude = {
    val __obj = js.Dynamic.literal(amplitude = amplitude.asInstanceOf[js.Any], asBitString = js.Any.fromFunction0(asBitString), asNumber = js.Any.fromFunction0(asNumber), index = index.asInstanceOf[js.Any], numBits = numBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateWithAmplitude]
  }
}

