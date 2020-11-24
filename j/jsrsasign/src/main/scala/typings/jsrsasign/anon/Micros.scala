package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Micros extends js.Object {
  
  var micros: Double = js.native
  
  var millis: Double = js.native
  
  var seconds: Double = js.native
}
object Micros {
  
  @scala.inline
  def apply(micros: Double, millis: Double, seconds: Double): Micros = {
    val __obj = js.Dynamic.literal(micros = micros.asInstanceOf[js.Any], millis = millis.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Micros]
  }
  
  @scala.inline
  implicit class MicrosOps[Self <: Micros] (val x: Self) extends AnyVal {
    
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
    def setMicros(value: Double): Self = this.set("micros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMillis(value: Double): Self = this.set("millis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeconds(value: Double): Self = this.set("seconds", value.asInstanceOf[js.Any])
  }
}
