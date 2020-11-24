package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cps extends js.Object {
  
  var cps: String = js.native
  
  var id: String = js.native
  
  var unotice: String = js.native
}
object Cps {
  
  @scala.inline
  def apply(cps: String, id: String, unotice: String): Cps = {
    val __obj = js.Dynamic.literal(cps = cps.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], unotice = unotice.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cps]
  }
  
  @scala.inline
  implicit class CpsOps[Self <: Cps] (val x: Self) extends AnyVal {
    
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
    def setCps(value: String): Self = this.set("cps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnotice(value: String): Self = this.set("unotice", value.asInstanceOf[js.Any])
  }
}
