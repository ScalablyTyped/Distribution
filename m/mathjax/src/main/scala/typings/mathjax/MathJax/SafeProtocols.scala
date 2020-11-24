package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SafeProtocols extends js.Object {
  
  var file: js.UndefOr[Boolean] = js.native
  
  var http: js.UndefOr[Boolean] = js.native
  
  var https: js.UndefOr[Boolean] = js.native
  
  var javascript: js.UndefOr[Boolean] = js.native
}
object SafeProtocols {
  
  @scala.inline
  def apply(): SafeProtocols = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SafeProtocols]
  }
  
  @scala.inline
  implicit class SafeProtocolsOps[Self <: SafeProtocols] (val x: Self) extends AnyVal {
    
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
    def setFile(value: Boolean): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    
    @scala.inline
    def setHttp(value: Boolean): Self = this.set("http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttp: Self = this.set("http", js.undefined)
    
    @scala.inline
    def setHttps(value: Boolean): Self = this.set("https", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttps: Self = this.set("https", js.undefined)
    
    @scala.inline
    def setJavascript(value: Boolean): Self = this.set("javascript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJavascript: Self = this.set("javascript", js.undefined)
  }
}
