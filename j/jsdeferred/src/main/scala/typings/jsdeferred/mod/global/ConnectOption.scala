package typings.jsdeferred.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectOption extends js.Object {
  
  var args: js.UndefOr[js.Array[_]] = js.native
  
  var ng: js.UndefOr[Double] = js.native
  
  var ok: js.UndefOr[Double] = js.native
  
  var target: js.Any = js.native
}
object ConnectOption {
  
  @scala.inline
  def apply(target: js.Any): ConnectOption = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectOption]
  }
  
  @scala.inline
  implicit class ConnectOptionOps[Self <: ConnectOption] (val x: Self) extends AnyVal {
    
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
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: js.Any*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[_]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setNg(value: Double): Self = this.set("ng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNg: Self = this.set("ng", js.undefined)
    
    @scala.inline
    def setOk(value: Double): Self = this.set("ok", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOk: Self = this.set("ok", js.undefined)
  }
}
