package typings.iitc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LatE6 extends js.Object {
  
  var guid: String = js.native
  
  var latE6: Double = js.native
  
  var lngE6: Double = js.native
}
object LatE6 {
  
  @scala.inline
  def apply(guid: String, latE6: Double, lngE6: Double): LatE6 = {
    val __obj = js.Dynamic.literal(guid = guid.asInstanceOf[js.Any], latE6 = latE6.asInstanceOf[js.Any], lngE6 = lngE6.asInstanceOf[js.Any])
    __obj.asInstanceOf[LatE6]
  }
  
  @scala.inline
  implicit class LatE6Ops[Self <: LatE6] (val x: Self) extends AnyVal {
    
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
    def setGuid(value: String): Self = this.set("guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatE6(value: Double): Self = this.set("latE6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLngE6(value: Double): Self = this.set("lngE6", value.asInstanceOf[js.Any])
  }
}
