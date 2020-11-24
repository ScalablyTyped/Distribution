package typings.iitc.anon

import typings.iitc.iitctypesMod.LinkGUID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait In extends js.Object {
  
  var in: js.Array[LinkGUID] = js.native
  
  var out: js.Array[LinkGUID] = js.native
}
object In {
  
  @scala.inline
  def apply(in: js.Array[LinkGUID], out: js.Array[LinkGUID]): In = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], out = out.asInstanceOf[js.Any])
    __obj.asInstanceOf[In]
  }
  
  @scala.inline
  implicit class InOps[Self <: In] (val x: Self) extends AnyVal {
    
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
    def setInVarargs(value: LinkGUID*): Self = this.set("in", js.Array(value :_*))
    
    @scala.inline
    def setIn(value: js.Array[LinkGUID]): Self = this.set("in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutVarargs(value: LinkGUID*): Self = this.set("out", js.Array(value :_*))
    
    @scala.inline
    def setOut(value: js.Array[LinkGUID]): Self = this.set("out", value.asInstanceOf[js.Any])
  }
}
