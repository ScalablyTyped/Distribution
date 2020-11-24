package typings.jsplumb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedrawResult extends js.Object {
  
  var c: js.Array[Connection] = js.native
  
  var e: js.Array[Endpoint] = js.native
}
object RedrawResult {
  
  @scala.inline
  def apply(c: js.Array[Connection], e: js.Array[Endpoint]): RedrawResult = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedrawResult]
  }
  
  @scala.inline
  implicit class RedrawResultOps[Self <: RedrawResult] (val x: Self) extends AnyVal {
    
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
    def setCVarargs(value: Connection*): Self = this.set("c", js.Array(value :_*))
    
    @scala.inline
    def setC(value: js.Array[Connection]): Self = this.set("c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEVarargs(value: Endpoint*): Self = this.set("e", js.Array(value :_*))
    
    @scala.inline
    def setE(value: js.Array[Endpoint]): Self = this.set("e", value.asInstanceOf[js.Any])
  }
}
