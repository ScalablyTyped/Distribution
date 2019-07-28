package typings.jsqubits.jsqubitsMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.jsqubits.jsqubitsMod.jsqubitsNs.Complex
import typings.jsqubits.jsqubitsMod.jsqubitsNs.QState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QStateStatic
  extends Instantiable1[/* numBits */ Double, QState]
     with Instantiable2[/* numBits */ Double, /* amplitudes */ js.Array[Complex], QState] {
  def applyOperatorMatrix(matrix: js.Array[js.Array[Complex]], bitValue: Double, amplitude: Complex): js.Array[Complex] = js.native
  def applyToOneBit(
    controlBits: js.Array[Double],
    targetBit: Double,
    operatorMatrix: js.Array[js.Array[Complex]],
    qState: QState
  ): QState = js.native
  def fromBits(bitString: String): QState = js.native
}

