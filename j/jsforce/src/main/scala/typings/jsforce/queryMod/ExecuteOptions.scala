package typings.jsforce.queryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecuteOptions extends js.Object {
  
  var autoFetch: js.UndefOr[Boolean] = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  var maxFetch: js.UndefOr[Double] = js.native
  
  var scanAll: js.UndefOr[Boolean] = js.native
}
object ExecuteOptions {
  
  @scala.inline
  def apply(): ExecuteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteOptions]
  }
  
  @scala.inline
  implicit class ExecuteOptionsOps[Self <: ExecuteOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoFetch(value: Boolean): Self = this.set("autoFetch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFetch: Self = this.set("autoFetch", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setMaxFetch(value: Double): Self = this.set("maxFetch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFetch: Self = this.set("maxFetch", js.undefined)
    
    @scala.inline
    def setScanAll(value: Boolean): Self = this.set("scanAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScanAll: Self = this.set("scanAll", js.undefined)
  }
}
