package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlRewrite extends js.Object {
  
  /**
    * Prior to forwarding the request to the selected service, the request's host header is replaced with contents of hostRewrite.
    * The value must be between 1 and 255 characters.
    */
  var hostRewrite: js.UndefOr[String] = js.native
  
  /**
    * Prior to forwarding the request to the selected backend service, the matching portion of the request's path is replaced by pathPrefixRewrite.
    * The value must be between 1 and 1024 characters.
    */
  var pathPrefixRewrite: js.UndefOr[String] = js.native
}
object UrlRewrite {
  
  @scala.inline
  def apply(): UrlRewrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlRewrite]
  }
  
  @scala.inline
  implicit class UrlRewriteOps[Self <: UrlRewrite] (val x: Self) extends AnyVal {
    
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
    def setHostRewrite(value: String): Self = this.set("hostRewrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostRewrite: Self = this.set("hostRewrite", js.undefined)
    
    @scala.inline
    def setPathPrefixRewrite(value: String): Self = this.set("pathPrefixRewrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathPrefixRewrite: Self = this.set("pathPrefixRewrite", js.undefined)
  }
}
