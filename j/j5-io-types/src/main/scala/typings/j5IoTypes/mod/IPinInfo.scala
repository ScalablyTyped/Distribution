package typings.j5IoTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPinInfo extends js.Object {
  
  var peripherals: js.Array[PeripheralType] = js.native
  
  var pins: js.Array[String] = js.native
}
object IPinInfo {
  
  @scala.inline
  def apply(peripherals: js.Array[PeripheralType], pins: js.Array[String]): IPinInfo = {
    val __obj = js.Dynamic.literal(peripherals = peripherals.asInstanceOf[js.Any], pins = pins.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPinInfo]
  }
  
  @scala.inline
  implicit class IPinInfoOps[Self <: IPinInfo] (val x: Self) extends AnyVal {
    
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
    def setPeripheralsVarargs(value: PeripheralType*): Self = this.set("peripherals", js.Array(value :_*))
    
    @scala.inline
    def setPeripherals(value: js.Array[PeripheralType]): Self = this.set("peripherals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinsVarargs(value: String*): Self = this.set("pins", js.Array(value :_*))
    
    @scala.inline
    def setPins(value: js.Array[String]): Self = this.set("pins", value.asInstanceOf[js.Any])
  }
}
