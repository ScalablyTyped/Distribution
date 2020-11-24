package typings.logfmt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestLoggerOptions extends js.Object {
  
  var elapsed: js.UndefOr[String] = js.native
  
  var immediate: js.UndefOr[Boolean] = js.native
}
object RequestLoggerOptions {
  
  @scala.inline
  def apply(): RequestLoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestLoggerOptions]
  }
  
  @scala.inline
  implicit class RequestLoggerOptionsOps[Self <: RequestLoggerOptions] (val x: Self) extends AnyVal {
    
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
    def setElapsed(value: String): Self = this.set("elapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElapsed: Self = this.set("elapsed", js.undefined)
    
    @scala.inline
    def setImmediate(value: Boolean): Self = this.set("immediate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImmediate: Self = this.set("immediate", js.undefined)
  }
}
