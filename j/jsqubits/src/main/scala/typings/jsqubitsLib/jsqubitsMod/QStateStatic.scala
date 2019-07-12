package typings
package jsqubitsLib.jsqubitsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QStateStatic
  extends org.scalablytyped.runtime.Instantiable1[/* numBits */ scala.Double, jsqubitsLib.jsqubitsMod.jsqubitsNs.QState]
     with org.scalablytyped.runtime.Instantiable2[
      /* numBits */ scala.Double, 
      /* amplitudes */ js.Array[jsqubitsLib.jsqubitsMod.jsqubitsNs.Complex], 
      jsqubitsLib.jsqubitsMod.jsqubitsNs.QState
    ] {
  def applyOperatorMatrix(
    matrix: js.Array[js.Array[jsqubitsLib.jsqubitsMod.jsqubitsNs.Complex]],
    bitValue: scala.Double,
    amplitude: jsqubitsLib.jsqubitsMod.jsqubitsNs.Complex
  ): js.Array[jsqubitsLib.jsqubitsMod.jsqubitsNs.Complex] = js.native
  def applyToOneBit(
    controlBits: js.Array[scala.Double],
    targetBit: scala.Double,
    operatorMatrix: js.Array[js.Array[jsqubitsLib.jsqubitsMod.jsqubitsNs.Complex]],
    qState: jsqubitsLib.jsqubitsMod.jsqubitsNs.QState
  ): jsqubitsLib.jsqubitsMod.jsqubitsNs.QState = js.native
  def fromBits(bitString: java.lang.String): jsqubitsLib.jsqubitsMod.jsqubitsNs.QState = js.native
}

