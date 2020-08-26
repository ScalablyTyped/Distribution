package typings.jsqubits.mod.jsqubits

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Measurement extends js.Object {
  var newState: QState = js.native
  var numBits: Double = js.native
  var result: Double = js.native
  def asBitString(): String = js.native
}

object Measurement {
  @scala.inline
  def apply(asBitString: () => String, newState: QState, numBits: Double, result: Double): Measurement = {
    val __obj = js.Dynamic.literal(asBitString = js.Any.fromFunction0(asBitString), newState = newState.asInstanceOf[js.Any], numBits = numBits.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Measurement]
  }
  @scala.inline
  implicit class MeasurementOps[Self <: Measurement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAsBitString(value: () => String): Self = this.set("asBitString", js.Any.fromFunction0(value))
    @scala.inline
    def setNewState(value: QState): Self = this.set("newState", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumBits(value: Double): Self = this.set("numBits", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: Double): Self = this.set("result", value.asInstanceOf[js.Any])
  }
  
}

