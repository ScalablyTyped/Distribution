package typings.jsqubits.mod.jsqubits

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateWithAmplitude extends js.Object {
  
  var amplitude: Complex = js.native
  
  def asBitString(): String = js.native
  
  def asNumber(): Double = js.native
  
  var index: Double = js.native
  
  var numBits: Double = js.native
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
  
  @scala.inline
  implicit class StateWithAmplitudeOps[Self <: StateWithAmplitude] (val x: Self) extends AnyVal {
    
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
    def setAmplitude(value: Complex): Self = this.set("amplitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsBitString(value: () => String): Self = this.set("asBitString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsNumber(value: () => Double): Self = this.set("asNumber", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumBits(value: Double): Self = this.set("numBits", value.asInstanceOf[js.Any])
  }
}
