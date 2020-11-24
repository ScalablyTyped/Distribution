package typings.hapiHapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hapi extends js.Object {
  
  var hapi: js.UndefOr[String] = js.native
  
  var node: js.UndefOr[String] = js.native
}
object Hapi {
  
  @scala.inline
  def apply(): Hapi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hapi]
  }
  
  @scala.inline
  implicit class HapiOps[Self <: Hapi] (val x: Self) extends AnyVal {
    
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
    def setHapi(value: String): Self = this.set("hapi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHapi: Self = this.set("hapi", js.undefined)
    
    @scala.inline
    def setNode(value: String): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNode: Self = this.set("node", js.undefined)
  }
}
