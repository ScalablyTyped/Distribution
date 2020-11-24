package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoardOption extends js.Object {
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[Double | String] = js.native
  
  var io: js.UndefOr[js.Any] = js.native
  
  var port: js.UndefOr[String | js.Any] = js.native
  
  var repl: js.UndefOr[Boolean] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object BoardOption {
  
  @scala.inline
  def apply(): BoardOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoardOption]
  }
  
  @scala.inline
  implicit class BoardOptionOps[Self <: BoardOption] (val x: Self) extends AnyVal {
    
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
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setId(value: Double | String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIo(value: js.Any): Self = this.set("io", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIo: Self = this.set("io", js.undefined)
    
    @scala.inline
    def setPort(value: String | js.Any): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setRepl(value: Boolean): Self = this.set("repl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepl: Self = this.set("repl", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
