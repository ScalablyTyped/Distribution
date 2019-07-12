package typings
package jsqubitsLib.jsqubitsMod.jsqubitsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateWithAmplitude extends js.Object {
  var amplitude: Complex
  var index: scala.Double
  var numBits: scala.Double
  def asBitString(): java.lang.String
  def asNumber(): scala.Double
}

object StateWithAmplitude {
  @scala.inline
  def apply(
    amplitude: Complex,
    asBitString: () => java.lang.String,
    asNumber: () => scala.Double,
    index: scala.Double,
    numBits: scala.Double
  ): StateWithAmplitude = {
    val __obj = js.Dynamic.literal(amplitude = amplitude, asBitString = js.Any.fromFunction0(asBitString), asNumber = js.Any.fromFunction0(asNumber), index = index, numBits = numBits)
  
    __obj.asInstanceOf[StateWithAmplitude]
  }
}

