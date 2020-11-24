package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogConfigDataAccessOptions extends js.Object {
  
  var logMode: js.UndefOr[String] = js.native
}
object LogConfigDataAccessOptions {
  
  @scala.inline
  def apply(): LogConfigDataAccessOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogConfigDataAccessOptions]
  }
  
  @scala.inline
  implicit class LogConfigDataAccessOptionsOps[Self <: LogConfigDataAccessOptions] (val x: Self) extends AnyVal {
    
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
    def setLogMode(value: String): Self = this.set("logMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogMode: Self = this.set("logMode", js.undefined)
  }
}
