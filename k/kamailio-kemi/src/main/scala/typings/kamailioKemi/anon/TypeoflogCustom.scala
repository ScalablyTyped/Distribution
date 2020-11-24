package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeoflogCustom extends js.Object {
  
  def log_udp(txt: String): Double = js.native
}
object TypeoflogCustom {
  
  @scala.inline
  def apply(log_udp: String => Double): TypeoflogCustom = {
    val __obj = js.Dynamic.literal(log_udp = js.Any.fromFunction1(log_udp))
    __obj.asInstanceOf[TypeoflogCustom]
  }
  
  @scala.inline
  implicit class TypeoflogCustomOps[Self <: TypeoflogCustom] (val x: Self) extends AnyVal {
    
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
    def setLog_udp(value: String => Double): Self = this.set("log_udp", js.Any.fromFunction1(value))
  }
}
