package typings.johnnyFive.mod.IR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayOption extends js.Object {
  
  var emitter: Double | String = js.native
  
  var freq: js.UndefOr[Double] = js.native
  
  var pins: js.Array[Double | String] = js.native
}
object ArrayOption {
  
  @scala.inline
  def apply(emitter: Double | String, pins: js.Array[Double | String]): ArrayOption = {
    val __obj = js.Dynamic.literal(emitter = emitter.asInstanceOf[js.Any], pins = pins.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayOption]
  }
  
  @scala.inline
  implicit class ArrayOptionOps[Self <: ArrayOption] (val x: Self) extends AnyVal {
    
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
    def setEmitter(value: Double | String): Self = this.set("emitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinsVarargs(value: (Double | String)*): Self = this.set("pins", js.Array(value :_*))
    
    @scala.inline
    def setPins(value: js.Array[Double | String]): Self = this.set("pins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreq(value: Double): Self = this.set("freq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFreq: Self = this.set("freq", js.undefined)
  }
}
