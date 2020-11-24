package typings.hapi.anon

import typings.hapi.hapiBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Log extends js.Object {
  
  var log: js.UndefOr[js.Array[String] | `false`] = js.native
  
  var request: js.UndefOr[js.Array[String] | `false`] = js.native
}
object Log {
  
  @scala.inline
  def apply(): Log = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Log]
  }
  
  @scala.inline
  implicit class LogOps[Self <: Log] (val x: Self) extends AnyVal {
    
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
    def setLogVarargs(value: String*): Self = this.set("log", js.Array(value :_*))
    
    @scala.inline
    def setLog(value: js.Array[String] | `false`): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    
    @scala.inline
    def setRequestVarargs(value: String*): Self = this.set("request", js.Array(value :_*))
    
    @scala.inline
    def setRequest(value: js.Array[String] | `false`): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
  }
}
