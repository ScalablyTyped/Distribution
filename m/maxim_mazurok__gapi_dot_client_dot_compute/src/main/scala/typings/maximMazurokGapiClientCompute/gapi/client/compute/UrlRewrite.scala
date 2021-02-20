package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlRewrite extends StObject {
  
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
  implicit class UrlRewriteMutableBuilder[Self <: UrlRewrite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostRewrite(value: String): Self = StObject.set(x, "hostRewrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostRewriteUndefined: Self = StObject.set(x, "hostRewrite", js.undefined)
    
    @scala.inline
    def setPathPrefixRewrite(value: String): Self = StObject.set(x, "pathPrefixRewrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathPrefixRewriteUndefined: Self = StObject.set(x, "pathPrefixRewrite", js.undefined)
  }
}
